package com.itheima.homework.basic.test2;
/*
 * 设计，并定义一个学员类：Student，要求有以下属性：
		学员编号（String） 
		姓名（String）
		性别（String）
		身高（double）
		年龄（int）
             使用封装的原则，并提供无参和全参的构造方法。
 */
public class Student {
	
	private String numId;
	
	private String name;
	
	private String sex;
	
	private double height;
	
	private int age;

	public Student(String numId, String name, String sex, double height, int age) {
		super();
		this.numId = numId;
		this.name = name;
		this.sex = sex;
		this.height = height;
		this.age = age;
	}

	public Student() {
		super();
	}

	public String getNumId() {
		return numId;
	}

	public void setNumId(String numId) {
		this.numId = numId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	

}
