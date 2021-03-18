package com.itheima._myAbstract_02;
/*
		 定义一个抽象的人类
		   属性:私有的age成员变量
		           私有的final的变量country为中国
		    行为:定义抽象成员方法eat();
		    在人类中定义有参(int age)和无参的构造方法
		定义一个学生类
		   重写eat方法
		定义一个测试类
		使用多态的形式创建学生对象,测试eat()方法

 */
public abstract class Person {
	private int age;
	
	private final String country  ="中国";

	
	public Person() {
		super();
	}

	public Person(int age) {
		super();
		this.age = age;
	}
	
	


	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCountry() {
		return country;
	}

	public abstract void eat();
	
	public void show() {
		System.out.println(age+"---"+country);

	}

}
