package ch02;


/**
 * @author 윤태영
 * @version
 */
public class HelloExam {
	
	public static int sum(int n , int m) {//메소드 n=20,m=10
		return n + m;
		
	}
	public static void main(String[] args) {//메인 메소드
		int i = 20; // 변수 초기화(할당)
		int s;// 선언만
		char a;//변수 선언만
		
		s = sum(i,10);//s=30;
		a = '?';//변수초기화
		System.out.println(a);
		System.out.println("Hello");
		System.out.println(s);
	}
	
}
