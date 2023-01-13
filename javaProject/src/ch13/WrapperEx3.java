package ch13;

public class WrapperEx3 {
	public static void main(String[] args) {
		String c = "Hello 1234";
		
		for(int i = 0 ; i<c.length(); i++) {
			if (Character.isUpperCase(c.charAt(i))) {
				System.out.println(c.charAt(i)+"는 대문자입니다.");
			}else if(Character.isLowerCase(c.charAt(i))) {
				System.out.println(c.charAt(i)+"는 소문자입니다.");
			}else if(Character.isDigit(c.charAt(i))) {
				System.out.println(c.charAt(i)+"는 숫자입니다.");
			}
		}
		System.out.println("--------------------------------");
		System.out.println("문자 "+c.substring(6)+"입니다.");
		System.out.println("숫자 "+Integer.parseInt(c.substring(6))+"입니다.");
		System.out.println("숫자 "+Integer.parseInt(c.substring(6))+" + 2 = "+(Integer.parseInt(c.substring(6))+2)+"입니다.");
	}
}
