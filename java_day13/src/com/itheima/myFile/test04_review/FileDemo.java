package com.itheima.myFile.test04_review;

import java.io.File;
import java.io.IOException;

/*
 * �ļ����жϺ���Ϣ��ȡ
 */

public class FileDemo {
	public static void main(String[] args) throws IOException {
		
		File f = new File("bb\\aa.txt");
		System.out.println("isDirectory:"+f.isDirectory());
		
		
		System.out.println("isFile:"+f.isFile());
		
		System.out.println("exists:"+f.exists());
		
		System.out.println("_______________________________________________________________________________");
		
		System.out.println("getAbsolutePath��"+f.getAbsolutePath());
		
		System.out.println("getPath:"+f.getPath());
		
		System.out.println("getName:"+f.getName());
		
	

		
	}

}
