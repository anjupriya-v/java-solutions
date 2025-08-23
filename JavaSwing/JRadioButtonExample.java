import java.io.*;
import java.util.*;
import javax.swing.*;
class JRadioButtonExample{
	JFrame f;
	JRadioButton r1;
	JRadioButton r2;
	ButtonGroup bg;
	JRadioButtonExample(){
		f=new JFrame();
		r1=new JRadioButton("Ruby",false);
		r1.setBounds(75,50,100,30);
		r2=new JRadioButton("C#",true);
		r2.setBounds(75,100,100,30);
		bg=new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		f.add(r1);
		f.add(r2);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
		
	}
	public static void main(String args[]){
		new JRadioButtonExample();
	}
}