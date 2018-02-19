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

import org.frank.cloudproject.StudentInformationSystem.model.Program;
import org.frank.cloudproject.StudentInformationSystem.service.Programsservice;

@Path("/programs")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ProgramsResource {

	private Programsservice programsservice = new Programsservice();

	@GET
	public Map<String, Program> getPrograms(){
		return programsservice.getAllPrograms();
	}

	@POST
	public Program addProgram(Program program) {
		return programsservice.addProgram(program);
	}

	@PUT
	@Path("/{programId}")
	public Program updateProgram(@PathParam("programId") String programId, Program program) {
		program.setProgramId(programId);
		return programsservice.updateProgram(program);
	}

	@DELETE
	@Path("/{programId}")
	public void deleteProgram(@PathParam("programId") String programId) {
		programsservice.removeProgram(programId);
	}

	@GET
	@Path("/{programId}")
	public Program getProgramName(@PathParam("programId") String programId) {
		return programsservice.getAllPrograms().get(programId);
	}

	@Path("/{programId}/courses")
	public CoursesResource getCoursesResource() {
		return new CoursesResource();
	}
}
