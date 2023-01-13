package ch04;

public class For_For {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {//5번반복
			for(int j=1; j<=5; j++) {//중첩for문(inner for)
				//중첩for문에서는 변수사용에 유의 (다른 변수를 사용)
				System.out.print("*");
			}//inner for
			System.out.println();
		}//outer for
	}//end main() : 프로그램종료

}
