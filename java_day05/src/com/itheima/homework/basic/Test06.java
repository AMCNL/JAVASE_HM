package com.itheima.homework.basic;



/*
 * ����һ������������ָ�������������г��ֵ�λ��(�����ֶ�Σ���δ�ӡ)
       ��: ����[1232]Ҫ���ҵ�����2 �򷽷��ڲ����ӡ����ֵ 1 ,3 
       ����[1232] Ҫ���ҵ�����5 �򷽷�ÿ�����ӡ ��������û��������֡�
 */
public class Test06 {

	public static void main(String[] args) {
          int[] arr = {1,2,3,4,5,6,6,6};
          
          //���÷��������ݲ���
          adress(arr,6);
		
	}
	
	
	/*
	 * ����ָ�������������г��ֵ�λ��(�����ֶ�Σ���δ�ӡ)
	 * ����ֵ���ͣ�void
	 * �����б�int[] arr,int n
	 */
	public static void adress(int[] arr,int n){
		int count = 0;
		//�������飬ȷ�������±�����
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == n){
				System.out.println(i);
				count++;
			}
			
		}
		if(count==0){
			System.out.println("������û���������!");
		}
		
		
	}
    
}
