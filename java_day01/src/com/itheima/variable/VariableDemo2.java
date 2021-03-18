package com.itheima.variable;

public class VariableDemo2 {
	public static void main(String[] args) {
		
	 byte bb=10;
	 byte cc=10;
	 
	 //下面的代码报错，隐式转换适用于变量
	 //byte dd = bb+cc;
	 int dd = bb+cc;
	 
	 //隐式转换不适应与常量
	 byte b2=4+3; 
	   
		
	}

}
