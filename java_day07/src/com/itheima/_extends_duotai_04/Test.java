package com.itheima._extends_duotai_04;
/*
 *猫狗动物多态综合案例：
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
		
		
		//向上转型（dog）
		a = new Dog();
		a.eat();
		//a.lookDoor();//dog类的私有变量不能访问
		
		//dog类，向下转型
		Dog d = (Dog)a;//（注意要确定a是要转的对象）
		d.eat();
		d.lookDoor();//访问私有对象
		
	}

}
