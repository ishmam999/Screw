public class Login {
	public static boolean loginstatus = false;
	public static String uType;
	public static String id;
	
	public boolean verifylogininfo(String userid, String password){
		data DB=new data();
		uType = DB.checklogin( userid , password);
		
		if(uType.equals("admin") || uType.equals("local") ){
			loginstatus = true;
			id=userid;
			return true ;
		}
		else{
			loginstatus = false;
			return false;
		}		
	}
	
	public static void setLoginStatus(boolean status){
		loginstatus = status;
	}
	
	public static void setuType(String utyppe){
		uType=utyppe;
	}
	public static void setID(String ids){
		id=ids;
	}
}
