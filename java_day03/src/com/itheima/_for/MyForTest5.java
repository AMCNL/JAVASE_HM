package com.itheima._for;
/*
 * ��ӡˮ�ɻ���
 */
public class MyForTest5 {
	public static void main(String[] args) {
	   int count=0;
	   for(int i=100;i<1000;i++){
		   int ge = i%10;
		   int shi = i/10%10;
		   int bai = i/10/10%10;
		   
		   if((ge*ge*ge+shi*shi*shi+bai*bai*bai)==i){
			   System.out.println(i+"��ˮ�ɻ�����");
			   count++;
		   }
		   
	   }
	   System.out.println("ˮ�ɻ��ĸ������У�"+count+"��");

	}

}
