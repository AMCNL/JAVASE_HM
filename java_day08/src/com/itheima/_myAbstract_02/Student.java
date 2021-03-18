package com.itheima._myAbstract_02;

public class Student extends Person{
    
	public Student(){}
	
	public Student(int age){
		super(age);
	}
	
	@Override
	public void eat() {
		System.out.println("student eat");
		
	}

}
