package com.itheima.myInputStream.test02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * �����ļ���ָ��λ��
 *    ��������ͼƬ
 */
public class FileInputStreamCopy2 {

	public static void main(String[] args) throws IOException{
		//��װ����Դ
		FileInputStream fis = new FileInputStream("E:\\����\\����ͼƬ\\IMG_20171216_165930.jpg");
		//��װĿ�ĵ��ļ�
		FileOutputStream fos = new FileOutputStream("LILI.jpg");
		
		
		//ÿ��д��һ���ֽ�
		int by;
		while((by = fis.read())!=-1){
			fos.write(by);
		}
		
		
		
		
		//�����ֽ�����,ÿ��д��һ���ֽ�����
		byte[] bys = new byte[1024];
		int len = 0;
		while((len = fis.read(bys))!=-1){
			fos.write(bys, 0, len);
		}
		
		fos.close();
		fis.close();

	}

}
