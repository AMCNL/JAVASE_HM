package com.itheima._myArray01;
/*
		����һ������ ��{171,72,19,16,118,51,210,7,18}
		���������������Ҫ���Ԫ�غ͡�
		Ҫ����͵�Ԫ�صĸ�λ��ʮλ���ܰ���7,����ֻ��Ϊż��

 */
public class MyArrayTest4 {

	public static void main(String[] args) {
		
		int[] arr = {171,72,19,16,118,51,210,7,18};	
		//������ͱ���
		
		int sum=0;
		//��������
		for(int i=0;i<arr.length;i++){
			//���λ
			int ge = arr[i]%10;
			//��ʮλ
			int shi = arr[i]/10%10;
			//�ж�����
			if(ge!=7 && shi!=7 && arr[i]%2==0){
				sum+=arr[i];
				System.out.println(arr[i]);
			}
		}//for end
		
		System.out.println("���Ϊ��"+sum);

	}

}
