package com.itheima.myMap.myTest02;

import java.util.HashMap;
import java.util.Map;

/*
 * ��һ���ַ������и���Ԫ�س��ֵĴ���������ӡ
 */
public class Test {

	public static void main(String[] args) {
		//��������
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
