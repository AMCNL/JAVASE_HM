package com.itheima.myHomework.high_test01;

import java.util.ArrayList;

/*
 * һ�������������󣬲��ô���ʵ��
1.����ArrayList���ϣ��������ַ���"abc" "def"  "efg" "def" "def" "qwe" "def" "def" "swd" "wwe" "def" "def"
2.ʹ����ͨforѭ����ȡ����������Ϊ3��Ԫ�ز���ӡ
3.���巽��public static boolean myContains(ArrayList list,String str)
			(1)����
				a.ArrayList list: ��ʾ�洢���String���ݵļ���
				b.String str: ��ʾһ���ַ���
			(2)����ֵ
				true: ��ʾlist�����а����ַ���str
				false: ��ʾlist�����в������ַ���str
4.�������涨���mycontains����ͳ�Ƽ����а����ַ���"def"������
5.ɾ�������е������ַ���"def"(˼·:ѭ���жϼ������Ƿ����"def"�ַ���,������ɾ��)
6.��������ÿ��Ԫ���е�Сд��ĸ��ɴ�д��ĸ
 */
public class Test02 {
	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("abc");
		arr.add("def");
		arr.add("efg");
		arr.add("def");
		arr.add("def");
		arr.add("qwe");
		arr.add("def");
		arr.add("swd");
		arr.add("wwe");
		arr.add("def");
		arr.add("def");
		
		
		
		System.out.println(arr.get(3));
	
		
	}
	
	public static boolean myContains(ArrayList list,String str){
		return list.contains(str);
	}
	
	
	
	
	

}
