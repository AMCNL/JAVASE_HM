package com.itheima._myInterface_test01;

public class Test {

	public static void main(String[] args) {
		// ����ƹ����Զ��Աʵ������
		PingPangPlayer  ppp = new PingPangPlayer();
		ppp.eat();
		ppp.study();
		ppp.speakEnglish();
		
		System.out.println("------------------------------");
		// ����ƹ�������Աʵ������
		PingPangCoach ppc = new PingPangCoach();
		ppc.eat();
		ppc.teach();
		ppc.speakEnglish();
		
		System.out.println("------------------------------");
		// ��������Զ��Աʵ������
		BasketballPlayer bp = new BasketballPlayer();
		bp.eat();
		bp.study();
		
		
		System.out.println("------------------------------");
		// �����������Աʵ������
		BasketballCoach bc = new BasketballCoach();
		bc.eat();
		bc.teach();

	}

}
