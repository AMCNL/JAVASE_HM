package com.itheima.myMap.myTest01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

/*
 *ArrayList中嵌套hashMap
 */
public class MapDemo1 {

	public static void main(String[] args) {
		// 创建ArrayList对象
		ArrayList<HashMap<String, String>> array = new ArrayList<HashMap<String, String>>();

		// 创建元素对象
		HashMap<String, String> hm1 = new HashMap<String, String>();
		hm1.put("司马懿", "诸葛亮");
		hm1.put("刘备", "曹操");

		array.add(hm1);
		// 创建元素对象
		HashMap<String, String> hm2 = new HashMap<String, String>();
		hm2.put("曹丕", "曹植");
		hm2.put("司马师", "司马昭");

		array.add(hm2);
		// 创建元素对象
		HashMap<String, String> hm3 = new HashMap<String, String>();
		hm3.put("姜维", "荀彧");
		hm3.put("呵呵", "哈哈");

		array.add(hm3);

		// 遍历ArrayList集合
		for (HashMap<String, String> hashMap : array) {
			// 得到键值对集合
			Set<String> key = hashMap.keySet();

			for (String k : key) {
				String value = hashMap.get(k);

				System.out.println(k + "---" + value);

			}
		System.out.println("----------------");

		}
		
		
		System.out.println("----------------------------------");
		
		//使用键值对对象
		for (HashMap<String, String> hashMap : array) {
			Set<Entry<String, String>> entrySet = hashMap.entrySet();
			
			for (Entry<String, String> entry : entrySet) {
				String key = entry.getKey();
				
				String value = entry.getValue();
				
				System.out.println(key+"---"+value);
			}
			System.out.println("--------------------");
		}

	}

}
