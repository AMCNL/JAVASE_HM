package com.itheima.myConversionStream02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

/*
 * 需求: 以UTF-8编码的格式写出 “你好”到文件中, 并将数据正确的读取出来打印在控制台
	分析:
	第一步: 创建OutputStreamWriter关联文件, 并在构造方法中指定编码表
	第二步: 调用writer方法写出字符串
	第三步: 创建InputStreamReader关联文件, 并在构造方法中指定码表进行读取
	第四部: 调用read方法读取数据, 打印在控制台

 */
public class OutputStreamWriterDemo {
	public static void main(String[] args) throws IOException {
		
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("a.txt"));
		String str = "你好";
		
		osw.write(str);
		
		osw.close();
		
		
		InputStreamReader isr = new InputStreamReader(new FileInputStream("a.txt"));
		
		int ch;
		while((ch=isr.read())!=-1){
			
			System.out.print((char)ch);
		}
		
		isr.close();
		
		
	}
}
