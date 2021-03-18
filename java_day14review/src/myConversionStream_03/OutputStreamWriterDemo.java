package myConversionStream_03;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/*
 * OutputStreamWriter：的写方法
 *     可以写一个字符：
 *     可以写一个数组
 *     可以写数组的一部分
 *     可以写一个字符串
 *     可以写一个字符串的一部分
 *     
 */
public class OutputStreamWriterDemo {

	public static void main(String[] args) throws IOException {
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("b.txt"));
		
		
		/*
		//写一个字符
		osw.write("a");//注意，代码写到这的时候执行在生成的b.txt文件中是看不到内容的原因如下
		//因为数据存储是以字节的形式存储的，但是我们操作的是字符， 一个字符=两个字节，字节是可以直接
		//进行存储的，但是字符不行，需要我们‘推’一下。---使用flush()方法
		
		osw.flush();
		
		//释放资源
		osw.close();
		*/
		
		
		
		/*
		//写一个字符数组
		char[] ch = {'a','b','d','h','r'};
		
		osw.write(ch);
		
		osw.flush();
		
		osw.close();*/
		
		/*
		 * //写一个字符数组的一部分
		char[] ch = {'a','b','d','h','r'};
		
		osw.write(ch,0,3);
		
		osw.flush();
		
		osw.close();*/
		
		
		/*//写一个字符串
		String s = "你好你好你好";
		
		osw.write(s);
		
		osw.flush();
		
		osw.close();*/
		
		
		//写一个字符串的一部分
		String s = "你好你好你好";
		
		osw.write(s,0,5);
		
		osw.flush();
		
		osw.close();
		
		
		

	}

}
