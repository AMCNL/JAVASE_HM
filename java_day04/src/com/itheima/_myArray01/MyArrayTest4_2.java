package com.itheima._myArray01;
/*
		����һ������ ��{171,72,19,16,118,51,210,7,18}
		���������������Ҫ���Ԫ�غ͡�
		Ҫ����͵�Ԫ�صĸ�λ��ʮλ���ܰ���7,����ֻ��Ϊż��

 */
public class MyArrayTest4_2 {

	public static void main(String[] args) {
		//����һ������
		int[] arr = {171,72,19,16,118,51,210,7,18};
		//����һ����ͱ���sum
		int sum=0;
		for(int i=0;i<arr.length;i++){
			int ge =arr[i]%10;
			int shi = arr[i]/10%10;
			//�����ж���͵�Ԫ�صĸ�λ��ʮλ���ܰ���7,����ֻ��Ϊż��
			if(ge!=7 && shi!=7 && arr[i]%2==0){
				System.out.println(arr[i]);
				sum += arr[i];
			}
			
		}
		
		System.out.println("��͵�ֵΪ��"+sum);
		
		

	}

}
