package com.itheima._extends_duotai_03;
/*
 *����ã����ë��ëëèĬ��ľľľľľ�Ѹ������������������������ͷ���҅ �Ƿ�ʱ����i   JoiiΪifŶ��           
 */
public class Test {

	public static void main(String[] args) {
		
		//��̬����
		Animal a = new Cat();//����ת�ͣ���������ָ���������
		
		a.eat();
		//a.playGame();//cat��˽�з������ܷ���
		
		//����cat˽�з���
		Cat c = (Cat)a;//����ת�ͣ�ע��Ҫȷ��a��Ҫת�Ķ���
		c.eat();
		c.playGame();
	}

}
