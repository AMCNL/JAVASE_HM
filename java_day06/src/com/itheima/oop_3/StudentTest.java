package com.itheima.oop_3;

import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {
		// ����ѧ�������
		Student s = new Student();
		
        Scanner sc = new Scanner(System.in);
        System.out.println("����������������");
        String inputName = sc.nextLine();
        
        Scanner sc1 = new Scanner(System.in);
        System.out.println("�������������䣺");
		int inpuAge = sc1.nextInt();
		s.setName(inputName);
		s.setAge(inpuAge);

		String name = s.getName();
		int age = s.getAge();
		
		System.out.println("name:"+name);
		System.out.println("age:"+age);
	}

}