package com.itheima.myInputStream.test02;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

/*
 * �����ļ���ָ��λ��
 *    ��������һ��txt�ĵ�������Ŀ��Ե�ַ
 */
public class FileInputStreamCopy {

	public static void main(String[] args) throws IOException {
		
		long begin = new Date().getTime();
		//�����ֽ����������󣨷�װ����Դ��
		FileInputStream fis = new FileInputStream("E:\\���������3��\\������\\day13-day14Ԥϰ����\\day13\\resource\\���ﴰ��.txt");
		//��װĿ�ĵ��ļ�
		FileOutputStream fos = new FileOutputStream("copy����ϼ.txt");
		
		
		//һ��д��һ���ֽ�:
		int by;
		while((by=fis.read())!=-1){
			fos.write(by);
		}
		
		
	/*	//һ��д��һ���ֽ�����
		//����byte����
		byte[] bys = new byte[1024*10];
		
		int len = 0;
		File f  = new File("copy����ϼ.txt");
		while((len=fis.read(bys))!=-1){
//			
			fos.write(bys,0,len);//������ڣ��Ḳ��ԭ�����ļ�
			
		}*/
		
		
		//�ر���Դ
		fos.close();
		fis.close();
		
		
		long end = new Date().getTime();
		System.out.println("��ʱ��"+(end - begin)+"����");
		

	}

}
