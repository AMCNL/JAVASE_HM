package com.itheima._homework.high;

import java.util.Random;

/*
 * ���峤��Ϊ10��int����,�����е�10��Ԫ��Ϊ������ɵ�1-100������
 * Ҫ��:����ʽ��ӡ�����е�Ԫ������
����:
	����ԭ����:{1,2,3,4,5}
	��ӡ������:[1, 2, 3, 4, 5]
 */
public class Test06 {

	public static void main(String[] args) {
		//���峤��Ϊ10��int����
		int[] arr = new int[10];
		
		//�����������
		Random rd = new Random();
		
		//ͨ��ѭ����Ԫ�ظ�ֵ
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rd.nextInt(10)+1;
			
			//�ж�����������ǿ�ͷ�Ļ����  "["
			if(i==0){
				System.out.print("["+arr[i]+",");
			}else if(i==arr.length-1){//��Ԫ���±�Ϊ���һ��ʱ���   " ]  "
				System.out.print(arr[i]+"]");
			}else{
				System.out.print(arr[i]+",");
			}
			
		}
		
	}

}
