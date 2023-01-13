package ch13;

public class AutoBox2 {
	public static void main(String[] args) {
		//기본자료형 변수
		int num1 = 30;
		int num2;
		int num3;
		
		Integer i1; //i1 = null 상태
		Integer i2 = new Integer(40);
		Integer i3 = new Integer(50);
		
		//객체자료형 참조변수
		i1 = num1;
		num2 = i2;//auto unboxing(객체 안에 들어있는 값을 풀어서 기본타입으로 바꾸었기 때문에 저장가능)
		num3 = i3;
		
		System.out.println("출력결과 : ");
		System.out.printf("기본자료형 : %d, 객체자료형: %d\n기본자료형 : %d, 객체자료형: %d\n기본자료형 : %d, 객체자료형: %d\n",num1,i1,num2,i2,num3,i3);
	}
}
