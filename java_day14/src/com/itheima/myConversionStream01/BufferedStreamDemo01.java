package com.itheima.myConversionStream01;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
/*
 * String���еı���ͽ�������
 */
public class BufferedStreamDemo01 {

	public static void main(String[] args) throws IOException {
	 
		String s = "���";
		
		//ʹ��Ĭ�ϵı���     [-60, -29, -70, -61]
		byte[] bys = s.getBytes();
		System.out.println("Ĭ�ϣ�GBK����"+Arrays.toString(bys));
		
		//ʹ��GBK�ı���    [-60, -29, -70, -61]
		byte[] bys1 = s.getBytes("GBK");
		System.out.println("GBK:"+Arrays.toString(bys1));
		
		byte[] bys2 = s.getBytes("UTF-8");
		
		System.out.println("UTF-8:"+Arrays.toString(bys2));
		
	
	}
}
