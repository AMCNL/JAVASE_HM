package com.itheima._myInterface_test01;

public class PingPangPlayer extends Player implements SpeakEnglish{
    public PingPangPlayer(){}
	
	public PingPangPlayer(String name,int age){
		super(name,age);
	}
	@Override
	public void study() {
		System.out.println("ƹ�������˶�Աѧϰ��ô����ͽ���");
		
	}

	@Override
	public void eat() {
		System.out.println("ƹ�������˶�Ա����ͷ�Ͱ�����");
	}

	@Override
	public void speakEnglish() {
		System.out.println("ƹ�����˶�Ա������ƹ����������Ա������˵Ӣ��");
		
	}

}
