package com.itheima._myInterface_test02;
/*
*   抽象Animal类:
	    属性:姓名,年龄
	    构造方法:无惨,带参
	    成员方法:getXxx(),setXxx(),eat()
	 接口 Jumpping:
	     成员方法:jump();
	 定义Cat类:
	        继承Animal 并实现 Jumpping接口
	        给出无惨和有参的构造
	        重写jump() 和 eat() 方法
	 定义Dog类:
	        继承Animal 并实现 Jumpping接口
	        给出无惨和有参的构造
	        重写jump() 和 eat() 方法
	在测试类中创建猫和狗的对象调用方法,并测试
 */
public class Test {
	
	public static void main(String[] args) {
		//普通创建狗类对象
		Dog d = new Dog();
		d.setName("啊黄");
		d.setAge(3);
		System.out.println(d.getName()+"---"+d.getAge());
		d.eat();
		d.jumpping();
		
		System.out.println("---------------------");
		
		//通过构造方法赋值
		Dog d1 = new Dog("大黑",10);
		System.out.println(d1.getName()+"---"+d1.getAge());
		d1.eat();
		d1.jumpping();
		
		
		
	}

}
