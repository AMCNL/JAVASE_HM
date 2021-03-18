package com.itheima._extends_duotai_01;
/*
 * 
 */
public class Test {
	public static void main(String[] args) {
		
		Animal a = new Cat();
		
		System.out.println(a.age);//编译看左边，执行看左边（输出：40）
		//System.out.println(a.witght);//报错，编译看左边，执行看左边
		
		a.eat();//编译看左边，执行看右边（输出：毛吃鱼）
		
		
		Cat c = (Cat)a;
		System.out.println(c.age);
	}

}
