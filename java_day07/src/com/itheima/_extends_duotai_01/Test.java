package com.itheima._extends_duotai_01;
/*
 * 
 */
public class Test {
	public static void main(String[] args) {
		
		Animal a = new Cat();
		
		System.out.println(a.age);//���뿴��ߣ�ִ�п���ߣ������40��
		//System.out.println(a.witght);//�������뿴��ߣ�ִ�п����
		
		a.eat();//���뿴��ߣ�ִ�п��ұߣ������ë���㣩
		
		
		Cat c = (Cat)a;
		System.out.println(c.age);
	}

}
