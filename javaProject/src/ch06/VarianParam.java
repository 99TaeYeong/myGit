package ch06;

public class VarianParam {
	public static void main(String[] args) {
		//자료형...변수 =>가변사이즈 매개변수
		//같은 자료형의 매개변수의 갯수에 관계없이 처리
		//매개변수들이 배열로 저장됨
		print("java");
		print("java","program");
		print("java","program","jsp");
		print("java","program","jsp","big","data");
	}

	static void print(String ...n) {//n은 가변형 매개변수(배열처리의 주소값)가 됨
		for(int i = 0; i<n.length; i++) {
			System.out.println(n[i]);
		}
	}

//	static void print(String a) {
//		 System.out.println(a);
//	}
//	 static void print(String a, String b) {
//		 
//		 System.out.println(a);
//		 System.out.println(b);
//	 }
//	 private static void print(String string, String string2, String string3) {
//		 // TODO Auto-generated method stub
//		 
//	 }
	 
}
