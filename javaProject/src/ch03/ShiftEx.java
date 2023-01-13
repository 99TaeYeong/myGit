package ch03;

public class ShiftEx {
	public static void main(String[] args) {
		int a = 2;//이진수 0010
		//a값으 좌측으로 2비트씩 쉬프트 (밀어내기)
		int b = a<<2;// 1000 이진수
		System.out.println(b);
	}
}
