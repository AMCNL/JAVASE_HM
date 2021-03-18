package com.itheima.myConversionStream01;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
/*
 * String类中的编码和解码问题
 */
public class BufferedStreamDemo01 {

	public static void main(String[] args) throws IOException {
	 
		String s = "你好";
		
		//使用默认的编码     [-60, -29, -70, -61]
		byte[] bys = s.getBytes();
		System.out.println("默认（GBK）："+Arrays.toString(bys));
		
		//使用GBK的编码    [-60, -29, -70, -61]
		byte[] bys1 = s.getBytes("GBK");
		System.out.println("GBK:"+Arrays.toString(bys1));
		
		byte[] bys2 = s.getBytes("UTF-8");
		
		System.out.println("UTF-8:"+Arrays.toString(bys2));
		
	
	}
}
