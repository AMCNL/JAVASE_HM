package com.itheima._for;
/*
 * ѭ�����������:1-100��ż���ͣ��Լ�������
 */
public class MyForTest4 {

	public static void main(String[] args) {
		//1-n����֮��
		
		int ouSum=0;
		int jiSum=0;
		for (int i = 1; i <=100; i++) {
			
			if(i%2 == 0){
				ouSum +=i;
			}else{
				jiSum +=i;
			}
		  
		}
		System.out.println(ouSum);
		System.out.println(jiSum);

	}

}
