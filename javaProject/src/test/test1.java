package test;

import java.util.Scanner;

public class test1 {
	public static final String UNIT="원";
	public int money;
	
	public test1() {
		
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
	public static String getUnit() {
		return UNIT;
	}
	
	public void print() {
		System.out.println(money+UNIT+"이 있습니다.");
	}
}
