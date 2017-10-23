import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

class data{  
	
	public String checklogin(String userid, String password){
		String tmp = "";
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  "jdbc:mysql://localhost:3306/scroou","root","" );  
			Statement stmt=con.createStatement();		
			ResultSet rs=stmt.executeQuery("select password,UserType,status from user where ID='"+userid+"'");
			rs.next();
			if(rs.getString(3).trim().equals("valid")){
				if (password.equals(rs.getString(1))){
					tmp = rs.getString(2);	
				}
				else {
					tmp="Error";
				}
			}
			else {
					tmp="Error";
				}
			con.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
		return tmp;
	}	
	
	public void checkregister(String userid, String username, String password,String email,String DOB ,String type ,String ACD , String status){
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  "jdbc:mysql://localhost:3306/scroou","root","" );  
			Statement stmt=con.createStatement();
			stmt.executeUpdate("insert into user(ID,Username,Password, Email, DOB, UserType, AccountCreatedate, Status) values('"+userid+"' , '"+username+"' , '"+password+"' , '"+email+"' , '"+DOB+"' , '"+type+"' , '"+ACD+"' , '"+status+"')");
			con.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
	
	public String[][] getProfile(String id){
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  "jdbc:mysql://localhost:3306/scroou","root","" );  
			Statement stmt=con.createStatement();		
			ResultSet rs= stmt.executeQuery("select * from user where id='"+id+"'");  
			rs.next();  
			String d[][] = { { rs.getString(1) , rs.getString(2) , rs.getString(3) , rs.getString(4) , rs.getString(5) , rs.getString(6) , rs.getString(7) , rs.getString(8) } };
			return d;
		}
		catch(Exception e){
			System.out.println(e);
			String f[][] = {};
			return f;
		}
	}
	
	public String[][] getProfileList(){
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  "jdbc:mysql://localhost:3306/scroou","root","" );  
			Statement stmt=con.createStatement();
			ResultSet rs= stmt.executeQuery("select count(*) from user");  
			rs.next();
			int i = Integer.parseInt(rs.getString(1)); 
			String d[][] = new String[i][8];		
			rs= stmt.executeQuery("select * from user");
			i = 0 ;
			while(rs.next()){
				for(int j=0 , count=1 ; j<8 ; j++ , count++){
					d[i][j] = rs.getString(count) ;
				}
				i++;
			}
			return d;
		}
		catch(Exception e){
			System.out.println(e);
			String f[][] = {};
			return f;
		}
	}
	
	public void setBand(String userid){	
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  "jdbc:mysql://localhost:3306/scroou","root","" );  
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select usertype from user where ID='"+userid+"'");
			rs.next();
			if( rs.getString(1).trim().equals("local") ){
				stmt.executeUpdate("update user set status='invalid' where id='"+userid+"'");
			}
			con.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
	
	public void setUnband(String userId){	
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  "jdbc:mysql://localhost:3306/scroou","root","" );  
			Statement stmt=con.createStatement();
			stmt.executeUpdate("update user set status='valid' where id='"+userId+"'");
			con.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
	/*
	public void delete(String userId){
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  "jdbc:mysql://localhost:3306/scroou","root","" );  
			Statement stmt=con.createStatement();
			stmt.executeUpdate("delete from user where id='"+userId+"'");
			con.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}*/
	
	public boolean game1checkidavailable(String userid){
		
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  "jdbc:mysql://localhost:3306/scroou","root","" );  
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select count(GamerID) from game1 where GamerID='"+userid+"'");
			rs.next();
			if( rs.getInt(1)==1 ){
				return true;
			}
			con.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
		
		return false;
		}
	
	public int game1checkhighscore(String userid){
		int c ;
		
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  "jdbc:mysql://localhost:3306/scroou","root","" );  
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select HighestScore from game1 where GamerID='"+userid+"'");
			rs.next();
			
				
			c=rs.getInt(1);
			con.close();
			return c;
		}
		catch(Exception e){
			System.out.println(e);
		}
		
return 0;

		
		
		
	}
	
	public void game1setinit(String userid){
		int zero = 0;
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  "jdbc:mysql://localhost:3306/scroou","root","" );  
			Statement stmt=con.createStatement();
			stmt.executeUpdate("insert into game1(GamerID,HighestScore) values ('"+userid+"' , '"+zero+"')");
			
			
				
			
			con.close();
			
		}
		catch(Exception e){
			System.out.println(e);
		}
		
	}
	
	
	public void game1updatehighscore(String userid,int sad){
		
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  "jdbc:mysql://localhost:3306/scroou","root","" );  
			Statement stmt=con.createStatement();
			stmt.executeUpdate("update game1 set HighestScore='"+sad+"' where GamerID ='"+userid+"'");
			//"update user set status='invalid' where id='"+userid+"'"
			
				
			
			con.close();
			
		}
		catch(Exception e){
			System.out.println(e);
		}
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
}  


