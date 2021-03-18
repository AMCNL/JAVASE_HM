package com.itheima._myInterface_test01;

public abstract class Coach extends Person{
	public Coach(){}
	
	public Coach(String name, int age) {
		super(name,age);
	}

	//定义教练类的抽象方法
	public abstract void teach();

}
