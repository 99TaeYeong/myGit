package ch02;


//사각형의 넓이의 둘레를 구하는 프로그램을 만들어보세요.
	//가로 = 10.0 , 세로 = 5으로 정함
	//공식) 사각형의 넓이 = 가로 * 세로
	//   ) 사각형의 둘레 = 2.0*(가로+세로)
public class Box {
	public static void main(String[] args) {
		double a = 10.0 ;
		int b = 5;
		
		double area = a*b;
		double round = 2.0 * (a+b);
		
		System.out.println("사각형의 넓이"+area);
		System.out.println("사각형의 둘레"+round);
		
		
		
	}
	
	
}
