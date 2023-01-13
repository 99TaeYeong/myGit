package ch10;

public class StaticMethod2 {
	static int num =10; //사번
	static String name = "홍길동";
	String email = "hong@gmail.com";
	String hp = "010-1234-5678";
	String addr = "서울 강남구 역삼동";
	
	public static void PrintA() {
		StaticMethod2 s2 = new StaticMethod2();
		System.out.printf("=== PrintA ===\n사번: %d\n이름: %s\n이메일: %s\n전화: %s\n주소: %s\n\n",num,name,s2.email,s2.hp,s2.addr);
	}
	public  void PrintB() {
		System.out.printf("=== PrintB ===\n사번: %d\n이름: %s\n이메일: %s\n전화: %s\n주소: %s\n",num,name,email,hp,addr);
	}
	
	public static void main(String[] args) {
		StaticMethod2 s1 = new StaticMethod2();
		PrintA();
		s1.PrintB();
	}
}
