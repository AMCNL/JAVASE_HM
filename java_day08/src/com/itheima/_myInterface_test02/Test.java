package com.itheima._myInterface_test02;
/*
*   ����Animal��:
	    ����:����,����
	    ���췽��:�޲�,����
	    ��Ա����:getXxx(),setXxx(),eat()
	 �ӿ� Jumpping:
	     ��Ա����:jump();
	 ����Cat��:
	        �̳�Animal ��ʵ�� Jumpping�ӿ�
	        �����޲Һ��вεĹ���
	        ��дjump() �� eat() ����
	 ����Dog��:
	        �̳�Animal ��ʵ�� Jumpping�ӿ�
	        �����޲Һ��вεĹ���
	        ��дjump() �� eat() ����
	�ڲ������д���è�͹��Ķ�����÷���,������
 */
public class Test {
	
	public static void main(String[] args) {
		//��ͨ�����������
		Dog d = new Dog();
		d.setName("����");
		d.setAge(3);
		System.out.println(d.getName()+"---"+d.getAge());
		d.eat();
		d.jumpping();
		
		System.out.println("---------------------");
		
		//ͨ�����췽����ֵ
		Dog d1 = new Dog("���",10);
		System.out.println(d1.getName()+"---"+d1.getAge());
		d1.eat();
		d1.jumpping();
		
		
		
	}

}
