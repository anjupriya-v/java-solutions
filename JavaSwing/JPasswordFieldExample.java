import java.io.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class JPasswordFieldExample implements ActionListener{
	JFrame f;
	JTextField t;
	JPasswordField p;
	JButton b;
	JLabel lu;
	JLabel lp;
	JLabel lr;
	JPasswordFieldExample(){
		f=new JFrame("JPasswordField Example");
		lu=new JLabel("UserName: ");
		lu.setBounds(20,20,80,30);
		t=new JTextField();
		t.setBounds(100,20,100,30);
		lp=new JLabel("Password: ");
		lp.setBounds(20,75,80,30);
		p=new JPasswordField();
		p.setBounds(100,75,100,30);
		b=new JButton("Login");
		b.setBounds(100,120,80,30);
		b.addActionListener(this);
		lr=new JLabel();
		lr.setBounds(20,150,200,50);
		f.add(lu);
		f.add(t);
		f.add(lp);
		f.add(b);
		f.add(p);
		f.add(lr);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
		
		
	}
	public void actionPerformed(ActionEvent e){
	String userName,password,data;
	userName=t.getText();
	password=new String(p.getPassword());
	data="UserName: "+userName+" ,Password: "+password;
	lr.setText(data);
	}
	public static void main(String args[]){
		new JPasswordFieldExample();
}
}