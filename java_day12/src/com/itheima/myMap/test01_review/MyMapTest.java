package com.itheima.myMap.test01_review;

import java.util.HashMap;
import java.util.Map;

public class MyMapTest {

	public static void main(String[] args) {
		// 创建集合对象
		Map<String,String> m = new HashMap<String,String>();
		
		m.put("0001", "小花");
		m.put("0002", "小红");
		m.put("0003", "小明");
		
		m.put("0003", "00000");//覆盖了原来键为0003的
		
		System.out.println(m);
		
		
		
	}

}
