package com.itheima.myMap.test01_review;

import java.util.HashMap;
import java.util.Map;

public class MyMapTest {

	public static void main(String[] args) {
		// �������϶���
		Map<String,String> m = new HashMap<String,String>();
		
		m.put("0001", "С��");
		m.put("0002", "С��");
		m.put("0003", "С��");
		
		m.put("0003", "00000");//������ԭ����Ϊ0003��
		
		System.out.println(m);
		
		
		
	}

}
