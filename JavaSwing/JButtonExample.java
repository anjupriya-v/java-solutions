import java.io.*;
import java.util.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
class JButtonExample{
	JFrame f;
	JButton b;
	JButtonExample(){
		f=new JFrame("JButton Example");
		b=new JButton("Click me");
		b.setBounds(130,100,100,40);
		f.setBackground(Color.yellow);
		b.setBackground(Color.gray);
		f.add(b);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
	}
	public static void main(String args[]){
		new JButtonExample();
	}
}