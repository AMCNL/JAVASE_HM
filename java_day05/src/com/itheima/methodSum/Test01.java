package com.itheima.methodSum;
/*
 * ����һ������: �����������ĺ�
  Ҫ��: 1.ע���������÷���������
	  2.ע������ȷ�÷����ķ���ֵ����
	  3.ע������ȷ�÷����Ĳ����ĸ���������

 */
public class Test01 {

	public static void main(String[] args) {
		
		//����int���͵ı������շ��ؽ����
		int result  = sum(10,20);
		
		//������
		System.out.println("result:"+result);

	}
	
	/*
	 * ����һ������: �����������ĺ�
	 * 
	 *   ��ȷ��
	 *      ����ֵ���ͣ�int
	 *      �����б�int a,int b
	 */
	public static int sum(int a,int b){
		
		//��Ͳ���
		int c = a + b;
		
		//����ֵ
		return c;
		
		//return a+b;
	}

}
