package com.itheima.myHomework.basic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test02 {
	public static void main(String[] args) {
		//�������϶���
		List<Test02Student> list = new ArrayList<Test02Student>();
		
		//����Ԫ�ض���
		Test02Student ts1 = new Test02Student("����",65);
		Test02Student ts2= new Test02Student("���»�",55);	
		Test02Student ts3 = new Test02Student("����",66);
		
		//��Ӷ���
		list.add(ts1);
		list.add(ts2);
		list.add(ts3);

		System.out.println("-------��������-------------");
		//������������
		Iterator<Test02Student> it = list.iterator();
		
		//ѭ������
		while(it.hasNext()){
			Test02Student st = it.next();
			System.out.println(st);
		}
		
		System.out.println("-------��ͨfor����-------------");
		for (int i = 0; i < list.size(); i++) {
			
			System.out.println(list.get(i));
		}
		
		System.out.println("-------��ǿfor����-------------");
		for (Test02Student Test02Student : list) {
			System.out.println(Test02Student);
		}
		
	}

}
