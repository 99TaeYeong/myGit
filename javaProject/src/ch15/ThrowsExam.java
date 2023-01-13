package ch15;

public class ThrowsExam {
	//예외처리방법
	//1)try~catch 직접처리
	//2)throws 예외처리 클래스에
	
	
	//try~catch절 대신 throws 뒤에 예외처리클래스에 처리를 위임
	public static void main(String[] args) throws InterruptedException {
		for(int i=1; i<=10; i++) {
			System.out.println(i);
			Thread.sleep(1000);//Interrupt(cpu간섭)
		}
	}
}
