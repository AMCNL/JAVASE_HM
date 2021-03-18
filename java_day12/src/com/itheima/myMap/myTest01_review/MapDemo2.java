package com.itheima.myMap.myTest01_review;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

/*
 *hashMap��Ƕ��ArrayList
 */
public class MapDemo2 {

	public static void main(String[] args) {
		// �������϶���
		HashMap<String, ArrayList<String>> hm = new HashMap<String, ArrayList<String>>();

		// ����Ԫ�ض���
		ArrayList<String> sgyy = new ArrayList<String>();

		sgyy.add("���");
		sgyy.add("�ܲ�");

		ArrayList<String> xyj = new ArrayList<String>();

		xyj.add("��ɮ");
		xyj.add("�˽�");

		ArrayList<String> shz = new ArrayList<String>();

		shz.add("�ν�");
		shz.add("����");

		hm.put("��������", sgyy);
		hm.put("���μ�", xyj);
		hm.put("ˮ䰴�", shz);

		// ͨ�������ֵ
		Set<String> keySet = hm.keySet();
		for (String key : keySet) {
			System.out.println(key);

			ArrayList<String> alist = hm.get(key);
			for (String string : alist) {
				System.out.println("\t" + string);
			}
		}

		System.out.println("-----------------------------------");

		// ͨ����ֵ�Զ���
		Set<Entry<String, ArrayList<String>>> entrySet = hm.entrySet();

		for (Entry<String, ArrayList<String>> entry : entrySet) {
			String key = entry.getKey();
			System.out.println(key);
			ArrayList<String> alist = entry.getValue();

			for (String string : alist) {
				System.out.println("\t" + string);
			}

		}
	}

}
