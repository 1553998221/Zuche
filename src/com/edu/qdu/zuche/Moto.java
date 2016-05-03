package com.edu.qdu.zuche;

import java.util.Scanner;

public abstract class Moto {
	Scanner input = new Scanner(System.in);
	// ����
	private String type;
	private int price;
	private int days;
	private int totalPrice;

	// ����
	public abstract void rent();
	public abstract int calcRent();

	// ��װ
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
}