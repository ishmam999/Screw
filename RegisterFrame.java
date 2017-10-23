import javax.swing.*;
import java.awt.event.*;

class RegisterFrame extends JFrame implements ActionListener{	
	JFrame frame ;
	
	JLabel l1= new JLabel("CREATING NEW SCROOU ACCOUNT");
	JLabel l2= new JLabel("USER ID");
	JLabel l3= new JLabel("USER NAME");
	JLabel l4= new JLabel("PASSWORD");
	JLabel l5= new JLabel("RE-ENTER PASSWORD");
	JLabel l6= new JLabel("EMAIL");
	JLabel l7= new JLabel("DATE OF BIRTH");
	JLabel l8= new JLabel("DAY");
	JLabel l9= new JLabel("MONTH");
	JLabel l10= new JLabel("YEAR");
	
	JTextField t=new JTextField();
	JTextField t1=new JTextField();
	JTextField t2=new JTextField();
	JTextField t3=new JTextField();
	JTextField t4=new JTextField();
	JTextField t5=new JTextField();
	JTextField t6=new JTextField();
	JTextField t7=new JTextField();
	JTextField t8=new JTextField();
	
	JButton b = new JButton("SUBMIT");
	JButton b1 = new JButton("BACK");
	
	public RegisterFrame(JFrame frame)	{
		this.frame = frame;
		
		frame.add(l1);
		l1.setBounds(150,20,200,20);
		frame.add(l2);
		l2.setBounds(50,70,80,20);
		frame.add(l3);
		l3.setBounds(50,100,80,20);
		frame.add(l4);
		l4.setBounds(50,130,80,20);
		frame.add(l5);
		l5.setBounds(50,160,150,20);
		frame.add(l6);
		l6.setBounds(50,190,80,20);
		frame.add(l7);
		l7.setBounds(50,230,100,20);
		frame.add(l8);
		l8.setBounds(210,210,100,20);
		frame.add(l9);
		l9.setBounds(260,210,100,20);
		frame.add(l10);
		l10.setBounds(315,210,100,20);
		frame.add(t);
		t.setBounds(210,70,170,20);
		frame.add(t1);
		t1.setBounds(210,100,170,20);
		frame.add(t2);
		t2.setBounds(210,130,170,20);
		frame.add(t3);
		t3.setBounds(210,160,170,20);
		frame.add(t4);
		t4.setBounds(210,190,170,20);
		frame.add(t5);
		t5.setBounds(210,230,35,20);
		frame.add(t6);
		t6.setBounds(260,230,35,20);
		frame.add(t7);
		t7.setBounds(315,230,50,20);
		frame.add(b);
		b.setBounds(300,260,80,30);
		frame.add(b1);
		b1.setBounds(300,300,80,30);

		b.addActionListener(this);
		b1.addActionListener(this);
		
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void actionPerformed(ActionEvent e){	
		if(e.getSource()==b){
			if( t.getText().trim().equals("") || t1.getText().trim().equals("") || t2.getText().trim().equals("") || t3.getText().trim().equals("") || t4.getText().trim().equals("") || t5.getText().trim().equals("") || t6.getText().trim().equals("") || t7.getText().trim().equals("") ){
				JOptionPane.showMessageDialog(this,"SOMETHING MISSING");
			}
			else{
				if( t2.getText().trim().equals( t3.getText().trim() ) && (Integer.parseInt(t5.getText())>0 && Integer.parseInt(t5.getText())<31) && (Integer.parseInt(t6.getText())>0 && Integer.parseInt(t6.getText())<13) ){				
					Register r = new Register();
					if(r.verifyregisterinfo(t.getText(),t1.getText(),t2.getText(),t4.getText(),t5.getText(),t6.getText(),t7.getText())==true){
						JOptionPane.showMessageDialog(this,"SCREW ACCOUNT SUCCESSFULLY CREATED");
						this.exitRegister();
						Register.setRegisterStatus(false);
					}
					else{
						JOptionPane.showMessageDialog(this,"SCREW ALREADY HAS THIS IN DATABASE");
					}
				}
				else {	
					JOptionPane.showMessageDialog(this,"PASSWORD IS NOT MATCH OR WRONG DATE OR WRONG MONTH!!!");
				}
			}
		}
		else if(e.getSource()==b1){
			this.exitRegister();
			Register.setRegisterStatus(false);
		}
	}
	
	public void exitRegister(){
		l1.setVisible(false);
		l2.setVisible(false);
		l3.setVisible(false);
		l4.setVisible(false);
		l5.setVisible(false);
		l6.setVisible(false);
		l7.setVisible(false);
		l8.setVisible(false);
		l9.setVisible(false);
		l10.setVisible(false);
			
		t.setVisible(false);
		t1.setVisible(false);
		t2.setVisible(false);
		t3.setVisible(false);
		t4.setVisible(false);
		t5.setVisible(false);
		t6.setVisible(false);
		t7.setVisible(false);
		t8.setVisible(false);
			
		b.setVisible(false);
		b1.setVisible(false);
	}
}
 
