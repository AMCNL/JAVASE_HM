package com.itheima._myInterface_test01_review;

public class BasketballPlayer extends Player {

	public BasketballPlayer(String name, int age) {
		super(name, age);

	}

	public BasketballPlayer() {
		super();
	}

	@Override
	public void study() {
		System.out.println("�����˶�Աѧϰ������");

	}

	@Override
	public void eat() {
		System.out.println("�����˶�Աȥ����ʳ�óԷ�");

	}

}
