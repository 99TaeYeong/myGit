package ch09;

public class ManagerTest {
	public static void main(String[] args) {
		Manager m1 = new Manager();
		
		m1.input(1,"홍길동", "서울 강남구 역삼동", "hong@gmail.com", 250, "123456-1234567");
		m1.money();
		m1.bonus();
		m1.print();
	}
}
