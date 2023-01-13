package ch13;

public class obj {//extends Object가 생략되어 있음
	public static void main(String[] args) {
		obj e1 =new obj();
		System.out.println(e1.getClass());//클래스 정보
		System.out.println(e1);
		System.out.println(e1.toString());//ch13.obj@15db9742 문자열 처리
	}

}
