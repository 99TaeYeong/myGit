package ch04;

public class BreakEx4 {
	public static void main(String[] args) {
		String a = "Hello World";
		int b = 1;
		
		while (1<=10) {
			if(b==8) break;
			System.out.println( b + a );
			b++;
		}
		System.out.println("B의 값이 8이며 while문을 빠져나옴");
	}
}
