package ch15;

public class Test {
	public static void main(String[] args) {
		try {
			int num = Integer.parseInt("abc");
			System.out.println(num);
		} catch (NumberFormatException e) {
			System.out.println("오류가 발생했습니다.");
		}
		System.out.println("시스템을 종료합니다.");
		
		
	}
}
