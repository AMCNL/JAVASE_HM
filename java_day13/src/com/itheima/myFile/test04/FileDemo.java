package com.itheima.myFile.test04;

import java.io.File;
import java.io.IOException;

/*
 * �ļ����жϺ���Ϣ��ȡ
 */

public class FileDemo {
	public static void main(String[] args) throws IOException {
		
	
		
		File f1 = new File("bb\\aa.txt");
		
		System.out.println("isDirectory��"+f1.isDirectory());//false
		
		System.out.println("isFile��"+f1.isFile());//true
		
		System.out.println("exists:"+f1.exists());
		
		//��ȡ����
		System.out.println("_______________________");
		
		System.out.println("getAbsolutePath:"+f1.getAbsolutePath());
		
		System.out.println("getPath:"+f1.getPath());
		
		System.out.println("getName:"+f1.getName());
		
		
		
		
		
		
		
		
		
		

		
	}

}
