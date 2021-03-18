package com.itheima.oop_1;
/*
 * 定义一个学生测试类类
 */
public class StudentTest {
	public static void main(String[] args) {
		//创建学生类的对象
		Student stu = new Student();
		
		System.out.println(stu.name);
		System.out.println(stu.sex);
		System.out.println(stu.ID);
		System.out.println(stu.age);
		
		stu.eat();
		stu.sleep();
		stu.study();
		System.out.println("-----------------");
		
		//赋值操作
		stu.age = 25;
		stu.ID = 1001;
		stu.name  = "小明";
		stu.sex = "男";
		
		System.out.println(stu.name);
		System.out.println(stu.sex);
		System.out.println(stu.ID);
		System.out.println(stu.age);
		
		stu.eat();
		stu.sleep();
		stu.study();
		System.out.println("-----------------");
		
	}

}
