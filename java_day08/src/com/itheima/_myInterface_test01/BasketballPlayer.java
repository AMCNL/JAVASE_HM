package com.itheima._myInterface_test01;

public class BasketballPlayer extends Player{
	public BasketballPlayer(){}
	
	public BasketballPlayer(String name,int age){
		super(name,age);
	}
	@Override
	public void study() {
		System.out.println("�����˶�Աѧϰ��ôͶ��ʹ���");
		
	}

	@Override
	public void eat() {
		System.out.println("����Զ��Ա�Ե��Ǵ��׺�ţ��");
		
	}

}
