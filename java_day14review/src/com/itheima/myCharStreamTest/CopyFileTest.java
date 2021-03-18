package com.itheima.myCharStreamTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 5�ַ�ʽ�����ļ���
 *    �����ַ���һ�ζ�дһ���ַ�
 *    �����ַ���һ�ζ�дһ���ַ�����
 *    �����ַ���һ�ζ�дһ���ַ�
 *    �����ַ���һ�ζ�дһ���ַ�����
 *    ʹ���ַ����������ⷽ��һ�ζ�ȡһ���ַ���
 *    
 */
public class CopyFileTest {

	public static void main(String[] args) throws Exception {
		
		method1();
		method2();
		method3();
		method4();
		method5();
		

	}
 
	//ʹ���ַ����������ⷽ��һ�ζ�ȡһ���ַ���
	private static void method5() throws IOException {
		//��װ����Դ
		BufferedReader br = new BufferedReader(new FileReader("b.txt"));
		//��װĿ�ĵ�
		BufferedWriter bw = new BufferedWriter(new FileWriter("Copyb.txt"));
		
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


	//�����ַ���һ�ζ�дһ���ַ�
	private static void method1() throws Exception {
		//��װ����Դ
		FileReader fr = new FileReader("b.txt");
		//��װĿ�ĵ�
		FileWriter fw = new FileWriter("Coypb.txt");
		
		int ch;
		while((ch = fr.read())!=-1){
			fw.write(ch);
		}
		
		fw.close();
		fr.close();

	}
	
	//�����ַ���һ�ζ�дһ���ַ�����
	private static void method2() throws Exception {
		//��װ����Դ
		FileReader fr = new FileReader("b.txt");
		//��װĿ�ĵ�
		FileWriter fw = new FileWriter("Coypb.txt");
		
		char[] chs = new char[1024];
		int len;
		while((len = fr.read(chs))!=-1){
			fw.write(chs,0,len);
		}
		
		fw.close();
		fr.close();


	}
	
	//�ַ���������һ�ζ�ȡһ���ַ�
	private static void method3() throws Exception {
		//��װ����Դ
		BufferedReader br = new BufferedReader(new FileReader("b.txt"));
		//��װĿ�ĵ�
		BufferedWriter bw = new BufferedWriter(new FileWriter("Copyb.txt"));
		
		int ch;
		while((ch = br.read())!=-1){
			bw.write(ch);
		}
		
		bw.close();
		br.close();
		
	}
	
	//�ַ���������һ�ζ�ȡһ���ַ�
	private static void method4() throws Exception {
		//��װ����Դ
		BufferedReader br = new BufferedReader(new FileReader("b.txt"));
		//��װĿ�ĵ�
		BufferedWriter bw = new BufferedWriter(new FileWriter("Copyb.txt"));
		
		char[] chs = new char[1024];
		int len;
		while((len = br.read(chs))!=-1){
			bw.write(chs,0,len);
		}
		
		bw.close();
		br.close();
		
	}
	
	
	
}
