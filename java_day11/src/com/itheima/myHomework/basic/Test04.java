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

public class Test04 {
	public static void main(String[] args) {
		//�������϶���
				List<Test04Student> list = new ArrayList<Test04Student>();
				
				//����Ԫ�ض���
				Test04Student ts1 = new Test04Student("����",65);
				Test04Student ts2= new Test04Student("���»�",55);	
				Test04Student ts3 = new Test04Student("����",66);
				
				//��Ӷ���
				list.add(ts1);
				list.add(ts2);
				list.add(ts3);

				System.out.println("-------��������-------------");
				//������������
				Iterator<Test04Student> it = list.iterator();
				
				//ѭ������
				while(it.hasNext()){
					Test04Student st = it.next();
					System.out.println(st);
				}
				
				System.out.println("-------��ͨfor����-------------");
				for (int i = 0; i < list.size(); i++) {
					
					System.out.println(list.get(i));
				}
				
				System.out.println("-------��ǿfor����-------------");
				for (Test04Student Test04Student : list) {
					System.out.println(Test04Student);
				}
		
	}

}
