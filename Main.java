import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main{
	
	public static void main (String [] args ){
		JFrame frame = new JFrame();
		frame.setSize( 900 , 769 );
		CheckersFrame CF = new CheckersFrame(frame);
		
	}
	
	public static void sleep(int time){
		try{
			Thread.sleep(time);
		}
		catch(Exception e){
			System.out.println("Thread excepttion occurs!!");
		}
	}
}