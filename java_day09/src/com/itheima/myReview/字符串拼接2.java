package com.itheima.myReview;
/*
 * ƴ���ַ�����Ϊһ���ַ���(StringBuiler ��ʽ)
 */
public class �ַ���ƴ��2 {
	public static void main(String[] args) {
		//����һ���ַ�����
		char[] ch = {'g','b','k'};
		String st = reverse(ch);
		System.out.println(st);
	}
	
	public static String reverse(char[] ch){
		StringBuilder sb = new StringBuilder();
		
		sb.append("[");
		for (int i = 0; i < ch.length; i++) {
			if(i==ch.length-1){
				sb.append(ch[i]);
			}else{
				sb.append(ch[i]).append(", ");
			}
		}
		sb.append("]");
		
		return sb.toString();
	}

}
