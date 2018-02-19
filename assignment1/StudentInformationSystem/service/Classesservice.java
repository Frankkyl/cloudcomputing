package org.frank.cloudproject.StudentInformationSystem.service;
import org.frank.cloudproject.StudentInformationSystem.database.DataBaseClass;
import org.frank.cloudproject.StudentInformationSystem.model.Classcc;

import java.util.Map;

public class Classesservice {
	
	private Map<String, Classcc> classes = DataBaseClass.getClasses();

	public Classesservice() {
//		classes.put("17s", new Classcc("17s", "IS 2017 SPRING"));
//		classes.put("17f", new Classcc("17f", "IS 2017 Fall"));
	}
	public Map<String, Classcc> getAllClasses(){
    		return classes;
    }
	
	public Classcc getClassName(String classId) {
		return classes.get(classId);
	}
	
	public Classcc addClasscc(Classcc classcc) {
		classcc.setClassId(classcc.getClassId());//Integer.toString(classes.size()+1)
		classes.put(classcc.getClassId(), classcc);
		return classcc;
	}
	
	public Classcc updateClasscc(Classcc classcc) {
		if(classcc.getClassId()=="") {
			return addClasscc(classcc);
		}
		classes.put(classcc.getClassId(), classcc);
		return classcc;
	}
	
	public Classcc removeClasscc(String classId) {
		return classes.remove(classId);
	}
	
	
}
