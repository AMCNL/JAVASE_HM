package com.itheima.mySplit;

import java.util.Arrays;

public class SplitTest {

	public static void main(String[] args) {
		//��һ��:����һ���ַ���
		String s = "91 27 46 38 50";

		//�ڶ���:���ַ��������и�(ʹ�ÿո��и�),����һ���ַ�������
		String[] ns = s.split(" ");
	
		
		/*
		 * �ַ�����������ã����Ǵ������������󣨱Ͼ��Ƚ������ַ���û���壩��
		 *һ����int�������������������Խ��бȽ��������Ĵ�С
		 */
		
		
		//������:���ַ�������ת��Ϊint���͵�����
		int[] arr = new int[ns.length];

		for (int i = 0; i < ns.length; i++) {
			
			arr[i] = Integer.parseInt(ns[i]);
		}
		
		//���Ĳ�:��ת����int���͵������������
		Arrays.sort(arr);
		
		
		//���岽:���������ƴ��
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < arr.length; i++) {
			if(i == arr.length){
				sb.append(arr[i]);
			}else{
				sb.append(arr[i]).append(" ");
			}
			
		}
		
		String rs  = sb.toString();
		
		System.out.println(rs);
		

	}

}
