package com.itheima._myInterface_test01_review;

public abstract class Coach extends Person {
	
	public Coach() {
	}

	public Coach(String name, int age) {
		super(name, age);
	}
	
	//������󷽷�
	public abstract void teach();

}
