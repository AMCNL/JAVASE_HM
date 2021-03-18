package com.itheima.myFor_01;

import java.util.ArrayList;
import java.util.List;

public class ForTest {

	public static void main(String[] args) {
		//创建集合对象
		List<Student> list = new ArrayList<Student>();
		
		//创建元素对象
		Student s1 = new Student("刘德华",55);
		Student s2 = new Student("黎明",45);
		Student s3 = new Student("郭富城",65);
		Student s4 = new Student("张学友",35);
		Student s5 = new Student("畅哥",88);
		
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);


		
		for (Student student : list) {
			
			if(list!=null){
				System.out.println(student);
				System.out.println(student.getName()+"---"+student.getAge());

			}
		}


	}

}
