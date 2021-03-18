package com.itheima.myMap.myTest01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

/*
 *hashMap��Ƕ��ArrayList
 */
public class MapDemo2 {

	public static void main(String[] args) {
		HashMap<String,ArrayList<String>> hs = new HashMap<String,ArrayList<String>>();
		
		ArrayList<String> sgyy = new ArrayList<String>();
		sgyy.add("����");
		sgyy.add("�ܲ�");
		
		ArrayList<String> xyj = new ArrayList<String>();
		xyj.add("��ɮ");
		xyj.add("�˽�");
		
		ArrayList<String> shz = new ArrayList<String>();
		shz.add("�ν�");
		shz.add("����");
		
		hs.put("��������", sgyy);
		hs.put("���μ�", xyj);
		hs.put("ˮ䰴�", shz);
		
		
		//����hashMap���ϣ�ͨ�����õ�ֵ�÷���
		Set<String> set = hs.keySet();
		
		for (String s : set) {
			
			System.out.println(s);
			
			ArrayList<String> value = hs.get(s);
			
			for (String ss : value) {
				System.out.println("\t"+ss);
			}
			
		}
		
		
		System.out.println("--------------------------");
		//ͨ����ֵ�Զ����ȡֵ
		
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
