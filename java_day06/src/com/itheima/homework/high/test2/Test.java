package com.itheima.homework.high.test2;

public class Test {

	public static void main(String[] args) {
		//创建对象,并赋值
		Teacher t = new Teacher("老大",25,"Java基础中面向对象的知识........(Java基础中面向对象代表老师讲课的内容)");
		t.eat();
		t.teach();
		
		//创建对象,并赋值
		Student s = new Student("老小",12,"面向对象的知识....('面向对象'代表学生学习的内容)");
		s.eat();
		s.study();

	}

}
