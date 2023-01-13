package ch05;

import java.util.Scanner;

public class ArrayScanScore {
	public static void main(String[] args) {
		int score[] = new int[10];
		int stu;
		int tot=0;
		double avg=0.0;
		
		Scanner scan = new Scanner(System.in);
		
		
		stu = scan.nextInt();
		
		
		for(int i=0; i<stu; i++) {
			System.out.print("성적을 입력하세요 : ");
			score[i] = scan.nextInt();
			tot += score[i];
			avg = tot/stu;
		}	
		System.out.printf("총점은 %d점 입니다.\n",tot);
		System.out.printf("평균성적은 %.1f점 입니다.",avg);
	}
}
