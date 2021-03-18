package com.itheima._myInterface_test01;

public class BasketballPlayer extends Player{
	public BasketballPlayer(){}
	
	public BasketballPlayer(String name,int age){
		super(name,age);
	}
	@Override
	public void study() {
		System.out.println("篮球运动员学习怎么投球和传球");
		
	}

	@Override
	public void eat() {
		System.out.println("篮球远动员吃的是大米和牛奶");
		
	}

}
