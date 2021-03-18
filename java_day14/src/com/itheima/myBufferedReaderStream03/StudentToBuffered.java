package com.itheima.myBufferedReaderStream03;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class StudentToBuffered {

	public static void main(String[] args) throws IOException {
		//�������϶���
		ArrayList<Student> array = new ArrayList<Student>();
		
		//����ѧ������
		Student s1 = new Student("s001","С��",30,"����");
		Student s2 = new Student("s002","С��",32,"�Ϻ�");
		Student s3 = new Student("s003","С��",33,"����");
		Student s4 = new Student("s004","С֣",35,"����");
		
		//��Ӽ���Ԫ��
		array.add(s1);
		array.add(s2);
		array.add(s3);
		array.add(s4);
		
		//�����ַ��������������
		BufferedWriter bw = new BufferedWriter(new FileWriter("stu.txt"));
		
		
		//�������ϣ���д������
		for (Student stu : array) {
			StringBuilder sb = new StringBuilder();
			sb.append(stu.getSid()).append(",").append(stu.getName()).append(",").append(stu.getAge()).append(",").append(stu.getAddr());
			System.out.println(sb.toString());
			
			bw.write(sb.toString());
			
			bw.newLine();
			bw.flush();
		}
		
		//�ͷ���Դ
		bw.close();
		
		
	}

}
