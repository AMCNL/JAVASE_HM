package com.itheima._myInterface_test01_review;

public class PingPangCoach extends Coach implements SpeakEnglist{

	
	public PingPangCoach(String name, int age) {
		super(name, age);

	}

	public PingPangCoach() {
		super();
	}
	@Override
	public void speakEnglish() {
		System.out.println("ƹ�������˵Ӣ��");
		
	}

	@Override
	public void teach() {
		System.out.println("ƹ����������ڴ�ƹ����");
		
	}

	@Override
	public void eat() {
		System.out.println("ƹ�������ȥƹ����ʳ�óԷ�");
		
	}

}
