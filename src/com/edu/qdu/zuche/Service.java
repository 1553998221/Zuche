package com.edu.qdu.zuche;

import java.util.Scanner;

public class Service {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Car car = new Car();
		Bus bus = new Bus();
		System.out.println("\t\t**********************");
		System.out.println("\t\t欢迎使用帆哥租车公司自助租车系统！");
		System.out.println("\t\t**********************");
		System.out.println("请选择您要租车的类型：1、轿车 2、客车（输入相应数字即可）");
		int num = input.nextInt();
		switch (num) {
		case 1:
			car.rent();
			car.calcRent();
			System.out.println("您需要缴纳的租赁费用为："+car.getTotalPrice());
			break;
		case 2:
			bus.rent();
			bus.calcRent();
			System.out.println("您需要缴纳的租赁费用为："+bus.getTotalPrice());
			break;

		default:
			break;
		}
	}
}
