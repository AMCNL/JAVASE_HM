package com.itheima.myHomework.basic;
/*
 * ����˵�����Զ���һ��ѧ���࣬������Ա����name��age��
 * ʹ��List���ϴ洢�Զ������ʹ����ǿfor���б�����
 * �������ϵ�ʱ���ڿ���̨���ѧ������ĳ�Ա����ֵ��
 */
public class Test03Student {
	private String name;
	
	private int age;

	public Test03Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Test03Student(String name, int age) {
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
		return "Test03Student [name=" + name + ", age=" + age + "]";
	}
	
}
