package com.itheima.myScannerString;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		//��������¼�����
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ�λ���");
		/*
		 * �����ַ������͵�����
		 *       nextLine() ->��ʾ���ַ������ͽ��ռ���¼��
		 */
		String str = sc.nextLine();
		
		System.out.println("str:"+str);
	}

}
