package com.itheima.oop_3;

public class Student2 {
    
	private String name;//姓名

	private int age;//年龄

	/*
	 * 封装姓名
	 */
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	/*
	 * 封装年龄
	 */
	public void setAge(int age) {
		if (age < 0 || age > 150) {
			System.out.println("您输入的年龄有误！");
		} else {
			this.age = age;
		}
	}

	public int getAge() {
		return age;
	}

}
