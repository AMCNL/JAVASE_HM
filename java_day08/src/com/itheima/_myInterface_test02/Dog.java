package com.itheima._myInterface_test02;

public class Dog extends Animal implements Jumpping{

	
	public Dog(String name, int age) {
		super(age,name);
	}

	public Dog() {
		
	}

	@Override
	public void jumpping() {
		System.out.println("����ӵ�е����ߵļ���");
		
	}

	@Override
	public void eat() {
		System.out.println("�����Թ�ͷ");
		
	}

}
