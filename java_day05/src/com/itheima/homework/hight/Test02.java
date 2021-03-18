package com.itheima.homework.hight;

/*
 * 分析以下需求，并用代码实现
	1.键盘录入长方形的长和宽
		定义方法计算该长方形的周长,并在main方法中打印周长
	2.键盘录入长方形的长和宽
		定义方法计算该长方形的面积,并在main方法中打印面积
	3.键盘录入圆的半径
		定义方法计算该圆的周长,并在main方法中打印周长
	4.键盘录入圆的半径
		定义方法计算该圆的面积,并在main方法中打印面积
 */
public class Test02 {

	public static void main(String[] args) {
		
		double squarePer=squarePer(10,20);
		System.out.println("长方形的周长为："+squarePer);
		
		double squareArea=squareArea(10,20);
		System.out.println("长方形的面积为："+squareArea);
		
		double criclePer=criclePer(10);
		System.out.println("圆的周长为："+criclePer);
		
		double cricleArea=cricleArea(10);
		System.out.println("圆的面积为："+cricleArea);
		
		
		
	}
	
	/*
	 * 计算长方形的周长
	 * 返回值类型：double
	 * 参数列表：int a,int b
	 */
	public static double squarePer(int width,int hight){
		return (width+hight)*2;
	}
	
	/*
	 * 计算长方形的面积
	 * 返回值类型：double
	 * 参数列表：int a,int b
	 */
	public static double squareArea(int width,int hight){
		return width*hight;
	}
	/*
	 * 计算圆的周长
	 * 返回值类型：double
	 * 参数列表：int R
	 */
	public static double criclePer(int R){
		return 2*3.14*R;
	}
	/*
	 * 计算圆的面积
	 * 返回值类型：double
	 * 参数列表：int R
	 */
	public static double cricleArea(int R){
		return 3.14*R*R;
	}
}
