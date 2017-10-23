import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Layout extends JFrame implements ActionListener

{
	JFrame frame;
	//GridLayout g= new GridLayout(10,10);
	//JButton b[][]= new JButton[10][10];
	JLabel l;
	
	Icon ic=new ImageIcon("snakes.jpg");
	Icon ic1=new ImageIcon("1.jpg");
	Icon ic2=new ImageIcon("2.jpg");
	Icon ic3= new ImageIcon ("3.jpg");
	Icon ic4=new ImageIcon ("4.jpg");
	
	JButton b1 = new JButton(ic1);
	JButton b2 = new JButton(ic2);
	JButton b3 = new JButton(ic3);
	JButton b4 = new JButton(ic4);
	
	
	
	
	
	
	public Layout(JFrame frames)
	{
		this.frame = frames;
		//setSize(900,700);
		
		/*int a=100;
		for(int i=0;i<=9;i++)
		{
			if(i==0 || i%2==0)
			{
				for(int j=0;j<=9;j++)
				{
					String v=String.valueOf(a);
					b[i][j]=new JButton(v);
					frame.add(b[i][j]);
					if(a%2==0)//color change
					{
							b[i][j].setBackground(Color.RED);
					}
					else
					{
							b[i][j].setBackground(Color.BLUE);
					}
					
					a--;
				}
			}
			else if(i%2==1)
			{
				a=a-9;
				for(int j=0;j<=9;j++)
				{
					String v=String.valueOf(a);
					b[i][j]=new JButton(v);
					frame.add(b[i][j]);
					if(a%2==0)//color change
					{
							b[i][j].setBackground(Color.GREEN);
					}
					else
					{
							b[i][j].setBackground(Color.YELLOW);
					}
					a++;
				}
				a=a-11;
			}
	
	
		}*/
		l=new JLabel(ic);
		b1=new JButton(ic1);
		
		frame.add(l);
		l.setBounds(0,0,700,700);
		
		frame.add(b1);
		b1.setBounds(30,30,30,30);
		
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}
	public void actionPerformed(ActionEvent e)
	{
		
	}
}