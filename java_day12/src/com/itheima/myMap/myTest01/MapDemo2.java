package com.itheima.myMap.myTest01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

/*
 *hashMap中嵌套ArrayList
 */
public class MapDemo2 {

	public static void main(String[] args) {
		HashMap<String,ArrayList<String>> hs = new HashMap<String,ArrayList<String>>();
		
		ArrayList<String> sgyy = new ArrayList<String>();
		sgyy.add("刘备");
		sgyy.add("曹操");
		
		ArrayList<String> xyj = new ArrayList<String>();
		xyj.add("唐僧");
		xyj.add("八戒");
		
		ArrayList<String> shz = new ArrayList<String>();
		shz.add("宋江");
		shz.add("武松");
		
		hs.put("三国演义", sgyy);
		hs.put("西游记", xyj);
		hs.put("水浒传", shz);
		
		
		//遍历hashMap集合，通过键得到值得方法
		Set<String> set = hs.keySet();
		
		for (String s : set) {
			
			System.out.println(s);
			
			ArrayList<String> value = hs.get(s);
			
			for (String ss : value) {
				System.out.println("\t"+ss);
			}
			
		}
		
		
		System.out.println("--------------------------");
		//通过键值对对象获取值
		
		Set<Entry<String, ArrayList<String>>> entrySet = hs.entrySet();
		
		for (Entry<String, ArrayList<String>> entry : entrySet) {
			String key = entry.getKey();
			System.out.println(key);
			ArrayList<String> alist = entry.getValue();
			for (String string : alist) {
				System.out.println("\t"+string);
			}
			
		}
		
		
	}

}
