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
public class Coder {
	private String name;// ����

	private String id;// ����

	private double salary;// ����
	/*
	 * ȫ�ι���
	 */
	public void work() {
		System.out.println("����Ϊ" + id + "��������Ϊ" + salary + "�ĳ���Ա��������Ŭ����д�Ŵ���......������������");
	}

	/*
	 * ȫ�ι���
	 */
	public Coder(String name, String id, double salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	/*
	 * �޲ι���
	 */
	public Coder() {
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

}
