package com.itheima.myHomework.basic;

public class Test01Student {
	private String name;
	
	private int age;

	public Test01Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Test01Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
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

	@Override
	public String toString() {
		return "Test01Student [name=" + name + ", age=" + age + "]";
	}
	
}
