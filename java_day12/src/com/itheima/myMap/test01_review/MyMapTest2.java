package com.itheima.myMap.test01_review;

import java.util.HashMap;
import java.util.Map;

public class MyMapTest2 {

	public static void main(String[] args) {
		// �������϶���
		Map<String,String> m = new HashMap<String,String>();
		
		m.put("0001", "С��");
		m.put("0002", "С��");
		m.put("0003", "С��");
		
		m.put("0003", "00000");//������ԭ����Ϊ0003��ֵ
		
		System.out.println("put:"+m.put("0001", "һ��ָ"));
		
		System.out.println("remove:"+m.remove("0001"));
		
		System.out.println("isEmpty:"+m.isEmpty());
		
		System.out.println("containsKey:"+m.containsKey("0002"));
		
		System.out.println("containsValue:"+m.containsValue("С��"));
		
		System.out.println("size:"+m.size());
		
		System.out.println(m);
		
		
		
	}

}
