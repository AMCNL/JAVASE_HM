package com.itheima.myBufferedReaderStream02;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferReaderDemo {
	public static void main(String[] args) throws IOException {
		//封装数据源
				BufferedReader br = new BufferedReader(new FileReader("java_day14review\\a.txt"));
				
				//封装目的地
				BufferedWriter bf = new BufferedWriter(new FileWriter("java_day14review\\copy.txt"));
				
				String line;
				while((line = br.readLine())!=null){
					bf.write(line);
					bf.newLine();
					bf.flush();
				}
				
				bf.close();
				br.close();
	}
	
}
