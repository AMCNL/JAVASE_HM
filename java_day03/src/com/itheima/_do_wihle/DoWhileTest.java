package com.itheima._do_wihle;
/*
 * ʹ��do while��ӡˮ�ɻ���
 */
public class DoWhileTest {

	public static void main(String[] args) {
		//��ʼ�����
		int i = 100;
		do{
			
			//ѭ�����
			int ge = i%10;
			int shi = i/10%10;
			int bai = i/100%10;
			
			
			if(ge*ge*ge+shi*shi*shi+bai*bai*bai == i){
				System.out.println(i);
			}
			
			//�����������
			i++;
		}while(i<=999);//�ж��������

	}

}
