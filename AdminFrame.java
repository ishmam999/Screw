import javax.swing.*;
import java.awt.event.*;

class AdminFrame extends JFrame implements ActionListener{ 
	Adminuser AU = new Adminuser();
	JFrame frame, JF;
	
	JLabel l=new JLabel("WELCOME TO ADMIN PANEL");
	JButton b= new JButton("VIEW PROFILE");
	JButton b1= new JButton("CHOOSE GAMES");
	JButton b2= new JButton("VIEW USER LIST");
	JButton b3= new JButton("LOGOUT");
	JTable t;
	JScrollPane sp;
	
	JLabel l1=new JLabel("VIEW PROFILE");
	JButton b4= new JButton("EXIT PROFILE VIEW");
	
	JLabel l2=new JLabel("VIEW USER LIST");
	JButton b9= new JButton("EXIT VIEW LIST");
	//JButton bDelete = new JButton("DELETE USER");
	JButton bBand= new JButton("BAN");
	JButton bUnband = new JButton("UNBAN");
	JTextField tBand=new JTextField("");
	JLabel lBand=new JLabel("Enter id");
	
	
	JLabel l4=new JLabel("CHOOSE GAMES");
	JButton b10= new JButton("HangMan");
	JButton b11= new JButton("Cheekers");
	JButton b12= new JButton("RedBall");
	JButton b13= new JButton("TicTacToe");
	JButton b20= new JButton("Ludo");
	JButton b14= new JButton("EXIT GAMES LIST");

	public AdminFrame(JFrame frame){
		this.frame = frame;
		setAdminUserButtons();
		setActionListenner();
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==b){
			viewProfile();
		}
		else if(e.getSource()==b1){
			chooseGames();
		}
		else if(e.getSource()==b2){
			AU = new Adminuser();
			viewList();
		}
		else if(e.getSource()==b3){
			AU.userlogout();
			this.setAdminUserInvisible();
		}
		else if(e.getSource()==b4){
			exitProfileView();
		}
	/*	else if(e.getSource()==bDelete){
			AU.deleteUser(tBand.getText());
			tBand.setText("");
		}	*/
		else if(e.getSource()==bBand){
			AU.band(tBand.getText());
			tBand.setText("");
		}
		else if(e.getSource()==bUnband){
			AU.unband(tBand.getText());	
			tBand.setText("");
		}
		else if(e.getSource()==b9){
			exitViewList();
		}
		else if(e.getSource()==b10){
			hangman hang = new hangman();
		}
		else if(e.getSource()==b11){
			JF = new JFrame();
			frame.setSize( 900 , 769 );
			CheckersFrame CF = new CheckersFrame(JF);
		}
		else if(e.getSource()==b12){
			this.setAdminUserInvisible();
			RedBall rb = new RedBall(); 
	    	rb.gameboard();
		}
		else if(e.getSource()==b13){
			this.setAdminUserInvisible();
			TicTacToe t = new TicTacToe();
			t.gamePanel();
		}
		else if(e.getSource()==b14){
			exitChooseGames();	
		}
		else if(e.getSource()==b20){
			JF=new JFrame();
			JF.setSize(1000,748);
			ludu l1=new ludu(JF);
		}
	}
	
	public void viewProfile(){		
		setAdminUserInvisible();
		setViewProfileButtons();
		setViewProfileVisible();
	}
	public void exitProfileView(){
		setPrfileViewInvisible();	
		setAdminUserVisble();
	}
	
	public void chooseGames(){
		setAdminUserInvisible();
		setChooseGamesButtons();
		setChooseGamesVisible();
	}
	public void exitChooseGames(){
		setChooseGamesInvisible();	
		setAdminUserVisble();
	}
	
	public void viewList(){
		setAdminUserInvisible();
		setViewListButtons();
		setViewListVisible();
	}
	public void exitViewList(){
		setViewListInvisible();
		setAdminUserVisble();
	}
		
	public void setAdminUserButtons(){	
		frame.add(l);
		l.setBounds(200,20,180,30);
		frame.add(b);
		b.setBounds(200,150,150,30);
		frame.add(b1);
		b1.setBounds(200,190,150,30);
		frame.add(b2);
		b2.setBounds(200,230,150,30);
		frame.add(b3);
		b3.setBounds(200,270,150,30);
	}
	
	public void setViewProfileButtons(){
		AU = new Adminuser();
		String c[] = {"Id","Username","Password","Email","DOB", "UserType","AccountCreateDate", "Status"};
		t = new JTable( AU.ViewProfile(Login.id) ,c);
		sp = new JScrollPane(t);
		frame.add(l1);
		l1.setBounds(250,50,150,30);
		frame.add(sp);
		sp.setBounds(20,110,550,400);
		frame.add(b4);
		b4.setBounds(420,520,150,30);
	}
	
	public void setChooseGamesButtons(){	
		frame.add(l4);
		l4.setBounds(240,50,150,30);
		frame.add(b10);
		b10.setBounds(200,150,150,30);
		frame.add(b11);
		b11.setBounds(200,190,150,30);
		frame.add(b12);
		b12.setBounds(200,230,150,30);
		frame.add(b13);
		b13.setBounds(200,270,150,30);
		frame.add(b14);
		b14.setBounds(420,520,150,30);
		frame.add(b20);
		b20.setBounds(200,310,150,30);
	}
	
	public void setViewListButtons(){
		AU = new Adminuser();
		String c[] = {"Id","Username","Password","Email","DOB", "UserType","AccountCreateDate", "Status"};
		t = new JTable( AU.ViewProfileList() ,c);
		sp = new JScrollPane(t);
		frame.add(l2);
		l2.setBounds(200,50,150,30);
		frame.add(sp);
		sp.setBounds(20,110,450,400);
		frame.add(tBand);
		tBand.setBounds(475,150,90,30);
		frame.add(lBand);
		lBand.setBounds(500, 190 , 70 , 20);
		//frame.add(bDelete);
		//bDelete.setBounds(475,240,90,30);
		frame.add(bBand);
		bBand.setBounds(475,290,90,30);
		frame.add(bUnband);
		bUnband.setBounds(475,360,90,30);	
		frame.add(b9);
		b9.setBounds(420,520,150,30);
	}
	
	public void setActionListenner(){	
		b.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		bBand.addActionListener(this);
		bUnband.addActionListener(this);
		b9.addActionListener(this);
		b10.addActionListener(this);
		b11.addActionListener(this);
		b12.addActionListener(this);
		b13.addActionListener(this);
		b14.addActionListener(this);
		b20.addActionListener(this);
	}
	
	public void setAdminUserVisble(){
		b.setVisible(true);
		b1.setVisible(true);
		b2.setVisible(true);
		b3.setVisible(true);
		l.setVisible(true);
	}
	public void setAdminUserInvisible(){
		b.setVisible(false);
		b1.setVisible(false);
		b2.setVisible(false);
		b3.setVisible(false);
		l.setVisible(false);
	}
	
	public void setViewProfileVisible(){	
		l1.setVisible(true);
		sp.setVisible(true);
		b4.setVisible(true);
	}
	public void setPrfileViewInvisible(){	
		l1.setVisible(false);
		sp.setVisible(false);
		b4.setVisible(false);
	}
	
	public void setChooseGamesVisible(){	
		l4.setVisible(true);
		b10.setVisible(true);
		b11.setVisible(true);
		b12.setVisible(true);
		b13.setVisible(true);
		b14.setVisible(true);
		b20.setVisible(true);
	}
	public void setChooseGamesInvisible(){
		l4.setVisible(false);
		b10.setVisible(false);
		b11.setVisible(false);
		b12.setVisible(false);
		b13.setVisible(false);
		b14.setVisible(false);
		b20.setVisible(false);
	}
	
	public void setViewListVisible(){	
		lBand.setVisible(true);
		l2.setVisible(true);
		sp.setVisible(true);
		//bDelete.setVisible(true);
		bBand.setVisible(true);
		bUnband.setVisible(true);
		tBand.setVisible(true);
		b9.setVisible(true);
	}
	public void setViewListInvisible(){
		l2.setVisible(false);
		sp.setVisible(false);
		//bDelete.setVisible(false);
		bBand.setVisible(false);
		bUnband.setVisible(false);
		tBand.setVisible(false);
		b9.setVisible(false);
		lBand.setVisible(false);
	}
 }