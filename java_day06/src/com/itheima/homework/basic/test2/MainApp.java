package com.itheima.homework.basic.test2;

import java.util.Scanner;

/*
 * 学员编号（String） 
		姓名（String）
		性别（String）
		身高（double）
		年龄（int）
 */
public class MainApp {

	public static void main(String[] args) {
		
		//创建键盘录入对象
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入学员编号：");
		String numId = sc.nextLine();
		
		System.out.println("请输入学员姓名：");
		String name = sc.nextLine();
		
		System.out.println("请输入学员性别：");
		String sex = sc.nextLine();
		
		System.out.println("请输入学员身高：");
		double height = sc.nextDouble();

		System.out.println("请输入学员年龄：");
		int age = sc.nextInt();
		
		//创建学员对象
		Student s = new Student(numId,name,sex,height,age);
		
		System.out.println("学员编号\t学员姓名\t学员性别\t学员身高\t学员年龄");
		System.out.println(numId+"\t"+name+"\t"+sex+"\t"+height+"\t"+age);
		
		
		
		
		
		

	}

}
