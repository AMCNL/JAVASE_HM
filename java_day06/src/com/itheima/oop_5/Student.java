package com.itheima.oop_5;

/*
 * ����һ����׼��ѧ����
     �����������ԣ�
	����   ����
     ����������Ϊ��
	�Է�    ѧϰ
 */
public class Student {

	private String name;

	private int age;

	/*
	 * ����
	 */
	public void eat(){
		System.out.println("�Է������㣡");
	}
	
	public void study(){
		System.out.println("ѧϰ�У�");
	}
	
	
	//������
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
