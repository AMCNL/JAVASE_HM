package com.itheima.homework.basic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

/*
 * һ������˵����ArrayList����Ƕ��HashMap���ϲ�������
		����һ��ArrayList���ϣ�����������Ԫ�أ�ÿһ��Ԫ�ض���HashMap���͵ġ�
		ÿһ��HashMap���ϵļ���ֵ����String���͵ģ�
		����String		�ɷ������
		ֵ��String		���ӵ�����
		�������µ��ַ������ݣ����ô���ʵ������
		��һ��HashMap���ϵ�Ԫ�أ�
		���		����
		���		С��
		�ڶ���HashMap���ϵ�Ԫ�أ�
		����		����
		���		С��Ů
		������HashMap���ϵ�Ԫ�أ�
		�����	��ӯӯ
		��ƽ֮	����ɺ
 */
public class Test04 {

	public static void main(String[] args) {
		// ���弯�϶���
		ArrayList<HashMap<String, String>> array = new ArrayList<HashMap<String, String>>();

		// ����Ԫ�ض���
		HashMap<String, String> hs1 = new HashMap<String, String>();

		hs1.put("���", "����");
		hs1.put("���", "С��");

		HashMap<String, String> hs2 = new HashMap<String, String>();

		hs2.put("����", "����");
		hs2.put("���", "С��Ů");

		HashMap<String, String> hs3 = new HashMap<String, String>();

		hs3.put("�����", "��ӯӯ");
		hs3.put("��ƽ֮", "����ɺ");
		
		
		array.add(hs1);
		array.add(hs2);
		array.add(hs3);
		
		//ͨ�������ֵ�÷�ʽ
		for(HashMap<String, String> hs : array){
			
			Set<String> keySet = hs.keySet();
			
			for(String key : keySet){
			   String str = hs.get(key);
			   System.out.println(key+"==="+str);
			}
		}
		System.out.println("----------------------------");
		//ͨ����ֵ��
		
		for (HashMap<String, String> hashMap : array) {
			Set<Entry<String, String>> entrySet = hashMap.entrySet();
			
			for (Entry<String, String> entry : entrySet) {
				String str1 = entry.getKey();
				
				String str2 = entry.getValue();
				
				System.out.println(str1+"==="+str2);
			}
		}

	}

}
