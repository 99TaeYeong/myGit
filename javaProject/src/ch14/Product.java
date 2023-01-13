package ch14;

import java.util.Scanner;

public class Product {
	private String num; //제품번호
	private String item; //제품명
	private String degree;//제조사
	private int price; //단가
	private int amount; //수량
	private int money; //총액 (단가*수량)
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("제품번호: ");
		num = sc.next();
		System.out.println("제품명: ");
		item = sc.next();
		System.out.println("제조사: ");
		degree = sc.next();
		System.out.println("단가: ");
		price = sc.nextInt();
		System.out.println("수량: ");
		amount = sc.nextInt();
		
		money = (price * amount)+(price*amount/10);
	}
		
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
	
	
}
