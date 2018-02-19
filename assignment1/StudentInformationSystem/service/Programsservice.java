package org.frank.cloudproject.StudentInformationSystem.service;

import java.util.Map;

import org.frank.cloudproject.StudentInformationSystem.database.DataBaseClass;
import org.frank.cloudproject.StudentInformationSystem.model.Program;

public class Programsservice {

	private Map<String, Program> programs = DataBaseClass.getPrograms();

	public Programsservice() {
//		programs.put("0001", new Program("0001", "CS"));
//		programs.put("0002", new Program("0002", "IS"));
	}
	public Map<String, Program> getAllPrograms(){
    		return programs;
    }
	
	public Program getProgramName(String programId) {
		return programs.get(programId);
	}

	public Program addProgram(Program program) {
		program.setProgramId(String.format("%4d",programs.size()+1).replace(" ", "0"));//program.getProgramId()//Integer.toString(programs.size()+1)
		programs.put(program.getProgramId(), program);								//String str = String.format("%5d", num).replace(" ", "0");
		return program;
	}

	public Program updateProgram(Program program) {
		if(program.getProgramId()=="") {
			return addProgram(program);
		}
		programs.put(program.getProgramId(), program);
		return program;
	}

	public Program removeProgram(String programId) {
		return programs.remove(programId);
	}
}
