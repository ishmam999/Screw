import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.Scanner;

class ScrewGameManagementSystem{

	public static void main (String [] args ){
		JFrame frame = new JFrame();
		frame.setSize(600,600);
		LoginFrame 		logFrame = new LoginFrame(frame);
		RegisterFrame 	regFrame;
		
		while (true){
			System.out.println("...");
			sleep(1000);
			if ( Login.loginstatus == true ){
				if( Login.uType.equals( "admin" ) ){
					AdminFrame AF = new AdminFrame(frame); 		
					while(true){
						System.out.println("..");
						sleep(1000);
						if (Login.loginstatus == false){
							logFrame = new LoginFrame(frame);
								break;
						}
					} 
				}
				else if ( Login.uType.equals( "local" ) ){
					UserFrame UF = new UserFrame(frame);
					while(true){
						System.out.println("....");
						sleep(1000); 
						if (Login.loginstatus == false){
							logFrame = new LoginFrame(frame);
								break;
						}
					}
				}
			}
			if(Register.registerStatus == true){
				while(true){
					System.out.println("...");
					sleep(1000);
					if(Register.registerStatus == false){
						logFrame = new LoginFrame(frame);
								break;
					}
				}
			}
		}				
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