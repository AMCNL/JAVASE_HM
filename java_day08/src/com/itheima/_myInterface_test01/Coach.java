package com.itheima._myInterface_test01;

public abstract class Coach extends Person{
	public Coach(){}
	
	public Coach(String name, int age) {
		super(name,age);
	}

	//���������ĳ��󷽷�
	public abstract void teach();

}
