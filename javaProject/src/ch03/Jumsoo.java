package ch03;

import java.util.Scanner;

public class Jumsoo {
	public static void main(String[] args) {
		String name;
		int java ,db , html, jsp ,tot ;
		double avg;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("이름 : ");
		name = scan.next(); //문자열 입력
		System.out.print("Java : ");
		java = scan.nextInt();
		System.out.print("DB : ");
		db = scan.nextInt();
		System.out.print("HTML : ");
		html = scan.nextInt();
		System.out.print("JSP : ");
		jsp = scan.nextInt();
		
		tot =  java + db + html + jsp;
		avg = tot / 4.0;
		System.out.println("===================================================");
		System.out.println("이름\tJAVA\tDB\tHTML\tJSP\t총점\t평균");
		System.out.println("---------------------------------------------------");
		System.out.println(name+"\t"+java+"\t"+db+"\t"+html+"\t"+jsp+"\t"+tot+"\t"+avg);
		System.out.println("===================================================");
		
		scan.close();
	}
}
