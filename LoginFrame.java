import javax.swing.*;
import java.awt.event.*;

class LoginFrame extends JFrame implements ActionListener{  
	JFrame frame;
	
	JLabel l1= new JLabel("WELCOME TO SCROOU");
	JLabel l2= new JLabel("USER ID");
	JLabel l3= new JLabel("PASSWORD");
	JLabel l4= new JLabel("OR CREATE A NEW ACCOUNT");
	 
	JButton b= new JButton("LOGIN");
	JButton b1= new JButton("REGISTER");
	 
	JTextField t=new JTextField();
	JTextField t1=new JTextField();
	
	public LoginFrame(JFrame frames){	
		this.frame = frames;
		
		frame.add(l1);
		l1.setBounds(170,50,150,50);
		frame.add(l2);
		l2.setBounds(50,100,80,30);
		frame.add(l3);
		l3.setBounds(50,150,80,30);
		frame.add(t);
		t.setBounds(170,100,170,30);
		frame.add(t1);
		t1.setBounds(170,150,170,30);
		frame.add(b);
		b.setBounds(270,200,70,30);
		frame.add(b1);
		b1.setBounds(250,240,100,30);
		frame.add(l4);
		l4.setBounds(50,240,200,30);
		
		b.addActionListener(this);
		b1.addActionListener(this);
		
		frame.setLayout(null);
		frame.setVisible(true);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==b){	
			if(t.getText().trim().equals("") || t1.getText().trim().equals("")){
				JOptionPane.showMessageDialog(this,"SOMETHING MISSING");
			}
			else{
				Login l = new Login();	
				if(l.verifylogininfo(t.getText(),t1.getText())==true){
					this.setLogFrameInvisible();
					JOptionPane.showMessageDialog(this,"SUCCESSFULLY LOGIN");
				}
				else {
					JOptionPane.showMessageDialog(this,"BANNED or PASSWORD MISMATCH! ");
				}
			}
		}	
		if(e.getSource()==b1){
			RegisterFrame r=new RegisterFrame(frame);
			Register.setRegisterStatus(true);
			this.setLogFrameInvisible();
		}
	}
	void setLogFrameInvisible(){
		l1.setVisible(false);
		l2.setVisible(false);
		l3.setVisible(false);
		l4.setVisible(false);	
		b.setVisible(false);
		b1.setVisible(false);
		t.setVisible(false);
		t1.setVisible(false);
	}
	
	 
 }