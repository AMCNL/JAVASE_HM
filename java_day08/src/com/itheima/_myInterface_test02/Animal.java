package com.itheima._myInterface_test02;
/*
 * 
 */
public abstract class Animal {
	private int age;
	
	private String name;

	public Animal() {
		super();
	}

	public Animal(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//定义抽象类吃方法
	public abstract void eat();

}
