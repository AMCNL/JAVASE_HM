package com.itheima.myMap.test01;

import java.util.HashMap;
import java.util.Map;

public class MapDemo2 {

	public static void main(String[] args) {
		// �������϶���
		Map<String,String> map = new HashMap<String,String>();
		
		//put����
		System.out.println(map.put("���»�", "����"));
		System.out.println(map.put("���޼�", "������"));
		System.out.println(map.put("���޼�", "����"));
		
		//remove���������صĵ��Ǽ������Ӧ��ֵ
		//System.out.println("remove:"+map.remove("���»�"));

		map.put("it001", "����ϼ");
		map.put("it002", "������");
		map.put("it003", "������");
		
		//clear()��ռ���
		//map.clear();
		
		//�жϼ����Ƿ�Ϊ��
		//System.out.println(map.isEmpty());
		
		//�жϼ����Ƿ���ĳԪ��
		System.out.println(map.containsKey("���»�"));//true
		System.out.println(map.containsKey("�Ǻ�"));//false
		
		//�жϼ����Ƿ����ָ���Ե�ֵ
		System.out.println(map.containsValue("����"));//true
		System.out.println(map.containsValue("����"));//false
		
		
		//��ֵ�Եĸ���
		System.out.println(map.size());
		
		//������϶���
		System.out.println(map);//��д��toString����
		
		
		

	}

}
