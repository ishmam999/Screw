import java.awt.event.*;
import javax.swing.*;
import java.util.*;
class ludu extends JFrame implements ActionListener
{
	int x_axis = 30;
	int y_axis = 650;
	int final_num=1;
	int final_num1=1;
	JFrame frame;
	JButton b = new JButton("PLAYER 1");
	JButton bb = new JButton("PLAYER 2");
	
	JButton r = new JButton("RESET");
	JButton ex = new JButton("EXIT");
	
	JLabel l=new JLabel("WELCOME TO LUDU");
	JLabel l1=new JLabel();
	JLabel l2=new JLabel("PLAYER NO:1");
	JLabel l3=new JLabel("PLAYER 1 Position:");
	JLabel l4=new JLabel("PLAYER NO:2");
	JLabel l5=new JLabel("PLAYER 2 Position:");
	JLabel l6=new JLabel();
	JLabel l7=new JLabel();
	
	 int auto_gen=0;
	 int auto_gen1=0;
	int counter =0;
	int counter1=0;
	//GridLayout g= new GridLayout(10,10);
	//JButton b[][]= new JButton[10][10];
	JLabel lsnake;
	
	Icon ic=new ImageIcon("snakes.jpg");
	Icon ic1=new ImageIcon("green.jpg");
	Icon ic2=new ImageIcon("red.jpg");
	Icon ic3= new ImageIcon ("3.jpg");
	Icon ic4=new ImageIcon ("4.jpg");
	
	JButton b1 = new JButton(ic1);
	JButton b2 = new JButton(ic2);
	JButton b3 = new JButton(ic3);
	JButton b4 = new JButton(ic4);
	
	
	
	
	
	
	
	
	public ludu(JFrame frames)
	{
		this.frame = frames;
		//setSize(300,500);
		
		frame.add(b1);
		frame.setVisible(true);
		b1.setBounds(x_axis,y_axis,30,30);
		frame.add(b2);
		frame.setVisible(true);
		b2.setBounds(x_axis,y_axis,30,30);
		
		
		
		
		
		frame.add(l);
		l.setBounds(750,10,150,30);
		frame.add(l1);
		l1.setBounds(710,80,200,30);
		frame.add(l2);
		l2.setBounds(710,120,150,30);
		frame.add(l3);
		l3.setBounds(710,160,150,30);
		
		frame.add(l4);
		l4.setBounds(710,200,150,30);
		frame.add(l5);
		l5.setBounds(710,240,150,30);
		
		frame.add(b);
		b.setBounds(730,300,100,30);
		frame.add(bb);
		bb.setBounds(840,300,100,30);
		
		frame.add(l6);
		l6.setBounds(730,350,200,30);
		frame.add(l7);
		l7.setBounds(730,350,200,30);
		
		frame.add(r);
		r.setBounds(730,390,200,30);
		
		frame.add(ex);
		ex.setBounds(730,430,200,30);
		
		b.addActionListener(this);
		bb.addActionListener(this);
		r.addActionListener(this);
		ex.addActionListener(this);
		
		lsnake=new JLabel(ic);
		
		
		frame.add(lsnake);
		lsnake.setBounds(0,0,700,700);
		
		frame.setLayout(null);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==ex)
		{
			this.frame.setVisible(false);
		}
		if(e.getSource()==b)    
		{
			
			auto_gen=this.randInt(1,6);
			l1.setText("DICE NUMBER : "+String.valueOf(auto_gen));
			//x_axis=x_axis+(auto_gen*70);
			if(auto_gen==1 && counter == 0)
			{
				counter++;
			}
			else if(auto_gen==1 && counter == 1)
			{
				counter++;
				x_axis=450;
				y_axis=440;
				final_num=34;
			}
			else if( counter>=1)          
			{
				
				/*int d_xaxis=(x_axis-730)/70;
				x_axis=660;
				y_axis=580;
				//int minus= d_xaxis-730;
				x_axis=x_axis-(d_xaxis*70);
				counter++;*/
				
				
				final_num=final_num+auto_gen;
			
				if(final_num==1)
				{
					x_axis=30;
					y_axis=650;
				}
				if(final_num==2)
				{
					x_axis=100;
					y_axis=650;
				}
				if(final_num==3)
				{
					x_axis=170;
					y_axis=650;
				}
				if(final_num==4)
				{
					//x_axis=240;
					//y_axis=650;
					
					x_axis=450;
					y_axis=580;
					final_num=14;
				}
				if(final_num==5)
				{
					x_axis=310;
					y_axis=650;
				}
				if(final_num==6)
				{
					x_axis=380;
					y_axis=650;
				}
				if(final_num==7)
				{
					x_axis=450;
					y_axis=650;
				}
				if(final_num==8)
				{
					x_axis=520;
					y_axis=650;
				}
				if(final_num==9)
				{
					//x_axis=590;
					//y_axis=650;
				
					x_axis=660;
					y_axis=440;
					final_num=31;
				
				}
				if(final_num==10)
				{
					x_axis=660;
					y_axis=650;
				}
				if(final_num==11)
				{
					x_axis=660;
					y_axis=580;
				}
				if(final_num==12)
				{
					x_axis=590;
					y_axis=580;
				}
				if(final_num==13)
				{
					x_axis=520;
					y_axis=580;
				}
				if(final_num==14)
				{
					x_axis=450;
					y_axis=580;
				}
				if(final_num==15)
				{
					x_axis=380;
					y_axis=580;
				}
				if(final_num==16)
				{
					x_axis=310;
					y_axis=580;
				}
				if(final_num==17)
				{
					//x_axis=240;
					//y_axis=580;
				
					x_axis=450;
					y_axis=650;
					final_num=7;
				}
				if(final_num==18)
				{
					x_axis=170;
					y_axis=580;
				}
				if(final_num==19)
				{
					x_axis=100;
					y_axis=580;
				}
				if(final_num==20)
				{
					x_axis=30;
					y_axis=580;
				}
				
				if(final_num==21)
				{
					//x_axis=30;
					//y_axis=510;
					
					
					x_axis=100;
					y_axis=370;
					final_num=42;
				}
				if(final_num==22)
				{
					x_axis=100;
					y_axis=510;
				}
				if(final_num==23)
				{
					x_axis=170;
					y_axis=510;
				}
				if(final_num==24)
				{
					x_axis=240;
					y_axis=510;
				}
				if(final_num==25)
				{
					x_axis=310;
					y_axis=510;
				}
				if(final_num==26)
				{
					x_axis=380;
					y_axis=510;
				}
				if(final_num==27)
				{
					x_axis=450;
					y_axis=510;
				}
				if(final_num==28)
				{
					//x_axis=520;
					//y_axis=510;
					
					x_axis=240;
					y_axis=90;
					final_num=84;
				
				}
				if(final_num==29)
				{
					x_axis=590;
					y_axis=510;
				}
				if(final_num==30)
				{
					x_axis=660;
					y_axis=510;
				}
				if(final_num==31)
				{
					x_axis=660;
					y_axis=440;
				}
				if(final_num==32)
				{
					x_axis=590;
					y_axis=440;
				}
				if(final_num==33)
				{
					x_axis=520;
					y_axis=440;
				}
				if(final_num==34)
				{
					x_axis=450;
					y_axis=440;
				}
				if(final_num==35)
				{
					x_axis=380;
					y_axis=440;
				}
				if(final_num==36)
				{
					x_axis=310;
					y_axis=440;
				}
				if(final_num==37)
				{
					x_axis=240;
					y_axis=440;
				}
				if(final_num==38)
				{
					x_axis=170;
					y_axis=440;
				}
				if(final_num==39)
				{
					x_axis=100;
					y_axis=440;
				}
				if(final_num==40)
				{
					x_axis=30;
					y_axis=440;
				}
				
				if(final_num==41)
				{
					x_axis=30;
					y_axis=370;
				}
				if(final_num==42)
				{
					x_axis=100;
					y_axis=370;
				}
				if(final_num==43)
				{
					x_axis=170;
					y_axis=370;
				}
				if(final_num==44)
				{
					x_axis=240;
					y_axis=370;
				}
				if(final_num==45)
				{
					x_axis=310;
					y_axis=370;
				}
				if(final_num==46)
				{
					x_axis=380;
					y_axis=370;
				}
				if(final_num==47)
				{
					x_axis=450;
					y_axis=370;
				}
				if(final_num==48)
				{
					x_axis=520;
					y_axis=370;
				}
				if(final_num==49)
				{
					x_axis=590;
					y_axis=370;
				}
				if(final_num==50)
				{
					x_axis=660;
					y_axis=370;
				}
				if(final_num==51)
				{
					//x_axis=660;
					//y_axis=300;
					final_num=67;
				
					x_axis=450;
					y_axis=230;
					final_num=67;
				
				}
				if(final_num==52)
				{
					x_axis=590;
					y_axis=300;
				}
				if(final_num==53)
				{
					x_axis=520;
					y_axis=300;
				}
				if(final_num==54)
				{
					//x_axis=450;
					//y_axis=300;
					
					x_axis=450;
					y_axis=440;
					final_num=34;
				}
				if(final_num==55)
				{
					x_axis=380;
					y_axis=300;
				}
				if(final_num==56)
				{
					x_axis=310;
					y_axis=300;
				}
				if(final_num==57)
				{
					x_axis=240;
					y_axis=300;
				}
				if(final_num==58)
				{
					x_axis=170;
					y_axis=300;
				}
				if(final_num==59)
				{
					x_axis=100;
					y_axis=300;
				}
				if(final_num==60)
				{
					x_axis=30;
					y_axis=300;
				}
				
				if(final_num==61)
				{
					x_axis=30;
					y_axis=230;
				}
				if(final_num==62)
				{
					//x_axis=100;
					//y_axis=230;
					final_num=19;
				
					x_axis=100;
					y_axis=580;
					final_num=19;
				}
				if(final_num==63)
				{
					x_axis=170;
					y_axis=230;
				}
				if(final_num==64)
				{
					//x_axis=240;
					//y_axis=230;
					
					x_axis=30;
					y_axis=300;
					final_num=60;
				
				}
				if(final_num==65)
				{
					x_axis=310;
					y_axis=230;
				}
				if(final_num==66)
				{
					x_axis=380;
					y_axis=230;
				}
				if(final_num==67)
				{
					x_axis=450;
					y_axis=230;
				}
				if(final_num==68)
				{
					x_axis=520;
					y_axis=230;
				}
				if(final_num==69)
				{
					x_axis=590;
					y_axis=230;
				}
				if(final_num==70)
				{
					x_axis=660;
					y_axis=230;
				}
				if(final_num==71)
				{
					//x_axis=660;
					//y_axis=160;
				
					x_axis=660;
					y_axis=20;
					final_num=91;
				}
				if(final_num==72)
				{
					x_axis=590;
					y_axis=160;
				}
				if(final_num==73)
				{
					x_axis=520;
					y_axis=160;
				}
				if(final_num==74)
				{
					x_axis=450;
					y_axis=160;
				}
				if(final_num==75)
				{
					x_axis=380;
					y_axis=160;
				}
				if(final_num==76)
				{
					x_axis=310;
					y_axis=160;
				}
				if(final_num==77)
				{
					x_axis=240;
					y_axis=160;
				}
				if(final_num==78)
				{
					x_axis=170;
					y_axis=160;
				}
				if(final_num==79)
				{
					x_axis=100;
					y_axis=160;
				}
				if(final_num==80)
				{
					//x_axis=30;
					//y_axis=160;
				
					x_axis=30;
					y_axis=20;
					final_num=100;
				}
				
				if(final_num==81)
				{
					x_axis=30;
					y_axis=90;
				}
				if(final_num==82)
				{
					x_axis=100;
					y_axis=90;
				}
				if(final_num==83)
				{
					x_axis=170;
					y_axis=90;
				}
				if(final_num==84)
				{
					x_axis=240;
					y_axis=90;
				}
				if(final_num==85)
				{
					x_axis=310;
					y_axis=90;
				}
				if(final_num==86)
				{
					x_axis=380;
					y_axis=90;
				}
				if(final_num==87)
				{
					//x_axis=450;
					//y_axis=90;
				
					x_axis=240;
					y_axis=510;
					final_num=24;
				
				}
				if(final_num==88)
				{
					x_axis=520;
					y_axis=90;
				}
				if(final_num==89)
				{
					x_axis=590;
					y_axis=90;
				}
				if(final_num==90)
				{
					x_axis=660;
					y_axis=90;
				}
				if(final_num==91)
				{
					x_axis=660;
					y_axis=20;
				}
				if(final_num==92)
				{
					x_axis=590;
					y_axis=20;
				}
				if(final_num==93)
				{
					//x_axis=520;
					//y_axis=20;
				
					x_axis=520;
					y_axis=160;
					final_num=73;
				
				}
				if(final_num==94)
				{
					x_axis=450;
					y_axis=20;
				}
				if(final_num==95)
				{
					//x_axis=380;
					//y_axis=20;
					
					x_axis=380;
					y_axis=160;
					final_num=75;
				}
				if(final_num==96)
				{
					x_axis=310;
					y_axis=20;
				}
				if(final_num==97)
				{
					x_axis=240;
					y_axis=20;
				}
				if(final_num==98)
				{
					//x_axis=170;
					//y_axis=20;
				
					x_axis=100;
					y_axis=160;
					final_num=79;
				
				}
				if(final_num==99)
				{
					x_axis=100;
					y_axis=20;
				}
				if(final_num==100)
				{
					x_axis=30;
					y_axis=20;
				}
				
				if(final_num>=100)
				{
					JOptionPane.showMessageDialog(this,"PLAYER 1 WIN");
				}
				
				l3.setText("PLAYER 1 Position:"+String.valueOf(final_num));
				b1.setBounds(x_axis,y_axis,30,30);
				
				//l7.setVisible(false);
				//l6.setText("NOW TURN PLAYER 2");
				//l6.setVisible(true);
			}
		
		
			
			//else if (y_axis==580)
			//{
				//x_axis=x_axis-(auto_gen*70);
				//y_axis=580;
				
			//}*/
			//l3.setText("PLAYER 1 Position:"+String.valueOf(final_num));
			
			l7.setVisible(false);
				l6.setText("NOW TURN PLAYER 2");
				l6.setVisible(true);
				b.setVisible(false);
				bb.setVisible(true);
			
		}	
		
		
		if(e.getSource()==bb)    
		{
			
			auto_gen1=this.randInt(1,6);
			l1.setText("DICE NUMBER : "+String.valueOf(auto_gen1));
			
			if(auto_gen1==1 && counter1 == 0)
			{
				counter1++;
			}
			else if(auto_gen1==1 && counter1 == 1)
			{
				counter1++;
				x_axis=450;
				y_axis=440;
				final_num1=34;
			}
			else if( counter1>=1)     
			{
			
				final_num1=final_num1+auto_gen1;
				
				if(final_num1==1)
				{
					x_axis=25;
					y_axis=650;
				}
				if(final_num1==2)
				{
					x_axis=95;
					y_axis=650;
				}
				if(final_num1==3)
				{
					x_axis=165;
					y_axis=650;
				}
				if(final_num1==4)
				{
					//x_axis=240;
					//y_axis=650;
					
					x_axis=445;
					y_axis=580;
					final_num1=14;
				}
				if(final_num1==5)
				{
					x_axis=305;
					y_axis=650;
				}
				if(final_num1==6)
				{
					x_axis=375;
					y_axis=650;
				}
				if(final_num1==7)
				{
					x_axis=445;
					y_axis=650;
				}
				if(final_num1==8)
				{
					x_axis=515;
					y_axis=650;
				}
				if(final_num1==9)
				{
					//x_axis=590;
					//y_axis=650;
				
					x_axis=655;
					y_axis=440;
					final_num1=31;
				
				}
				if(final_num1==10)
				{
					x_axis=655;
					y_axis=650;
				}
				if(final_num1==11)
				{
					x_axis=655;
					y_axis=580;
				}
				if(final_num1==12)
				{
					x_axis=585;
					y_axis=580;
				}
				if(final_num1==13)
				{
					x_axis=515;
					y_axis=580;
				}
				if(final_num1==14)
				{
					x_axis=445;
					y_axis=580;
				}
				if(final_num1==15)
				{
					x_axis=375;
					y_axis=580;
				}
				if(final_num1==16)
				{
					x_axis=305;
					y_axis=580;
				}
				if(final_num1==17)
				{
					//x_axis=240;
					//y_axis=580;
				
					x_axis=445;
					y_axis=650;
					final_num1=7;
				}
				if(final_num1==18)
				{
					x_axis=165;
					y_axis=580;
				}
				if(final_num1==19)
				{
					x_axis=95;
					y_axis=580;
				}
				if(final_num1==20)
				{
					x_axis=25;
					y_axis=580;
				}
				
				if(final_num1==21)
				{
					//x_axis=30;
					//y_axis=510;
					
					
					x_axis=95;
					y_axis=370;
					final_num1=42;
				}
				if(final_num1==22)
				{
					x_axis=95;
					y_axis=510;
				}
				if(final_num1==23)
				{
					x_axis=165;
					y_axis=510;
				}
				if(final_num1==24)
				{
					x_axis=235;
					y_axis=510;
				}
				if(final_num1==25)
				{
					x_axis=305;
					y_axis=510;
				}
				if(final_num1==26)
				{
					x_axis=375;
					y_axis=510;
				}
				if(final_num1==27)
				{
					x_axis=445;
					y_axis=510;
				}
				if(final_num1==28)
				{
					//x_axis=520;
					//y_axis=510;
					
					x_axis=235;
					y_axis=90;
					final_num1=84;
				
				}
				if(final_num1==29)
				{
					x_axis=585;
					y_axis=510;
				}
				if(final_num1==30)
				{
					x_axis=655;
					y_axis=510;
				}
				if(final_num1==31)
				{
					x_axis=655;
					y_axis=440;
				}
				if(final_num1==32)
				{
					x_axis=585;
					y_axis=440;
				}
				if(final_num1==33)
				{
					x_axis=515;
					y_axis=440;
				}
				if(final_num1==34)
				{
					x_axis=445;
					y_axis=440;
				}
				if(final_num1==35)
				{
					x_axis=375;
					y_axis=440;
				}
				if(final_num1==36)
				{
					x_axis=305;
					y_axis=440;
				}
				if(final_num1==37)
				{
					x_axis=235;
					y_axis=440;
				}
				if(final_num1==38)
				{
					x_axis=165;
					y_axis=440;
				}
				if(final_num1==39)
				{
					x_axis=95;
					y_axis=440;
				}
				if(final_num1==40)
				{
					x_axis=25;
					y_axis=440;
				}
				
				if(final_num1==41)
				{
					x_axis=25;
					y_axis=370;
				}
				if(final_num1==42)
				{
					x_axis=95;
					y_axis=370;
				}
				if(final_num1==43)
				{
					x_axis=165;
					y_axis=370;
				}
				if(final_num1==44)
				{
					x_axis=235;
					y_axis=370;
				}
				if(final_num1==45)
				{
					x_axis=305;
					y_axis=370;
				}
				if(final_num1==46)
				{
					x_axis=375;
					y_axis=370;
				}
				if(final_num1==47)
				{
					x_axis=445;
					y_axis=370;
				}
				if(final_num1==48)
				{
					x_axis=515;
					y_axis=370;
				}
				if(final_num1==49)
				{
					x_axis=585;
					y_axis=370;
				}
				if(final_num1==50)
				{
					x_axis=655;
					y_axis=370;
				}
				if(final_num1==51)
				{
					//x_axis=660;
					//y_axis=300;
				
					x_axis=445;
					y_axis=230;
					final_num1=67;
				
				}
				if(final_num1==52)
				{
					x_axis=585;
					y_axis=300;
				}
				if(final_num1==53)
				{
					x_axis=515;
					y_axis=300;
				}
				if(final_num1==54)
				{
					//x_axis=450;
					//y_axis=300;
					
					x_axis=445;
					y_axis=440;
					final_num1=34;
				}
				if(final_num1==55)
				{
					x_axis=375;
					y_axis=300;
				}
				if(final_num1==56)
				{
					x_axis=305;
					y_axis=300;
				}
				if(final_num1==57)
				{
					x_axis=235;
					y_axis=300;
				}
				if(final_num1==58)
				{
					x_axis=165;
					y_axis=300;
				}
				if(final_num1==59)
				{
					x_axis=95;
					y_axis=300;
				}
				if(final_num1==60)
				{
					x_axis=25;
					y_axis=300;
				}
				
				if(final_num1==61)
				{
					x_axis=25;
					y_axis=230;
				}
				if(final_num1==62)
				{
					//x_axis=100;
					//y_axis=230;
				
					x_axis=95;
					y_axis=580;
					final_num1=19;
				}
				if(final_num1==63)
				{
					x_axis=165;
					y_axis=230;
				}
				if(final_num1==64)
				{
					//x_axis=240;
					//y_axis=230;
					
					x_axis=25;
					y_axis=300;
					final_num1=60;
				
				}
				if(final_num1==65)
				{
					x_axis=305;
					y_axis=230;
				}
				if(final_num1==66)
				{
					x_axis=375;
					y_axis=230;
				}
				if(final_num1==67)
				{
					x_axis=445;
					y_axis=230;
				}
				if(final_num1==68)
				{
					x_axis=515;
					y_axis=230;
				}
				if(final_num1==69)
				{
					x_axis=585;
					y_axis=230;
				}
				if(final_num1==70)
				{
					x_axis=655;
					y_axis=230;
				}
				if(final_num1==71)
				{
					//x_axis=660;
					//y_axis=160;
				
					x_axis=655;
					y_axis=20;
					final_num1=91;
				}
				if(final_num1==72)
				{
					x_axis=585;
					y_axis=160;
				}
				if(final_num1==73)
				{
					x_axis=515;
					y_axis=160;
				}
				if(final_num1==74)
				{
					x_axis=445;
					y_axis=160;
				}
				if(final_num1==75)
				{
					x_axis=375;
					y_axis=160;
				}
				if(final_num1==76)
				{
					x_axis=305;
					y_axis=160;
				}
				if(final_num1==77)
				{
					x_axis=235;
					y_axis=160;
				}
				if(final_num1==78)
				{
					x_axis=165;
					y_axis=160;
				}
				if(final_num1==79)
				{
					x_axis=95;
					y_axis=160;
				}
				if(final_num1==80)
				{
					//x_axis=30;
					//y_axis=160;
				
					x_axis=25;
					y_axis=20;
					final_num1=100;
				}
				
				if(final_num1==81)
				{
					x_axis=25;
					y_axis=90;
				}
				if(final_num1==82)
				{
					x_axis=95;
					y_axis=90;
				}
				if(final_num1==83)
				{
					x_axis=165;
					y_axis=90;
				}
				if(final_num1==84)
				{
					x_axis=235;
					y_axis=90;
				}
				if(final_num1==85)
				{
					x_axis=305;
					y_axis=90;
				}
				if(final_num1==86)
				{
					x_axis=375;
					y_axis=90;
				}
				if(final_num1==87)
				{
					//x_axis=450;
					//y_axis=90;
				
					x_axis=235;
					y_axis=510;
					final_num1=24;
				
				}
				if(final_num1==88)
				{
					x_axis=515;
					y_axis=90;
				}
				if(final_num1==89)
				{
					x_axis=585;
					y_axis=90;
				}
				if(final_num1==90)
				{
					x_axis=655;
					y_axis=90;
				}
				if(final_num1==91)
				{
					x_axis=655;
					y_axis=20;
				}
				if(final_num1==92)
				{
					x_axis=585;
					y_axis=20;
				}
				if(final_num1==93)
				{
					//x_axis=520;
					//y_axis=20;
				
					x_axis=515;
					y_axis=160;
					final_num1=73;
				
				}
				if(final_num1==94)
				{
					x_axis=445;
					y_axis=20;
				}
				if(final_num1==95)
				{
					//x_axis=380;
					//y_axis=20;
					
					x_axis=375;
					y_axis=160;
					final_num1=75;
				}
				if(final_num1==96)
				{
					x_axis=305;
					y_axis=20;
				}
				if(final_num1==97)
				{
					x_axis=235;
					y_axis=20;
				}
				if(final_num1==98)
				{
					//x_axis=170;
					//y_axis=20;
				
					x_axis=95;
					y_axis=160;
					final_num1=79;
				
				}
				if(final_num1==99)
				{
					x_axis=95;
					y_axis=20;
				}
				if(final_num1==100)
				{
					x_axis=25;
					y_axis=20;
				}
				if(final_num1>=100)
				{
					JOptionPane.showMessageDialog(this,"PLAYER 2 WIN");
				}
				l5.setText("PLAYER 2 Position:"+String.valueOf(final_num1));
				b2.setBounds(x_axis,y_axis,30,30);
				
				l6.setVisible(false);
				l7.setText("NOW TURN PLAYER 1");
				l7.setVisible(true);
			}
			
			l6.setVisible(false);
				l7.setText("NOW TURN PLAYER 1");
				l7.setVisible(true);
				bb.setVisible(false);
				b.setVisible(true);
		}
		
		
		if(e.getSource()==r)    
		{
			x_axis = 30;
			y_axis = 650;
			b1.setBounds(x_axis,y_axis,30,30);
			b2.setBounds(x_axis-5,y_axis,30,30);
			final_num=0;
			l3.setText("PLAYER 2 Position:"+String.valueOf(final_num));
			final_num1=0;
			l5.setText("PLAYER 2 Position:"+String.valueOf(final_num1));
			auto_gen=0;
			l1.setText("DICE NUMBER : "+String.valueOf(auto_gen));
			auto_gen1=0;
			l1.setText("DICE NUMBER : "+String.valueOf(auto_gen1));
			counter =0;
			counter1=0;
		}
		
	}
	
	
	public static int randInt(int min, int max) {
		Random rand = new Random();
		int randomNum = rand.nextInt((max - min) + 1) + min;
		return randomNum;
	}

}