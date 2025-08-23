import java.io.*;
import java.util.*;
import javax.swing.*;
class JSpinnerExample{
	JFrame f;
	JSpinner js;
	SpinnerModel sm;
	JSpinnerExample(){
		f=new JFrame();
		sm=new SpinnerNumberModel(5,0,10,1);
		js=new JSpinner(sm);
		js.setBounds(100,100,50,30);
		f.add(js);
		f.setSize(300,300);
		f.setLayout(null);
		f.setVisible(true);
	}
	public static void main(String args[]){
		new JSpinnerExample();
	}
}