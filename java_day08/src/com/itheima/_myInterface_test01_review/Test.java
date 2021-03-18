package com.itheima._myInterface_test01_review;

public class Test {

	public static void main(String[] args) {
	 PingPangPlayer ppp = new PingPangPlayer();
	 ppp.setName("邓亚萍");
	 ppp.setAge(40);
	 System.out.println(ppp.getName()+"---"+ppp.getAge());
	 ppp.study();
	 ppp.speakEnglish();
	 ppp.eat();
	 
	 System.out.println("------------构造方法赋值方式--------------");
	 
	 PingPangPlayer ppp1 = new PingPangPlayer("马琳",42);
	 System.out.println(ppp1.getName()+"---"+ppp1.getAge());
	 ppp1.study();
	 ppp1.speakEnglish();
	 ppp1.eat();
	
	 System.out.println("\n$$$$$$$$$$$$$$$篮球类测试$$$$$$$$$$$$$$$$$$$$$$$$$$\n");
	 BasketballCoach bc = new BasketballCoach();
	 bc.setName("姚明");
	 bc.setAge(45);
	 System.out.println(bc.getName()+"---"+bc.getAge());
	 bc.teach();
	 bc.eat();
	 
	 System.out.println("------------构造方法赋值方式---------------");
	 BasketballCoach bc1 = new BasketballCoach("易建联",36);
	 System.out.println(bc1.getName()+"---"+bc1.getAge());
	 bc1.teach();
	 bc1.eat();

	}

}
