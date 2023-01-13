package ch12;

public class MemberAnony {
	
	public static void main(String[] args) {
		
		
		
		Member m = new Member() {
			
			private int num;
			private String name;
			private String email;
			
			@Override
			public void client(int num, String name, String email) {
				this.num = num;
				this.name = name;
				this.email = email;
				
			}
			@Override
			public void print() {
				System.out.println("출력결과 :");
				System.out.println("==================================");
				System.out.printf("고객이름: %d\n이름: %s\n이메일: %s\n",num,name,email);
				System.out.println("==================================");
			}
		};
		m.client(2, "홍길동", "kim@gmail.com");
		m.print();
	}
}
