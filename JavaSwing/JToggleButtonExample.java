import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class JToggleButtonExample extends JFrame implements ItemListener{
	public static void main(String args[]){
		new JToggleButtonExample();
	}
	private JToggleButton button;
	JToggleButtonExample(){
		setTitle("JToggleButton with ItemListener");
		setLayout(new FlowLayout());
		setJToggleButton();
		setAction();
		setSize(200,200);
		setVisible(true);
	}
	private void setJToggleButton(){
		button =new JToggleButton("ON");
		add(button);
	}
	private void setAction(){
		button.addItemListener(this);
	}
	public void itemStateChanged(ItemEvent eve){
		if(button.isSelected()){
			button.setText("OFF");
		}
		else{
			button.setText("ON");
		}
	}
}
		