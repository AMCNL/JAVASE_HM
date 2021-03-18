package com.itheima._myInterface_test01;

public class BasketballCoach extends Coach{
	
	public BasketballCoach(){}
	
	public BasketballCoach(String name,int age){
		super(name,age);
	}
	

	@Override
	public void teach() {
		System.out.println("篮球教练员教怎么投球和传球技巧");
		
	}

	@Override
	public void eat() {
		System.out.println("篮球教练员吃的是大米和羊奶");
		
	}

}
