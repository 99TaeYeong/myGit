package ch11;

public class SInfo implements Student {
	private String name, email, address;
	private int kor;
	private int eng;
	private int mat;
	private int tot;
	private float avg;
	

	SInfo(String name, String email){
		this.name = name;
		this.email = email;
	}
	
	@Override
	public void address(String address) {
		this.address = address;
	}

	@Override
	public void point(int kor, int eng, int mat) {
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		tot = kor + eng + mat;
		avg = tot/3.0f;
		
	}
	
	public void print() {
		System.out.println("=============================================");
		System.out.println("이름\t주소\t\t이메일");
		System.out.println(name+"\t"+address+"\t"+email);
		System.out.println("---------------------------------------------");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%.1f\n",name, kor, eng, mat, tot, avg);
		System.out.println("=============================================");
		
		
	}
	
	
	



}
