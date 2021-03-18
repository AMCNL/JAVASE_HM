package com.itheima.myMap.test01_review;

import java.util.HashMap;
import java.util.Map;

public class MyMapTest2 {

	public static void main(String[] args) {
		// 创建集合对象
		Map<String,String> m = new HashMap<String,String>();
		
		m.put("0001", "小花");
		m.put("0002", "小红");
		m.put("0003", "小明");
		
		m.put("0003", "00000");//覆盖了原来键为0003的值
		
		System.out.println("put:"+m.put("0001", "一阳指"));
		
		System.out.println("remove:"+m.remove("0001"));
		
		System.out.println("isEmpty:"+m.isEmpty());
		
		System.out.println("containsKey:"+m.containsKey("0002"));
		
		System.out.println("containsValue:"+m.containsValue("小红"));
		
		System.out.println("size:"+m.size());
		
		System.out.println(m);
		
		
		
	}

}
