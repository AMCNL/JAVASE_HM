package com.itheima._extends_duotai_02;
/*
 * 
 */
public class Test {
	public static void main(String[] args) {
		Animal a = new Cat();
		
		System.out.println(a.age);//�������뿴��ߣ�ִ�п���ߣ������40��
		//System.out.println(a.weight);//�������뿴��ߣ�ִ�п����
		
		a.eat();//���뿴��ߣ�ִ�п��ұߣ������è���㣩
		
		//a.playGame();//����ִ�п���ߣ�Anmial�������������playGame()������
		
		System.out.println("----------------------");
		
		//˼������ô���������еı���
		
		Cat c = (Cat)a;//����ת��
		System.out.println(a.age);
		System.out.println(c.weight);
		
		
	}

}
