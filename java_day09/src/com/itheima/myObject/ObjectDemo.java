package com.itheima.myObject;
/*
 * Object����java������ĸ��࣬���е��඼ֱ�ӻ��߼�Ӽ̳��˸���
 * ���췽����ֻ��һ���޲ε�Object(){}
 * 
 * 
 * 
 */
public class ObjectDemo {

	public static void main(String[] args) {
		Student st = new Student();
		
		st.setName("licn");
		st.setAge(24);
		
		//System.out.println(st);//��дtoString����ǰ��com.itheima.myObject.Student@633e5e
		
		System.out.println(st);//��дtoString������ ��Student [name=licn, age=24]

	}

}
