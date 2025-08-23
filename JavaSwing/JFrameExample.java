import java.io.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
class JFrameExample{
	JFrame f;
	JButton b;
	JPanel p;
	JLabel l;
	JFrameExample(){
		f=new JFrame("JFrame Example");
		p=new JPanel();
		p.setLayout(new FlowLayout());
		l=new JLabel("Hello world");
		b=new JButton("Click me");
		p.add(l);
		p.add(b);
		f.add(p);
		f.setSize(500,500);
		f.setVisible(true);
	}
	public static void main(String args[]){
		new JFrameExample();
	}
}
		