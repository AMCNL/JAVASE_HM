package com.itheima._myInterface_test01;

public class BasketballCoach extends Coach{
	
	public BasketballCoach(){}
	
	public BasketballCoach(String name,int age){
		super(name,age);
	}
	

	@Override
	public void teach() {
		System.out.println("�������Ա����ôͶ��ʹ�����");
		
	}

	@Override
	public void eat() {
		System.out.println("�������Ա�Ե��Ǵ��׺�����");
		
	}

}
