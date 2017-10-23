import java.awt.font.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TicTacToe {

	public static JFrame frame ;
	
	public static int[][] winCombinations = new int[][] {{0, 1, 2}, {3, 4, 5}, {6, 7, 8}, {0, 3, 6}, {1, 4, 7}, {2, 5, 8}, {0, 4, 8}, {2, 4, 6}			 
	};
	
	public static JButton buttons[] = new JButton[9];
	
	public static void gamePanel(){
		frame = new JFrame ("Tic Tac Toe");
		//frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
	

		JPanel panel = new JPanel();
		panel.setLayout (new GridLayout (3, 3));

		for(int i=0; i<=8; i++){ 
			buttons[i] = new MyButton();
			panel.add(buttons[i]);			
		}

		frame.getContentPane().add (panel);
		//frame.pack();
		frame.setVisible(true);
		frame.setSize(500, 500);
	}

	public static int count = 0; 

	public static class MyButton extends JButton implements ActionListener {
		
		int again;
		boolean win=false; 
		String letter;
		public MyButton() {	
			super();
			letter=" ";
			setFont(new Font("Dialog", 1, 60));
			setText(letter);
			addActionListener(this);
		}
		
		
		public void actionPerformed(ActionEvent e) {
			if((count%2)==0 && getText().equals(" ") && win==false){
				letter="X";
				count=count+1;
			} 
			else if((count%2)==1 && getText().equals(" ") && win==false) {
				letter="O";
				count=count+1;
			} 
			
			setText(letter); 

			
			for(int i=0; i<=7; i++){ 
				if( buttons[winCombinations[i][0]].getText().equals(buttons[winCombinations[i][1]].getText()) && buttons[winCombinations[i][1]].getText().equals(buttons[winCombinations[i][2]].getText()) && buttons[winCombinations[i][0]].getText() != " "){//the winning is true
					win = true;
				}
			}
			
			if(win == true){ 
				again=JOptionPane.showConfirmDialog(null, letter + " wins the game!  Do you want to play again?",letter + "won!",JOptionPane.YES_NO_OPTION);
				
			} 
			else if(count == 9 && win == false){
				again=JOptionPane.showConfirmDialog(null, "The game was tie!  Do you want to play again?","Tie game!",JOptionPane.YES_NO_OPTION);
				win=true;
			}	
			
			if(again==JOptionPane.YES_OPTION && win==true){
					clearButtons();			
					win=false;
			}
			else if(again==JOptionPane.NO_OPTION){
				//clearButtons();
				//frame.setVisible(false);
				//System.exit(0);
				//frame.setVisible(false);
				frame.dispose();
			}

		}

	}
	
	public static void clearButtons(){
		
		for(int i=0; i<=8; i++){
			buttons[i].setText(" ");						
		}
		count=0;
		
	}

}