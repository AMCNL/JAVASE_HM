package com.itheima.homework.basic;
/*
	 ����һ������ �ܽ���һ������(�����������3)��ӡ0���������(����)֮������е�ż��
	�� ���ܵ�������6������귽����ӡ������ż���� 0 2 4 6
	�� ���ܵ������� 5������귽����ӡ������ż���� 0 2 4
 */
public class Test01 {

	public static void main(String[] args) {
		//���÷������ݲ���
		//printOdd(5);
		
		printOdd(6);

	}
	/*
	 * ����ֵ���ͣ�void
	 * �����б�int n
	 */
	public static void printOdd(int n){
		for(int i=0;i<=n;i++){
			if(i%2==0){
				System.out.print(i+" ");
			}
		}
	}

}
