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
		System.out.println("篮球运动员学习打篮球");

	}

	@Override
	public void eat() {
		System.out.println("篮球运动员去篮球食堂吃饭");

	}

}
