package com.itheima._myfinal_01;
/*
 *  •final关键字是最终的意思，可以修饰类，成员变量，成员方法。
    –修饰类，类不能被继承
	–修饰变量，变量就变成了常量，只能被赋值一次
	–修饰方法，方法不能被重写
 */
public class YuTest01 {
	//–修饰类，类不能被继承
	
	public final int age = 10;//修饰变量，变量就变成了常量，只能被赋值一次
	
	public final void show(){
		System.out.println("final修饰的方法不能被重写");
	}
}
