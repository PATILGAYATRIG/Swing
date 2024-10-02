package Swing;
import java.awt.*;
import javax.swing.*;



public class SwingDemo2 extends JFrame {
	public SwingDemo2()
	{
		JLabel lbl =new JLabel("Enter Your Name:");
		JTextField txt =new JTextField(20);
		add(lbl);
		add(txt);
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(200,200);
	}

	public static void main(String[] args) {
		
		new SwingDemo2();

	}

}
