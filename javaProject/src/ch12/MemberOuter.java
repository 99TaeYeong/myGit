package ch12;

public class MemberOuter {
	private int num = 1;
	private String  name = "홍길동";
	private String email = "hong@gmail.com";
	class member{
		void member() {
			System.out.println("출력결과 : ");
			System.out.println("--------------------------------------------");
			System.out.println("고객번호 : "+num+"\n이름 : "+name+"\n이메일 : "+email);
			System.out.println("--------------------------------------------");
		}
	}
	
	
	
	
	
	public static void main(String[] args) {
		MemberOuter obj = new MemberOuter();
		MemberOuter.member m = obj.new member(); 
		m.member();
	}
}
