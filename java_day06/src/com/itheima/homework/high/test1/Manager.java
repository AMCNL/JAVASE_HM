package com.itheima.homework.high.test1;
/*
 * �����������󣬲��ô���ʵ��
	1.��Ŀ������Manager 
		���ԣ�
			����name
			����id
			����salary
			����bonus
		��Ϊ��
			����work()
	2.����Ա��Coder
		���ԣ�
			����name
			����id
			����salary
		��Ϊ��
			����work()
	Ҫ��:
		1.��������Ҫ����Manager���Coder��,����Ҫ˽��,���ɿղΡ��вι��죬setter��getter����
		2.���������,��main�����д�������Ķ��󲢸����Ը�ֵ(��ʾ���ַ���:setter�����͹��췽��)
		3.���ó�Ա����,��ӡ��ʽ����:
			����Ϊ123��������Ϊ15000����Ϊ6000����Ŀ����һ������Ŭ�������Ź�����,��������,���Ա���ύ�����Ĵ���.....
			����Ϊ135��������Ϊ10000�ĳ���Ա��������Ŭ����д�Ŵ���......������������
 */
public class Manager {
	
	private String name;//����
	
	private String id;//����
	
	private double salary;//����
	
	private double bonus;//����
	
	
	public void work(){
		System.out.println("����Ϊ"+id+"��������Ϊ"+salary+"����Ϊ"+bonus+"����Ŀ����һ������Ŭ�������Ź�����,��������,���Ա���ύ�����Ĵ���.....");
	}

	public Manager(String name, String id, double salary, double bonus) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.bonus = bonus;
	}
	/*
	 * �޲ι���
	 */
	public Manager() {
		super();
	}

	/*
	 * ��װ����
	 */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	
	
	
	
	

}
