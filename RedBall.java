import java.awt.*;
import java.awt.event.*;

import javax.swing.*;


public class RedBall extends JPanel implements ActionListener, MouseMotionListener {

    private int ballx = 150;
    private int bally = 30;
    private int paddlex = 0;
    private int ballySpeed = 7;
    private int ballxSpeed = 5;
    public int score = 0;  
    private int scorefinal;
    public int bestscore;
    public boolean gameOver, started;
    public boolean status = true;
	
    public static JFrame wind ;

   
    protected void paintComponent(Graphics g) {

    	ImageIcon background = new ImageIcon("background.jpg");
		g.drawImage(background.getImage(), 0, 0, null);
        
        
        
        //draw the paddel
        g.setColor(Color.black);
        g.fillRect(paddlex, 450, 100, 10);

        
        //draw the ball
        g.setColor(Color.RED);
        g.fillOval(ballx, bally, 30, 30);

        
        //score	
       
        g.setColor(Color.black);
        g.setFont(new Font("Arial", 5, 20));
        g.drawString(String.valueOf("Score :" + score), 10, 80);
            
        
        
        // start && gameOver
        g.setColor(Color.black);
        g.setFont(new Font("Arial", 5, 20));

        if (gameOver) {

            g.drawString(String.valueOf("Best Score :" + scorefinal), 10, 100);

        }
    }

    public void actionPerformed(ActionEvent e) {

        ballx = ballx + ballxSpeed;
        bally = bally + ballySpeed;

        // Window Down 
        if (ballx >= paddlex && ballx <= paddlex + 100 && bally >= 420) {

            ballySpeed = -7;
            score++;

        }

        if (bally >= 430 ) {

            score = 0;
            bally = 30;
            gameOver = true;
            if(gameOver == true)
            {
            	int reply = JOptionPane.showConfirmDialog(null, "Do you want to play again?", "Redball",  JOptionPane.YES_NO_OPTION);
            	if (reply == JOptionPane.NO_OPTION)
            	{
            		bye();
            		//wind.dispose();
					
            	}
            }

        }

        // Window up
        if (bally <= 0) {

            ballySpeed = 7;

        }

        // Window right
        if (ballx >= 800) {

            ballxSpeed = -5;

        }

        // Window left
        if (ballx <= 0) {

            ballxSpeed = 5;

        }

       
        bestscore = score;
             
        if (scorefinal > bestscore) {

            scorefinal = scorefinal;

        } else {

            scorefinal = bestscore;
            scorefinal = score;
        }

        if(status==true){
			repaint();
		}
    }

    
    public void mouseMoved(MouseEvent e) {

        paddlex = e.getX() - 50;
        repaint();
    }


	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	void gameboard(){
		wind = new JFrame("RedBall");
        RedBall g = new RedBall();
        wind.add(g);
        
        wind.setSize(830, 500);
        wind.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        wind.setLocationRelativeTo(null);
        wind.setVisible(true);
        wind.addMouseMotionListener(g);
       

        Timer tt = new Timer(25, g);
        tt.start();
	}
	void bye(){
		System.exit(0);
		//wind.setVisible(false);
		//wind.dispose();
		
	}

 }
