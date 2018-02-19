package org.frank.cloudproject.StudentInformationSystem.service;
import java.util.Map;

import org.frank.cloudproject.StudentInformationSystem.database.DataBaseClass;
import org.frank.cloudproject.StudentInformationSystem.model.Student;

public class Studentsservice {

	private Map<String, Student> students = DataBaseClass.getStudents();

	public Studentsservice() {
//		students.put("1", new Student("1", "Frank Liu", "Cloud Comp", "17s", "IS"));
//		students.put("2", new Student("2", "Harry Han", "Adv Cloud", "17f", "CS"));
	}

	public Map<String, Student> getAllStudents(){
    		return students;
    }

	public Student getStudentName(String studentId) {
		return students.get(studentId);
	}

	public Student addStudent(Student student) {
		student.setStudentId(student.getStudentId());//Integer.toString(classes.size()+1)
		students.put(student.getStudentId(), student);
		return student;
	}

	public Student updateStudent(Student student) {
		if(student.getStudentId()=="") {
			return addStudent(student);
		}
		students.put(student.getStudentId(), student);
		return student;
	}

	public Student removeStudent(String studentId) {
		return students.remove(studentId);
	}
}
