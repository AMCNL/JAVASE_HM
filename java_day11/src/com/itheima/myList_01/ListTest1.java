package com.itheima.myList_01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * ����:����List���϶���,���Ԫ�ز�����
	����:
	��һ��:��ȡList���϶���
	�ڶ���:����ΪString
	������:��Ӽ���Ԫ��
	���Ĳ�:ʹ�õ������Լ��Ͻ��б���
	���岽:��ӡ����Ԫ��

 */
public class ListTest1 {

	public static void main(String[] args) {
		// �������϶���
		List<String> list = new ArrayList<String> ();
		
		list.add("java");
		list.add("php");
		list.add("ui");
		
		//��������������
	    Iterator<String> it = list.iterator();
		
	    //ѭ������
	    while(it.hasNext()){
	    	
	    	String s = it.next();
	    	
	    	System.out.println(s);
	    	
	    }

	}

}
