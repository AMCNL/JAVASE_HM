package com.itheima._myInterface_test02;

public class Dog extends Animal implements Jumpping{

	
	public Dog(String name, int age) {
		super(age,name);
	}

	public Dog() {
		
	}

	@Override
	public void jumpping() {
		System.out.println("狗狗拥有的跳高的技能");
		
	}

	@Override
	public void eat() {
		System.out.println("狗狗吃骨头");
		
	}

}
