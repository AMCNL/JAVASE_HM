package com.itheima.myCollections_01;

import java.util.ArrayList;
import java.util.Collection;

public class MyCollectionDemo1 {

	public static void main(String[] args) {
	    //ArrayList
		Collection<String> c = new ArrayList<String>();
		
		//add()��ӷ���
		c.add("hello");
		c.add("world");
		c.add("������磡");
		
		System.out.println(c);//��д��toString����

	}

}
