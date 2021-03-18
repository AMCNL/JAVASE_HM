package com.itheima.myMap.myTest02;

import java.util.HashMap;
import java.util.Map;

/*
 * 求一个字符数组中各个元素出现的次数，并打印
 */
public class Test {

	public static void main(String[] args) {
		//定义数组
		char[] arr = {'a','b','c','a','b'};
		
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		
		for (int i = 0; i < arr.length; i++) {
			boolean ct = map.containsKey(arr[i]);
			
			if(!ct){
				map.put(arr[i], 1);
			}else{
				int count = map.get(arr[i]);
				count++;
				map.put(arr[i], count);
				
			}
		}
		System.out.println(map);

	}

}
