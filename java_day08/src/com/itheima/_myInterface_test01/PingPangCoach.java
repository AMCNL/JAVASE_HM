package com.itheima._myInterface_test01;

public class PingPangCoach extends Coach implements SpeakEnglish{
	public PingPangCoach(){}
	
	public PingPangCoach(String name,int age){
		super(name,age);
	}
	@Override
	public void teach() {
		System.out.println("ƹ�����������ô����ͽ�����");
		
	}

	@Override
	public void eat() {
		
		System.out.println("ƹ��������Ե�����ͷ�ͺ�����");
	}

	@Override
	public void speakEnglish() {
		System.out.println("ƹ�������������ƹ����������Ա������˵Ӣ��");
		
	}

}
