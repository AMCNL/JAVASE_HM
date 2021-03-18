package com.itheima._myInterface_test01;

public class PingPangCoach extends Coach implements SpeakEnglish{
	public PingPangCoach(){}
	
	public PingPangCoach(String name,int age){
		super(name,age);
	}
	@Override
	public void teach() {
		System.out.println("乒乓球教练教怎么发球和接球技巧");
		
	}

	@Override
	public void eat() {
		
		System.out.println("乒乓球教练吃的是馒头和黑米粥");
	}

	@Override
	public void speakEnglish() {
		System.out.println("乒乓球教练由于是乒乓球的相关人员，所以说英语");
		
	}

}
