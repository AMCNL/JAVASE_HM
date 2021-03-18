 package com.itheima.myBufferedStream2_02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * �ַ������������⹦�ܣ�
 *     BufferedWriter��
 *         newLine();   //���У�����ϵͳƥ��
 *         
 *    BufferedReader:
 *         readLine();    //һ�ζ�ȡһ�У���������������
 */
public class BufferedStreamDemo {

	public static void main(String[] args) throws Exception {
		BufferedWriter bw = new BufferedWriter(new FileWriter("aa.txt"));
		
		/*for (int i = 0; i <3; i++) {
			bw.write("hello");
			bw.newLine();
			bw.flush();
		}*/
		
	
		
		
		BufferedReader br = new BufferedReader(new FileReader("aa.txt"));
		
		//***�ص�***
		String line;
		while((line = br.readLine())!=null){
			System.out.println(line);
		}
		
		bw.close();
	}

}
