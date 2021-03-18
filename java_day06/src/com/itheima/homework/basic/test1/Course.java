package com.itheima.homework.basic.test1;
/*
 * 课程编号	名称	创建时间	课程描述
 */
public class Course {
	private String courseId;
	
	private String cname;
	
	private String ctime;
	
	private String cdescribe;

	public String getCourseId() {
		return courseId;
	}

	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getCtime() {
		return ctime;
	}

	public void setCtime(String ctime) {
		this.ctime = ctime;
	}

	public String getCdescribe() {
		return cdescribe;
	}

	public void setCdescribe(String cdescribe) {
		this.cdescribe = cdescribe;
	}

	public Course(String courseId, String cname, String ctime, String cdescribe) {
		super();
		this.courseId = courseId;
		this.cname = cname;
		this.ctime = ctime;
		this.cdescribe = cdescribe;
	}

	public Course() {
		super();
	}

	
	
	
	
	
	
	

    
}
