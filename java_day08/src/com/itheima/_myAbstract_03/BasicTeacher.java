package com.itheima._myAbstract_03;

public class BasicTeacher extends Teacher{
	public BasicTeacher(){}
	
	public BasicTeacher(String name, int age) {
		super(name,age);
	}

	@Override
	public void teach() {
		System.out.println("��������ʦ����javase�γ�");
		
	}

}
