package com.itheima.myMap.test01_review;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MyMapTest3 {

	public static void main(String[] args) {
		// 创建集合对象
		Map<String,String> m = new HashMap<String,String>();
		
		m.put("0001", "小花");
		m.put("0002", "小红");
		m.put("0003", "小明");
		
		System.out.println(m.get("0001"));
		
		
		//获取所有键集合
		Set<String> s = m.keySet();
		
		for (String key : s) {
			System.out.println(key);
		}
		
		//获取所有值集合
		/*
		 * 思考：为什么使用Collection集合来接收，主要考虑到后期的扩展灵活性，
		 * 如果限定了某一个子类接口，假如后期有新的子接口出现，则不能匹配
		 * 但是用顶层集合接口后期可以通过多态方式实现
		 */
		Collection<String> c = m.values();
		for (String v : c) {
			System.out.println(v);
		}
	
	}

}
