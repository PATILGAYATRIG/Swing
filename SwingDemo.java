package Swing;

import javax.swing.*;
import java.awt.*;
public class SwingDemo {

	public static void main(String[] args) {
	JFrame j=new JFrame();
	JLabel lbl=new JLabel("Enter Your Name:");
	JTextField txt =new JTextField(10);
	j.add(lbl);
	j.add(txt);
	j.setLayout(new FlowLayout());
	j.setVisible(true);
	j.setSize(200,200);
	}

}
