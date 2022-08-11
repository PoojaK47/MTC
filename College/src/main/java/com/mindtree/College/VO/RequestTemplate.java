package com.mindtree.College.VO;

import java.util.ArrayList;
import java.util.List;

import com.mindtree.College.Entity.College;

public class RequestTemplate {
	private College college;
	private List<Student> studentList = new ArrayList<Student>();
	
	
	public RequestTemplate(College college, List<Student> StudentList) {
		super();
		this.college = college;
		this.studentList = StudentList;
	}


	public College getCollege() {
		return college;
	}


	public void setCollege(College college) {
		this.college= college;
	}


	public List<Student> getStudentList() {
		return studentList;
	}


	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}


	public RequestTemplate() {
		super();
		
	}

}