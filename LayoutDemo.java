package Swing;
import java.awt.*;
import javax.swing.*;
public class LayoutDemo extends JFrame {
	public LayoutDemo()
	{
		
//		JButton bt1=new JButton("One");
//		JButton bt2=new JButton("Two");
//		JButton bt3=new JButton("Three");
//		JButton bt4=new JButton("Four");
//		JButton bt5=new JButton("Five");
//		add(bt1);
//		add(bt2);
//		add(bt3);
//		add(bt4);
//		add(bt5);
		add(new Button("PAGE_START"),BorderLayout.PAGE_START);
		add(new Button("B"),BorderLayout.SOUTH);
		add(new Button("C"),BorderLayout.LINE_START);
		add(new Button("D"),BorderLayout.LINE_END);
		add(new Button("F"),BorderLayout.CENTER);
		//GridLayout glt=new GridLayout(2,3);//Rows has more priority;
		//CardLayout cl=new CardLayout();
		//setLayout(cl);
		//setLayout(glt);
		setVisible(true);
		setSize(200,200);
		
	}

	public static void main(String[] args) {
		new LayoutDemo();
		

	}

}
