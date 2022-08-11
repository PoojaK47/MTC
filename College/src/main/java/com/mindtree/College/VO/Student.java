package com.mindtree.College.VO;

public class Student {
	private long rollNo;
	private String name;
	private String gender;
	private int age;
	private long college_id;
	
	public Long getRollNo() {
		return rollNo;
	}
	public void setRollNo(Long rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public long getCollege_id() {
		return college_id;
	}
	public void setCollege_id(long college_id) {
		this.college_id = college_id;
	}

	public Student(String name, String gender, int age, long college_id) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.college_id = college_id;
	}
	public Student() {
		super();
	}

}
