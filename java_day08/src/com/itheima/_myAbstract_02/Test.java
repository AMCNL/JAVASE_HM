package com.itheima._myAbstract_02;

public class Test {
	public static void main(String[] args) {
		//创建对象，父类引用指向子类对象
		Person  p = new Student(30);
		System.out.println(p.getAge()+"---"+p.getCountry());
		p.show();
		p.eat();
	}

}
