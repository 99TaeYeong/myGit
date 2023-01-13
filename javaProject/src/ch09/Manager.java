package ch09;

public class Manager  extends Employee{
	private int money;
	private float bonus;
	
	public void input(int num,String name,String adress,String email,int salary ,String rrn) {
		setNum(num);
		this.name =name;
		this.adress = adress;
		this.email = email;
		this.salary = salary;
		setRrn(rrn);
		this.money=money;
		this.bonus=bonus;
	}
	public void money() {
		 money = salary*12;
	}
	public void bonus() {
		bonus = (float)(money*0.3);
	}
	public void print() {
		System.out.println("=========================================");
		System.out.printf("사번 : %d\n이름 :%s\n주소 : %s\n이메일 : %s\n주민번호 : %s\n연봉 : %d\n보너스 : %.1f\n",getNum(),name,adress,email,getRrn(),money,bonus);
		System.out.print("=========================================");
	}
	
}
