package org.frank.cloudproject.StudentInformationSystem.model;

import java.util.Date;

public class Classcc {
	private String classId;
	private String className;
	private Date created;
	
	public Classcc() {
		
	}
	public Classcc(String classId, String className) {
		super();
		this.classId = classId;
		this.className = className;
		this.created = new Date();
	}
	
	public String getClassId() {
		return classId;
	}
	public void setClassId(String classId) {
		this.classId = classId;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}	
}
