package com.itheima.myswitch;
/*
 * switch:����¼��1-7��Ӧ��Ӧ�����ڼ�
 */
import java.util.Scanner;

public class SwitchTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("������Ҫ¼������ݣ�1-7��");

		int num = sc.nextInt();

		switch (num) {
		case 1:
			System.out.println("����һ");
			break;
		case 2:
			System.out.println("���ڶ�");
			break;
		case 3:
			System.out.println("������");
			break;
		case 4:
			System.out.println("������");
			break;
		case 5:
			System.out.println("������");
			break;
		case 6:
			System.out.println("������");
			break;
		case 7:
			System.out.println("������");
			break;

		default:
			System.out.println("���������Ϣ���󣡣�");

			break;
		}

	}

}
