package com.itheima._myInterface_test01;

public class PingPangPlayer extends Player implements SpeakEnglish{
    public PingPangPlayer(){}
	
	public PingPangPlayer(String name,int age){
		super(name,age);
	}
	@Override
	public void study() {
		System.out.println("乒乓球球运动员学习怎么发球和接球");
		
	}

	@Override
	public void eat() {
		System.out.println("乒乓球球运动员吃馒头和白米粥");
	}

	@Override
	public void speakEnglish() {
		System.out.println("乒乓球运动员由于是乒乓球的相关人员，所以说英语");
		
	}

}
