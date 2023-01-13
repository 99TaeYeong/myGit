package ch17;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;

public class FrameColor extends JFrame{
	public FrameColor() throws InterruptedException{//기본생성자 
		setVisible(true);
		Container c=getContentPane();//프레임에 컨텐츠의 영역처리
		for(int i =0; i<=255; i++) {
			setSize(i*2,i);//프레임 사이즈
			setLocation(i*2,i);//프레임의 좌표
			c.setBackground(new Color(i,0,0));//배경색상 설정
			Thread.sleep(10);
		}
		for(int i = 0; i<=255;i++) {
			setSize(i*2,i);
			setLocation(i*2,i);//프레임의 좌표
			c.setBackground(new Color(255,0,i));//배경색상 설정
			Thread.sleep(10);
		}
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		new FrameColor();
	}
}
