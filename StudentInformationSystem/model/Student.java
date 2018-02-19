package org.frank.cloudproject.StudentInformationSystem.model;

import java.util.Date;

//import javax.xml.bind.annotation.XmlRootElement;
//@XmlRootElement
public class Student {
	private String studentId;
	private String studentName;
//	private String studentFirstName;
//	private String studentLastName;
	private String courseenrolled;
	private String classenrolled;
	private String image;
	private Object program;
	private Date created;
	
	public Student() {
		
	}
	public Student(String studentId, String studentName
			, String courseenrolled, String classenrolled, Object program) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
//		this.studentFirstName = studentFirstName;
//		this.studentLastName = studentLastName;
		this.courseenrolled = courseenrolled;
		this.classenrolled = classenrolled;
		this.program = program;
		this.created = new Date();
	}
	
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	
//	public void getStudentFirstName(String studentFirstName) {
//		this.studentFirstName = studentFirstName;
//	}
//	public void getStudentLastName(String studentLastName) {
//		this.studentLastName = studentLastName;
//	}
//	
//	public void setStudentFirstName(String studentFirstName) {
//		this.studentFirstName = studentFirstName;
//	}
//	public void setStudentLastName(String studentLastName) {
//		this.studentLastName = studentLastName;
//	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}	
	public String getCourse() {
		return courseenrolled;
	}
	public void setCourseenrolled(String courseenrolled) {
		this.courseenrolled = courseenrolled;
	}
	public Object getProgram() {
		return program;
	}
	public void setProgram(Object program) {
		this.program = program;
	}
	public String getClassenrolled() {
		return classenrolled;
	}
	public void setClassenrolled(String classenrolled) {
		this.classenrolled = classenrolled;
	}
}

