package com.edu.qdu.zuche;

public class Bus extends Moto {

	public void rent(){
		System.out.println("\t\t�ͳ��⳵ϵͳ��ӭ����");
		System.out.println("��ѡ����Ҫ���޵Ŀͳ����ͣ�");
		System.out.println("����\t1��<=16���ͳ�\t2��>16���ͳ�");
		System.out.println("����ѣ�Ԫ/�죩\t800\t1500");
		int num = input.nextInt();
		switch (num) {
		case 1:
			setType("<=16���ͳ�");
			setPrice(800);
			break;
		case 2:
			setType(">16���ͳ�");
			setPrice(1500);
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
