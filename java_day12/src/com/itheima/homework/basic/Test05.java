package com.itheima.homework.basic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

/*
 * ��������˵����HashMap����Ƕ��ArrayList���ϲ�������
		����һ��HashMap���ϣ�����������Ԫ�أ�ÿһ��Ԫ�صļ���String���ͣ�ֵ��ArrayList���͡�
		����String			���������Ĳ����Ӿ�
		ֵ��ArrayList		���������
		ÿһ��ArrayList���ϵ�������String���͵ġ�
		�������µ��ַ������ݣ����ô���ʵ������
		��һ��ArrayList���ϵ�Ԫ�أ�(��������)
			�����
			����
		�ڶ���ArrayList���ϵ�Ԫ�أ�(���μ�)
		��ɮ
		�����
		������ArrayList���ϵ�Ԫ�أ�(ˮ䰴�)
		����
		³����
 */
public class Test05 {

	public static void main(String[] args) {
		// ���弯�϶���
		HashMap<String, ArrayList<String>> hs = new HashMap<String, ArrayList<String>>();

		// ����Ԫ�ض���
		ArrayList<String> arr1 = new ArrayList<String>();

		arr1.add("��ɮ");
		arr1.add("�����");

		hs.put("���μ�", arr1);
		ArrayList<String> arr2 = new ArrayList<String>();

		arr2.add("�����");
		arr2.add("����");

		hs.put("��������", arr2);
		
		ArrayList<String> arr3= new ArrayList<String>();

		arr3.add("����");
		arr3.add("³����");
		
		hs.put("ˮ䰴�", arr3);
		
		
		//ͨ�������ֵ
		Set<String> set = hs.keySet();
		for(String key : set){
			System.out.println(key);
			ArrayList<String> arr = hs.get(key);
			for (String string : arr) {
				System.out.println("\t"+string);
			}
		}
		
		
		System.out.println("--------------------------------");
		//ͨ����ֵ�Զ���
		
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
