import java.io.*;
import java.util.*;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import javax.swing.*;
class JTextFieldExample extends Applet implements ActionListener{
	JFrame f;
	JTextField t1;
	JTextField t2;
	JTextField t3;
	JButton b1;
	JButton b2;
	JTextFieldExample(){
		f=new JFrame("JTextField Example");
		t1=new JTextField();
		t1.setBounds(50,50,150,20);
		t2=new JTextField();
		t2.setBounds(50,100,150,20);
		t3=new JTextField();
		t3.setBounds(50,150,150,20);
		t3.setEditable(false);
		b1=new JButton("Add");
		b1.setBounds(50,200,90,50);
		b1.setActionCommand("Add");
		b2=new JButton("Sub");
		b2.setBounds(150,200,90,50);
		b2.setActionCommand("Sub");
		b1.addActionListener(this);
		b2.addActionListener(this);
		f.add(t1);
		f.add(t2);
		f.add(t3);
		f.add(b1);
		f.add(b2);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent e){
		String com=e.getActionCommand();
		if(com.equals("Add")){
	String s1=t1.getText();
	String s2=t2.getText();
	int value1=Integer.parseInt(s1);
	int value2=Integer.parseInt(s2);
	int result;
	result=value1+value2;
	String s3=String.valueOf(result);
	t3.setText(s3);
		}
		else{
	String s1=t1.getText();
	String s2=t2.getText();
	int value1=Integer.parseInt(s1);
	int value2=Integer.parseInt(s2);
	int result;
	result=value1-value2;
	String s3=String.valueOf(result);
	t3.setText(s3);
		}
	}
	public static void main(String args[]){
		new JTextFieldExample();
	}
}