package com.itheima.myFile.test03;

import java.io.File;
import java.io.IOException;

/*
 * ɾ���ļ�\�ļ��в���
 */

public class FileDemo {
	public static void main(String[] args) throws IOException {
		
		File f = new File("aa.txt");
		
		System.out.println("createNewFile��"+f.createNewFile());
		
		File f1 = new File("bb");
		File f2 = new File("bb\\aa.txt");
		System.out.println("mkdir:"+f1.mkdir());
		System.out.println("createNewFile:"+f2.createNewFile());
		
		
		//ɾ������
		System.out.println("delete:"+f.delete());//true
		
		
		System.out.println("delete:"+f.delete());//flase(�༶����ֱ��ɾ������Ҫ����һ��������ļ�ɾ�������ɾ��)
		
		
		
		

		
	}

}
