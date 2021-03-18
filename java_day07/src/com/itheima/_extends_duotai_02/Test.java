package com.itheima._extends_duotai_02;
/*
 * 
 */
public class Test {
	public static void main(String[] args) {
		Animal a = new Cat();
		
		System.out.println(a.age);//报错，编译看左边，执行看左边（输出：40）
		//System.out.println(a.weight);//报错，编译看左边，执行看左边
		
		a.eat();//编译看左边，执行看右边（输出：猫吃鱼）
		
		//a.playGame();//报错，执行看左边（Anmial），左边里面无playGame()方法。
		
		System.out.println("----------------------");
		
		//思考：怎么访问子类中的变量
		
		Cat c = (Cat)a;//向下转型
		System.out.println(a.age);
		System.out.println(c.weight);
		
		
	}

}
