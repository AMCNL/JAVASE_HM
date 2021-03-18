package com.itheima.myHomework.high_test01;

public abstract class Student {
	private String name;
	
	private int age;
	
	private int score;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int age, int score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
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

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public abstract void eat();
	
	public abstract void study(String content);
	
	
	

}
