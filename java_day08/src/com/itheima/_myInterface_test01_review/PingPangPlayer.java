package com.itheima._myInterface_test01_review;

public class PingPangPlayer extends Player implements SpeakEnglist{

	
	public PingPangPlayer(String name, int age) {
		super(name,age);
		
	}

	public PingPangPlayer() {
		super();
	}
	@Override
	public void speakEnglish() {
		System.out.println("ƹ�����˶�Ա˵Ӣ��");
		
	}

	@Override
	public void study() {
		System.out.println("ƹ�����˶�Աѧϰ��ƹ����");
		
	}

	@Override
	public void eat() {
		System.out.println("ƹ�����˶�Աȥƹ����ʳ�óԷ�");
		
	}

}
