package org.frank.cloudproject.StudentInformationSystem.model;

import java.util.Date;

public class Program {
	private String programId;
	private String programName;
	private Date created;

	public Program() {

	}
	public Program(String programId, String programName) {
		super();
		this.programId = programId;
		this.programName = programName;
		this.created = new Date();
	}

	public String getProgramId() {
		return programId;
	}
	public void setProgramId(String programId) {
		this.programId = programId;
	}
	public String getProgramName() {
		return programName;
	}
	public void setProgramName(String programName) {
		this.programName = programName;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
}
