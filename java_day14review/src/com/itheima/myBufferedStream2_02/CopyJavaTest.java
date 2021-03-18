package com.itheima.myBufferedStream2_02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/*
 * ʹ���ַ��������������⹦�ܽ����ļ�����
 *     newLine()
 *     readLine()
 */
public class CopyJavaTest {

	public static void main(String[] args) throws Exception {
		//��װ����Դ
		BufferedReader br = new BufferedReader(new FileReader("aa.txt"));
		//��װĿ�ĵ�
		BufferedWriter bw = new BufferedWriter(new FileWriter("CopyAA.txt"));
		
		//��д����
		String line;
		while((line = br.readLine())!=null){
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		
		//�ͷ���Դ
		bw.close();
		br.close();
	}

}
