package com.edu.qdu.zuche;

import java.util.Scanner;

public class Car extends Moto {
	Scanner input = new Scanner(System.in);

	public void rent() {
		System.out.println("\t\t轿车租车系统欢迎您！");
		System.out.println("车型\t\t1、别克商务\t2、宝马550i\t3、别克林荫大道");
		System.out.println("日租费（元/天）\t600\t500\t\t300");
		System.out.println("请选择您要租赁的轿车类型：");
		int num = input.nextInt();
		switch (num) {
		case 1:
			setType("别克商务");
			setPrice(600);
			break;
		case 2:
			setType("宝马550i");
			setPrice(500);
			break;
		case 3:
			setType("别克林荫大道");
			setPrice(300);
			break;

		default:
			break;
		}
		System.out.println("您选择的是:" + getType() + "\t" + getPrice() + "元/天");
		System.out.println("请您输入您要租赁的天数：");
		setDays(input.nextInt());

	}

	public int calcRent() {
		setTotalPrice(getDays() * getPrice());
		return getTotalPrice();
	}
}
