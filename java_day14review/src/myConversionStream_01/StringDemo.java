package myConversionStream_01;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/*
 *���룺���ѿ��ö��ı�ɿ������ģ�
 *   public byte[] getByte(String charsetName) throws UnsupportedEncodingException
 *   ʹ��ָ�����ַ�������String����Ϊbyte���У������õ��Ľ���洢��һ���µ�byte������
 *   
 *���룺�����������ı�ɿ��ö��ģ�
 *   public String(byte[] bytes,String charsetName)
 *   ͨ��ָ����charsetName����byte���飬����һ���µ�String
 *   
 */
public class StringDemo {

	public static void main(String[] args) throws UnsupportedEncodingException {
		//����һ���ַ���
		String s = "hello";
		
		byte[] bytes = s.getBytes();
		//[104, 101, 108, 108, 111]
		System.out.println(Arrays.toString(bytes));
		
		//����������ַ���
		String s2 = "���";
		//ʹ��Ĭ�ϵı���gbk
		byte[] bytes2 = s2.getBytes();
		//[-60, -29, -70, -61]
		System.out.println(Arrays.toString(bytes2));
		
		//ʹ�ñ���gbk
		byte[] bytes2_1 = s2.getBytes("gbk");
		//[-60, -29, -70, -61]
		System.out.println(Arrays.toString(bytes2_1));
		
		
		//ʹ�ñ���gbk
		byte[] bytes3_1 = s2.getBytes("UTF-8");
		//[-28, -67, -96, -27, -91, -67]
		System.out.println(Arrays.toString(bytes3_1));
		
		//���ۣ�ϵͳĬ��gbk���Լ��趨gbk����õ���byte������ͬ
		
		
		//���룺
		//String js = new String(bytes2);
		//ϵͳĬ�Ͻ��루gbk��
		//System.out.println(js);//��������
		
		//����gbk����
		String js2 = new String(bytes2_1,"GBK");
		System.out.println(js2);//��������
		
		
		//ʹ��utf-8���룬gbk���루���룩
		String js3 = new String(bytes3_1,"GBK");
		System.out.println(js3);//�����你好(����)
		
		
		//ʹ��utf-8���룬gbk���루���룩
		String js4 = new String(bytes3_1,"utf-8");
		System.out.println(js4);//��������
		
		//���ۣ��������һ�»᲻��������룬������벻һ�»��������
		
		//�ܽ᣺�������룬����ͽ���ķ�ʽҪһ�¡�
		
		
		
	}

}
