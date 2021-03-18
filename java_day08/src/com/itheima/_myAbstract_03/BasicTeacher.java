package com.itheima._myAbstract_03;

public class BasicTeacher extends Teacher{
	public BasicTeacher(){}
	
	public BasicTeacher(String name, int age) {
		super(name,age);
	}

	@Override
	public void teach() {
		System.out.println("基础班老师讲授javase课程");
		
	}

}
