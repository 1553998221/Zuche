package com.edu.qdu.zuche;

import java.util.Scanner;

public class Service {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Car car = new Car();
		Bus bus = new Bus();
		System.out.println("\t\t**********************");
		System.out.println("\t\t��ӭʹ�÷����⳵��˾�����⳵ϵͳ��");
		System.out.println("\t\t**********************");
		System.out.println("��ѡ����Ҫ�⳵�����ͣ�1���γ� 2���ͳ���������Ӧ���ּ��ɣ�");
		int num = input.nextInt();
		switch (num) {
		case 1:
			car.rent();
			car.calcRent();
			System.out.println("����Ҫ���ɵ����޷���Ϊ��"+car.getTotalPrice());
			break;
		case 2:
			bus.rent();
			bus.calcRent();
			System.out.println("����Ҫ���ɵ����޷���Ϊ��"+bus.getTotalPrice());
			break;

		default:
			break;
		}
	}
}
