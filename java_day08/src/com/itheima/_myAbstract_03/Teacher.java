package com.itheima._myAbstract_03;

public abstract class Teacher {
	private int age;

	private String name;

	public abstract void teach();
	
	
	public Teacher(String name,int age) {
		super();
		this.age = age;
		this.name = name;
	}

	public Teacher() {
		super();
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
	
	

}
