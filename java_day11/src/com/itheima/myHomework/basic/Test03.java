package com.itheima.myHomework.basic;
/*
 * 
 * ����˵�����Զ���һ��ѧ���࣬������Ա����name��age��
 * ʹ��List���ϴ洢�Զ������ʹ����ǿfor���б�����
 * �������ϵ�ʱ���ڿ���̨���ѧ������ĳ�Ա����ֵ��
 */
 
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test03 {
	public static void main(String[] args) {
		//�������϶���
		List<Test03Student> list = new ArrayList<Test03Student>();
		
		//����Ԫ�ض���
		Test03Student ts1 = new Test03Student("����",65);
		Test03Student ts2= new Test03Student("���»�",55);	
		Test03Student ts3 = new Test03Student("����",66);
		
		//��Ӷ���
		list.add(ts1);
		list.add(ts2);
		list.add(ts3);

		
		
		System.out.println("-------��ǿfor����-------------");
		for (Test03Student Test03Student : list) {
			System.out.println(Test03Student);
		}
		
	}

}
