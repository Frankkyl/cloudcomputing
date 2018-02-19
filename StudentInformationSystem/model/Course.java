package org.frank.cloudproject.StudentInformationSystem.model;

import java.util.Date;
import java.util.List;

//import javax.xml.bind.annotation.XmlRootElement;
//@XmlRootElement
public class Course {

	private String courseId;
	private String courseName;
	private String board;
	private String lecture;
	private String notes;
	private String materials;
	private Date created;
	
	public Course() {

	}
	
	public Course(String courseId, String courseName) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.created = new Date();
	}

	public String getCourseId() {
		return courseId;
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}

}
