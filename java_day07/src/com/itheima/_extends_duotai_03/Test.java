package com.itheima._extends_duotai_03;
/*
 *多你好，你好毛吗毛毛猫默哀木木木木木搜付绿所扩军付啦扩军所军付就分手覅 是否及时交付i   Joii为if哦啊           
 */
public class Test {

	public static void main(String[] args) {
		
		//多态体现
		Animal a = new Cat();//向上转型（父类引用指向子类对象）
		
		a.eat();
		//a.playGame();//cat的私有方法不能访问
		
		//访问cat私有方法
		Cat c = (Cat)a;//向下转型（注意要确定a是要转的对象）
		c.eat();
		c.playGame();
	}

}
