package com.itheima.myHomework.high_test01;

public class TestStudentTool {

	public static void main(String[] args) {
		//������������
		Student[] s = new Student[5];
		
		s[0] = new StudentTool("С��",20,98);
		s[1] = new StudentTool("С��",25,99);
		s[2] = new StudentTool("����",20,97);
		s[3] = new StudentTool("Ҧ��",25,100);
		s[4] = new StudentTool("��ɽ",20,55);
		
		StudentTool st = new StudentTool();
		
		int avg = st.getAverageScore(s);
		
		System.out.println("ƽ����Ϊ��"+avg);
		
		int max = st.getMaxScore(s);
		System.out.println("��߷���Ϊ��"+max);
		
		int count = st.getCount(s);
		System.out.println("������������У�"+count+"��");
		
		Student maxs = st.getMaxStudent(s);
		System.out.println("�ɼ����ѧԱ�������ǣ�"+maxs.getName());
		
		
		s[1].eat();
		s[2].eat();
		
		s[3].study("java");
		
		
		

	}

}
