package com.itheima.oop_3;

public class Student2 {
    
	private String name;//����

	private int age;//����

	/*
	 * ��װ����
	 */
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	/*
	 * ��װ����
	 */
	public void setAge(int age) {
		if (age < 0 || age > 150) {
			System.out.println("���������������");
		} else {
			this.age = age;
		}
	}

	public int getAge() {
		return age;
	}

}
