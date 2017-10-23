import javax.swing.*;

import java.awt.event.*;

class ultimatehangman extends JPanel implements ActionListener{
	data dust = new data(); //database object
	public int milenai=0 ; // amount of mistakes
	int ok;   //for changing 
	StringBuffer WORDBUFFER = new StringBuffer(hangman.WORD); //copying the WORD here
	int milse=0; //amount of correct guess
	int checker; //checking if letter exists
	StringBuffer hyp=new StringBuffer("-");  //First Hyphen of the word .... Representing hyphens further


JLabel gamel = new JLabel ("GAMER ID ");
JLabel highl = new JLabel ("HighScore");
JTextField gamet = new JTextField("");
JTextField hight = new JTextField("");



JButton exit = new JButton ("EXIT");
JTextField answer=new JTextField(gethyphens());
JLabel Score = new JLabel ("Score : ");
JLabel AHEADtoDEATH = new JLabel("Ahead to DEATH : ");
JLabel MAX = new JLabel ("MAXIMUM GUESS UNTIL DEATH = 5");

JLabel point = new JLabel(Integer.toString(milse)); 
JLabel a2d   = new JLabel(Integer.toString(milenai));

JButton database= new JButton("Score");

ImageIcon p1=new ImageIcon("1.jpg");
ImageIcon p2=new ImageIcon("2.jpg");
ImageIcon p3=new ImageIcon("3.jpg");
ImageIcon p4=new ImageIcon("4.jpg");
ImageIcon p5=new ImageIcon("5.jpg");
ImageIcon p6=new ImageIcon("6.jpg");
ImageIcon p7=new ImageIcon("7.jpg");
ImageIcon p8=new ImageIcon("8.jpg");

JButton picture1=new JButton("",p1);
JButton picture2=new JButton("",p2);
JButton picture3=new JButton("",p3);
JButton picture4=new JButton("",p4);
JButton picture5=new JButton("",p5);
JButton picture6=new JButton("",p6);
JButton picture7=new JButton("",p7);
JButton picture8=new JButton("",p8);
	
JFrame Frame ; 
JButton A= new JButton ("A");
JButton B=new JButton ("B");
JButton C=new JButton ("C");
JButton D=new JButton ("D");
JButton E=new JButton ("E");
JButton F=new JButton ("F");
JButton G=new JButton ("G");
JButton H=new JButton ("H");
JButton I=new JButton ("I");
JButton J=new JButton ("J");
JButton K=new JButton ("K");
JButton L=new JButton ("L");
JButton M=new JButton ("M");
JButton N=new JButton ("N");
JButton O=new JButton ("O");
JButton P=new JButton ("P");
JButton Q=new JButton ("Q");
JButton R=new JButton ("R");
JButton S=new JButton ("S");
JButton T=new JButton ("T");
JButton U=new JButton ("U");
JButton V=new JButton ("V");
JButton W=new JButton ("W");
JButton X=new JButton ("X");
JButton Y=new JButton ("Y");
JButton Z=new JButton ("Z");


public ultimatehangman(JFrame x){
	Frame=x;
	Frame.add(Score);
	Frame.add(AHEADtoDEATH);
	Frame.add(MAX);
	Frame.add(point);
	Frame.add(a2d);
	Frame.add(exit);
	Frame.add(database);
	Frame.add(gamel);
	Frame.add(gamet);
	Frame.add(highl);
	Frame.add(hight);
	
	gamel.setBounds(20,500,70,50);
	gamet.setBounds(100,500,100,50);
	highl.setBounds(250,500,70,50);
	hight.setBounds(320,500,100,50);
	
	gamel.setVisible(false);
	gamet.setVisible(false);
	highl.setVisible(false);
	hight.setVisible(false);
	
	
	
	
	exit.setBounds(520,325,70,45);
	exit.addActionListener(this);
	database.setBounds(520,275,70,45);
	
	
	Score.setBounds(40,50,100,40);
	AHEADtoDEATH.setBounds(40,100,100,40);
	MAX.setBounds(40,150,200,40);
	point.setBounds(150,50,50,40);
	a2d.setBounds(150,100,50,40);
	
	Frame.add(picture1);
	Frame.add(picture2);
	Frame.add(picture3);
	Frame.add(picture4);
	Frame.add(picture5);
	Frame.add(picture6);
	Frame.add(picture7);
	Frame.add(picture8);
	
	picture2.setVisible(false);
	picture3.setVisible(false);
	picture4.setVisible(false);
	picture5.setVisible(false);
	picture6.setVisible(false);
	picture7.setVisible(false);
	picture8.setVisible(false);
	
	
	picture2.setBounds(600,20,200,350);
	picture1.setBounds(600,20,200,350);
	picture3.setBounds(600,20,200,350);
	picture4.setBounds(600,20,200,350);
	picture5.setBounds(600,20,200,350);
	picture6.setBounds(600,20,200,350);
	picture7.setBounds(600,20,200,350);
	picture8.setBounds(600,20,200,350);
	
	
	
	Frame.add(answer);
	answer.setBounds(40,200,400,60);
	
	Frame.add(A);Frame.add(B);Frame.add(C);Frame.add(D);Frame.add(E);Frame.add(F);Frame.add(G);Frame.add(H);Frame.add(I);Frame.add(J);Frame.add(K);Frame.add(L);Frame.add(M);Frame.add(N);Frame.add(O);Frame.add(P);Frame.add(Q);Frame.add(R);Frame.add(S);Frame.add(T);Frame.add(U);Frame.add(V);Frame.add(W);Frame.add(X);Frame.add(Y);Frame.add(Z);
	
	A.setBounds(20,400,50,30);
	B.setBounds(80,400,50,30);
	C.setBounds(140,400,50,30);
	D.setBounds(200,400,50,30);
	E.setBounds(260,400,50,30);
	F.setBounds(320,400,50,30);
	G.setBounds(380,400,50,30);
	H.setBounds(440,400,50,30);
	I.setBounds(500,400,50,30);
	J.setBounds(560,400,50,30);
	K.setBounds(620,400,50,30);
	L.setBounds(680,400,50,30);
	M.setBounds(740,400,50,30);
	
	N.setBounds(20,450,50,30);
	O.setBounds(80,450,50,30);
	P.setBounds(140,450,50,30);
	Q.setBounds(200,450,50,30);
	R.setBounds(260,450,50,30);
	S.setBounds(320,450,50,30);
	T.setBounds(380,450,50,30);
	U.setBounds(440,450,50,30);
	V.setBounds(500,450,50,30);
	W.setBounds(560,450,50,30);
	X.setBounds(620,450,50,30);
	Y.setBounds(680,450,50,30);
	Z.setBounds(740,450,50,30);
	
	A.addActionListener(this);
	B.addActionListener(this);
	C.addActionListener(this);
	D.addActionListener(this);
	E.addActionListener(this);
	F.addActionListener(this);
	G.addActionListener(this);
	H.addActionListener(this);
	I.addActionListener(this);
	J.addActionListener(this);
	K.addActionListener(this);
	L.addActionListener(this);
	M.addActionListener(this);
	N.addActionListener(this);
		
	O.addActionListener(this);
	P.addActionListener(this);	
	Q.addActionListener(this);
	R.addActionListener(this);	
	S.addActionListener(this);
	T.addActionListener(this);
	U.addActionListener(this);
	V.addActionListener(this);	
	W.addActionListener(this);	
	X.addActionListener(this);
	Y.addActionListener(this);
	Z.addActionListener(this);
	database.addActionListener(this);
	
	if(dust.game1checkidavailable(Login.id)==false){	
	dust.game1setinit(Login.id);}
	
	
	Frame.setLayout(null);
	Frame.setVisible(true);
	
}






public void actionPerformed(ActionEvent f){
		
		
		if (f.getSource()==database){
			gamet.setVisible(true);
			gamet.setText(Login.id);
			gamel.setVisible(true);
			hight.setVisible(true);
			hight.setText(Integer.toString(dust.game1checkhighscore(Login.id)));
			highl.setVisible(true);
			hight.setText(Integer.toString(dust.game1checkhighscore(Login.id)));
			
			
		}
		
		if(f.getSource()==exit)
		{
			Frame.setVisible(false);
		}
		
		if (f.getSource()==A){
			A.setVisible(false);
		checker = hangman.WORD.indexOf("A");
		if (checker==-1){
		milenai++;
		a2d.setText(Integer.toString(milenai));
		if(milenai==1){
			picture1.setVisible(false);
			picture2.setVisible(true);}
			if(milenai==2){
			picture2.setVisible(false);
			picture3.setVisible(true);}
			if(milenai==3){
			picture3.setVisible(false);
			picture4.setVisible(true);}
			if(milenai==4){
			picture4.setVisible(false);
			picture5.setVisible(true);}
			if(milenai==5){
			picture5.setVisible(false);
			picture6.setVisible(true);}
			if(milenai==6){
			picture6.setVisible(false);
			picture7.setVisible(true);
			JOptionPane.showMessageDialog(this,"YOU LOSE! ");
	        this.setInvisible();
			}
			}
	
	if (checker>-1){
	StringBuffer lp = new StringBuffer("");
	int vp=recurrencycheck_A(hangman.WORD);
	
	for(int k=0;k<vp;k++){
	milse++;
	if(milse==hangman.WORD.length()){
		
		if(dust.game1checkhighscore(Login.id)<milse){
			dust.game1updatehighscore(Login.id,milse);
			hight.setText(Integer.toString(dust.game1checkhighscore(Login.id)));
		}
		
		
		this.setPictureInvisible();
		picture8.setVisible(true);
		this.setInvisible();
		
	}
	ok=WORDBUFFER.indexOf("A");
	WORDBUFFER.replace(ok,ok+1,"*");
	hypchangerA();
	}
	point.setText(Integer.toString(milse));
	answer.setText(hyp.toString());
	}

}

//new 


if (f.getSource()==B){
		B.setVisible(false);
		checker = hangman.WORD.indexOf("B");
		if (checker==-1){
		milenai++;
		a2d.setText(Integer.toString(milenai));
		    if(milenai==1){
			picture1.setVisible(false);
			picture2.setVisible(true);}
			if(milenai==2){
			picture2.setVisible(false);
			picture3.setVisible(true);}
			if(milenai==3){
			picture3.setVisible(false);
			picture4.setVisible(true);}
			if(milenai==4){
			picture4.setVisible(false);
			picture5.setVisible(true);}
			if(milenai==5){
			picture5.setVisible(false);
			picture6.setVisible(true);}
			if(milenai==6){
			picture6.setVisible(false);
			picture7.setVisible(true);
			JOptionPane.showMessageDialog(this,"YOU LOSE! ");
	        this.setInvisible();
			}
			}
	
	if (checker>-1){
	StringBuffer lp = new StringBuffer("");
	int vp=recurrencycheck_B(hangman.WORD);
	
	for(int k=0;k<vp;k++){
	milse++;
	if(milse==hangman.WORD.length()){
		if(dust.game1checkhighscore(Login.id)<milse){
			dust.game1updatehighscore(Login.id,milse);
			hight.setText(Integer.toString(dust.game1checkhighscore(Login.id)));
		}
		
		this.setPictureInvisible();
		picture8.setVisible(true);
		this.setInvisible();
	}
	ok=WORDBUFFER.indexOf("B");
	WORDBUFFER.replace(ok,ok+1,"*");
	hypchangerB();
	}
	point.setText(Integer.toString(milse));
	answer.setText(hyp.toString());
	}

}


//c
if (f.getSource()==C){
		C.setVisible(false);
		checker = hangman.WORD.indexOf("C");
		if (checker==-1){
		milenai++;
		a2d.setText(Integer.toString(milenai));
		    if(milenai==1){
			picture1.setVisible(false);
			picture2.setVisible(true);}
			if(milenai==2){
			picture2.setVisible(false);
			picture3.setVisible(true);}
			if(milenai==3){
			picture3.setVisible(false);
			picture4.setVisible(true);}
			if(milenai==4){
			picture4.setVisible(false);
			picture5.setVisible(true);}
			if(milenai==5){
			picture5.setVisible(false);
			picture6.setVisible(true);}
			if(milenai==6){
			picture6.setVisible(false);
			picture7.setVisible(true);
			JOptionPane.showMessageDialog(this,"YOU LOSE! ");
	        this.setInvisible();
			}
			}
	
	if (checker>-1){
	StringBuffer lp = new StringBuffer("");
	int vp=recurrencycheck_C(hangman.WORD);
	
	for(int k=0;k<vp;k++){
	milse++;
	if(milse==hangman.WORD.length()){
		if(dust.game1checkhighscore(Login.id)<milse){
			dust.game1updatehighscore(Login.id,milse);
			hight.setText(Integer.toString(dust.game1checkhighscore(Login.id)));
		}
		
		this.setPictureInvisible();
		picture8.setVisible(true);
		this.setInvisible();
	}
	ok=WORDBUFFER.indexOf("C");
	WORDBUFFER.replace(ok,ok+1,"*");
	hypchangerC();
	}
	point.setText(Integer.toString(milse));
	answer.setText(hyp.toString());
	}

}


//D

if (f.getSource()==D){
	D.setVisible(false);
		checker = hangman.WORD.indexOf("D");
		if (checker==-1){
		milenai++;
		a2d.setText(Integer.toString(milenai));
		    if(milenai==1){
			picture1.setVisible(false);
			picture2.setVisible(true);}
			if(milenai==2){
			picture2.setVisible(false);
			picture3.setVisible(true);}
			if(milenai==3){
			picture3.setVisible(false);
			picture4.setVisible(true);}
			if(milenai==4){
			picture4.setVisible(false);
			picture5.setVisible(true);}
			if(milenai==5){
			picture5.setVisible(false);
			picture6.setVisible(true);}
			if(milenai==6){
			picture6.setVisible(false);
			picture7.setVisible(true);
			JOptionPane.showMessageDialog(this,"YOU LOSE! ");
	        this.setInvisible();
			}
			}
	
	if (checker>-1){
	StringBuffer lp = new StringBuffer("");
	int vp=recurrencycheck_D(hangman.WORD);
	
	for(int k=0;k<vp;k++){
	milse++;
	if(milse==hangman.WORD.length()){
		if(dust.game1checkhighscore(Login.id)<milse){
			dust.game1updatehighscore(Login.id,milse);
			hight.setText(Integer.toString(dust.game1checkhighscore(Login.id)));
		}
		
		
		this.setPictureInvisible();
		picture8.setVisible(true);
		this.setInvisible();
	}
	ok=WORDBUFFER.indexOf("D");
	WORDBUFFER.replace(ok,ok+1,"*");
	hypchangerD();
	}
	point.setText(Integer.toString(milse));
	answer.setText(hyp.toString());
	}

}


//E


if (f.getSource()==E){
	E.setVisible(false);
		checker = hangman.WORD.indexOf("E");
		if (checker==-1){
		milenai++;
		a2d.setText(Integer.toString(milenai));
		    if(milenai==1){
			picture1.setVisible(false);
			picture2.setVisible(true);}
			if(milenai==2){
			picture2.setVisible(false);
			picture3.setVisible(true);}
			if(milenai==3){
			picture3.setVisible(false);
			picture4.setVisible(true);}
			if(milenai==4){
			picture4.setVisible(false);
			picture5.setVisible(true);}
			if(milenai==5){
			picture5.setVisible(false);
			picture6.setVisible(true);}
			if(milenai==6){
			picture6.setVisible(false);
			picture7.setVisible(true);
			JOptionPane.showMessageDialog(this,"YOU LOSE! ");
	        this.setInvisible();}
			}
	
	if (checker>-1){
	StringBuffer lp = new StringBuffer("");
	int vp=recurrencycheck_E(hangman.WORD);
	
	for(int k=0;k<vp;k++){
	milse++;
	if(milse==hangman.WORD.length()){
		if(dust.game1checkhighscore(Login.id)<milse){
			dust.game1updatehighscore(Login.id,milse);
			hight.setText(Integer.toString(dust.game1checkhighscore(Login.id)));
		}
		
		this.setPictureInvisible();
		picture8.setVisible(true);
		this.setInvisible();
	}
	ok=WORDBUFFER.indexOf("E");
	WORDBUFFER.replace(ok,ok+1,"*");
	hypchangerE();
	}
	point.setText(Integer.toString(milse));
	answer.setText(hyp.toString());
	}

}

//F


if (f.getSource()==F){
	F.setVisible(false);
		checker = hangman.WORD.indexOf("F");
		if (checker==-1){
		milenai++;
		a2d.setText(Integer.toString(milenai));
		    if(milenai==1){
			picture1.setVisible(false);
			picture2.setVisible(true);}
			if(milenai==2){
			picture2.setVisible(false);
			picture3.setVisible(true);}
			if(milenai==3){
			picture3.setVisible(false);
			picture4.setVisible(true);}
			if(milenai==4){
			picture4.setVisible(false);
			picture5.setVisible(true);}
			if(milenai==5){
			picture5.setVisible(false);
			picture6.setVisible(true);}
			if(milenai==6){
			picture6.setVisible(false);
			picture7.setVisible(true);
			JOptionPane.showMessageDialog(this,"YOU LOSE! ");
	        this.setInvisible();
			}
			}
	
	if (checker>-1){
	StringBuffer lp = new StringBuffer("");
	int vp=recurrencycheck_F(hangman.WORD);
	
	for(int k=0;k<vp;k++){
	milse++;
	if(milse==hangman.WORD.length()){
		if(dust.game1checkhighscore(Login.id)<milse){
			dust.game1updatehighscore(Login.id,milse);
			hight.setText(Integer.toString(dust.game1checkhighscore(Login.id)));
		}
		
		this.setPictureInvisible();
		picture8.setVisible(true);
		this.setInvisible();
	}
	ok=WORDBUFFER.indexOf("F");
	WORDBUFFER.replace(ok,ok+1,"*");
	hypchangerF();
	}
	point.setText(Integer.toString(milse));
	answer.setText(hyp.toString());
	}

}


//G



if (f.getSource()==G){
	G.setVisible(false);
		checker = hangman.WORD.indexOf("G");
		if (checker==-1){
		milenai++;
		a2d.setText(Integer.toString(milenai));
		    if(milenai==1){
			picture1.setVisible(false);
			picture2.setVisible(true);}
			if(milenai==2){
			picture2.setVisible(false);
			picture3.setVisible(true);}
			if(milenai==3){
			picture3.setVisible(false);
			picture4.setVisible(true);}
			if(milenai==4){
			picture4.setVisible(false);
			picture5.setVisible(true);}
			if(milenai==5){
			picture5.setVisible(false);
			picture6.setVisible(true);}
			if(milenai==6){
			picture6.setVisible(false);
			picture7.setVisible(true);
			JOptionPane.showMessageDialog(this,"YOU LOSE! ");
	        this.setInvisible();
			}
			}
	
	if (checker>-1){
	StringBuffer lp = new StringBuffer("");
	int vp=recurrencycheck_G(hangman.WORD);
	
	for(int k=0;k<vp;k++){
	milse++;
	if(milse==hangman.WORD.length()){
		
		if(dust.game1checkhighscore(Login.id)<milse){
			dust.game1updatehighscore(Login.id,milse);
			hight.setText(Integer.toString(dust.game1checkhighscore(Login.id)));
		}
		this.setPictureInvisible();
		picture8.setVisible(true);
		this.setInvisible();
	}
	ok=WORDBUFFER.indexOf("G");
	WORDBUFFER.replace(ok,ok+1,"*");
	hypchangerG();
	}
	point.setText(Integer.toString(milse));
	answer.setText(hyp.toString());
	}

}


//H

if (f.getSource()==H){
	H.setVisible(false);
		checker = hangman.WORD.indexOf("H");
		if (checker==-1){
		milenai++;
		a2d.setText(Integer.toString(milenai));
		    if(milenai==1){
			picture1.setVisible(false);
			picture2.setVisible(true);}
			if(milenai==2){
			picture2.setVisible(false);
			picture3.setVisible(true);}
			if(milenai==3){
			picture3.setVisible(false);
			picture4.setVisible(true);}
			if(milenai==4){
			picture4.setVisible(false);
			picture5.setVisible(true);}
			if(milenai==5){
			picture5.setVisible(false);
			picture6.setVisible(true);}
			if(milenai==6){
			picture6.setVisible(false);
			picture7.setVisible(true);
			JOptionPane.showMessageDialog(this,"YOU LOSE! ");
	        this.setInvisible();
			}
			}
	
	if (checker>-1){
	StringBuffer lp = new StringBuffer("");
	int vp=recurrencycheck_H(hangman.WORD);
	
	for(int k=0;k<vp;k++){
	milse++;
	if(milse==hangman.WORD.length()){
		if(dust.game1checkhighscore(Login.id)<milse){
			dust.game1updatehighscore(Login.id,milse);
			hight.setText(Integer.toString(dust.game1checkhighscore(Login.id)));
		}
		
		this.setPictureInvisible();
		picture8.setVisible(true);
		this.setInvisible();
	}
	ok=WORDBUFFER.indexOf("H");
	WORDBUFFER.replace(ok,ok+1,"*");
	hypchangerH();
	}
	point.setText(Integer.toString(milse));
	answer.setText(hyp.toString());
	}

}



//I



if (f.getSource()==I){
	I.setVisible(false);
		checker = hangman.WORD.indexOf("I");
		if (checker==-1){
		milenai++;
		a2d.setText(Integer.toString(milenai));
		    if(milenai==1){
			picture1.setVisible(false);
			picture2.setVisible(true);}
			if(milenai==2){
			picture2.setVisible(false);
			picture3.setVisible(true);}
			if(milenai==3){
			picture3.setVisible(false);
			picture4.setVisible(true);}
			if(milenai==4){
			picture4.setVisible(false);
			picture5.setVisible(true);}
			if(milenai==5){
			picture5.setVisible(false);
			picture6.setVisible(true);}
			if(milenai==6){
			picture6.setVisible(false);
			picture7.setVisible(true);
			JOptionPane.showMessageDialog(this,"YOU LOSE! ");
	        this.setInvisible();
			}
			}
	
	if (checker>-1){
	StringBuffer lp = new StringBuffer("");
	int vp=recurrencycheck_I(hangman.WORD);
	
	for(int k=0;k<vp;k++){
	milse++;
	if(milse==hangman.WORD.length()){
		if(dust.game1checkhighscore(Login.id)<milse){
			dust.game1updatehighscore(Login.id,milse);
			hight.setText(Integer.toString(dust.game1checkhighscore(Login.id)));
		}
		
		this.setPictureInvisible();
		picture8.setVisible(true);
		this.setInvisible();
	}
	ok=WORDBUFFER.indexOf("I");
	WORDBUFFER.replace(ok,ok+1,"*");
	hypchangerI();
	}
	point.setText(Integer.toString(milse));
	answer.setText(hyp.toString());
	}

}



//J

if (f.getSource()==J){
	J.setVisible(false);
		checker = hangman.WORD.indexOf("J");
		if (checker==-1){
		milenai++;
		a2d.setText(Integer.toString(milenai));
		    if(milenai==1){
			picture1.setVisible(false);
			picture2.setVisible(true);}
			if(milenai==2){
			picture2.setVisible(false);
			picture3.setVisible(true);}
			if(milenai==3){
			picture3.setVisible(false);
			picture4.setVisible(true);}
			if(milenai==4){
			picture4.setVisible(false);
			picture5.setVisible(true);}
			if(milenai==5){
			picture5.setVisible(false);
			picture6.setVisible(true);}
			if(milenai==6){
			picture6.setVisible(false);
			picture7.setVisible(true);
			JOptionPane.showMessageDialog(this,"YOU LOSE! ");
	        this.setInvisible();
			}
			}
	
	if (checker>-1){
	StringBuffer lp = new StringBuffer("");
	int vp=recurrencycheck_J(hangman.WORD);
	
	for(int k=0;k<vp;k++){
	milse++;
	if(milse==hangman.WORD.length()){
		if(dust.game1checkhighscore(Login.id)<milse){
			dust.game1updatehighscore(Login.id,milse);
			hight.setText(Integer.toString(dust.game1checkhighscore(Login.id)));
		}
		
		this.setPictureInvisible();
		picture8.setVisible(true);
		this.setInvisible();
	}
	ok=WORDBUFFER.indexOf("J");
	WORDBUFFER.replace(ok,ok+1,"*");
	hypchangerJ();
	}
	point.setText(Integer.toString(milse));
	answer.setText(hyp.toString());
	}

}


//K



if (f.getSource()==K){
	K.setVisible(false);
		checker = hangman.WORD.indexOf("K");
		if (checker==-1){
		milenai++;
		a2d.setText(Integer.toString(milenai));
		    if(milenai==1){
			picture1.setVisible(false);
			picture2.setVisible(true);}
			if(milenai==2){
			picture2.setVisible(false);
			picture3.setVisible(true);}
			if(milenai==3){
			picture3.setVisible(false);
			picture4.setVisible(true);}
			if(milenai==4){
			picture4.setVisible(false);
			picture5.setVisible(true);}
			if(milenai==5){
			picture5.setVisible(false);
			picture6.setVisible(true);}
			if(milenai==6){
			picture6.setVisible(false);
			picture7.setVisible(true);
			JOptionPane.showMessageDialog(this,"YOU LOSE! ");
	        this.setInvisible();
			}
			}
	
	if (checker>-1){
	StringBuffer lp = new StringBuffer("");
	int vp=recurrencycheck_K(hangman.WORD);
	
	for(int k=0;k<vp;k++){
	milse++;
	if(milse==hangman.WORD.length()){
		if(dust.game1checkhighscore(Login.id)<milse){
			dust.game1updatehighscore(Login.id,milse);
			hight.setText(Integer.toString(dust.game1checkhighscore(Login.id)));
		}
		
		this.setPictureInvisible();
		picture8.setVisible(true);
		this.setInvisible();
	}
	ok=WORDBUFFER.indexOf("K");
	WORDBUFFER.replace(ok,ok+1,"*");
	hypchangerK();
	}
	point.setText(Integer.toString(milse));
	answer.setText(hyp.toString());
	}

}

//L
if (f.getSource()==L){
	L.setVisible(false);
		checker = hangman.WORD.indexOf("L");
		if (checker==-1){
		milenai++;
		a2d.setText(Integer.toString(milenai));
		    if(milenai==1){
			picture1.setVisible(false);
			picture2.setVisible(true);}
			if(milenai==2){
			picture2.setVisible(false);
			picture3.setVisible(true);}
			if(milenai==3){
			picture3.setVisible(false);
			picture4.setVisible(true);}
			if(milenai==4){
			picture4.setVisible(false);
			picture5.setVisible(true);}
			if(milenai==5){
			picture5.setVisible(false);
			picture6.setVisible(true);}
			if(milenai==6){
			picture6.setVisible(false);
			picture7.setVisible(true);
			JOptionPane.showMessageDialog(this,"YOU LOSE! ");
	        this.setInvisible();
			}
			}
	
	if (checker>-1){
	StringBuffer lp = new StringBuffer("");
	int vp=recurrencycheck_L(hangman.WORD);
	
	for(int k=0;k<vp;k++){
	milse++;
	if(milse==hangman.WORD.length()){
		if(dust.game1checkhighscore(Login.id)<milse){
			dust.game1updatehighscore(Login.id,milse);
			hight.setText(Integer.toString(dust.game1checkhighscore(Login.id)));
		}
		
		this.setPictureInvisible();
		picture8.setVisible(true);
		this.setInvisible();
	}
	ok=WORDBUFFER.indexOf("L");
	WORDBUFFER.replace(ok,ok+1,"*");
	hypchangerL();
	}
	point.setText(Integer.toString(milse));
	answer.setText(hyp.toString());
	}

}



//M




if (f.getSource()==M){
	M.setVisible(false);
		checker = hangman.WORD.indexOf("M");
		if (checker==-1){
			
		milenai=milenai+1;
		a2d.setText(Integer.toString(milenai));
		    if(milenai==1){
			picture1.setVisible(false);
			picture2.setVisible(true);}
			if(milenai==2){
			picture2.setVisible(false);
			picture3.setVisible(true);}
			if(milenai==3){
			picture3.setVisible(false);
			picture4.setVisible(true);}
			if(milenai==4){
			picture4.setVisible(false);
			picture5.setVisible(true);}
			if(milenai==5){
			picture5.setVisible(false);
			picture6.setVisible(true);}
			if(milenai==6){
			picture6.setVisible(false);
			picture7.setVisible(true);
			JOptionPane.showMessageDialog(this,"YOU LOSE! ");
	        this.setInvisible();
			}
			}
	
	if (checker>-1){
	StringBuffer lp = new StringBuffer("");
	int vp=recurrencycheck_M(hangman.WORD);
	
	for(int k=0;k<vp;k++){
	milse=milse+1;
	if(milse==hangman.WORD.length()){
		if(dust.game1checkhighscore(Login.id)<milse){
			dust.game1updatehighscore(Login.id,milse);
			hight.setText(Integer.toString(dust.game1checkhighscore(Login.id)));
		}
		
		this.setPictureInvisible();
		picture8.setVisible(true);
		this.setInvisible();
	}
	ok=WORDBUFFER.indexOf("M");
	WORDBUFFER.replace(ok,ok+1,"*");
	hypchangerM();
	}
	point.setText(Integer.toString(milse));
	answer.setText(hyp.toString());
	}

}


//N
if (f.getSource()==N){
	N.setVisible(false);
		checker = hangman.WORD.indexOf("N");
		if (checker==-1){
		milenai++;
		a2d.setText(Integer.toString(milenai));
		    if(milenai==1){
			picture1.setVisible(false);
			picture2.setVisible(true);}
			if(milenai==2){
			picture2.setVisible(false);
			picture3.setVisible(true);}
			if(milenai==3){
			picture3.setVisible(false);
			picture4.setVisible(true);}
			if(milenai==4){
			picture4.setVisible(false);
			picture5.setVisible(true);}
			if(milenai==5){
			picture5.setVisible(false);
			picture6.setVisible(true);}
			if(milenai==6){
			picture6.setVisible(false);
			picture7.setVisible(true);
			JOptionPane.showMessageDialog(this,"YOU LOSE! ");
	        this.setInvisible();
			}
			}
	
	if (checker>-1){
	StringBuffer lp = new StringBuffer("");
	int vp=recurrencycheck_N(hangman.WORD);
	
	for(int k=0;k<vp;k++){
	milse++;
	if(milse==hangman.WORD.length()){
		
		if(dust.game1checkhighscore(Login.id)<milse){
			dust.game1updatehighscore(Login.id,milse);
			hight.setText(Integer.toString(dust.game1checkhighscore(Login.id)));
		}
		this.setPictureInvisible();
		picture8.setVisible(true);
		this.setInvisible();
	}
	ok=WORDBUFFER.indexOf("N");
	WORDBUFFER.replace(ok,ok+1,"*");
	hypchangerN();
	}
	point.setText(Integer.toString(milse));
	answer.setText(hyp.toString());
	}

}




//O

if (f.getSource()==O){
	O.setVisible(false);
		checker = hangman.WORD.indexOf("O");
		if (checker==-1){
		milenai++;
		a2d.setText(Integer.toString(milenai));
		    if(milenai==1){
			picture1.setVisible(false);
			picture2.setVisible(true);}
			if(milenai==2){
			picture2.setVisible(false);
			picture3.setVisible(true);}
			if(milenai==3){
			picture3.setVisible(false);
			picture4.setVisible(true);}
			if(milenai==4){
			picture4.setVisible(false);
			picture5.setVisible(true);}
			if(milenai==5){
			picture5.setVisible(false);
			picture6.setVisible(true);}
			if(milenai==6){
			picture6.setVisible(false);
			picture7.setVisible(true);
			JOptionPane.showMessageDialog(this,"YOU LOSE! ");
	        this.setInvisible();
			}
			}
	
	if (checker>-1){
	StringBuffer lp = new StringBuffer("");
	int vp=recurrencycheck_O(hangman.WORD);
	
	for(int k=0;k<vp;k++){
	milse++;
	if(milse==hangman.WORD.length()){
		if(dust.game1checkhighscore(Login.id)<milse){
			dust.game1updatehighscore(Login.id,milse);
			hight.setText(Integer.toString(dust.game1checkhighscore(Login.id)));
		}
		this.setPictureInvisible();
		picture8.setVisible(true);
		this.setInvisible();
	}
	ok=WORDBUFFER.indexOf("O");
	WORDBUFFER.replace(ok,ok+1,"*");
	hypchangerO();
	}
	point.setText(Integer.toString(milse));
	answer.setText(hyp.toString());
	}

}

//P


if (f.getSource()==P){
	P.setVisible(false);
		checker = hangman.WORD.indexOf("P");
		if (checker==-1){
		milenai++;
		a2d.setText(Integer.toString(milenai));
		    if(milenai==1){
			picture1.setVisible(false);
			picture2.setVisible(true);}
			if(milenai==2){
			picture2.setVisible(false);
			picture3.setVisible(true);}
			if(milenai==3){
			picture3.setVisible(false);
			picture4.setVisible(true);}
			if(milenai==4){
			picture4.setVisible(false);
			picture5.setVisible(true);}
			if(milenai==5){
			picture5.setVisible(false);
			picture6.setVisible(true);}
			if(milenai==6){
			picture6.setVisible(false);
			picture7.setVisible(true);
			JOptionPane.showMessageDialog(this,"YOU LOSE! ");
	        this.setInvisible();
			}
			}
	
	if (checker>-1){
	StringBuffer lp = new StringBuffer("");
	int vp=recurrencycheck_P(hangman.WORD);
	
	for(int k=0;k<vp;k++){
	milse++;
	if(milse==hangman.WORD.length()){
		
		if(dust.game1checkhighscore(Login.id)<milse){
			dust.game1updatehighscore(Login.id,milse);
			hight.setText(Integer.toString(dust.game1checkhighscore(Login.id)));
		}
		this.setPictureInvisible();
		picture8.setVisible(true);
		this.setInvisible();
	}
	ok=WORDBUFFER.indexOf("P");
	WORDBUFFER.replace(ok,ok+1,"*");
	hypchangerP();
	}
	point.setText(Integer.toString(milse));
	answer.setText(hyp.toString());
	}

}


//Q


if (f.getSource()==Q){
	Q.setVisible(false);
		checker = hangman.WORD.indexOf("Q");
		if (checker==-1){
		milenai++;
		a2d.setText(Integer.toString(milenai));
		    if(milenai==1){
			picture1.setVisible(false);
			picture2.setVisible(true);}
			if(milenai==2){
			picture2.setVisible(false);
			picture3.setVisible(true);}
			if(milenai==3){
			picture3.setVisible(false);
			picture4.setVisible(true);}
			if(milenai==4){
			picture4.setVisible(false);
			picture5.setVisible(true);}
			if(milenai==5){
			picture5.setVisible(false);
			picture6.setVisible(true);}
			if(milenai==6){
			picture6.setVisible(false);
			picture7.setVisible(true);
			JOptionPane.showMessageDialog(this,"YOU LOSE! ");
	        this.setInvisible();
			}
			}
	
	if (checker>-1){
	StringBuffer lp = new StringBuffer("");
	int vp=recurrencycheck_Q(hangman.WORD);
	
	for(int k=0;k<vp;k++){
	milse++;
	if(milse==hangman.WORD.length()){
		if(dust.game1checkhighscore(Login.id)<milse){
			dust.game1updatehighscore(Login.id,milse);
			hight.setText(Integer.toString(dust.game1checkhighscore(Login.id)));
		}
		this.setPictureInvisible();
		picture8.setVisible(true);
		this.setInvisible();
	}
	ok=WORDBUFFER.indexOf("Q");
	WORDBUFFER.replace(ok,ok+1,"*");
	hypchangerQ();
	}
	point.setText(Integer.toString(milse));
	answer.setText(hyp.toString());
	}

}

//R

if (f.getSource()==R){
	R.setVisible(false);
		checker = hangman.WORD.indexOf("R");
		if (checker==-1){
		milenai++;
		a2d.setText(Integer.toString(milenai));
		    if(milenai==1){
			picture1.setVisible(false);
			picture2.setVisible(true);}
			if(milenai==2){
			picture2.setVisible(false);
			picture3.setVisible(true);}
			if(milenai==3){
			picture3.setVisible(false);
			picture4.setVisible(true);}
			if(milenai==4){
			picture4.setVisible(false);
			picture5.setVisible(true);}
			if(milenai==5){
			picture5.setVisible(false);
			picture6.setVisible(true);}
			if(milenai==6){
			picture6.setVisible(false);
			picture7.setVisible(true);
			JOptionPane.showMessageDialog(this,"YOU LOSE! ");
	        this.setInvisible();}
			}
	
	if (checker>-1){
	StringBuffer lp = new StringBuffer("");
	int vp=recurrencycheck_R(hangman.WORD);
	
	for(int k=0;k<vp;k++){
	milse++;
	if(milse==hangman.WORD.length()){
		if(dust.game1checkhighscore(Login.id)<milse){
			dust.game1updatehighscore(Login.id,milse);
			hight.setText(Integer.toString(dust.game1checkhighscore(Login.id)));
		}
		this.setPictureInvisible();
		picture8.setVisible(true);
		this.setInvisible();
	}
	ok=WORDBUFFER.indexOf("R");
	WORDBUFFER.replace(ok,ok+1,"*");
	hypchangerR();
	}
	point.setText(Integer.toString(milse));
	answer.setText(hyp.toString());
	}

}



//S


if (f.getSource()==S){
	S.setVisible(false);
		checker = hangman.WORD.indexOf("S");
		if (checker==-1){
		milenai++;
		a2d.setText(Integer.toString(milenai));
		    if(milenai==1){
			picture1.setVisible(false);
			picture2.setVisible(true);}
			if(milenai==2){
			picture2.setVisible(false);
			picture3.setVisible(true);}
			if(milenai==3){
			picture3.setVisible(false);
			picture4.setVisible(true);}
			if(milenai==4){
			picture4.setVisible(false);
			picture5.setVisible(true);}
			if(milenai==5){
			picture5.setVisible(false);
			picture6.setVisible(true);}
			if(milenai==6){
			picture6.setVisible(false);
			picture7.setVisible(true);
			JOptionPane.showMessageDialog(this,"YOU LOSE! ");
	        this.setInvisible();
			}
			}
	
	if (checker>-1){
	StringBuffer lp = new StringBuffer("");
	int vp=recurrencycheck_S(hangman.WORD);
	
	for(int k=0;k<vp;k++){
	milse++;
	if(milse==hangman.WORD.length()){
		if(dust.game1checkhighscore(Login.id)<milse){
			dust.game1updatehighscore(Login.id,milse);
			hight.setText(Integer.toString(dust.game1checkhighscore(Login.id)));
		}
		this.setPictureInvisible();
		picture8.setVisible(true);
		this.setInvisible();
	}
	ok=WORDBUFFER.indexOf("S");
	WORDBUFFER.replace(ok,ok+1,"*");
	hypchangerS();
	}
	point.setText(Integer.toString(milse));
	answer.setText(hyp.toString());
	}

}

//T


if (f.getSource()==T){
	T.setVisible(false);
		checker = hangman.WORD.indexOf("T");
		if (checker==-1){
		milenai++;
		a2d.setText(Integer.toString(milenai));
		    if(milenai==1){
			picture1.setVisible(false);
			picture2.setVisible(true);}
			if(milenai==2){
			picture2.setVisible(false);
			picture3.setVisible(true);}
			if(milenai==3){
			picture3.setVisible(false);
			picture4.setVisible(true);}
			if(milenai==4){
			picture4.setVisible(false);
			picture5.setVisible(true);}
			if(milenai==5){
			picture5.setVisible(false);
			picture6.setVisible(true);}
			if(milenai==6){
			picture6.setVisible(false);
			picture7.setVisible(true);
			JOptionPane.showMessageDialog(this,"YOU LOSE! ");
	        this.setInvisible();
			}
			}
	
	if (checker>-1){
	StringBuffer lp = new StringBuffer("");
	int vp=recurrencycheck_T(hangman.WORD);
	
	for(int k=0;k<vp;k++){
	milse++;
	if(milse==hangman.WORD.length()){
		if(dust.game1checkhighscore(Login.id)<milse){
			dust.game1updatehighscore(Login.id,milse);
			hight.setText(Integer.toString(dust.game1checkhighscore(Login.id)));
		}
		
		this.setPictureInvisible();
		picture8.setVisible(true);
		this.setInvisible();
	}
	ok=WORDBUFFER.indexOf("T");
	WORDBUFFER.replace(ok,ok+1,"*");
	hypchangerT();
	}
	point.setText(Integer.toString(milse));
	answer.setText(hyp.toString());
	}

}


//U




if (f.getSource()==U){
	U.setVisible(false);
		checker = hangman.WORD.indexOf("U");
		if (checker==-1){
		milenai++;
		a2d.setText(Integer.toString(milenai));
		    if(milenai==1){
			picture1.setVisible(false);
			picture2.setVisible(true);}
			if(milenai==2){
			picture2.setVisible(false);
			picture3.setVisible(true);}
			if(milenai==3){
			picture3.setVisible(false);
			picture4.setVisible(true);}
			if(milenai==4){
			picture4.setVisible(false);
			picture5.setVisible(true);}
			if(milenai==5){
			picture5.setVisible(false);
			picture6.setVisible(true);}
			if(milenai==6){
			picture6.setVisible(false);
			picture7.setVisible(true);
			JOptionPane.showMessageDialog(this,"YOU LOSE! ");
	        this.setInvisible();}
			}
	
	if (checker>-1){
	StringBuffer lp = new StringBuffer("");
	int vp=recurrencycheck_U(hangman.WORD);
	
	for(int k=0;k<vp;k++){
	milse++;
	if(milse==hangman.WORD.length()){
		if(dust.game1checkhighscore(Login.id)<milse){
			dust.game1updatehighscore(Login.id,milse);
			hight.setText(Integer.toString(dust.game1checkhighscore(Login.id)));
		}
		
		this.setPictureInvisible();
		picture8.setVisible(true);
		this.setInvisible();
	}
	ok=WORDBUFFER.indexOf("U");
	WORDBUFFER.replace(ok,ok+1,"*");
	hypchangerU();
	}
	point.setText(Integer.toString(milse));
	answer.setText(hyp.toString());
	}

}



//V




if (f.getSource()==V){
	V.setVisible(false);
		checker = hangman.WORD.indexOf("V");
		if (checker==-1){
		milenai++;
		a2d.setText(Integer.toString(milenai));
		    if(milenai==1){
			picture1.setVisible(false);
			picture2.setVisible(true);}
			if(milenai==2){
			picture2.setVisible(false);
			picture3.setVisible(true);}
			if(milenai==3){
			picture3.setVisible(false);
			picture4.setVisible(true);}
			if(milenai==4){
			picture4.setVisible(false);
			picture5.setVisible(true);}
			if(milenai==5){
			picture5.setVisible(false);
			picture6.setVisible(true);}
			if(milenai==6){
			picture6.setVisible(false);
			picture7.setVisible(true);
			JOptionPane.showMessageDialog(this,"YOU LOSE! ");
	        this.setInvisible();
			}
			}
	
	if (checker>-1){
	StringBuffer lp = new StringBuffer("");
	int vp=recurrencycheck_V(hangman.WORD);
	
	for(int k=0;k<vp;k++){
	milse++;
	if(milse==hangman.WORD.length()){
		if(dust.game1checkhighscore(Login.id)<milse){
			dust.game1updatehighscore(Login.id,milse);
			hight.setText(Integer.toString(dust.game1checkhighscore(Login.id)));
		}
		this.setPictureInvisible();
		picture8.setVisible(true);
		this.setInvisible();
	}
	ok=WORDBUFFER.indexOf("V");
	WORDBUFFER.replace(ok,ok+1,"*");
	hypchangerV();
	}
	point.setText(Integer.toString(milse));
	answer.setText(hyp.toString());
	}

}

//W


if (f.getSource()==W){
	W.setVisible(false);
		checker = hangman.WORD.indexOf("W");
		if (checker==-1){
		milenai++;
		a2d.setText(Integer.toString(milenai));
		    if(milenai==1){
			picture1.setVisible(false);
			picture2.setVisible(true);}
			if(milenai==2){
			picture2.setVisible(false);
			picture3.setVisible(true);}
			if(milenai==3){
			picture3.setVisible(false);
			picture4.setVisible(true);}
			if(milenai==4){
			picture4.setVisible(false);
			picture5.setVisible(true);}
			if(milenai==5){
			picture5.setVisible(false);
			picture6.setVisible(true);}
			if(milenai==6){
			picture6.setVisible(false);
			picture7.setVisible(true);
			JOptionPane.showMessageDialog(this,"YOU LOSE! ");
	        this.setInvisible();
			}
			}
	
	if (checker>-1){
	StringBuffer lp = new StringBuffer("");
	int vp=recurrencycheck_W(hangman.WORD);
	
	for(int k=0;k<vp;k++){
	milse++;
	if(milse==hangman.WORD.length()){
		if(dust.game1checkhighscore(Login.id)<milse){
			dust.game1updatehighscore(Login.id,milse);
			hight.setText(Integer.toString(dust.game1checkhighscore(Login.id)));
		}
		
		this.setPictureInvisible();
		picture8.setVisible(true);
		this.setInvisible();
	}
	ok=WORDBUFFER.indexOf("W");
	WORDBUFFER.replace(ok,ok+1,"*");
	hypchangerW();
	}
	point.setText(Integer.toString(milse));
	answer.setText(hyp.toString());
	}

}

//X


if (f.getSource()==X){
	X.setVisible(false);
		checker = hangman.WORD.indexOf("X");
		if (checker==-1){
		milenai++;
		a2d.setText(Integer.toString(milenai));
		    if(milenai==1){
			picture1.setVisible(false);
			picture2.setVisible(true);}
			if(milenai==2){
			picture2.setVisible(false);
			picture3.setVisible(true);}
			if(milenai==3){
			picture3.setVisible(false);
			picture4.setVisible(true);}
			if(milenai==4){
			picture4.setVisible(false);
			picture5.setVisible(true);}
			if(milenai==5){
			picture5.setVisible(false);
			picture6.setVisible(true);}
			if(milenai==6){
			picture6.setVisible(false);
			picture7.setVisible(true);
			JOptionPane.showMessageDialog(this,"YOU LOSE! ");
	        this.setInvisible();
			}
			}
	
	if (checker>-1){
	StringBuffer lp = new StringBuffer("");
	int vp=recurrencycheck_X(hangman.WORD);
	
	for(int k=0;k<vp;k++){
	milse++;
	
	if(milse==hangman.WORD.length()){
		if(dust.game1checkhighscore(Login.id)<milse){
			dust.game1updatehighscore(Login.id,milse);
			hight.setText(Integer.toString(dust.game1checkhighscore(Login.id)));
		}
		
		this.setPictureInvisible();
		picture8.setVisible(true);
		this.setInvisible();
	}
	
	
	ok=WORDBUFFER.indexOf("X");
	WORDBUFFER.replace(ok,ok+1,"*");
	hypchangerX();
	}
	point.setText(Integer.toString(milse));
	answer.setText(hyp.toString());
	}

}


//Y

if (f.getSource()==Y){
	Y.setVisible(false);
		checker = hangman.WORD.indexOf("Y");
		if (checker==-1){
		milenai++;
		a2d.setText(Integer.toString(milenai));
		    if(milenai==1){
			picture1.setVisible(false);
			picture2.setVisible(true);}
			if(milenai==2){
			picture2.setVisible(false);
			picture3.setVisible(true);}
			if(milenai==3){
			picture3.setVisible(false);
			picture4.setVisible(true);}
			if(milenai==4){
			picture4.setVisible(false);
			picture5.setVisible(true);}
			if(milenai==5){
			picture5.setVisible(false);
			picture6.setVisible(true);}
			if(milenai==6){
			picture6.setVisible(false);
			picture7.setVisible(true);
			JOptionPane.showMessageDialog(this,"YOU LOSE! ");
	        this.setInvisible();
			}
			}
	
	if (checker>-1){
	StringBuffer lp = new StringBuffer("");
	int vp=recurrencycheck_Y(hangman.WORD);
	
	for(int k=0;k<vp;k++){
	milse++;
	if(milse==hangman.WORD.length()){
		
		if(dust.game1checkhighscore(Login.id)<milse){
			dust.game1updatehighscore(Login.id,milse);
			hight.setText(Integer.toString(dust.game1checkhighscore(Login.id)));
		}
		this.setPictureInvisible();
		picture8.setVisible(true);
		this.setInvisible();
	}
	ok=WORDBUFFER.indexOf("Y");
	WORDBUFFER.replace(ok,ok+1,"*");
	hypchangerY();
	}
	point.setText(Integer.toString(milse));
	answer.setText(hyp.toString());
	}

}



//Z


if (f.getSource()==Z){
	Z.setVisible(false);
		checker = hangman.WORD.indexOf("Z");
		if (checker==-1){
		milenai++;
		a2d.setText(Integer.toString(milenai));
		    if(milenai==1){
			picture1.setVisible(false);
			picture2.setVisible(true);}
			if(milenai==2){
			picture2.setVisible(false);
			picture3.setVisible(true);}
			if(milenai==3){
			picture3.setVisible(false);
			picture4.setVisible(true);}
			if(milenai==4){
			picture4.setVisible(false);
			picture5.setVisible(true);}
			if(milenai==5){
			picture5.setVisible(false);
			picture6.setVisible(true);}
			if(milenai==6){
			picture6.setVisible(false);
			picture7.setVisible(true);
			JOptionPane.showMessageDialog(this,"YOU LOSE! ");
	        this.setInvisible();
			}
			}
	
	if (checker>-1){
	StringBuffer lp = new StringBuffer("");
	int vp=recurrencycheck_Z(hangman.WORD);
	
	for(int k=0;k<vp;k++){
	milse++;
	if(milse==hangman.WORD.length()){
		if(dust.game1checkhighscore(Login.id)<milse){
			dust.game1updatehighscore(Login.id,milse);
			hight.setText(Integer.toString(dust.game1checkhighscore(Login.id)));
		}
		
		this.setPictureInvisible();
		picture8.setVisible(true);
		this.setInvisible();
	}
	ok=WORDBUFFER.indexOf("Z");
	WORDBUFFER.replace(ok,ok+1,"*");
	hypchangerZ();
	}
	point.setText(Integer.toString(milse));
	answer.setText(hyp.toString());
	}

}



















}


public String gethyphens(){
	
	for (int i=2; i <= hangman.WORD_COUNT; i ++)
	{
		hyp.append("-");
	}
	return hyp.toString();
}

//hypchanger
public void hypchangerA(){
		hyp.replace(ok,ok+1,"A");
}

public void hypchangerZ(){
		hyp.replace(ok,ok+1,"Z");
}

public void hypchangerY(){
		hyp.replace(ok,ok+1,"Y");
}
public void hypchangerX(){
		hyp.replace(ok,ok+1,"X");
}
public void hypchangerW(){
		hyp.replace(ok,ok+1,"W");
}
public void hypchangerV(){
		hyp.replace(ok,ok+1,"V");
}
public void hypchangerU(){
		hyp.replace(ok,ok+1,"U");
}
public void hypchangerT(){
		hyp.replace(ok,ok+1,"T");
}
public void hypchangerS(){
		hyp.replace(ok,ok+1,"S");
}
public void hypchangerR(){
		hyp.replace(ok,ok+1,"R");
}
public void hypchangerQ(){
		hyp.replace(ok,ok+1,"Q");
}
public void hypchangerP(){
		hyp.replace(ok,ok+1,"P");
}
public void hypchangerO(){
		hyp.replace(ok,ok+1,"O");
}
public void hypchangerN(){
		hyp.replace(ok,ok+1,"N");
}
public void hypchangerM(){
		hyp.replace(ok,ok+1,"M");
}
public void hypchangerL(){
		hyp.replace(ok,ok+1,"L");
}
public void hypchangerK(){
		hyp.replace(ok,ok+1,"K");
}
public void hypchangerJ(){
		hyp.replace(ok,ok+1,"J");
}
public void hypchangerI(){
		hyp.replace(ok,ok+1,"I");
}
public void hypchangerH(){
		hyp.replace(ok,ok+1,"H");
}
public void hypchangerG(){
		hyp.replace(ok,ok+1,"G");
}
public void hypchangerF(){
		hyp.replace(ok,ok+1,"F");
}
public void hypchangerE(){
		hyp.replace(ok,ok+1,"E");
}
public void hypchangerD(){
		hyp.replace(ok,ok+1,"D");
}
public void hypchangerC(){
		hyp.replace(ok,ok+1,"C");
}
public void hypchangerB(){
		hyp.replace(ok,ok+1,"B");
}


//recurrency checking

public int recurrencycheck_A(String s){
		int counter=0;
		for( int i=0; i<s.length(); i++ ) {
    if( s.charAt(i) == 'A' ) {
        counter++;
    }	
}
return counter;
	}
	
	public int recurrencycheck_B(String s){
		int counter=0;
		for( int i=0; i<s.length(); i++ ) {
    if( s.charAt(i) == 'B' ) {
        counter++;
    }	
}
return counter;
	}
	
	public int recurrencycheck_C(String s){
		int counter=0;
		for( int i=0; i<s.length(); i++ ) {
    if( s.charAt(i) == 'C' ) {
        counter++;
    }	
}
return counter;
	}
	
	public int recurrencycheck_D(String s){
		int counter=0;
		for( int i=0; i<s.length(); i++ ) {
    if( s.charAt(i) == 'D' ) {
        counter++;
    }	
}
return counter;
	}
	
	public int recurrencycheck_E(String s){
		int counter=0;
		for( int i=0; i<s.length(); i++ ) {
    if( s.charAt(i) == 'E' ) {
        counter++;
    }	
}
return counter;
	}
	
	public int recurrencycheck_F(String s){
		int counter=0;
		for( int i=0; i<s.length(); i++ ) {
    if( s.charAt(i) == 'F' ) {
        counter++;
    }	
}
return counter;
	}
	
	public int recurrencycheck_G(String s){
		int counter=0;
		for( int i=0; i<s.length(); i++ ) {
    if( s.charAt(i) == 'G' ) {
        counter++;
    }	
}
return counter;
	}
	
	public int recurrencycheck_H(String s){
		int counter=0;
		for( int i=0; i<s.length(); i++ ) {
    if( s.charAt(i) == 'H' ) {
        counter++;
    }	
}
return counter;
	}
	
	public int recurrencycheck_I(String s){
		int counter=0;
		for( int i=0; i<s.length(); i++ ) {
    if( s.charAt(i) == 'I' ) {
        counter++;
    }	
}
return counter;
	}public int recurrencycheck_J(String s){
		int counter=0;
		for( int i=0; i<s.length(); i++ ) {
    if( s.charAt(i) == 'J' ) {
        counter++;
    }	
}
return counter;
	}
	
	public int recurrencycheck_K(String s){
		int counter=0;
		for( int i=0; i<s.length(); i++ ) {
    if( s.charAt(i) == 'K' ) {
        counter++;
    }	
}
return counter;
	}
	
	public int recurrencycheck_L(String s){
		int counter=0;
		for( int i=0; i<s.length(); i++ ) {
    if( s.charAt(i) == 'L' ) {
        counter++;
    }	
}
return counter;
	}
	
	public int recurrencycheck_M(String s){
		int counter=0;
		for( int i=0; i<s.length(); i++ ) {
    if( s.charAt(i) == 'M' ) {
        counter++;
    }	
}
return counter;
	}
	
	public int recurrencycheck_N(String s){
		int counter=0;
		for( int i=0; i<s.length(); i++ ) {
    if( s.charAt(i) == 'N' ) {
        counter++;
    }	
}
return counter;
	}
	
	public int recurrencycheck_O(String s){
		int counter=0;
		for( int i=0; i<s.length(); i++ ) {
    if( s.charAt(i) == 'O' ) {
        counter++;
    }	
}
return counter;
	}
	
	public int recurrencycheck_P(String s){
		int counter=0;
		for( int i=0; i<s.length(); i++ ) {
    if( s.charAt(i) == 'P' ) {
        counter++;
    }	
}
return counter;
	}
	
	public int recurrencycheck_Q(String s){
		int counter=0;
		for( int i=0; i<s.length(); i++ ) {
    if( s.charAt(i) == 'Q' ) {
        counter++;
    }	
}
return counter;
	}
	
	public int recurrencycheck_R(String s){
		int counter=0;
		for( int i=0; i<s.length(); i++ ) {
    if( s.charAt(i) == 'R' ) {
        counter++;
    }	
}
return counter;
	}
	
	public int recurrencycheck_S(String s){
		int counter=0;
		for( int i=0; i<s.length(); i++ ) {
    if( s.charAt(i) == 'S' ) {
        counter++;
    }	
}
return counter;
	}
	
	public int recurrencycheck_T(String s){
		int counter=0;
		for( int i=0; i<s.length(); i++ ) {
    if( s.charAt(i) == 'T' ) {
        counter++;
    }	
}
return counter;
	}
	
	public int recurrencycheck_U(String s){
		int counter=0;
		for( int i=0; i<s.length(); i++ ) {
    if( s.charAt(i) == 'U' ) {
        counter++;
    }	
}
return counter;
	}
	
	public int recurrencycheck_V(String s){
		int counter=0;
		for( int i=0; i<s.length(); i++ ) {
    if( s.charAt(i) == 'V' ) {
        counter++;
    }	
}
return counter;
	}
	
	public int recurrencycheck_W(String s){
		int counter=0;
		for( int i=0; i<s.length(); i++ ) {
    if( s.charAt(i) == 'W' ) {
        counter++;
    }	
}
return counter;
	}
	
	public int recurrencycheck_X(String s){
		int counter=0;
		for( int i=0; i<s.length(); i++ ) {
    if( s.charAt(i) == 'X' ) {
        counter++;
    }	
}
return counter;
	}
	
	public int recurrencycheck_Y(String s){
		int counter=0;
		for( int i=0; i<s.length(); i++ ) {
    if( s.charAt(i) == 'Y' ) {
        counter++;
    }	
}
return counter;
	}
	
	public int recurrencycheck_Z(String s){
		int counter=0;
		for( int i=0; i<s.length(); i++ ) {
    if( s.charAt(i) == 'Z' ) {
        counter++;
    }	
}
return counter;
	}
	
	public void setInvisible(){
		
	Score.setVisible(false);
	AHEADtoDEATH.setVisible(false);
	MAX.setVisible(false);
	point.setVisible(false);
	a2d.setVisible(false);
	
	A.setVisible(false);
	B.setVisible(false);
	C.setVisible(false);
	D.setVisible(false);
	E.setVisible(false);
	F.setVisible(false);
	G.setVisible(false);
	H.setVisible(false);	
	I.setVisible(false);
	J.setVisible(false);
	K.setVisible(false);
	L.setVisible(false);
	M.setVisible(false);
	N.setVisible(false);
	O.setVisible(false);
	P.setVisible(false);
	Q.setVisible(false);
	R.setVisible(false);
	S.setVisible(false);
	T.setVisible(false);
	U.setVisible(false);
	V.setVisible(false);
	W.setVisible(false);
	X.setVisible(false);
	Y.setVisible(false);
	Z.setVisible(false);
	answer.setVisible(false);
}

void setPictureInvisible(){
	picture1.setVisible(false);
	picture2.setVisible(false);
	picture3.setVisible(false);
	picture4.setVisible(false);
	picture5.setVisible(false);
	picture6.setVisible(false);
	
}

/*public void CloseFrame(){
    super.dispose();
}*/




}