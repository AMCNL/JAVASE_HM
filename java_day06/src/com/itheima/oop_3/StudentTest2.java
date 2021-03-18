package com.itheima.oop_3;

import java.util.Scanner;

public class StudentTest2 {

	public static void main(String[] args) {
		// 创建学生类对象
		Student2 s = new Student2();
		
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的姓名：");
        String inputName = sc.nextLine();
        
        Scanner sc1 = new Scanner(System.in);
        System.out.println("请输入您的年龄：");
		int inpuAge = sc1.nextInt();
		s.setName(inputName);
		s.setAge(inpuAge);

		String name = s.getName();
		int age = s.getAge();
		
		System.out.println("name:"+name);
		System.out.println("age:"+age);
	}

}
