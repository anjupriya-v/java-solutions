import java.io.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
class JPanelExample{
	JFrame f;
	JPanel p;
	JButton b1;
	JButton b2;
	JPanelExample(){
		f=new JFrame("JPanel Example");
		p=new JPanel();
		p.setBounds(40,40,80,200);
		p.setBackground(Color.red);
		b1=new JButton("Click me");
		b1.setBounds(50,100,80,30);
		b1.setBackground(Color.yellow);
		b2=new JButton("Press me");
		b2.setBounds(100,100,80,30);
		b2.setBackground(Color.yellow);
		p.add(b1);
		p.add(b2);
		f.add(p);
		f.setSize(500,500);
		f.setLayout(null);
		f.setVisible(true);
	}
	public static void main(String args[]){
		new JPanelExample();
	}
}