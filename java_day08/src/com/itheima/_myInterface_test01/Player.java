package com.itheima._myInterface_test01;

public abstract class Player extends Person{
	public Player(){
		
	}
	
    public Player(String name,int age){
		super(name,age);
	}
	
	//�����˶�Ա�ĳ��󷽷�
	public abstract void study();

}
