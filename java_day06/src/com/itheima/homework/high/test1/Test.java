package com.itheima.homework.high.test1;
/*
 * 测试类
 */
public class Test {

	public static void main(String[] args) {
		//创建Manager对象，并初始化
		Manager m = new Manager("刘德华","1001",5000.0,6000.0);
		/*
		 * get/set方式赋值
		 */
		/*
		m.setId("1001");
		m.setSalary(5000.0);
		m.setBonus(60000.0);
		m.work();
		*/
		
		//创建Manager对象，并初始化
		Coder c = new Coder("成龙","2001",3000.0);
		
		/*
		 * get/set方式赋值
		 */
		/*
		c.getName("cl");
		c.getId("2001");
		c.setSalary(3500.0);
		*/
		c.work();
		
		

	}

}
