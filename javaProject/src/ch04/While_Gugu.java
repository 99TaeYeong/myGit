package ch04;

import java.util.Scanner;

public class While_Gugu {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a ;
		int b =1;
		System.out.print("구구단 중에서 출력하고 싶은 단을 입력하세요 : ");
		a = scan.nextInt();
		
		
			while(b<=9){
				System.out.println(a+" x "+b+" = "+(a*b));
				b++;
			}
			scan.close();
		}
		
		
	
}
