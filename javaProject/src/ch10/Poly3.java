package ch10;

class Pa3{
	int code = 10;
	public void print() {
		System.out.printf("출력결과 : \n사번 :%d\n",code);
	}
}
class Ch3 extends Pa3 {
	String name ="홍길동";
	@Override
	public void print() {
		super.print();
		System.out.println("이름 : "+name);
	}
}


public class Poly3 {
	public static void main(String[] args) {
		String email = "hong@gmail.com";
		String num = "010-1234-5678";
		String address = "서울 강남구 역삼동";
		Pa3 p = new Ch3();
		p.print();
		System.out.printf("이메일: %s\n전화: %s\n주소: %s\n",email,num,address);
		
	}
}
