package com.itheima.myDouble;

public class DoubleDemo {

	public static void main(String[] args) {
		String s = "3.14";
		
		Double d = new Double(s);
		
		double dd=d.valueOf(d);
		
		System.out.println(dd);
		
		System.out.println("---------------------------");
		
		double d1=d.parseDouble(s);
		
		System.out.println(d1);

	}

}
