package com.itheima.myString;
/*
 * ģ���û���¼�������ڶ��飩��
 */

import java.util.Scanner;

public class StringTest {
	public static void main(String[] args) {
		String username = "admin";
		String password = "admin";
		
		for (int i = 0; i < 3; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("�������û�����");
			String name = sc.nextLine();
			System.out.println("���������룺");
			String pwd = sc.nextLine();
			
			if(username.equals(name) && password.equals(pwd)){
				System.out.println("��¼�ɹ�");
				break;
			}else{
				if(2-i == 0){
					System.out.println("��¼ʧ�ܣ������˺ű����ᣬ�뼰ʱ�����Ա��ϵ");
				}else{
					System.out.println("��¼ʧ�ܣ�������"+(2-i)+"�λ���");
				}
			}
		}
		
	}

}
