package myConversionStream_04;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 * 把本java文件复制到当前目录下的Copy.java中
 */
public class CopyJavaTest {

	public static void main(String[] args) throws IOException {
		//封住数据源
		InputStreamReader isr = new InputStreamReader(new FileInputStream("CopyJavaTest.java"));
		
		//封装目的地
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("Copy.java"));
		
		//一次读写一个字符
		/*int ch;
		while((ch = isr.read())!=-1){
			osw.write(ch);
			
		}*/
		
		//一次写入一个字符数组
		char[] chs = new char[1024];
		int len;
		while((len = isr.read(chs))!=-1){
			osw.write(chs, 0, len);
		}
		
		//释放资源
		osw.close();
		isr.close();

	}

}
