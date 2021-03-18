package com.itheima.oop_5;

/*
 * 定义一个标准的学生类
     包含以下属性：
	姓名   年龄
     包含以下行为：
	吃饭    学习
 */
public class Student {

	private String name;

	private int age;

	/*
	 * 方法
	 */
	public void eat(){
		System.out.println("吃饭，真香！");
	}
	
	public void study(){
		System.out.println("学习中！");
	}
	
	
	//构造器
	public Student(){
		
	}
	
	public Student(String name, int age) {
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

}
