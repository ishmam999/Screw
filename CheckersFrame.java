import java.awt.*;
import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

public class CheckersFrame extends JFrame implements ActionListener{
	JFrame JF;
	
	Icon baseB = new ImageIcon("pic/BOARD.jpg");
	JLabel lIconBase = new JLabel( baseB );

	CheckersPlayer player1;
	CheckersPlayer player2;
	
	JButton bPlayer1[] = new JButton[12];
	JButton bPlayer2[] = new JButton[12];
	JButton bExit = new JButton();
	
	Checkers player1B[] = new Checkers[12];
	Checkers player2B[] = new Checkers[12];
	
	JButton bDemo[] = new JButton[4];
	
	public int hieght = 40 ;
	public int width = 40 ;
	public int xAxis = 25 ;
	public int yAxis = 25 ;
	public int index , director , indexRight , indexLeft , indexUpRight , indexUpLeft ;
	public int count = 0 ;
	public int life1 = 12 ;
	public int life2 = 12 ;
	
	public boolean rightState = true ;
	public boolean leftState = true ;
	public boolean dUprightState = true ;
	public boolean dUpleftState = true ;
	
	public boolean SecrightState = true ;
	public boolean SecleftState = true ;
	public boolean SecdUprightState = true ;
	public boolean SecdUpleftState = true ;
	
	public CheckersFrame( JFrame frame ){
		JF = frame ;	
		/*Super("Checkers");*/
		
		player1 = new CheckersPlayer( true );
		player2 = new CheckersPlayer( false );
		
		
		bExit = new JButton("EXIT GAME");
		JF.add(bExit);
		bExit.setBounds( 750 , 650 , 100 , 40 );
		
		for( int i=0 ; i<12 ; i++ ){
			if(i==4){
				xAxis = 90 + 25 ;
				yAxis = yAxis + 90 ;
			}
			else if(i==8){
				xAxis = 25 ;
				yAxis = yAxis + 90 ;
			}
			bPlayer1[i] = new JButton();
			JF.add(bPlayer1[i]);
			player1B[i] = new Checkers( xAxis , yAxis , hieght , width , "single" );
			bPlayer1[i].setBounds( xAxis , yAxis , hieght , width );
			bPlayer1[i].setBackground(Color.BLACK);
			
			bPlayer2[i] = new JButton();
			JF.add(bPlayer2[i]);
			if(i>=4 && i<=7){
				player2B[i] = new Checkers( (xAxis -90) , (yAxis + 450) , hieght , width , "single" ) ;
				bPlayer2[i].setBounds( (xAxis -90) , (yAxis + 450) , hieght , width );
			}
			else{
				player2B[i] = new Checkers ((xAxis + 90) , (yAxis + 450) , hieght , width , "single" ) ;
				bPlayer2[i].setBounds( (xAxis + 90) , (yAxis + 450) , hieght , width );
			}
			xAxis = xAxis + 180 ;
			bPlayer2[i].setBackground(Color.RED);
		}
		for( int i=0 ; i<4 ; i++){
			bDemo[i]= new JButton();
			JF.add(bDemo[i]);
			bDemo[i].setVisible(true);
			bDemo[i].setBackground(Color.YELLOW);
		}
		
		setActionListenner();
		
		JF.add(lIconBase);
		lIconBase.setBounds( 0 , 0 , 722 , 722 );
		
		JF.setLayout(null);
		JF.setVisible(true);
		
		JF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent e){
		if(e.getSource()==bPlayer1[0]){
			if( player1.getStatus() == true ){
				director = 1;
				index = 0;
				if( player1B[0].getStatus().trim().equals("single") ){
					setTurningStatus1( 0 );
					setDemoS( 0 ) ;
					
				}
				else if( player1B[0].getStatus().trim().equals("couple") ){
					setTurningStatusD1( 0 );
					setDemoD( 0 ) ;
					
				}
			}
			else{
				JOptionPane.showMessageDialog(this,"Sorry player1!!! now player2's turn!!!");
			}
		}
		else if(e.getSource()==bPlayer1[1]){
			if( player1.getStatus() == true ){
				director = 1;
				index = 1;
				if( player1B[1].getStatus().trim().equals("single") ){
					setTurningStatus1( 1 );
					setDemoS( 1 ) ;
				}
				else if( player1B[1].getStatus().trim().equals("couple") ){
					setTurningStatusD1( 1 );
					setDemoD( 1 ) ;
				}
			}
			else{
				JOptionPane.showMessageDialog(this,"Sorry player1!!! now player2's turn!!!");
			}
		}
		else if(e.getSource()==bPlayer1[2]){
			if( player1.getStatus() == true ){
				director = 1;
				index = 2;
				if( player1B[2].getStatus().trim().equals("single") ){
					setTurningStatus1( 2 );
					setDemoS( 2 ) ;
				}
				else if( player1B[2].getStatus().trim().equals("couple") ){
					setTurningStatusD1( 2 );
					setDemoD( 2 ) ;
				}
			}
			else{
				JOptionPane.showMessageDialog(this,"Sorry player1!!! now player2's turn!!!");
			}
		}
		else if(e.getSource()==bPlayer1[3]){
			if( player1.getStatus() == true ){
				director = 1;
				index = 3;
				if( player1B[3].getStatus().trim().equals("single") ){
					setTurningStatus1( 3 );
					setDemoS( 3 ) ;
				}
				else if( player1B[3].getStatus().trim().equals("couple") ){
					setTurningStatusD1( 3 );
					setDemoD( 3 ) ;
				}
			}
			else{
				JOptionPane.showMessageDialog(this,"Sorry player1!!! now player2's turn!!!");
			}
		}
		else if(e.getSource()==bPlayer1[4]){
			if( player1.getStatus() == true ){
				director = 1;
				index = 4;
				if( player1B[4].getStatus().trim().equals("single") ){
					setTurningStatus1( 4 );
					setDemoS( 4 ) ;
				}
				else if( player1B[4].getStatus().trim().equals("couple") ){
					setTurningStatusD1( 4 );
					setDemoD( 4 ) ;
				}
			}
			else{
				JOptionPane.showMessageDialog(this,"Sorry player1!!! now player2's turn!!!");
			}
		}
		else if(e.getSource()==bPlayer1[5]){
			if( player1.getStatus() == true ){
				director = 1;
				index = 5;
				if( player1B[5].getStatus().trim().equals("single") ){
					setTurningStatus1( 5 );
					setDemoS( 5 ) ;
				}
				else if( player1B[5].getStatus().trim().equals("couple") ){
					setTurningStatusD1( 5 );
					setDemoD( 5 ) ;
				}
			}
			else{
				JOptionPane.showMessageDialog(this,"Sorry player1!!! now player2's turn!!!");
			}
		}
		else if(e.getSource()==bPlayer1[6]){
			if( player1.getStatus() == true ){
				director = 1;
				index = 6;
				if( player1B[6].getStatus().trim().equals("single") ){
					setTurningStatus1( 6 );
					setDemoS( 6 ) ;
				}
				else if( player1B[6].getStatus().trim().equals("couple") ){
					setTurningStatusD1( 6 );
					setDemoD( 6 ) ;
				}
			}
			else{
				JOptionPane.showMessageDialog(this,"Sorry player1!!! now player2's turn!!!");
			}
		}
		else if(e.getSource()==bPlayer1[7]){
			if( player1.getStatus() == true ){
				director = 1;
				index = 7;
				if( player1B[7].getStatus().trim().equals("single") ){
					setTurningStatus1( 7 );
					setDemoS( 7 ) ;
				}
				else if( player1B[7].getStatus().trim().equals("couple") ){
					setTurningStatusD1( 7 );
					setDemoD( 7 ) ;
				}
			}
			else{
				JOptionPane.showMessageDialog(this,"Sorry player1!!! now player2's turn!!!");
			}
		}
		else if(e.getSource()==bPlayer1[8]){
			if( player1.getStatus() == true ){
				director = 1;
				index = 8;
				if( player1B[8].getStatus().trim().equals("single") ){
					setTurningStatus1( 8 );
					setDemoS( 8 ) ;
				}
				else if( player1B[8].getStatus().trim().equals("couple") ){
					setTurningStatusD1( 8 );
					setDemoD( 8 ) ;
				}
			}
			else{
				JOptionPane.showMessageDialog(this,"Sorry player1!!! now player2's turn!!!");
			}
		}
		else if(e.getSource()==bPlayer1[9]){
			if( player1.getStatus() == true ){
				director = 1;
				index = 9;
				if( player1B[9].getStatus().trim().equals("single") ){
					setTurningStatus1( 9 );
					setDemoS( 9 ) ;
				}
				else if( player1B[9].getStatus().trim().equals("couple") ){
					setTurningStatusD1( 9 );
					setDemoD( 9 ) ;
				}
			}
			else{
				JOptionPane.showMessageDialog(this,"Sorry player1!!! now player2's turn!!!");
			}
		}
		else if(e.getSource()==bPlayer1[10]){
			if( player1.getStatus() == true ){
				director = 1;
				index = 10;
				if( player1B[10].getStatus().trim().equals("single") ){
					setTurningStatus1( 10 );
					setDemoS( 10 ) ;
				}
				else if( player1B[10].getStatus().trim().equals("couple") ){
					setTurningStatusD1( 10 );
					setDemoD( 10 ) ;
				}
			}
			else{
				JOptionPane.showMessageDialog(this,"Sorry player1!!! now player2's turn!!!");
			}
		}
		else if(e.getSource()==bPlayer1[11]){
			if( player1.getStatus() == true ){
				director = 1;
				index = 11;
				if( player1B[11].getStatus().trim().equals("single") ){
					setTurningStatus1( 11 );
					setDemoS( 11 ) ;
				}
				else if( player1B[11].getStatus().trim().equals("couple") ){
					setTurningStatusD1( 11 );
					setDemoD( 11 ) ;
				}
			}
			else{
				JOptionPane.showMessageDialog(this,"Sorry player1!!! now player2's turn!!!");
			}
		}
		else if(e.getSource()==bPlayer2[0]){
			if( player2.getStatus() == true ){
				director = 2;
				index = 0;
				if( player2B[0].getStatus().trim().equals("single") ){
					setTurningStatus2( 0 );
					setDemoS1( 0 ) ;
				}
				else if( player2B[0].getStatus().trim().equals("couple") ){
					setTurningStatusD2( 0 ) ;
					setDemoD1( 0 ) ;
				}
			}
			else{
				JOptionPane.showMessageDialog(this,"Sorry player2!!! now player1's turn!!!");
			}
		}
		else if(e.getSource()==bPlayer2[1]){
			if( player2.getStatus() == true ){
				director = 2;
				index = 1;
				if( player2B[1].getStatus().trim().equals("single") ){
					setTurningStatus2( 1 );
					setDemoS1( 1 ) ;
				}
				else if( player2B[1].getStatus().trim().equals("couple") ){
					setTurningStatusD2( 1 ) ;
					setDemoD1( 1 ) ;
				}
			}
			else{
				JOptionPane.showMessageDialog(this,"Sorry player2!!! now player1's turn!!!");
			}
		}
		else if(e.getSource()==bPlayer2[2]){
			if( player2.getStatus() == true ){
				director = 2;
				index = 2;
				if( player2B[2].getStatus().trim().equals("single") ){
					setTurningStatus2( 2 );
					setDemoS1( 2 ) ;
				}
				else if( player2B[2].getStatus().trim().equals("couple") ){
					setTurningStatusD2( 2 ) ;
					setDemoD1( 2 ) ;
				}
			}
			else{
				JOptionPane.showMessageDialog(this,"Sorry player2!!! now player1's turn!!!");
			}
		}
		else if(e.getSource()==bPlayer2[3]){
			if( player2.getStatus() == true ){
				director = 2;
				index = 3;
				if( player2B[3].getStatus().trim().equals("single") ){
					setTurningStatus2( 3 );
					setDemoS1( 3 ) ;
				}
				else if( player2B[3].getStatus().trim().equals("couple") ){
					setTurningStatusD2( 3 ) ;
					setDemoD1( 3 ) ;
				}
			}
			else{
				JOptionPane.showMessageDialog(this,"Sorry player2!!! now player1's turn!!!");
			}
		}
		else if(e.getSource()==bPlayer2[4]){
			if( player2.getStatus() == true ){
				director = 2;
				index = 4;
				if( player2B[4].getStatus().trim().equals("single") ){
					setTurningStatus2( 4 );
					setDemoS1( 4 ) ;
				}
				else if( player2B[4].getStatus().trim().equals("couple") ){
					setTurningStatusD2( 4 ) ;
					setDemoD1( 4 ) ;
				}
			}
			else{
				JOptionPane.showMessageDialog(this,"Sorry player2!!! now player1's turn!!!");
			}
		}
		else if(e.getSource()==bPlayer2[5]){
			if( player2.getStatus() == true ){
				director = 2;
				index = 5;
				if( player2B[5].getStatus().trim().equals("single") ){
					setTurningStatus2( 5 );
					setDemoS1( 5 ) ;
				}
				else if( player2B[5].getStatus().trim().equals("couple") ){
					setTurningStatusD2( 5 ) ;
					setDemoD1( 5 ) ;
				}
			}
			else{
				JOptionPane.showMessageDialog(this,"Sorry player2!!! now player1's turn!!!");
			}
		}
		else if(e.getSource()==bPlayer2[6]){
			if( player2.getStatus() == true ){
				director = 2;
				index = 6;
				if( player2B[6].getStatus().trim().equals("single") ){
					setTurningStatus2( 6 );
					setDemoS1( 6 ) ;
				}
				else if( player2B[6].getStatus().trim().equals("couple") ){
					setTurningStatusD2( 6 ) ;
					setDemoD1( 6 ) ;
				}
			}
			else{
				JOptionPane.showMessageDialog(this,"Sorry player2!!! now player1's turn!!!");
			}
		}
		else if(e.getSource()==bPlayer2[7]){
			if( player2.getStatus() == true ){
				director = 2;
				index = 7;
				if( player2B[7].getStatus().trim().equals("single") ){
					setTurningStatus2( 7 );
					setDemoS1( 7 ) ;
				}
				else if( player2B[7].getStatus().trim().equals("couple") ){
					setTurningStatusD2( 7 ) ;
					setDemoD1( 7 ) ;
				}
			}
			else{
				JOptionPane.showMessageDialog(this,"Sorry player2!!! now player1's turn!!!");
			}
		}
		else if(e.getSource()==bPlayer2[8]){
			if( player2.getStatus() == true ){
				director = 2;
				index = 8;
				if( player2B[8].getStatus().trim().equals("single") ){
					setTurningStatus2( 8 );
					setDemoS1( 8 ) ;
				}
				else if( player2B[8].getStatus().trim().equals("couple") ){
					setTurningStatusD2( 8 ) ;
					setDemoD1( 8 ) ;
				}
			}
			else{
				JOptionPane.showMessageDialog(this,"Sorry player2!!! now player1's turn!!!");
			}
		}
		else if(e.getSource()==bPlayer2[9]){
			if( player2.getStatus() == true ){
				director = 2;
				index = 9;
				if( player2B[9].getStatus().trim().equals("single") ){
					setTurningStatus2( 9 );
					setDemoS1( 9 ) ;
				}
				else if( player2B[9].getStatus().trim().equals("couple") ){
					setTurningStatusD2( 9 ) ;
					setDemoD1( 9 ) ;
				}
			}
			else{
				JOptionPane.showMessageDialog(this,"Sorry player2!!! now player1's turn!!!");
			}
		}
		else if(e.getSource()==bPlayer2[10]){
			if( player2.getStatus() == true ){
				director = 2;
				index = 10;
				if( player2B[10].getStatus().trim().equals("single") ){
					setTurningStatus2( 10 );
					setDemoS1( 10 ) ;
				}
				else if( player2B[10].getStatus().trim().equals("couple") ){
					setTurningStatusD2( 10 ) ;
					setDemoD1( 10 ) ;
				}
			}
			else{
				JOptionPane.showMessageDialog(this,"Sorry player2!!! now player1's turn!!!");
			}
		}
		else if(e.getSource()==bPlayer2[11]){
			if( player2.getStatus() == true ){
				director = 2;
				index = 11;
				if( player2B[11].getStatus().trim().equals("single") ){
					setTurningStatus2( 11 );
					setDemoS1( 11 ) ;
				}
				else if( player2B[11].getStatus().trim().equals("couple") ){
					setTurningStatusD2( 11 ) ;
					setDemoD1( 11 ) ;
				}
			}
			else{
				JOptionPane.showMessageDialog(this,"Sorry player2!!! now player1's turn!!!");
			}
		}
		else if(e.getSource()==bDemo[0]){
			if(director==1){
				if( rightState == true ){
					player1B[index].set( player1B[index].getXAxis()+90 , player1B[index].getYAxis()+90 , player1B[index].getHieght() , player1B[index].getWidth() );
					bPlayer1[index].setBounds( player1B[index].getXAxis() , player1B[index].getYAxis() , player1B[index].getHieght() , player1B[index].getWidth() );
					if(player1B[index].getYAxis()>=655){
						player1B[index].setStatus("couple");
						bPlayer1[index].setBackground(Color.GREEN);
					}
					player1.setStatus( false ) ;
					player2.setStatus( true ) ;
					setInvisibleTrue();
					if( life2==0 || checkMate(2)==true){
						JOptionPane.showMessageDialog(this,"player1 wins!!!");
					}
				}
				else if( SecrightState == true ){
					player1B[index].set( player1B[index].getXAxis()+180 , player1B[index].getYAxis()+180 , player1B[index].getHieght() , player1B[index].getWidth() );
					bPlayer1[index].setBounds( player1B[index].getXAxis() , player1B[index].getYAxis() , player1B[index].getHieght() , player1B[index].getWidth() );
					if(player1B[index].getYAxis()>=655){
						player1B[index].setStatus("couple");
						bPlayer1[index].setBackground(Color.GREEN);
					}
					bPlayer2[indexRight].setVisible(false);
					player2B[indexRight].set( -1000 , -1000 , 40 , 40 );
					player2B[indexRight].setStatus("invalid");
					life2--;
					player1.setStatus( false ) ;
					player2.setStatus( true ) ;
					setInvisibleTrue();
					if( life2==0 || checkMate(2)==true){
						JOptionPane.showMessageDialog(this,"player1 wins!!!");
					}
				}
			}
			else if(director==2){
				if( rightState == true ){
					player2B[index].set( player2B[index].getXAxis()+90 , player2B[index].getYAxis()+90 , player2B[index].getHieght() , player2B[index].getWidth() );
					bPlayer2[index].setBounds( player2B[index].getXAxis() , player2B[index].getYAxis() , player2B[index].getHieght() , player2B[index].getWidth() );
					player2.setStatus( false ) ;
					player1.setStatus( true ) ;
					setInvisibleTrue();
					if( life1==0 || checkMate(12)==true){
						JOptionPane.showMessageDialog(this,"player2 wins!!!");
					}
				}
				else if( SecrightState == true ){
					player2B[index].set( player2B[index].getXAxis()+180 , player2B[index].getYAxis()+180 , player2B[index].getHieght() , player2B[index].getWidth() );
					bPlayer2[index].setBounds( player2B[index].getXAxis() , player2B[index].getYAxis() , player2B[index].getHieght() , player2B[index].getWidth() );
					bPlayer1[indexRight].setVisible(false);
					player1B[indexRight].set( -1000 , -1000 , 40 , 40 );
					player1B[indexRight].setStatus("invalid");
					life1--;
					player2.setStatus( false ) ;
					player1.setStatus( true ) ;
					setInvisibleTrue();
					if( life1==0 || checkMate(12)==true){
						JOptionPane.showMessageDialog(this,"player2 wins!!!");
					}
				}
			}
		}
		else if(e.getSource()==bDemo[1]){
			if(director==1){
				if( leftState == true ){
					player1B[index].set( player1B[index].getXAxis()-90 , player1B[index].getYAxis()+90 , player1B[index].getHieght() , player1B[index].getWidth() );
					bPlayer1[index].setBounds( player1B[index].getXAxis() , player1B[index].getYAxis() , player1B[index].getHieght() , player1B[index].getWidth() );
					if(player1B[index].getYAxis()>=655){
						player1B[index].setStatus("couple");
						bPlayer1[index].setBackground(Color.GREEN);
					}
					player1.setStatus( false ) ;
					player2.setStatus( true ) ;
					setInvisibleTrue();
					if( life2==0 || checkMate(2)==true){
						JOptionPane.showMessageDialog(this,"player1 wins!!!");
					}
				}
				else if( SecleftState == true ){
					player1B[index].set( player1B[index].getXAxis()-180 , player1B[index].getYAxis()+180 , player1B[index].getHieght() , player1B[index].getWidth() );
					bPlayer1[index].setBounds( player1B[index].getXAxis() , player1B[index].getYAxis() , player1B[index].getHieght() , player1B[index].getWidth() );
					if(player1B[index].getYAxis()>=655){
						player1B[index].setStatus("couple");
						bPlayer1[index].setBackground(Color.GREEN);
					}
					bPlayer2[indexLeft].setVisible(false);
					player2B[indexLeft].set( -1000 , -1000 , 40 , 40 );
					player2B[indexLeft].setStatus("invalid");
					life2--;
					player1.setStatus( false ) ;
					player2.setStatus( true ) ;
					setInvisibleTrue();
					if( life2==0 || checkMate(2)==true){
						JOptionPane.showMessageDialog(this,"player1 wins!!!");
					}
				}
			}
			else if(director==2){
				if( leftState == true ){
					player2B[index].set( player2B[index].getXAxis()-90 , player2B[index].getYAxis()+90 , player2B[index].getHieght() , player2B[index].getWidth() );
					bPlayer2[index].setBounds( player2B[index].getXAxis() , player2B[index].getYAxis() , player2B[index].getHieght() , player2B[index].getWidth() );
					player2.setStatus( false ) ;
					player1.setStatus( true ) ;
					setInvisibleTrue();
					if( life1==0 || checkMate(1)==true){
						JOptionPane.showMessageDialog(this,"player2 wins!!!");
					}
				}
				else if( SecleftState == true ){
					player2B[index].set( player2B[index].getXAxis()-180 , player2B[index].getYAxis()+180 , player2B[index].getHieght() , player2B[index].getWidth() );
					bPlayer2[index].setBounds( player2B[index].getXAxis() , player2B[index].getYAxis() , player2B[index].getHieght() , player2B[index].getWidth() );
					bPlayer1[indexLeft].setVisible(false);
					player1B[indexLeft].set( -1000 , -1000 , 40 , 40 );
					player1B[indexLeft].setStatus("invalid");
					life1--;
					player2.setStatus( false ) ;
					player1.setStatus( true ) ;
					setInvisibleTrue();
					if( life1==0 || checkMate(1)==true){
						JOptionPane.showMessageDialog(this,"player2 wins!!!");
					}
				}
			}
		}
		else if(e.getSource()==bDemo[2]){
			if(director==1){
				if( dUprightState == true ){
					player1B[index].set( player1B[index].getXAxis()+90 , player1B[index].getYAxis()-90 , player1B[index].getHieght() , player1B[index].getWidth() );
					bPlayer1[index].setBounds( player1B[index].getXAxis() , player1B[index].getYAxis() , player1B[index].getHieght() , player1B[index].getWidth() );
					player1.setStatus( false ) ;
					player2.setStatus( true ) ;
					setInvisibleTrue();
					if( life2==0 || checkMate(2)==true){
						JOptionPane.showMessageDialog(this,"player1 wins!!!");
					}
				}
				else if( SecdUprightState == true ){
					player1B[index].set( player1B[index].getXAxis()+180 , player1B[index].getYAxis()-180 , player1B[index].getHieght() , player1B[index].getWidth() );
					bPlayer1[index].setBounds( player1B[index].getXAxis() , player1B[index].getYAxis() , player1B[index].getHieght() , player1B[index].getWidth() );
					bPlayer2[indexUpRight].setVisible(false);
					player2B[indexUpRight].set( -1000 , -1000 , 40 , 40 );
					player2B[indexUpRight].setStatus("invalid");
					life2--;
					player1.setStatus( false ) ;
					player2.setStatus( true ) ;
					setInvisibleTrue();
					if( life2==0 || checkMate(2)==true){
						JOptionPane.showMessageDialog(this,"player1 wins!!!");
					}
				}
			}
			else if(director==2){
				if( dUprightState == true ){
					player2B[index].set( player2B[index].getXAxis()+90 , player2B[index].getYAxis()-90 , player2B[index].getHieght() , player2B[index].getWidth() );
					bPlayer2[index].setBounds( player2B[index].getXAxis() , player2B[index].getYAxis() , player2B[index].getHieght() , player2B[index].getWidth() );
					if(player2B[index].getYAxis()<90){
						player2B[index].setStatus("couple");
						bPlayer2[index].setBackground(Color.BLUE);
					}
					player2.setStatus( false ) ;
					player1.setStatus( true ) ;
					setInvisibleTrue();
					if( life1==0 || checkMate(1)==true){
						JOptionPane.showMessageDialog(this,"player2 wins!!!");
					}
				}
				else if( SecdUprightState == true ){
					player2B[index].set( player2B[index].getXAxis()+180 , player2B[index].getYAxis()-180 , player2B[index].getHieght() , player2B[index].getWidth() );
					bPlayer2[index].setBounds( player2B[index].getXAxis() , player2B[index].getYAxis() , player2B[index].getHieght() , player2B[index].getWidth() );
					if(player2B[index].getYAxis()<90){
						player2B[index].setStatus("couple");
						bPlayer2[index].setBackground(Color.BLUE);
					}
					bPlayer1[indexUpRight].setVisible(false);
					player1B[indexUpRight].set( -1000 , -1000 , 40 , 40 );
					player1B[indexUpRight].setStatus("invalid");
					life1--;
					player2.setStatus( false ) ;
					player1.setStatus( true ) ;
					setInvisibleTrue();
					if( life1==0 || checkMate(1)==true){
						JOptionPane.showMessageDialog(this,"player2 wins!!!");
					}
				}
			}
		}
		else if(e.getSource()==bDemo[3]){
			if(director==1){
				if( dUpleftState == true ){
					player1B[index].set( player1B[index].getXAxis()-90 , player1B[index].getYAxis()-90 , player1B[index].getHieght() , player1B[index].getWidth() );
					bPlayer1[index].setBounds( player1B[index].getXAxis() , player1B[index].getYAxis() , player1B[index].getHieght() , player1B[index].getWidth() );
					player1.setStatus( false ) ;
					player2.setStatus( true ) ;
					setInvisibleTrue();
					if( life2==0 || checkMate(2)==true){
						JOptionPane.showMessageDialog(this,"player1 wins!!!");
					}
				}
				else if( SecdUpleftState == true ){
					player1B[index].set( player1B[index].getXAxis()-180 , player1B[index].getYAxis()-180 , player1B[index].getHieght() , player1B[index].getWidth() );
					bPlayer1[index].setBounds( player1B[index].getXAxis() , player1B[index].getYAxis() , player1B[index].getHieght() , player1B[index].getWidth() );
					bPlayer2[indexUpLeft].setVisible(false);
					player2B[indexUpLeft].set( -1000 , -1000 , 40 , 40 );
					player2B[indexUpLeft].setStatus("invalid");
					life2--;
					player1.setStatus( false ) ;
					player2.setStatus( true ) ;
					setInvisibleTrue();
					if( life2==0 || checkMate(2)==true){
						JOptionPane.showMessageDialog(this,"player1 wins!!!");
					}
				}
			}
			else if(director==2){
				if( dUpleftState == true ){
					player2B[index].set( player2B[index].getXAxis()-90 , player2B[index].getYAxis()-90 , player2B[index].getHieght() , player2B[index].getWidth() );
					bPlayer2[index].setBounds( player2B[index].getXAxis() , player2B[index].getYAxis() , player2B[index].getHieght() , player2B[index].getWidth() );
					if(player2B[index].getYAxis()<90){
						player2B[index].setStatus("couple");
						bPlayer2[index].setBackground(Color.BLUE);
					}
					player2.setStatus( false ) ;
					player1.setStatus( true ) ;
					setInvisibleTrue();
					if( life1==0 || checkMate(1)==true){
						JOptionPane.showMessageDialog(this,"player2 wins!!!");
					}
				}
				else if( SecdUpleftState == true ){
					player2B[index].set( player2B[index].getXAxis()-180 , player2B[index].getYAxis()-180 , player2B[index].getHieght() , player2B[index].getWidth() );
					bPlayer2[index].setBounds( player2B[index].getXAxis() , player2B[index].getYAxis() , player2B[index].getHieght() , player2B[index].getWidth() );
					if(player2B[index].getYAxis()<90){
						player2B[index].setStatus("couple");
						bPlayer2[index].setBackground(Color.BLUE);
					}
					bPlayer1[indexUpLeft].setVisible(false);
					player1B[indexUpLeft].set( -1000 , -1000 , 40 , 40 );
					player1B[indexUpLeft].setStatus("invalid");
					life1--;
					player2.setStatus( false ) ;
					player1.setStatus( true ) ;
					setInvisibleTrue();
					if( life1==0 || checkMate(1)==true){
						JOptionPane.showMessageDialog(this,"player2 wins!!!");
					}
				}
			}
		}
		else if(e.getSource()==bExit){
			JF.setVisible(false);
		}
	}
	
	public void refresh(){
		lIconBase.setVisible(true);
		for(int i=0 ; i<12 ; i++ ){
			bPlayer1[i].setVisible(true);
			bPlayer2[i].setVisible(true);
		}
	}
	
	
	public boolean checkMate( int state ){
		if(state==1){
			for(int i=0 ; i<12 ; i++ ){
				if( player1B[i].getStatus().trim().equals("single") ){
					if( (player1B[i].getYAxis()+90)<722 ){
						for( int j=0 ; j<12 ; j++){
							if(j!=i){
								if( (player1B[i].getXAxis()+90)<722 && rightState==true ){
									if( (player1B[i].getXAxis()+90)==player1B[j].getXAxis() && (player1B[i].getYAxis()+90)==player1B[j].getYAxis() ){
										rightState = false ;
										count++;
									}
								}
								else{
									rightState = false ;count++;
								}
								if( (player1B[i].getXAxis()-90)>0 && leftState==true ){
									if( (player1B[i].getXAxis()-90)==player1B[j].getXAxis() && (player1B[i].getYAxis()+90)==player1B[j].getYAxis() ){
										leftState = false ;count++;
									}
								}
								else{
									leftState = false ;count++;
								}
							}
							if( (player1B[i].getXAxis()+90)<722 && rightState==true ){
								if( (player1B[i].getXAxis()+90)==player2B[j].getXAxis() && (player1B[i].getYAxis()+90)==player2B[j].getYAxis() ){
									rightState = false ;count++;
								}
							}
							else{
								rightState = false ;count++;
							}
							if( (player1B[i].getXAxis()-90)>0 && leftState==true ){
								if( (player1B[i].getXAxis()-90)==player2B[j].getXAxis() && (player1B[i].getYAxis()+90)==player2B[j].getYAxis() ){
									leftState = false ;count++;
								}
							}
							else{
								leftState = false ;count++;
							}
						}
					}
				}
				else if( player2B[i].getStatus().trim().equals("couple") ){		
					if( (player1B[i].getYAxis()+90)<722 ){
						for( int j=0 ; j<12 ; j++){
							if(j!=i){
								if( (player1B[i].getXAxis()+90)<722 && rightState==true ){
									if( (player1B[i].getXAxis()+90)==player1B[j].getXAxis() && (player1B[i].getYAxis()+90)==player1B[j].getYAxis() ){
										rightState = false ;count++;
									}
								}
								else{
									rightState = false ;count++;
								}
								if( (player1B[i].getXAxis()-90)>0 && leftState==true ){
									if( (player1B[i].getXAxis()-90)==player1B[j].getXAxis() && (player1B[i].getYAxis()+90)==player1B[j].getYAxis() ){
										leftState = false ;count++;
									}
								}
								else{
									leftState = false ;count++;
								}
							}
							if( (player1B[i].getXAxis()+90)<722 && rightState==true ){
								if( (player1B[i].getXAxis()+90)==player2B[j].getXAxis() && (player1B[i].getYAxis()+90)==player2B[j].getYAxis() ){
									rightState = false ;count++;
								}
							}
							else{
								rightState = false ;count++;
							}
							if( (player1B[i].getXAxis()-90)>0 && leftState==true ){
								if( (player1B[i].getXAxis()-90)==player2B[j].getXAxis() && (player1B[i].getYAxis()+90)==player2B[j].getYAxis() ){
									leftState = false ;count++;
								}
							}
							else{
								leftState = false ;count++;
							}
						}
					}
		
					if( (player1B[i].getYAxis()-90)>0 ){
						for( int j=0 ; j<12 ; j++){
							if(j!=i){
								if( (player1B[i].getXAxis()+90)<722 && dUprightState==true ){
									if( (player1B[i].getXAxis()+90)==player1B[j].getXAxis() && (player1B[i].getYAxis()-90)==player1B[j].getYAxis() ){
										dUprightState = false ;count++;
									}
								}
								else{
									dUprightState = false ;count++;
								}
								if( (player1B[i].getXAxis()-90)>0 && dUpleftState==true ){
									if( (player1B[i].getXAxis()-90)==player1B[j].getXAxis() && (player1B[i].getYAxis()-90)==player1B[j].getYAxis() ){
										dUpleftState = false ;count++;
									}
								}
								else{
									dUpleftState = false ;count++;
								}
							}	
							if( (player1B[i].getXAxis()+90)<722 && dUprightState==true ){
								if( (player1B[i].getXAxis()+90)==player2B[j].getXAxis() && (player1B[i].getYAxis()-90)==player2B[j].getYAxis() ){
									dUprightState = false ;count++;
								}
							}
							else{
								dUprightState = false ;count++;
							}
							if( (player1B[i].getXAxis()-90)>0 && dUpleftState==true ){
								if( (player1B[i].getXAxis()-90)==player2B[j].getXAxis() && (player1B[i].getYAxis()-90)==player2B[j].getYAxis() ){
									dUpleftState = false ;count++;
								}
							}
							else{
								dUpleftState = false ;count++;
							}
						}
					}
				}	
			}
			if( (count/2)==life1){
				return true ;
			}
			else{
				return false ;
			}
		}
		else if(state == 2){
			for(int i=0 ; i<12 ; i++ ){
				if( player1B[i].getStatus().trim().equals("single") ){
					if( (player2B[i].getYAxis()-90)>0 ){
						for( int j=0 ; j<12 ; j++){
							if( (player2B[i].getXAxis()+90)<722 && dUprightState==true ){
								if( (player2B[i].getXAxis()+90)==player1B[j].getXAxis() && (player2B[i].getYAxis()-90)==player1B[j].getYAxis() ){
									dUprightState = false ;count++;
								}
							}
							else{
								dUprightState = false ;count++;
								}
							if( (player2B[i].getXAxis()-90)>0 && dUpleftState==true ){
								if( (player2B[i].getXAxis()-90)==player1B[j].getXAxis() && (player2B[i].getYAxis()-90)==player1B[j].getYAxis() ){
									dUpleftState = false ;count++;
								}
							}
							else{
								dUpleftState = false ;count++;
							}
							if(j!=i){
								if( (player2B[i].getXAxis()+90)<722 && dUprightState==true ){
									if( (player2B[i].getXAxis()+90)==player2B[j].getXAxis() && (player2B[i].getYAxis()-90)==player2B[j].getYAxis() ){
										dUprightState = false ;count++;
									}
								}
								else{
									dUprightState = false ;count++;
								}
								if( (player2B[i].getXAxis()-90)>0 && dUpleftState==true ){
									if( (player2B[i].getXAxis()-90)==player2B[j].getXAxis() && (player2B[i].getYAxis()-90)==player2B[j].getYAxis() ){
										dUpleftState = false ;count++;
									}
								}
								else{
									dUpleftState = false ;count++;
								}
							}
						}
					}
				}
				else if( player2B[i].getStatus().trim().equals("couple") ){	
					if( (player2B[i].getYAxis()-90)>0 ){
						for( int j=0 ; j<12 ; j++){
							if( (player2B[i].getXAxis()+90)<722 && dUprightState==true ){
								if( (player2B[i].getXAxis()+90)==player1B[j].getXAxis() && (player2B[i].getYAxis()-90)==player1B[j].getYAxis() ){
									dUprightState = false ;count++;
								}
							}
							else{
									dUprightState = false ;
							}
							if( (player2B[i].getXAxis()-90)>0 && dUpleftState==true ){
								if( (player2B[i].getXAxis()-90)==player1B[j].getXAxis() && (player2B[i].getYAxis()-90)==player1B[j].getYAxis() ){
									dUpleftState = false ;count++;
								}
							}
							else{
								dUpleftState = false ;count++;
							}
							if(j!=i){
								if( (player2B[i].getXAxis()+90)<722 && dUprightState==true ){
									if( (player2B[i].getXAxis()+90)==player2B[j].getXAxis() && (player2B[i].getYAxis()-90)==player2B[j].getYAxis() ){
										dUprightState = false ;count++;
									}
								}
								else{
									dUprightState = false ;count++;
								}
								if( (player2B[i].getXAxis()-90)>0 && dUpleftState==true ){
									if( (player2B[i].getXAxis()-90)==player2B[j].getXAxis() && (player2B[i].getYAxis()-90)==player2B[j].getYAxis() ){
										dUpleftState = false ;count++;
									}
								}
								else{
									dUpleftState = false ;count++;
								}
							}
						}
					}
		
					if( (player2B[i].getYAxis()+90)<722 ){
						for( int j=0 ; j<12 ; j++){
							if( (player2B[i].getXAxis()+90)<722 && rightState==true ){
								if( (player2B[i].getXAxis()+90)==player1B[j].getXAxis() && (player2B[i].getYAxis()+90)==player1B[j].getYAxis() ){
									rightState = false ;count++;
								}
							}
							else{
								rightState = false ;count++;
							}
							if( (player2B[i].getXAxis()-90)>0 && leftState==true ){
								if( (player2B[i].getXAxis()-90)==player1B[j].getXAxis() && (player2B[i].getYAxis()+90)==player1B[j].getYAxis() ){
									leftState = false ;
								}
							}
							else{
								leftState = false ;count++;
							}
							if(j!=i){
								if( (player2B[i].getXAxis()+90)<722 && rightState==true ){
									if( (player2B[i].getXAxis()+90)==player2B[j].getXAxis() && (player2B[i].getYAxis()+90)==player2B[j].getYAxis() ){
										rightState = false ;count++;
									}
								}
								else{
									rightState = false ;count++;
								}
								if( (player2B[i].getXAxis()-90)>0 && leftState==true ){
									if( (player2B[i].getXAxis()-90)==player2B[j].getXAxis() && (player2B[i].getYAxis()+90)==player2B[j].getYAxis() ){
										leftState = false ;count++;
									}
								}
								else{
									leftState = false ;count++;
								}
							}
						}
					}
				}
			}
			if( (count/2)==life2){
				return true ;
			}
			else{
				return false ;
			}
		}
		return false ;
	}
	
	public void setInvisibleTrue(){
			rightState = true ;
			leftState = true ;
			dUprightState = true ;
			dUpleftState = true ;
			bDemo[0].setVisible(false);
			bDemo[1].setVisible(false);
			bDemo[2].setVisible(false);
			bDemo[3].setVisible(false);
		}
	
	public void setTurningStatus1( int i ){
	//	refresh();
		setInvisibleTrue();
		
		if( (player1B[i].getYAxis()+90)<722 ){
			for( int j=0 ; j<12 ; j++){
				if(j!=i){
					if( (player1B[i].getXAxis()+90)<722 && rightState==true ){
						if( (player1B[i].getXAxis()+90)==player1B[j].getXAxis() && (player1B[i].getYAxis()+90)==player1B[j].getYAxis() ){
							rightState = false ;
						}
					}
					else{
						rightState = false ;
					}
					if( (player1B[i].getXAxis()-90)>0 && leftState==true ){
						if( (player1B[i].getXAxis()-90)==player1B[j].getXAxis() && (player1B[i].getYAxis()+90)==player1B[j].getYAxis() ){
							leftState = false ;
						}
					}
					else{
						leftState = false ;
					}
				}
				if( (player1B[i].getXAxis()+90)<722 && rightState==true ){
					if( (player1B[i].getXAxis()+90)==player2B[j].getXAxis() && (player1B[i].getYAxis()+90)==player2B[j].getYAxis() ){
						rightState = false ;
						indexRight = j ;
						/////
						if( (player1B[i].getYAxis()+180)<722 ){
							for( int k=0 ; k<12 ; k++){
								if(k!=i){
									if( (player1B[i].getXAxis()+180)<722 && SecrightState==true ){
										if( (player1B[i].getXAxis()+180)==player1B[k].getXAxis() && (player1B[i].getYAxis()+180)==player1B[k].getYAxis() ){
											SecrightState = false ;
										}
									}
									else{
										SecrightState = false ;
									}/*
									if( (player1B[i].getXAxis()-180)>0 && SecleftState==true ){
										if( (player1B[i].getXAxis()-180)==player1B[k].getXAxis() && (player1B[i].getYAxis()+180)==player1B[k].getYAxis() ){
											SecleftState = false ;
										}
									}
									else{
										SecleftState = false ;
									}*/
								}
								if( (player1B[i].getXAxis()+180)<722 && SecrightState==true ){
									if( (player1B[i].getXAxis()+180)==player2B[k].getXAxis() && (player1B[i].getYAxis()+180)==player2B[k].getYAxis() ){
										SecrightState = false ;
									}
								}
								else{
									SecrightState = false ;
								}/*
								if( (player1B[i].getXAxis()-180)>0 && SecleftState==true ){
									if( (player1B[i].getXAxis()-180)==player2B[k].getXAxis() && (player1B[i].getYAxis()+180)==player2B[k].getYAxis() ){
										SecleftState = false ;
									}
								}
								else{
									SecleftState = false ;
								}*/
							}
						}	
						/////
					}
				}
				else{
					rightState = false ;
				}
				if( (player1B[i].getXAxis()-90)>0 && leftState==true ){
					if( (player1B[i].getXAxis()-90)==player2B[j].getXAxis() && (player1B[i].getYAxis()+90)==player2B[j].getYAxis() ){
						leftState = false ;
						indexLeft = j ;
						////
						if( (player1B[i].getYAxis()+180)<722 ){
							for( int k=0 ; k<12 ; k++){
								if(k!=i){/*
									if( (player1B[i].getXAxis()+180)<722 && SecrightState==true ){
										if( (player1B[i].getXAxis()+180)==player1B[k].getXAxis() && (player1B[i].getYAxis()+180)==player1B[k].getYAxis() ){
											SecrightState = false ;
										}
									}
									else{
										SecrightState = false ;
									}*/
									if( (player1B[i].getXAxis()-180)>0 && SecleftState==true ){
										if( (player1B[i].getXAxis()-180)==player1B[k].getXAxis() && (player1B[i].getYAxis()+180)==player1B[k].getYAxis() ){
											SecleftState = false ;
										}
									}
									else{
										SecleftState = false ;
									}
								}/*
								if( (player1B[i].getXAxis()+180)<722 && SecrightState==true ){
									if( (player1B[i].getXAxis()+180)==player2B[k].getXAxis() && (player1B[i].getYAxis()+180)==player2B[k].getYAxis() ){
										SecrightState = false ;
									}
								}
								else{
									SecrightState = false ;
								}*/
								if( (player1B[i].getXAxis()-180)>0 && SecleftState==true ){
									if( (player1B[i].getXAxis()-180)==player2B[k].getXAxis() && (player1B[i].getYAxis()+180)==player2B[k].getYAxis() ){
										SecleftState = false ;
									}
								}
								else{
									SecleftState = false ;
								}
							}
						}
						////
					}
				}
				else{
					leftState = false ;
				}
			}
		}
	}

	public void setTurningStatus2( int i ){
	//	refresh();
		setInvisibleTrue();
		
		if( (player2B[i].getYAxis()-90)>0 ){
			for( int j=0 ; j<12 ; j++){
				if( (player2B[i].getXAxis()+90)<722 && dUprightState==true ){
					if( (player2B[i].getXAxis()+90)==player1B[j].getXAxis() && (player2B[i].getYAxis()-90)==player1B[j].getYAxis() ){
						dUprightState = false ;
						indexUpRight = j ;
						/////
						if( (player2B[i].getYAxis()-180)>0 ){
							for( int k=0 ; k<12 ; k++){
								if( (player2B[i].getXAxis()+180)<722 && SecdUprightState==true ){
									if( (player2B[i].getXAxis()+180)==player1B[k].getXAxis() && (player2B[i].getYAxis()-180)==player1B[k].getYAxis() ){
										SecdUprightState = false ;
									}
								}
								else{
									SecdUprightState = false ;
								}/*
								if( (player2B[i].getXAxis()-180)>0 && SecdUpleftState==true ){
									if( (player2B[i].getXAxis()-180)==player1B[k].getXAxis() && (player2B[i].getYAxis()-180)==player1B[k].getYAxis() ){
										SecdUpleftState = false ;
									}
								}
								else{
									SecdUpleftState = false ;
								}*/
								if(k!=i){
									if( (player2B[i].getXAxis()+180)<722 && SecdUprightState==true ){
										if( (player2B[i].getXAxis()+180)==player2B[k].getXAxis() && (player2B[i].getYAxis()-180)==player2B[k].getYAxis() ){
											SecdUprightState = false ;
										}
									}
									else{
										SecdUprightState = false ;
									}/*
									if( (player2B[i].getXAxis()-180)>0 && SecdUpleftState==true ){
										if( (player2B[i].getXAxis()-180)==player2B[k].getXAxis() && (player2B[i].getYAxis()-180)==player2B[k].getYAxis() ){
											SecdUpleftState = false ;
										}
									}
									else{
										SecdUpleftState = false ;
									}*/
								}
							}
						}
						////
					}
				}
				else{
					dUprightState = false ;
				}
				if( (player2B[i].getXAxis()-90)>0 && dUpleftState==true ){
					if( (player2B[i].getXAxis()-90)==player1B[j].getXAxis() && (player2B[i].getYAxis()-90)==player1B[j].getYAxis() ){
						dUpleftState = false ;
						indexUpLeft = j ;
						////
						if( (player2B[i].getYAxis()-180)>0 ){
							for( int k=0 ; k<12 ; k++){/*
								if( (player2B[i].getXAxis()+180)<722 && SecdUprightState==true ){
									if( (player2B[i].getXAxis()+180)==player1B[k].getXAxis() && (player2B[i].getYAxis()-180)==player1B[k].getYAxis() ){
										SecdUprightState = false ;
									}
								}
								else{
									SecdUprightState = false ;
								}*/
								if( (player2B[i].getXAxis()-180)>0 && SecdUpleftState==true ){
									if( (player2B[i].getXAxis()-180)==player1B[k].getXAxis() && (player2B[i].getYAxis()-180)==player1B[k].getYAxis() ){
										SecdUpleftState = false ;
									}
								}
								else{
									SecdUpleftState = false ;
								}
								if(k!=i){/*
									if( (player2B[i].getXAxis()+180)<722 && SecdUprightState==true ){
										if( (player2B[i].getXAxis()+180)==player2B[k].getXAxis() && (player2B[i].getYAxis()-180)==player2B[k].getYAxis() ){
											SecdUprightState = false ;
										}
									}
									else{
										SecdUprightState = false ;
									}*/
									if( (player2B[i].getXAxis()-180)>0 && SecdUpleftState==true ){
										if( (player2B[i].getXAxis()-180)==player2B[k].getXAxis() && (player2B[i].getYAxis()-180)==player2B[k].getYAxis() ){
											SecdUpleftState = false ;
										}
									}
									else{
										SecdUpleftState = false ;
									}
								}
							}
						}
						////
					}
				}
				else{
					dUpleftState = false ;
				}
				if(j!=i){
					if( (player2B[i].getXAxis()+90)<722 && dUprightState==true ){
						if( (player2B[i].getXAxis()+90)==player2B[j].getXAxis() && (player2B[i].getYAxis()-90)==player2B[j].getYAxis() ){
							dUprightState = false ;
						}
					}
					else{
						dUprightState = false ;
					}
					if( (player2B[i].getXAxis()-90)>0 && dUpleftState==true ){
						if( (player2B[i].getXAxis()-90)==player2B[j].getXAxis() && (player2B[i].getYAxis()-90)==player2B[j].getYAxis() ){
							dUpleftState = false ;
						}
					}
					else{
						dUpleftState = false ;
					}
				}
			}
		}
	}
	
	public void setTurningStatusD1( int i ){
		//refresh();
		setInvisibleTrue();
		
		if( (player1B[i].getYAxis()+90)<722 ){
			for( int j=0 ; j<12 ; j++){
				if(j!=i){
					if( (player1B[i].getXAxis()+90)<722 && rightState==true ){
						if( (player1B[i].getXAxis()+90)==player1B[j].getXAxis() && (player1B[i].getYAxis()+90)==player1B[j].getYAxis() ){
							rightState = false ;
						}
					}
					else{
						rightState = false ;
					}
					if( (player1B[i].getXAxis()-90)>0 && leftState==true ){
						if( (player1B[i].getXAxis()-90)==player1B[j].getXAxis() && (player1B[i].getYAxis()+90)==player1B[j].getYAxis() ){
							leftState = false ;
						}
					}
					else{
						leftState = false ;
					}
				}
				if( (player1B[i].getXAxis()+90)<722 && rightState==true ){
					if( (player1B[i].getXAxis()+90)==player2B[j].getXAxis() && (player1B[i].getYAxis()+90)==player2B[j].getYAxis() ){
						rightState = false ;
						indexRight = j ;
						////
						if( (player1B[i].getYAxis()+180)<722 ){
							for( int k=0 ; k<12 ; k++){
								if(k!=i){
									if( (player1B[i].getXAxis()+180)<722 && SecrightState==true ){
										if( (player1B[i].getXAxis()+180)==player1B[k].getXAxis() && (player1B[i].getYAxis()+180)==player1B[k].getYAxis() ){
											SecrightState = false ;
										}
									}
									else{
										SecrightState = false ;
									}/*
									if( (player1B[i].getXAxis()-180)>0 && SecleftState==true ){
										if( (player1B[i].getXAxis()-180)==player1B[k].getXAxis() && (player1B[i].getYAxis()+180)==player1B[k].getYAxis() ){
											SecleftState = false ;
										}
									}
									else{
										SecleftState = false ;
									}*/
								}
								if( (player1B[i].getXAxis()+180)<722 && SecrightState==true ){
									if( (player1B[i].getXAxis()+180)==player2B[k].getXAxis() && (player1B[i].getYAxis()+180)==player2B[k].getYAxis() ){
										SecrightState = false ;
									}
								}
								else{
									SecrightState = false ;
								}/*
								if( (player1B[i].getXAxis()-180)>0 && SecleftState==true ){
									if( (player1B[i].getXAxis()-180)==player2B[k].getXAxis() && (player1B[i].getYAxis()+180)==player2B[k].getYAxis() ){
										SecleftState = false ;
									}
								}
								else{
									SecleftState = false ;
								}*/
							}
						}
						////
					}
				}
				else{
					rightState = false ;
				}
				if( (player1B[i].getXAxis()-90)>0 && leftState==true ){
					if( (player1B[i].getXAxis()-90)==player2B[j].getXAxis() && (player1B[i].getYAxis()+90)==player2B[j].getYAxis() ){
						leftState = false ;
						indexLeft = j ;
						////
						if( (player1B[i].getYAxis()+180)<722 ){
							for( int k=0 ; k<12 ; k++){
								if(k!=i){/*
									if( (player1B[i].getXAxis()+180)<722 && SecrightState==true ){
										if( (player1B[i].getXAxis()+180)==player1B[k].getXAxis() && (player1B[i].getYAxis()+180)==player1B[k].getYAxis() ){
											SecrightState = false ;
										}
									}
									else{
										SecrightState = false ;
									}*/
									if( (player1B[i].getXAxis()-180)>0 && SecleftState==true ){
										if( (player1B[i].getXAxis()-180)==player1B[k].getXAxis() && (player1B[i].getYAxis()+180)==player1B[k].getYAxis() ){
											SecleftState = false ;
										}
									}
									else{
										SecleftState = false ;
									}
								}/*
								if( (player1B[i].getXAxis()+180)<722 && SecrightState==true ){
									if( (player1B[i].getXAxis()+180)==player2B[k].getXAxis() && (player1B[i].getYAxis()+180)==player2B[k].getYAxis() ){
										SecrightState = false ;
									}
								}
								else{
									SecrightState = false ;
								}*/
								if( (player1B[i].getXAxis()-180)>0 && SecleftState==true ){
									if( (player1B[i].getXAxis()-180)==player2B[k].getXAxis() && (player1B[i].getYAxis()+180)==player2B[k].getYAxis() ){
										SecleftState = false ;
									}
								}
								else{
									SecleftState = false ;
								}
							}
						}
						/////
					}
				}
				else{
					leftState = false ;
				}
			}
		}
		
		if( (player1B[i].getYAxis()-90)>0 ){
			for( int j=0 ; j<12 ; j++){
				if(j!=i){
					if( (player1B[i].getXAxis()+90)<722 && dUprightState==true ){
						if( (player1B[i].getXAxis()+90)==player1B[j].getXAxis() && (player1B[i].getYAxis()-90)==player1B[j].getYAxis() ){
							dUprightState = false ;
						}
					}
					else{
						dUprightState = false ;
					}
					if( (player1B[i].getXAxis()-90)>0 && dUpleftState==true ){
						if( (player1B[i].getXAxis()-90)==player1B[j].getXAxis() && (player1B[i].getYAxis()-90)==player1B[j].getYAxis() ){
							dUpleftState = false ;
						}
					}
					else{
						dUpleftState = false ;
					}
				}
				if( (player1B[i].getXAxis()+90)<722 && dUprightState==true ){
					if( (player1B[i].getXAxis()+90)==player2B[j].getXAxis() && (player1B[i].getYAxis()-90)==player2B[j].getYAxis() ){
						dUprightState = false ;
						indexUpRight = j ;
						////
						if( (player1B[i].getYAxis()-180)>0 ){
							for( int k=0 ; k<12 ; k++){
								if(k!=i){
									if( (player1B[i].getXAxis()+180)<722 && SecdUprightState==true ){
										if( (player1B[i].getXAxis()+180)==player1B[k].getXAxis() && (player1B[i].getYAxis()-180)==player1B[k].getYAxis() ){
											SecdUprightState = false ;
										}
									}
									else{
										SecdUprightState = false ;
									}/*
									if( (player1B[i].getXAxis()-180)>0 && SecdUpleftState==true ){
										if( (player1B[i].getXAxis()-180)==player1B[k].getXAxis() && (player1B[i].getYAxis()-180)==player1B[k].getYAxis() ){
											SecdUpleftState = false ;
										}
									}
									else{
										SecdUpleftState = false ;
									}*/
								}
								if( (player1B[i].getXAxis()+180)<722 && SecdUprightState==true ){
									if( (player1B[i].getXAxis()+180)==player2B[k].getXAxis() && (player1B[i].getYAxis()-180)==player2B[k].getYAxis() ){
										SecdUprightState = false ;
									}
								}
								else{
									SecdUprightState = false ;
								}/*
								if( (player1B[i].getXAxis()-180)>0 && SecdUpleftState==true ){
									if( (player1B[i].getXAxis()-180)==player2B[k].getXAxis() && (player1B[i].getYAxis()-180)==player2B[k].getYAxis() ){
										SecdUpleftState = false ;
									}
								}
								else{
									SecdUpleftState = false ;
								}*/
							}
						}
						////
					}
				}
				else{
					dUprightState = false ;
				}
				if( (player1B[i].getXAxis()-90)>0 && dUpleftState==true ){
					if( (player1B[i].getXAxis()-90)==player2B[j].getXAxis() && (player1B[i].getYAxis()-90)==player2B[j].getYAxis() ){
						dUpleftState = false ;
						indexUpLeft = j ;
						////
						if( (player1B[i].getYAxis()-180)>0 ){
							for( int k=0 ; k<12 ; k++){
								if(k!=i){/*
									if( (player1B[i].getXAxis()+180)<722 && SecdUprightState==true ){
										if( (player1B[i].getXAxis()+180)==player1B[k].getXAxis() && (player1B[i].getYAxis()-180)==player1B[k].getYAxis() ){
											SecdUprightState = false ;
										}
									}
									else{
										SecdUprightState = false ;
									}*/
									if( (player1B[i].getXAxis()-180)>0 && SecdUpleftState==true ){
										if( (player1B[i].getXAxis()-180)==player1B[k].getXAxis() && (player1B[i].getYAxis()-180)==player1B[k].getYAxis() ){
											SecdUpleftState = false ;
										}
									}
									else{
										SecdUpleftState = false ;
									}
								}/*
								if( (player1B[i].getXAxis()+180)<722 && SecdUprightState==true ){
									if( (player1B[i].getXAxis()+180)==player2B[k].getXAxis() && (player1B[i].getYAxis()-180)==player2B[k].getYAxis() ){
										SecdUprightState = false ;
									}
								}
								else{
									SecdUprightState = false ;
								}*/
								if( (player1B[i].getXAxis()-180)>0 && SecdUpleftState==true ){
									if( (player1B[i].getXAxis()-180)==player2B[k].getXAxis() && (player1B[i].getYAxis()-180)==player2B[k].getYAxis() ){
										SecdUpleftState = false ;
									}
								}
								else{
									SecdUpleftState = false ;
								}
							}
						}
						/////
					}
				}
				else{
					dUpleftState = false ;
				}
			}
		}
	}
	
	public void setTurningStatusD2( int i ){
		//refresh();
		setInvisibleTrue();
		
		if( (player2B[i].getYAxis()-90)>0 ){
			for( int j=0 ; j<12 ; j++){
				if( (player2B[i].getXAxis()+90)<722 && dUprightState==true ){
					if( (player2B[i].getXAxis()+90)==player1B[j].getXAxis() && (player2B[i].getYAxis()-90)==player1B[j].getYAxis() ){
						dUprightState = false ;
						indexUpRight = j ;
						/////
						if( (player2B[i].getYAxis()-180)>0 ){
							for( int k=0 ; k<12 ; k++){
								if( (player2B[i].getXAxis()+180)<722 && SecdUprightState==true ){
									if( (player2B[i].getXAxis()+180)==player1B[k].getXAxis() && (player2B[i].getYAxis()-180)==player1B[k].getYAxis() ){
										SecdUprightState = false ;
									}
								}
								else{
									SecdUprightState = false ;
								}/*
								if( (player2B[i].getXAxis()-180)>0 && SecdUpleftState==true ){
									if( (player2B[i].getXAxis()-180)==player1B[k].getXAxis() && (player2B[i].getYAxis()-180)==player1B[k].getYAxis() ){
										SecdUpleftState = false ;
									}
								}
								else{
									SecdUpleftState = false ;
								}*/
								if(k!=i){
									if( (player2B[i].getXAxis()+180)<722 && SecdUprightState==true ){
										if( (player2B[i].getXAxis()+180)==player2B[k].getXAxis() && (player2B[i].getYAxis()-180)==player2B[k].getYAxis() ){
											SecdUprightState = false ;
										}
									}
									else{
										SecdUprightState = false ;
									}/*
									if( (player2B[i].getXAxis()-180)>0 && SecdUpleftState==true ){
										if( (player2B[i].getXAxis()-180)==player2B[k].getXAxis() && (player2B[i].getYAxis()-180)==player2B[k].getYAxis() ){
											SecdUpleftState = false ;
										}
									}
									else{
										SecdUpleftState = false ;
									}*/
								}
							}
						}
						/////
					}
				}
				else{
					dUprightState = false ;
				}
				if( (player2B[i].getXAxis()-90)>0 && dUpleftState==true ){
					if( (player2B[i].getXAxis()-90)==player1B[j].getXAxis() && (player2B[i].getYAxis()-90)==player1B[j].getYAxis() ){
						dUpleftState = false ;
						indexUpLeft = j ;
						/////
						if( (player2B[i].getYAxis()-180)>0 ){
							for( int k=0 ; k<12 ; k++){/*
								if( (player2B[i].getXAxis()+180)<722 && SecdUprightState==true ){
									if( (player2B[i].getXAxis()+180)==player1B[k].getXAxis() && (player2B[i].getYAxis()-180)==player1B[k].getYAxis() ){
										SecdUprightState = false ;
									}
								}
								else{
									SecdUprightState = false ;
								}*/
								if( (player2B[i].getXAxis()-180)>0 && SecdUpleftState==true ){
									if( (player2B[i].getXAxis()-180)==player1B[k].getXAxis() && (player2B[i].getYAxis()-180)==player1B[k].getYAxis() ){
										SecdUpleftState = false ;
									}
								}
								else{
									SecdUpleftState = false ;
								}
								if(k!=i){/*
									if( (player2B[i].getXAxis()+180)<722 && SecdUprightState==true ){
										if( (player2B[i].getXAxis()+180)==player2B[k].getXAxis() && (player2B[i].getYAxis()-180)==player2B[k].getYAxis() ){
											SecdUprightState = false ;
										}
									}
									else{
										SecdUprightState = false ;
									}*/
									if( (player2B[i].getXAxis()-180)>0 && SecdUpleftState==true ){
										if( (player2B[i].getXAxis()-180)==player2B[k].getXAxis() && (player2B[i].getYAxis()-180)==player2B[k].getYAxis() ){
											SecdUpleftState = false ;
										}
									}
									else{
										SecdUpleftState = false ;
									}
								}
							}
						}
						/////
					}
				}
				else{
					dUpleftState = false ;
				}
				if(j!=i){
					if( (player2B[i].getXAxis()+90)<722 && dUprightState==true ){
						if( (player2B[i].getXAxis()+90)==player2B[j].getXAxis() && (player2B[i].getYAxis()-90)==player2B[j].getYAxis() ){
							dUprightState = false ;
						}
					}
					else{
						dUprightState = false ;
					}
					if( (player2B[i].getXAxis()-90)>0 && dUpleftState==true ){
						if( (player2B[i].getXAxis()-90)==player2B[j].getXAxis() && (player2B[i].getYAxis()-90)==player2B[j].getYAxis() ){
							dUpleftState = false ;
						}
					}
					else{
						dUpleftState = false ;
					}
				}
			}
		}
		
		if( (player2B[i].getYAxis()+90)<722 ){
			for( int j=0 ; j<12 ; j++){
				if( (player2B[i].getXAxis()+90)<722 && rightState==true ){
					if( (player2B[i].getXAxis()+90)==player1B[j].getXAxis() && (player2B[i].getYAxis()+90)==player1B[j].getYAxis() ){
						rightState = false ;
						indexRight = j ;
						/////
						if( (player2B[i].getYAxis()+180)<722 ){
							for( int k=0 ; k<12 ; k++){
								if( (player2B[i].getXAxis()+180)<722 && SecrightState==true ){
									if( (player2B[i].getXAxis()+180)==player1B[k].getXAxis() && (player2B[i].getYAxis()+180)==player1B[k].getYAxis() ){
										SecrightState = false ;
									}
								}
								else{
									SecrightState = false ;
								}/*
								if( (player2B[i].getXAxis()-180)>0 && SecleftState==true ){
									if( (player2B[i].getXAxis()-180)==player1B[k].getXAxis() && (player2B[i].getYAxis()+180)==player1B[k].getYAxis() ){
										SecleftState = false ;
									}
								}
								else{
									SecleftState = false ;
								}*/
								if(k!=i){
									if( (player2B[i].getXAxis()+180)<722 && SecrightState==true ){
										if( (player2B[i].getXAxis()+180)==player2B[k].getXAxis() && (player2B[i].getYAxis()+180)==player2B[k].getYAxis() ){
											SecrightState = false ;
										}
									}
									else{
										SecrightState = false ;
									}/*
									if( (player2B[i].getXAxis()-180)>0 && SecleftState==true ){
										if( (player2B[i].getXAxis()-180)==player2B[k].getXAxis() && (player2B[i].getYAxis()+180)==player2B[k].getYAxis() ){
											SecleftState = false ;
										}
									}
									else{
										SecleftState = false ;
									}*/
								}
							}
						}
						/////
					}
				}
				else{
					rightState = false ;
				}
				if( (player2B[i].getXAxis()-90)>0 && leftState==true ){
					if( (player2B[i].getXAxis()-90)==player1B[j].getXAxis() && (player2B[i].getYAxis()+90)==player1B[j].getYAxis() ){
						leftState = false ;
						indexLeft = j ;
						/////
						if( (player2B[i].getYAxis()+180)<722 ){
							for( int k=0 ; k<12 ; k++){/*
								if( (player2B[i].getXAxis()+180)<722 && SecrightState==true ){
									if( (player2B[i].getXAxis()+180)==player1B[k].getXAxis() && (player2B[i].getYAxis()+180)==player1B[k].getYAxis() ){
										SecrightState = false ;
									}
								}
								else{
									SecrightState = false ;
								}*/
								if( (player2B[i].getXAxis()-180)>0 && SecleftState==true ){
									if( (player2B[i].getXAxis()-180)==player1B[k].getXAxis() && (player2B[i].getYAxis()+180)==player1B[k].getYAxis() ){
										SecleftState = false ;
									}
								}
								else{
									SecleftState = false ;
								}
								if(k!=i){/*
									if( (player2B[i].getXAxis()+180)<722 && SecrightState==true ){
										if( (player2B[i].getXAxis()+180)==player2B[k].getXAxis() && (player2B[i].getYAxis()+180)==player2B[k].getYAxis() ){
											SecrightState = false ;
										}
									}
									else{
										SecrightState = false ;
									}*/
									if( (player2B[i].getXAxis()-180)>0 && SecleftState==true ){
										if( (player2B[i].getXAxis()-180)==player2B[k].getXAxis() && (player2B[i].getYAxis()+180)==player2B[k].getYAxis() ){
											SecleftState = false ;
										}
									}
									else{
										SecleftState = false ;
									}
								}
							}
						}
						/////
					}
				}
				else{
					leftState = false ;
				}
				if(j!=i){
					if( (player2B[i].getXAxis()+90)<722 && rightState==true ){
						if( (player2B[i].getXAxis()+90)==player2B[j].getXAxis() && (player2B[i].getYAxis()+90)==player2B[j].getYAxis() ){
							rightState = false ;
						}
					}
					else{
						rightState = false ;
					}
					if( (player2B[i].getXAxis()-90)>0 && leftState==true ){
						if( (player2B[i].getXAxis()-90)==player2B[j].getXAxis() && (player2B[i].getYAxis()+90)==player2B[j].getYAxis() ){
							leftState = false ;
						}
					}
					else{
						leftState = false ;
					}
				}
			}
		}
	}
	
	public void setDemoS( int k ){
		if( rightState == true ){
			bDemo[0].setBounds( (player1B[k].getXAxis()+90) , (player1B[k].getYAxis()+90) , hieght , width );
			bDemo[0].setVisible(true);
		}
		else if( SecrightState == true ){
			bDemo[0].setBounds( (player1B[k].getXAxis()+180) , (player1B[k].getYAxis()+180) , hieght , width );
			bDemo[0].setVisible(true);
		}
		if( leftState == true ){
			bDemo[1].setBounds( (player1B[k].getXAxis()-90) , (player1B[k].getYAxis()+90) , hieght , width );
			bDemo[1].setVisible(true);
		}
		else if( SecleftState == true ){
			bDemo[1].setBounds( (player1B[k].getXAxis()-180) , (player1B[k].getYAxis()+180) , hieght , width );
			bDemo[1].setVisible(true);
		}
	}
	
	public void setDemoD( int k ){
	//	refresh();
		if( rightState == true ){
			bDemo[0].setBounds( (player1B[k].getXAxis()+90) , (player1B[k].getYAxis()+90) , hieght , width );
			bDemo[0].setVisible(true);
		}
		else if( SecrightState == true ){
			bDemo[0].setBounds( (player1B[k].getXAxis()+180) , (player1B[k].getYAxis()+180) , hieght , width );
			bDemo[0].setVisible(true);
		}
		if( leftState == true ){
			bDemo[1].setBounds( (player1B[k].getXAxis()-90) , (player1B[k].getYAxis()+90) , hieght , width );
			bDemo[1].setVisible(true);
		}
		else if( SecleftState == true ){
			bDemo[1].setBounds( (player1B[k].getXAxis()-180) , (player1B[k].getYAxis()+180) , hieght , width );
			bDemo[1].setVisible(true);
		}
		if( dUprightState == true ){
			bDemo[2].setBounds( (player1B[k].getXAxis()-90) , (player1B[k].getYAxis()-90) , hieght , width );
			bDemo[2].setVisible(true);
		}
		else if( SecdUprightState == true ){
			bDemo[2].setBounds( (player1B[k].getXAxis()-180) , (player1B[k].getYAxis()-180) , hieght , width );
			bDemo[2].setVisible(true);
		}
		if( dUpleftState == true ){
			bDemo[3].setBounds( (player1B[k].getXAxis()-90) , (player1B[k].getYAxis()-90) , hieght , width );
			bDemo[3].setVisible(true);
		}
		else if( SecdUpleftState == true ){
			bDemo[3].setBounds( (player1B[k].getXAxis()-180) , (player1B[k].getYAxis()-180) , hieght , width );
			bDemo[3].setVisible(true);
		}
	}
	
	public void setDemoS1( int k ){
	//	refresh();
		if( dUprightState == true ){
			bDemo[2].setBounds( (player2B[k].getXAxis()+90) , (player2B[k].getYAxis()-90) , hieght , width );
			bDemo[2].setVisible(true);
		}
		else if( SecdUprightState == true ){
			bDemo[2].setBounds( (player2B[k].getXAxis()+180) , (player2B[k].getYAxis()-180) , hieght , width );
			bDemo[2].setVisible(true);
		}
		if( dUpleftState == true ){
			bDemo[3].setBounds( (player2B[k].getXAxis()-90) , (player2B[k].getYAxis()-90) , hieght , width );
			bDemo[3].setVisible(true);
		}
		else if( SecdUpleftState == true ){
			bDemo[3].setBounds( (player2B[k].getXAxis()-180) , (player2B[k].getYAxis()-180) , hieght , width );
			bDemo[3].setVisible(true);
		}
	}
	
	public void setDemoD1( int k ){
	//	refresh();
		if( rightState == true ){
			bDemo[0].setBounds( (player2B[k].getXAxis()+90) , (player2B[k].getYAxis()+90) , hieght , width );
			bDemo[0].setVisible(true);
		}
		else if( SecrightState == true ){
			bDemo[0].setBounds( (player2B[k].getXAxis()+180) , (player2B[k].getYAxis()+180) , hieght , width );
			bDemo[0].setVisible(true);
		}
		if( leftState == true ){
			bDemo[1].setBounds( (player2B[k].getXAxis()-90) , (player2B[k].getYAxis()+90) , hieght , width );
			bDemo[1].setVisible(true);
		}
		else if( SecleftState == true ){
			bDemo[1].setBounds( (player2B[k].getXAxis()-180) , (player2B[k].getYAxis()+180) , hieght , width );
			bDemo[1].setVisible(true);
		}
		if( dUprightState == true ){
			bDemo[2].setBounds( (player2B[k].getXAxis()-90) , (player2B[k].getYAxis()-90) , hieght , width );
			bDemo[2].setVisible(true);
		}
		else if( SecdUprightState == true ){
			bDemo[2].setBounds( (player2B[k].getXAxis()-180) , (player2B[k].getYAxis()-180) , hieght , width );
			bDemo[2].setVisible(true);
		}
		if( dUpleftState == true ){
			bDemo[3].setBounds( (player2B[k].getXAxis()-90) , (player2B[k].getYAxis()-90) , hieght , width );
			bDemo[3].setVisible(true);
		}
		else if( SecdUpleftState == true ){
			bDemo[3].setBounds( (player2B[k].getXAxis()-180) , (player2B[k].getYAxis()-180) , hieght , width );
			bDemo[3].setVisible(true);
		}
	}
	
	public void setActionListenner(){
		
		bPlayer1[0].addActionListener(this);
		bPlayer1[1].addActionListener(this);
		bPlayer1[2].addActionListener(this);
		bPlayer1[3].addActionListener(this);
		bPlayer1[4].addActionListener(this);
		bPlayer1[5].addActionListener(this);
		bPlayer1[6].addActionListener(this);
		bPlayer1[7].addActionListener(this);
		bPlayer1[8].addActionListener(this);
		bPlayer1[9].addActionListener(this);
		bPlayer1[10].addActionListener(this);
		bPlayer1[11].addActionListener(this);
		
		bPlayer2[0].addActionListener(this);
		bPlayer2[1].addActionListener(this);
		bPlayer2[2].addActionListener(this);
		bPlayer2[3].addActionListener(this);
		bPlayer2[4].addActionListener(this);
		bPlayer2[5].addActionListener(this);
		bPlayer2[6].addActionListener(this);
		bPlayer2[7].addActionListener(this);
		bPlayer2[8].addActionListener(this);
		bPlayer2[9].addActionListener(this);
		bPlayer2[10].addActionListener(this);
		bPlayer2[11].addActionListener(this);
		
		bDemo[0].addActionListener(this);
		bDemo[1].addActionListener(this);
		bDemo[2].addActionListener(this);
		bDemo[3].addActionListener(this);
		
		bExit.addActionListener(this);
	}
}