package com.itheima.oop_5;

/*
 *������
 */
public class CarTest {
    public static void main(String[] args) {
		//��������
    	Car c = new Car();
    	c.setBrand("����");
    	c.setPrice(1000000);
    	c.setColor("��ʯ��");
    	
    	c.run();
    	System.out.println(c.getBrand()+"---"+c.getPrice()+"---"+c.getColor());
    	
    	System.out.println("------------------");
    	Car c1 = new Car("����",200000,"��ɫ");
    	
    	c1.run();
    	System.out.println(c1.getBrand()+"---"+c1.getPrice()+"---"+c1.getColor());

    	
    	
	}
	

}
