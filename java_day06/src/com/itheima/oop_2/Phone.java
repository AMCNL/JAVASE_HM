package com.itheima.oop_2;

public class Phone {
	String brand; //�ֻ�Ʒ��
	
	int price;   //�۸�
	
	String color;  //��ɫ
	
	//��Ա����
	public void call(String brand){
		System.out.println("��"+brand+"��绰��");
	}
	
	public void sendMessage(String brand){
		System.out.println("��"+brand+"��ѶϢ");
	}

}
