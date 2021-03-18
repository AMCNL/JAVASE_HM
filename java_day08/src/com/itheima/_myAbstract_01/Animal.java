package com.itheima._myAbstract_01;
/*
 * 
 */
public abstract class Animal {
	//抽象动物类的抽象方法
	public abstract void eat();
	
	//非抽象的方法
	public void breath(){
		System.out.println("动物都要呼吸");
		
	}
}
