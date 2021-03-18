package com.itheima._extends_overide;

public class NewPhone extends Phone {
	public void call(String name){
		System.out.println("开启视频功能");
		
		//同时拥有父类打电话的功能
		super.call(name);
	}

}
