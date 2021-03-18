package com.itheima._myInterface_test01;

public abstract class Person {
	private String name;
	
	private int age;
    
	
	//定义抽象方法
	public abstract void eat();
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public Person() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	

}
