package com.itheima.methodShuiXH;
/*
 * ����һ����������ӡ100-999֮��ˮ�ɻ���
	Ҫ��ע����д������
	          ע����д�������ķ���ֵ����
	          ע����д�������Ĳ������ͼ�����
       �������е��ø÷���������̨���ˮ�ɻ���

 */
public class Test01 {
	public static void main(String[] args) {
		printFlower();
	}
	
	
	/*
	 * �������ͣ�void
	 * �����б�
	 */
	public static void printFlower(){
		
		for(int i=100;i<1000;i++){
			int ge = i%10;
			int shi = i/10%10;
			int bai = i/10/10%10;
			
			if(ge*ge*ge+shi*shi*shi+bai*bai*bai == i){
				System.out.println(i);
			}
		}
	}

}
