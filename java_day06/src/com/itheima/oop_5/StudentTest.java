package com.itheima.oop_5;

/*
 * ������
 */
public class StudentTest {

	public static void main(String[] args) {
		// ��������
		Student s = new Student();
		s.setName("ll");
		s.setAge(20);

		System.out.println(s.getName() + "----" + s.getAge());

		s.eat();
		s.study();
		System.out.println("----------------");
		
		
		Student s1 = new Student("lcn", 22);
		System.out.println(s.getName() + "----" + s.getAge());

		s.eat();
		s.study();

	}

}
