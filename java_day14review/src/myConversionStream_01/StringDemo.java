package myConversionStream_01;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/*
 *编码：（把看得懂的变成看不懂的）
 *   public byte[] getByte(String charsetName) throws UnsupportedEncodingException
 *   使用指定的字符集将此String编码为byte序列，并将得到的结果存储到一个新的byte数组中
 *   
 *解码：（将看不懂的变成看得懂的）
 *   public String(byte[] bytes,String charsetName)
 *   通过指定的charsetName解码byte数组，构造一个新的String
 *   
 */
public class StringDemo {

	public static void main(String[] args) throws UnsupportedEncodingException {
		//定义一个字符串
		String s = "hello";
		
		byte[] bytes = s.getBytes();
		//[104, 101, 108, 108, 111]
		System.out.println(Arrays.toString(bytes));
		
		//定义个中文字符串
		String s2 = "你好";
		//使用默认的编码gbk
		byte[] bytes2 = s2.getBytes();
		//[-60, -29, -70, -61]
		System.out.println(Arrays.toString(bytes2));
		
		//使用编码gbk
		byte[] bytes2_1 = s2.getBytes("gbk");
		//[-60, -29, -70, -61]
		System.out.println(Arrays.toString(bytes2_1));
		
		
		//使用编码gbk
		byte[] bytes3_1 = s2.getBytes("UTF-8");
		//[-28, -67, -96, -27, -91, -67]
		System.out.println(Arrays.toString(bytes3_1));
		
		//结论：系统默认gbk和自己设定gbk编码得到的byte序列相同
		
		
		//解码：
		//String js = new String(bytes2);
		//系统默认解码（gbk）
		//System.out.println(js);//结果：你好
		
		//设置gbk解码
		String js2 = new String(bytes2_1,"GBK");
		System.out.println(js2);//结果：你好
		
		
		//使用utf-8编码，gbk解码（乱码）
		String js3 = new String(bytes3_1,"GBK");
		System.out.println(js3);//结果：浣犲ソ(乱码)
		
		
		//使用utf-8编码，gbk解码（乱码）
		String js4 = new String(bytes3_1,"utf-8");
		System.out.println(js4);//结果：你好
		
		//结论：编码解码一致会不会出现乱码，编码解码不一致会出现乱码
		
		//总结：避免乱码，编码和解码的方式要一致。
		
		
		
	}

}
