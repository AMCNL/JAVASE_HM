package myConversionStream_03;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * InputStreamReader读数据的方法
 *     一次读取一个字符
 *     一次读取一个字符数组 
 *     
 */
public class InputStreamWriterDemo {

	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(new FileInputStream("OutputStreamWriterDemo.java"));

		//一次读取一个字符
		/*int ch;
		while((ch = isr.read())!=-1){
			System.out.print((char)ch);
		}
		*/
		//一次读取一个字符数组
		char[] chs = new char[1024];
		int len;
		while((len = isr.read(chs))!=-1){
			System.out.print(new String(chs,0,len));
		}
		
		
		isr.close();

	}

}
