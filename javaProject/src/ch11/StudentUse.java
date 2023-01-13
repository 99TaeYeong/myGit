package ch11;

public class StudentUse {
	public static void main(String[] args) {
		
		SInfo s = new SInfo("홍길동", "hong@gmail.com");
		s.address("서울시 강남구");
		s.point(90, 85, 79);
		s.print();
		
		
	}
}
