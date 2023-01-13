package ch17;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class MyGridLayout extends JFrame{
	public MyGridLayout() {
		super("그리드 레이아웃");
		Container c = getContentPane();
		c.setLayout(new GridLayout(4,2));
		c.add(new JLabel("id"));
		c.add(new JTextField("hong",20));
		c.add(new JLabel("비밀번호"));
		c.add(new JPasswordField("1234",20));
		c.add(new JLabel("이메일"));
		c.add(new JTextField("hong@daum.net",20));
		c.add(new JLabel("hp"));
		c.add(new JTextField("010-1234-5678",20));
		
		setSize(400,300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new MyGridLayout();
	}
}
