package com.itheima._myAbstract_02;
/*
		 ����һ�����������
		   ����:˽�е�age��Ա����
		           ˽�е�final�ı���countryΪ�й�
		    ��Ϊ:��������Ա����eat();
		    �������ж����в�(int age)���޲εĹ��췽��
		����һ��ѧ����
		   ��дeat����
		����һ��������
		ʹ�ö�̬����ʽ����ѧ������,����eat()����

 */
public abstract class Person {
	private int age;
	
	private final String country  ="�й�";

	
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
