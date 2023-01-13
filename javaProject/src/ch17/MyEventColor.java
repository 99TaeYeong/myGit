package ch17;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyEventColor extends JFrame{
	 public MyEventColor() {
		JButton button1 = new JButton("North");
		JButton button2 = new JButton("East");
		JButton button3 = new JButton("South");
		JButton button4 = new JButton("West");
		
		add(button1,BorderLayout.NORTH);
		add(button2,BorderLayout.EAST);
		add(button3,BorderLayout.SOUTH);
		add(button4,BorderLayout.WEST);
		
		button1.addActionListener(new MyColorAction(this, Color.red));
		button2.addActionListener(new MyColorAction(this, Color.green));
		button3.addActionListener(new MyColorAction(this, Color.blue));
		button4.addActionListener(new MyColorAction(this, Color.yellow));

		setSize(300,300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	 }
	public static void main(String[] args) {
		new MyEventColor();
	}
}
