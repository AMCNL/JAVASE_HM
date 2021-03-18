package com.itheima.oop_5;
/*
 * 定义一个标准的汽车类
       包含以下属性：
	品牌   价格    颜色
       包含以下行为：
	跑
 */
public class Car {
    private String brand;
    
    private int price;
    
    private String color;

	public Car() {
		super();
	}

	public Car(String brand, int price, String color) {
		super();
		this.brand = brand;
		this.price = price;
		this.color = color;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
    
    public void run(){
    	System.out.println("开车了，快上车！");
    }
	

}
