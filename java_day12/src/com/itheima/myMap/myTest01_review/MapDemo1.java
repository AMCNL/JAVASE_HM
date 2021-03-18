package com.itheima.myMap.myTest01_review;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

/*
 *ArrayList中嵌套hashMap
 */
public class MapDemo1 {

	public static void main(String[] args) {
		//创建集合对象
		ArrayList<HashMap<String,String>>  array = new ArrayList<HashMap<String,String>>();
		
		//创建元素对象
		HashMap<String,String> hm1 = new HashMap<String,String>();
		hm1.put("刘德华", "林凤娇");
		hm1.put("徐志摩", "徐小曼");
		
		
		HashMap<String,String> hm2 = new HashMap<String,String>();
		hm2.put("梁思成", "林徽因");
		hm2.put("梁山伯", "祝英台");
		
		HashMap<String,String> hm3 = new HashMap<String,String>();
		hm3.put("君哥", "玉姐");
		hm3.put("呵呵", "哈哈");
		
		
		array.add(hm1);
		array.add(hm2);
		array.add(hm3);
		
		for (HashMap<String, String> hashMap : array) {
			//双列集合转成单列集合
			Set<Entry<String, String>> entrySet = hashMap.entrySet();
			
			for (Entry<String, String> entry : entrySet) {
				String key = entry.getKey();
				
				String value = entry.getValue();
				
				System.out.println(key+"---"+value);
			}
			System.out.println("---------------------");
		}
		
		System.out.println("---------第二种遍历方法----------");
		for (HashMap<String, String> hashMap : array) {
			
			Set<String> keySet = hashMap.keySet();
			
			for (String key : keySet) {
				String value = hashMap.get(key);
				
				System.out.println(key+"-----"+value);
			}
			System.out.println("-------------------------");
	
		}
		
		
	}

}
