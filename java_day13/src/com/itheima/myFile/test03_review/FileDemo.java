package com.itheima.myFile.test03_review;

import java.io.File;
import java.io.IOException;

/*
 * ������ϰFile���ɾ������(ʹ�����·��)
	������
	��һ��:�ô��������ڵ�ǰ��Ŀ��׼���ļ����ļ���
	�ڶ���:�������õ��ļ����ļ��з�װ��file����
	������:����delete����ɾ��

 */

public class FileDemo {
	public static void main(String[] args) throws IOException {
	
       File f1 = new File("aa");
       
      // System.out.println("mkdir:"+f1.mkdir());
       
       
       File f2 = new File("aa\\a.txt");
       //System.out.println("createNewFile:"+f2.createNewFile());
       
       File f3 = new File("aa.txt");
      //System.out.println("createNewFile:"+f3.createNewFile());
       
		
       //ɾ������
       System.out.println("delete:"+f3.delete());
       
       System.out.println("delete:"+f2.delete());//�����Լ���ɾ��
       
       System.out.println("delete:"+f1.delete());
	}

}
