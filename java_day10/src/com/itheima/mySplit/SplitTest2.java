package com.itheima.mySplit;

import java.util.Arrays;

public class SplitTest2 {

	public static void main(String[] args) {
		String s = "91 27 46 38 50";
		
		String[] ns = s.split(" ");
		
		//�ַ�����������ã����Ǵ������������󣨱Ͼ��Ƚ������ַ���û���壩��
		//һ����int�������������������Խ��бȽ��������Ĵ�С
		Arrays.sort(ns);
		
		
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < ns.length; i++) {
			if(i == ns.length){
				sb.append(ns[i]);
			}else{
				sb.append(ns[i]).append(" ");
			}
			
		}
		
		String rs  = sb.toString();
		
		System.out.println(rs);
		

	}

}
