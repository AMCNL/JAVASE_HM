package com.itheima._myInterface_test01;

public abstract class Player extends Person{
	public Player(){
		
	}
	
    public Player(String name,int age){
		super(name,age);
	}
	
	//定义运动员的抽象方法
	public abstract void study();

}
