package com.itheima._extends_overide;

public class NewPhone extends Phone {
	public void call(String name){
		System.out.println("������Ƶ����");
		
		//ͬʱӵ�и����绰�Ĺ���
		super.call(name);
	}

}
