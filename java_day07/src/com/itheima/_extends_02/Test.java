package com.itheima._extends_02;

public class Test {
	public static void main(String[] args) {
		
		//��������
		Teacher t = new Teacher();
		
		t.setName("���");
		t.setAge(24);
		
		System.out.println(t.getName()+"---"+t.getAge());
		
		System.out.println("------------------------");
		
		//ͨ�����캯����ʼ��ֵ
		Teacher t2 = new Teacher("lcn",24);
		System.out.println(t2.getName()+"---"+t2.getAge());
		
		
	}

}
