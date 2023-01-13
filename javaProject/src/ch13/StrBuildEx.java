package ch13;

public class StrBuildEx {
	public static void main(String[] args) {
		StringBuilder str1 = new StringBuilder("I am a ");
		String str2 = "Java Programmer";
		
		str1.append(str2);
		System.out.println(str1);
		str1.replace(7, 11, "jsp");
		System.out.println(str1);
		System.out.println(str1.substring(6));
	}
}
