package com.itheima.myMap.test01;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo3 {

	public static void main(String[] args) {
		
		//创建集合对象
		Map<String,String> map = new HashMap<String,String>();
		
		map.put("it001","java");
		map.put("it002","php");
		map.put("it003","ui");
		
		//get()通过键获得值
		System.out.println("get:"+map.get("it002"));
		System.out.println("get:"+map.get("it005"));//null
		System.out.println("------------------------");
		
		//获取所有键值集合Set<k> ketSet();
		
		Set<String> set = map.keySet();
		
//		Iterator it = set.iterator();
//		while(it.hasNext()){
//			System.out.println(it.next());
//		}
		
		for (String key : set) {
			System.out.println(key);
		}
		
		
		System.out.println("-------------------------");
		//获取所有值
		Collection<String> c = map.values();
		
		for (String v : c) {
			System.out.println(v);
		}
		

	}

}
