package com.itheima.myConversionStream01;

import java.io.FileInputStream;
import java.io.IOException;

public class BufferedStreamDemo2 {

	public static void main(String[] args) throws IOException {
	 
		FileInputStream fis = new FileInputStream("a.txt");
		
		int by;
		while((by = fis.read())!=-1){
			System.out.print((char)by);
		}
		
		
		//สอทลืสิด
		
		fis.close();
	
	}
}
