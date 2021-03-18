package com.itheima.myHomework.basic;
/*
 * 需求说明：自定义一个学生类，给出成员变量name和age，
 * 使用List集合存储自定义对象并使用增强for进行遍历，
 * 遍历集合的时候，在控制台输出学生对象的成员变量值。
 */
public class Test04Student {
	private String name;
	
	private int age;

	public Test04Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Test04Student(String name, int age) {
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
		return "Test04Student [name=" + name + ", age=" + age + "]";
	}
	
}
