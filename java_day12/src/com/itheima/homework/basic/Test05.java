package com.itheima.homework.basic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

/*
 * 二、需求说明：HashMap集合嵌套ArrayList集合并遍历。
		定义一个HashMap集合，它包含三个元素，每一个元素的键是String类型，值是ArrayList类型。
		键：String			人物来自哪部电视剧
		值：ArrayList		人物的名称
		每一个ArrayList集合的数据是String类型的。
		给出如下的字符串数据，请用代码实现需求。
		第一个ArrayList集合的元素：(三国演义)
			诸葛亮
			赵云
		第二个ArrayList集合的元素：(西游记)
		唐僧
		孙悟空
		第三个ArrayList集合的元素：(水浒传)
		武松
		鲁智深
 */
public class Test05 {

	public static void main(String[] args) {
		// 定义集合对象
		HashMap<String, ArrayList<String>> hs = new HashMap<String, ArrayList<String>>();

		// 创建元素对象
		ArrayList<String> arr1 = new ArrayList<String>();

		arr1.add("唐僧");
		arr1.add("孙悟空");

		hs.put("西游记", arr1);
		ArrayList<String> arr2 = new ArrayList<String>();

		arr2.add("诸葛亮");
		arr2.add("赵云");

		hs.put("三国演义", arr2);
		
		ArrayList<String> arr3= new ArrayList<String>();

		arr3.add("武松");
		arr3.add("鲁智深");
		
		hs.put("水浒传", arr3);
		
		
		//通过键获得值
		Set<String> set = hs.keySet();
		for(String key : set){
			System.out.println(key);
			ArrayList<String> arr = hs.get(key);
			for (String string : arr) {
				System.out.println("\t"+string);
			}
		}
		
		
		System.out.println("--------------------------------");
		//通过键值对对象
		
		Set<Entry<String,ArrayList<String>>> enset =  hs.entrySet();
		for (Entry<String, ArrayList<String>> entry : enset) {
			String key = entry.getKey();
			System.out.println(key);
			ArrayList<String> value = entry.getValue();
			
			for (String string : value) {
				System.out.println("\t"+string);
			}
		
		}

	}

}
