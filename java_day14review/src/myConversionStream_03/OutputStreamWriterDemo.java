package myConversionStream_03;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/*
 * OutputStreamWriter����д����
 *     ����дһ���ַ���
 *     ����дһ������
 *     ����д�����һ����
 *     ����дһ���ַ���
 *     ����дһ���ַ�����һ����
 *     
 */
public class OutputStreamWriterDemo {

	public static void main(String[] args) throws IOException {
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("b.txt"));
		
		
		/*
		//дһ���ַ�
		osw.write("a");//ע�⣬����д�����ʱ��ִ�������ɵ�b.txt�ļ����ǿ��������ݵ�ԭ������
		//��Ϊ���ݴ洢�����ֽڵ���ʽ�洢�ģ��������ǲ��������ַ��� һ���ַ�=�����ֽڣ��ֽ��ǿ���ֱ��
		//���д洢�ģ������ַ����У���Ҫ���ǡ��ơ�һ�¡�---ʹ��flush()����
		
		osw.flush();
		
		//�ͷ���Դ
		osw.close();
		*/
		
		
		
		/*
		//дһ���ַ�����
		char[] ch = {'a','b','d','h','r'};
		
		osw.write(ch);
		
		osw.flush();
		
		osw.close();*/
		
		/*
		 * //дһ���ַ������һ����
		char[] ch = {'a','b','d','h','r'};
		
		osw.write(ch,0,3);
		
		osw.flush();
		
		osw.close();*/
		
		
		/*//дһ���ַ���
		String s = "���������";
		
		osw.write(s);
		
		osw.flush();
		
		osw.close();*/
		
		
		//дһ���ַ�����һ����
		String s = "���������";
		
		osw.write(s,0,5);
		
		osw.flush();
		
		osw.close();
		
		
		

	}

}
