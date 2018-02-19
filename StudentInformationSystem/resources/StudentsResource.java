package org.frank.cloudproject.StudentInformationSystem.resources;

import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.frank.cloudproject.StudentInformationSystem.model.Student;
import org.frank.cloudproject.StudentInformationSystem.service.Studentsservice;

@Path("/students")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class StudentsResource {
	
	private Studentsservice studentsservice = new Studentsservice();

	@GET
	public Map<String, Student> getStudents(){
		return studentsservice.getAllStudents();
	}

	@POST
	public Student addStudent(Student student) {
		return studentsservice.addStudent(student);
	}

	@PUT
	@Path("/{studentId}")
	public Student updateStudent(@PathParam("studentId") String studentId, Student student) {
		student.setStudentId(studentId);
		return studentsservice.updateStudent(student);
	}

	@DELETE
	@Path("/{studentId}")
	public void deleteStudent(@PathParam("studentId") String studentId) {
		studentsservice.removeStudent(studentId);
	}

	@GET
	@Path("/{studentId}")
	public Student getStudentName(@PathParam("studentId") String studentId) {
		return studentsservice.getAllStudents().get(studentId);
	}
}
