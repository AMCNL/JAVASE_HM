package com.itheima.myEquals;

public class EqualsTest {

	public static void main(String[] args) {
		
		Student s1 = new Student("lcn",24);
		
		
		//System.out.println(s1.hashCode());
		
		Student s2 = new Student("lcn",24);
		
		
		System.out.println(s1.equals(s2));
		
		

	}

}
