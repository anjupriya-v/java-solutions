import java.io.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class JButtonWithListenerExample {
	JFrame f;
	JButton b;
	JTextField t;
	JButtonWithListenerExample(){
		f=new JFrame("JButton With listener Example");
		b=new JButton("Click me");
		b.setBounds(50,100,95,30);
		t=new JTextField();
		t.setBounds(50,50,150,20);
		b.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
			t.setText("Welcome to java tutorial");
			}
		});
		f.add(t);
		f.add(b);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
	}
	public static void main(String args[]){
		new JButtonWithListenerExample();
	}
}