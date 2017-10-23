import javax.swing.*;

import java.awt.event.*;

class hangman extends JFrame implements ActionListener {
JButton Submit = new JButton ("SUBMIT");
JTextField TF = new JTextField("");
JLabel L = new JLabel ("ENTER A WORD (ONLY CAPITAL LETTERS)");
JFrame F; 
public static String WORD;
public static int WORD_COUNT;

public hangman(){
F = new JFrame("Hangman");
F.setSize (900,600)	;
F.add(Submit);
Submit.setBounds (600,200,100,50);
F.add(L);
L.setBounds(50,150,400,30);
F.add(TF);
TF.setBounds(50,200,400,60);
F.setLayout(null);
F.setVisible (true);	
F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	Submit.addActionListener(this);
}
public void actionPerformed(ActionEvent e){
	if (e.getSource()==Submit){
		String ok = TF.getText().trim();
		int v=1;
		for(int i = 0 ; i<ok.length() ; i++){
		if(ok.charAt(i) >64 && ok.charAt(i)<91)
			v=0;
			
			
		}
		
		
		if(v==1){
			JOptionPane.showMessageDialog(this,"INVALID INPUT");
			System.out.println(v);
		}
		else
		{
		WORD=TF.getText();
		WORD_COUNT=WORD.length();
		Submit.setVisible(false);
		TF.setVisible(false);
		L.setVisible(false);
		ultimatehangman uh = new ultimatehangman(F);
		}
		
	}
	
}






}