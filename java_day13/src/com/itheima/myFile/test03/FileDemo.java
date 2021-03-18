package com.itheima.myFile.test03;

import java.io.File;
import java.io.IOException;

/*
 * 删除文件\文件夹操作
 */

public class FileDemo {
	public static void main(String[] args) throws IOException {
		
		File f = new File("aa.txt");
		
		System.out.println("createNewFile："+f.createNewFile());
		
		File f1 = new File("bb");
		File f2 = new File("bb\\aa.txt");
		System.out.println("mkdir:"+f1.mkdir());
		System.out.println("createNewFile:"+f2.createNewFile());
		
		
		//删除操作
		System.out.println("delete:"+f.delete());//true
		
		
		System.out.println("delete:"+f.delete());//flase(多级不能直接删除，需要把上一层里面的文件删除后才能删除)
		
		
		
		

		
	}

}
