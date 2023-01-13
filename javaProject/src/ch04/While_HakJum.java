package ch04;

import java.util.Scanner;

public class While_HakJum {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int kor, mat, eng, tot;
		double avg;
		String grade;
		String result = "";
		int i = 0;
		
		System.out.println("전체 성적입력이 끝나면 마지막에 -1을 입력하세요.");
		System.out.print("아무정수나 입력하세요: ");
		i = in.nextInt();
		
		while(i != -1) {
			System.out.print("국어: ");
			kor = in.nextInt();
			System.out.print("영어: ");
			mat = in.nextInt();
			System.out.print("수학: ");
			eng = in.nextInt();
			tot = kor + eng + mat;
			avg = tot/3.0;
			switch((int)(avg / 10)) {
				case 10: 
				case 9: grade = "수"; break;
				case 8: grade = "우"; break;
				case 7: grade = "미"; break;
				case 6: grade = "양"; break;
				default: grade = "가";
			}
			result += kor +"\t" +eng + "\t" + mat + "\t" + tot + "\t" + String.format("%.1f",avg) + "\t" + grade + "\n";
			System.out.print("계속하려면 아무정수나 입력하세요: ");
			i = in.nextInt();
			tot = 0;
			avg = 0;			
		}
		in.close();
		
		
		
		
		
		System.out.println("============================================");
		System.out.println("국어\t영어\t수학\t총점\t평균\t등급");
		System.out.println("--------------------------------------------");
		System.out.println(result);
		System.out.println("============================================");
		
		
	}
}
