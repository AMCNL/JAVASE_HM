package com.itheima._homework.basic;

import java.util.Scanner;

/*
 * ����
		�ڱ�̾����У���6����ίΪ������ѡ�ִ�֣�����Ϊ0-100�������֡�
		ѡ�ֵ����÷�Ϊ��ȥ��һ����߷ֺ�һ����ͷֺ� ��4����ίƽ��ֵ��
		��д����ʵ�֡�(������С������)
	
       ˼·��
        A:����һ������Ϊ6������
		B:��ί��ֵ����ݲ��ü���¼��ʵ��
		C:д�����ȡ��������ֵ(��߷�)
		D:д�����ȡ�������Сֵ(��ͷ�)
		E:д�����������е�Ԫ�غ�(�ܷ�)
		F:ƽ���֣�(�ܷ�-��߷�-��ͷ�)/(arr.length-2)
		G:���ƽ���ּ���
		
 */
public class Test05 {

	public static void main(String[] args) {
		// ����һ������Ϊ6������
		int[] arr = new int[6];

		// ����¼�����
		Scanner sc = new Scanner(System.in);

		// ѭ�������鸳ֵ
		for (int i = 0; i < arr.length; i++) {
			System.out.println("�����" + (i + 1) + "λѡ�ִ�֣�");
			arr[i] = sc.nextInt();
		}

		// �������ֵ�ο�����max��������������ֵΪ0�ĵ�ֵ��ֵ��max
		int max = arr[0];

		// �������ֵ�ο�����min��������������ֵΪ0�ĵ�ֵ��ֵ��min
		int min = arr[0];

		// ����һ����ͱ���sum
		int sum = 0;

		// forѭ����������Ԫ��
		for (int i = 0; i < arr.length; i++) {
			// ���maxֵ
			if (arr[i] > max) {
				max = arr[i];
			}

			// ���minֵ
			if (arr[i] < min) {
				min = arr[i];
			}

			// ���
			sum += arr[i];
		} // for end

		// ����ƽ����
		double vag = (double) (sum - max - min) / (arr.length - 2);

		// �����ӡ
		System.out.println(max+","+min);
		System.out.println("��ѡ�ֵ����յ÷�Ϊ��" + vag);

	}

}
