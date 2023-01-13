package ch09;

public class Circle {
	private void secret() {//private
		System.out.println("비밀이다.");
	}
	protected void findRadius() {
		System.out.println("반지름 구하기");
	}
	public void findarea() {
		System.out.println("넒이 구하기");
	}
	public Circle() {//기본생성자(코딩해주는 습관은 좋다)
		
	}
	public Circle(int r) {//생성자는 상속의 대상이 아니다
		System.out.println("반지름 : "+r);
	}
}
