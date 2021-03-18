package com.itheima.myBufferedReaderStream03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class BufferReaderDemo {
	public static void main(String[] args) throws IOException {
		//封装数据源
		BufferedReader br = new BufferedReader(new FileReader("a.txt"));
		
		//创建集合对象
		ArrayList<String> array = new ArrayList<String>();
		
		
		String line;
		
		while((line=br.readLine())!=null){
			array.add(line);
		}
		
		br.close();
		
		for (String s : array) {
			System.out.println(s);
		}
		
	}
	
}
