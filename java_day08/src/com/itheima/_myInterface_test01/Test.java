package com.itheima._myInterface_test01;

public class Test {

	public static void main(String[] args) {
		// 创建乒乓球远动员实例对象
		PingPangPlayer  ppp = new PingPangPlayer();
		ppp.eat();
		ppp.study();
		ppp.speakEnglish();
		
		System.out.println("------------------------------");
		// 创建乒乓球教练员实例对象
		PingPangCoach ppc = new PingPangCoach();
		ppc.eat();
		ppc.teach();
		ppc.speakEnglish();
		
		System.out.println("------------------------------");
		// 创建篮球远动员实例对象
		BasketballPlayer bp = new BasketballPlayer();
		bp.eat();
		bp.study();
		
		
		System.out.println("------------------------------");
		// 创建篮球教练员实例对象
		BasketballCoach bc = new BasketballCoach();
		bc.eat();
		bc.teach();

	}

}
