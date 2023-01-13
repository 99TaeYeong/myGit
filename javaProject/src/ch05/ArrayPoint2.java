package ch05;

import java.util.Scanner;

public class ArrayPoint2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name[]=new String[2];
		int kor[] = new int[2];
		int eng[] = new int[2];
		int mat[] = new int[2];
		
		double avg[] = new double[2];
		double tot[] = new double[2];
		double tot_avg = 0;
		
		System.out.println("2명의 학생의 국,영,수 점수를 각각 입력하세요.");
		
		for(int i=0; i<name.length; i++) {
			System.out.print("이름을 입력하세요 :");
			name[i] = scan.next();
			System.out.print("국어점수를 입력하세요 :");
			kor[i] = scan.nextInt();
			System.out.print("영어점수를 입력하세요 :");
			eng[i] = scan.nextInt();
			System.out.print("수학점수를 입력하세요 :");
			mat[i] = scan.nextInt();
			System.out.println("");
		}
		for(int i=0; i<name.length; i++) {
			tot[i] = kor[i]+eng[i]+mat[i];
			avg[i] = tot[i]/3.0;
			tot_avg = tot_avg + avg[i];
			System.out.println("이름: "+name[i]+"\n국어: "+kor[i]+"\n영어: "+
					eng[i]+"\n수학: "+mat[i]+"\n총점: "+tot[i]+"\n평균: "+String.format("%.1f\n",avg[i]));
		}	
		System.out.println("============================================");
		System.out.printf("학급평균: %.1f",tot_avg/2);
	}

}
