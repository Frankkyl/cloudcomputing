package org.frank.cloudproject.StudentInformationSystem.database;

import java.util.HashMap;
import java.util.Map;

import org.frank.cloudproject.StudentInformationSystem.model.Classcc;
import org.frank.cloudproject.StudentInformationSystem.model.Course;
import org.frank.cloudproject.StudentInformationSystem.model.Program;
import org.frank.cloudproject.StudentInformationSystem.model.Student;

public class DataBaseClass {
	private static Map<String, Classcc> classes = new HashMap<>();
	private static Map<String, Course> courses = new HashMap<>();

	private static Map<String, Program> programs = new HashMap<>();
	private static Map<String, Student> students = new HashMap<>();
	
	public static Map<String, Classcc> getClasses(){
		return classes;
	}
	
	public static Map<String, Course> getCourses(){
		return courses;
	}
	
	public static Map<String, Program> getPrograms(){
		return programs;
	}
	
	public static Map<String, Student> getStudents(){
		return students;
	};
}
