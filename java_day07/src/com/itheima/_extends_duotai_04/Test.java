package com.itheima._extends_duotai_04;
/*
 *è�������̬�ۺϰ�����
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
		
		
		//����ת�ͣ�dog��
		a = new Dog();
		a.eat();
		//a.lookDoor();//dog���˽�б������ܷ���
		
		//dog�࣬����ת��
		Dog d = (Dog)a;//��ע��Ҫȷ��a��Ҫת�Ķ���
		d.eat();
		d.lookDoor();//����˽�ж���
		
	}

}
