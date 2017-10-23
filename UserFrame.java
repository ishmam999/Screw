import javax.swing.*;
import java.awt.event.*;

class UserFrame extends JFrame implements ActionListener{
	Localuser LU;
	JFrame frame;
	JFrame JF;
	JTable t;
	JScrollPane sp;
	
	JLabel l=new JLabel("WELCOME PLAYER");
	JButton b= new JButton("VIEW PROFILE");
	JButton b1= new JButton("CHOOSE GAMES");
	JButton b2= new JButton("LOGOUT");
	
	JLabel l1=new JLabel("VIEW PROFILE");
	JButton b3= new JButton("EXIT PROFILE VIEW");
	
	JLabel l2=new JLabel("CHOOSE GAMES");
	JButton b4= new JButton("HangMan");
	JButton b5= new JButton("Cheekers");
	JButton b6= new JButton("RedBall");
	JButton b7= new JButton("TicTacToe");
	JButton b10= new JButton("LuDo");
	JButton b8= new JButton("EXIT GAMES LIST");
	
	public UserFrame(JFrame frame){
		this.frame = frame;
		setUserFrameButtons();	
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
			LU = new Localuser();
			LU.userlogout();
			this.setUserFrameInvisible();
		}
		else if(e.getSource()==b3){
			exitProfileView();	
		}
		else if(e.getSource()==b4){
			hangman hang = new hangman();
		}
		else if(e.getSource()==b5){
			JF = new JFrame();
			JF.setSize( 900 , 769 );
			CheckersFrame CF = new CheckersFrame(JF);
		}
		else if(e.getSource()==b6){
			this.setUserFrameInvisible();
			RedBall rb = new RedBall(); 
	    	rb.gameboard();
	    	//this.setUserFrameInvisible();
		}
		else if(e.getSource()==b7){
			this.setUserFrameInvisible();
			TicTacToe t = new TicTacToe();  // game challu
			t.gamePanel(); 
			//this.setUserFrameInvisible();
		}
		else if(e.getSource()==b8){
			exitChooseGames();
		}
		else if(e.getSource()==b10){
			JF=new JFrame();
			JF.setSize(1000,748);
			ludu l1=new ludu(JF);
		}
	}
	
	public void viewProfile(){	
		setUserFrameInvisible();		
		setViewProfileButtons();
		setProfileViewVisible();	
	}
	
	public void exitProfileView(){
		setProfileViewInvisible();		
		setUserFrameVisible();
	}
	
	public void chooseGames(){
		setUserFrameInvisible();
		setChooseGameButtons();
		setExitChooseGameVisible();
	}
	
	public void exitChooseGames(){
		setExitChooseGameInvisible();	
		setUserFrameVisible();
	}
	
	public void setUserFrameButtons(){
		frame.add(l);
		l.setBounds(220,20,180,30);	
		frame.add(b);
		b.setBounds(200,150,150,30);
		frame.add(b1);
		b1.setBounds(200,190,150,30);
		frame.add(b2);
		b2.setBounds(200,230,150,30);
	}
	
	public void setViewProfileButtons(){	
		LU = new Localuser();
		String c[] = {"Id","Username","Password","Email","DOB", "UserType","AccountCreateDate", "Status"};
		t = new JTable( LU.ViewProfile(Login.id) ,c);
		sp = new JScrollPane(t);
		frame.add(l1);
		l1.setBounds(250,50,150,30);
		frame.add(sp);
		sp.setBounds(20,110,550,400);
		frame.add(b3);
		b3.setBounds(420,520,150,30);
	}
	
	public void setChooseGameButtons(){
		frame.add(l2);
		l2.setBounds(240,50,150,30);
		frame.add(b4);
		b4.setBounds(200,150,150,30);	
		frame.add(b5);
		b5.setBounds(200,190,150,30);
		frame.add(b6);
		b6.setBounds(200,230,150,30);
		frame.add(b7);
		b7.setBounds(200,270,150,30);
		frame.add(b8);
		b8.setBounds(420,520,150,30);
		frame.add(b10);
		b10.setBounds(200,310,150,30);
		
	}
	
	public void setActionListenner(){
		b.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b10.addActionListener(this);
	}
	
	public void setUserFrameInvisible(){
		b.setVisible(false);
		b1.setVisible(false);
		b2.setVisible(false);
		l.setVisible(false);
	}
	public void setUserFrameVisible(){
		b.setVisible(true);
		b1.setVisible(true);
		b2.setVisible(true);
		l.setVisible(true);
	}
	
	public void setProfileViewVisible(){
		l1.setVisible(true);
		sp.setVisible(true);
		b3.setVisible(true);
	}
	public void setProfileViewInvisible(){
		l1.setVisible(false);
		sp.setVisible(false);
		b3.setVisible(false);
	}
	
	public void setExitChooseGameVisible(){
		l2.setVisible(true);
		b4.setVisible(true);
		b5.setVisible(true);
		b6.setVisible(true);
		b7.setVisible(true);
		b8.setVisible(true);
		b10.setVisible(true);
	}
	public void setExitChooseGameInvisible(){
		l2.setVisible(false);
		b4.setVisible(false);
		b5.setVisible(false);
		b6.setVisible(false);
		b7.setVisible(false);
		b8.setVisible(false);
		b10.setVisible(false);
	}
 }