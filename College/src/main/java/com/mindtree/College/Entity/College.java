package com.mindtree.College.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table
public class College {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String name;
	private int TotalStudents;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTotalStudents() {
		return TotalStudents;
	}
	public void setTotalStudents(int TotalStudents) {
		this.TotalStudents = TotalStudents;
	}
	public College(String name, int TotalStudents) {
		super();
		this.name = name;
		this.TotalStudents = TotalStudents;
	}
	public College() {
		super();
		
	}

}
