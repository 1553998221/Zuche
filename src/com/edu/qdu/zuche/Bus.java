package com.edu.qdu.zuche;

public class Bus extends Moto {

	public void rent(){
		System.out.println("\t\t客车租车系统欢迎您！");
		System.out.println("请选择您要租赁的客车类型：");
		System.out.println("车型\t1、<=16座客车\t2、>16座客车");
		System.out.println("日租费（元/天）\t800\t1500");
		int num = input.nextInt();
		switch (num) {
		case 1:
			setType("<=16座客车");
			setPrice(800);
			break;
		case 2:
			setType(">16座客车");
			setPrice(1500);
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
