package org.frank.cloudproject.StudentInformationSystem.service;
import org.frank.cloudproject.StudentInformationSystem.database.DataBaseClass;
import org.frank.cloudproject.StudentInformationSystem.model.Course;

import java.util.Map;

public class Coursesservice {
	
	private Map<String, Course> courses = DataBaseClass.getCourses();

	public Coursesservice() {
//		courses.put("5566", new Course("5566", "Cloud Comp"));
//		courses.put("7788", new Course("7788", "Adv Cloud"));
	}
	public Map<String, Course> getAllCourses(){
    		return courses;
    }
	
	public Course getcourseName(String courseId) {
		return courses.get(courseId);
	}
	
	public Course addCourse(Course course) {
		course.setCourseId(course.getCourseId());
		courses.put(course.getCourseId(), course);
		return course;
	}
	
	public Course updateCourse(Course course) {
		if(course.getCourseId()=="") {
			return addCourse(course);
		}
		courses.put(course.getCourseId(), course);
		return course;
	}
	
	public Course removeCourse(String courseId) {
		return courses.remove(courseId);
	}
	
}
