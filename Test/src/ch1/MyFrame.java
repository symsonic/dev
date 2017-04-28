package ch1;

import javax.swing.JFrame;

public class MyFrame extends JFrame{
	MyFrame(){
		setTitle("frame");
		
		setSize(300, 300);
		
		setVisible(true);
	}
	
	
	//Container contentPane = getContentPane();
	public static void main(String[] args){
		MyFrame mf = new MyFrame();
	}


}
