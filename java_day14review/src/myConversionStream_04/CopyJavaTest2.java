package myConversionStream_04;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 * 把本java文件复制到当前目录下的Copy.java中(改进版)
 * 
 *  FileReader = InputStreamReader + 编码表（系统默认）
 *  
 *  FileWriter = OutputStreamWriter + 编码表（系统默认）
 *  
 *  注意：以上等号前者俩个使用的编码表是当前系统默认的编码表，若要使用其他编码表则还是要使用等号后者两个
 */
public class CopyJavaTest2 {

	public static void main(String[] args) throws IOException {
		//封住数据源
		FileReader fr = new FileReader("CopyJavaTest.java");
		
		//封装目的地
		FileWriter fw = new FileWriter("Copy.java");
		
		//一次读写一个字符
		/*int ch;
		while((ch = fr.read())!=-1){
			fw.write(ch);
		}*/
		
		//一次读取一个字符数组
		char[] chs = new char[1024];
		int len;
		while((len = fr.read(chs))!=-1){
			fw.write(chs, 0, len);
		}
		fw.close();
		fr.close();
		

	}

}
