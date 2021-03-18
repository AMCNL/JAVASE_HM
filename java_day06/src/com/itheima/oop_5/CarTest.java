package com.itheima.oop_5;

/*
 *测试类
 */
public class CarTest {
    public static void main(String[] args) {
		//创建对象
    	Car c = new Car();
    	c.setBrand("奔驰");
    	c.setPrice(1000000);
    	c.setColor("宝石蓝");
    	
    	c.run();
    	System.out.println(c.getBrand()+"---"+c.getPrice()+"---"+c.getColor());
    	
    	System.out.println("------------------");
    	Car c1 = new Car("大众",200000,"白色");
    	
    	c1.run();
    	System.out.println(c1.getBrand()+"---"+c1.getPrice()+"---"+c1.getColor());

    	
    	
	}
	

}
