package com.itheima.myFor_01;

import java.util.ArrayList;
import java.util.List;

public class ForTest {

	public static void main(String[] args) {
		//�������϶���
		List<Student> list = new ArrayList<Student>();
		
		//����Ԫ�ض���
		Student s1 = new Student("���»�",55);
		Student s2 = new Student("����",45);
		Student s3 = new Student("������",65);
		Student s4 = new Student("��ѧ��",35);
		Student s5 = new Student("����",88);
		
		
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
