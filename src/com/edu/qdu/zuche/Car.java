package com.edu.qdu.zuche;

import java.util.Scanner;

public class Car extends Moto {
	Scanner input = new Scanner(System.in);

	public void rent() {
		System.out.println("\t\t�γ��⳵ϵͳ��ӭ����");
		System.out.println("����\t\t1���������\t2������550i\t3�����������");
		System.out.println("����ѣ�Ԫ/�죩\t600\t500\t\t300");
		System.out.println("��ѡ����Ҫ���޵Ľγ����ͣ�");
		int num = input.nextInt();
		switch (num) {
		case 1:
			setType("�������");
			setPrice(600);
			break;
		case 2:
			setType("����550i");
			setPrice(500);
			break;
		case 3:
			setType("���������");
			setPrice(300);
			break;

		default:
			break;
		}
		System.out.println("��ѡ�����:" + getType() + "\t" + getPrice() + "Ԫ/��");
		System.out.println("����������Ҫ���޵�������");
		setDays(input.nextInt());

	}

	public int calcRent() {
		setTotalPrice(getDays() * getPrice());
		return getTotalPrice();
	}
}
