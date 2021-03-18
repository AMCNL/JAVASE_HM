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
		System.out.println("乒乓球运动员说英语");
		
	}

	@Override
	public void study() {
		System.out.println("乒乓球运动员学习打乒乓球");
		
	}

	@Override
	public void eat() {
		System.out.println("乒乓球运动员去乒乓球食堂吃饭");
		
	}

}
