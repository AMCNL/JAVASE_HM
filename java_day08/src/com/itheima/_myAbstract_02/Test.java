package com.itheima._myAbstract_02;

public class Test {
	public static void main(String[] args) {
		//�������󣬸�������ָ���������
		Person  p = new Student(30);
		System.out.println(p.getAge()+"---"+p.getCountry());
		p.show();
		p.eat();
	}

}
