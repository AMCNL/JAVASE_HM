package com.itheima.oop_5;

/*
 * 测试类
 */
public class StudentTest {

	public static void main(String[] args) {
		// 创建对象
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
