package com.itheima.myHomework.basic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * һ������˵�����Զ���һ��ѧ���࣬������Ա����name��age��
 * ʹ��Collection���ϴ洢�Զ�����󲢱�����
 * �������ϵ�ʱ���ڿ���̨���ѧ������ĳ�Ա����ֵ��
 */
public class Test01 {
	
	public static void main(String[] args) {
		//�������϶���
		Collection<Test01Student> c = new ArrayList<Test01Student>();
		
		//����Ԫ�ض���
		Test01Student ts1 = new Test01Student("����",65);
		Test01Student ts2= new Test01Student("���»�",55);	
		Test01Student ts3 = new Test01Student("����",66);
		
		//��Ӷ���
		c.add(ts1);
		c.add(ts2);
		c.add(ts3);

		//������������
		Iterator<Test01Student> it = c.iterator();
		
		//ѭ������
		while(it.hasNext()){
			Test01Student st = it.next();
			System.out.println(st);
		}
	}

}
