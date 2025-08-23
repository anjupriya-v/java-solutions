import java.io.*;
import java.util.*;
import java.awt.*;
import javax.swing.*;
class JCheckBoxExample{
	JFrame f;
	JCheckBox c1;
	JCheckBox c2;
	JCheckBoxExample(){
		f=new JFrame();
		c1=new JCheckBox("Java",true);
		c1.setBounds(100,100,100,50);
		c2=new JCheckBox("JavaScript",false);
		c2.setBounds(100,150,100,50);
		f.add(c1);
		f.add(c2);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
	}
	public static void main(String args[]){
		new JCheckBoxExample();
	}
}
		