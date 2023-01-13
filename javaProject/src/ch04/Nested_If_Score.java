package ch04;

import java.util.Scanner;

public class Nested_If_Score {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a ;
		System.out.print("Java 점수 : ");
		a = scan.nextInt() ;
		scan.close();
		if (a>=95) {
			System.out.printf("당신의 점수는 %d이고 등급은 A+입니다",a);
		} else if(a>=90) {
			System.out.printf("당신의 점수는 %d이고 등급은 A0입니다",a);
		} else if(a>=85) {
			System.out.printf("당신의 점수는 %d이고 등급은 b+입니다",a);
		}else if(a>=80) {
			System.out.printf("당신의 점수는 %d이고 등급은 b0입니다",a);
		}else if(a>=75) {
			System.out.printf("당신의 점수는 %d이고 등급은 c+입니다",a);
		}else {
			System.out.println("당신의 점수는 75점 이하입니다.");
		}
		
	}
}
