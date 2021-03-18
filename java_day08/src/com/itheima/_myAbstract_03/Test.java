package com.itheima._myAbstract_03;

public class Test {

	public static void main(String[] args) {
		
		Teacher t = new BasicTeacher();
		t.setName("¾ý¸ç");
		t.setAge(30);
		System.out.println(t.getName()+"---"+t.getAge());
		t.teach();
		
		System.out.println("-----------------");
		Teacher t1 = new BasicTeacher("junge",35);
		System.out.println(t1.getName()+"---"+t1.getAge());
		t1.teach();
		
		System.out.println("**************************************");
		
		
		t = new WorkTeacher();
		
		t.setName("»ª¸ç");
		t.setAge(26);
		System.out.println(t.getName()+"---"+t.getAge());
		t.teach();
		
		System.out.println("-----------------");

	}

}
