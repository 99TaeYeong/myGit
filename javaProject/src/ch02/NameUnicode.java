package ch02;

public class NameUnicode {
	public static void main(String[] args) {
		char a = '\uc724';
		char b = '\ud0dc';
		char c = '\uc601';
		
		System.out.println("char형(\'\\uc724'):"+a);
		System.out.println("char형(\'\\ud0dc'):"+b);
		System.out.println("char형(\'\\uc601'):"+c);
	}
}
