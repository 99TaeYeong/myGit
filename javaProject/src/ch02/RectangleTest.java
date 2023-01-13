package ch02;

import java.util.Scanner;

public class RectangleTest {

	public static void main(String[] args) {
		System.out.println("====================");
		Scanner scan = new Scanner(System.in);
		System.out.print("가로값을 입력하세요 : ");
		int a = scan.nextInt();
		System.out.print("세로값을 입력하세요 : ");
		int b = scan.nextInt();
		int area = a * b ;
		System.out.println("직사각형의 넓이는"+area+"입니다");
		System.out.println("====================");
		
		scan.close();
	}

}
