package ch07;

public class RadioTest {
	public static void main(String[] args) {
	
		Radio Rd1 = new Radio();
		
		Rd1.name = "브리츠 라디오";
		Rd1.onOff = true;
		Rd1.channel = 89.1f;
		Rd1.volume = 12;
		
		
		Radio Rd2 = new Radio();
		
		Rd2.name = "아이리버 라디오";
		Rd2.onOff = false;
		Rd2.channel = 95.1f;
		Rd2.volume = 9;
		
		System.out.println("출력결과 :\n");
		Rd1.print();
		Rd2.print();
		
		
	}
	
}
