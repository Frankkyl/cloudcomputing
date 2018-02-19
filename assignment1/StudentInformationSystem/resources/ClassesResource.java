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

import org.frank.cloudproject.StudentInformationSystem.service.Classesservice;
import org.frank.cloudproject.StudentInformationSystem.model.Classcc;

@Path("/classes")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ClassesResource {
	
	Classesservice classesservice = new Classesservice();
	
	@GET
	public Map<String, Classcc> getClasses(){
		//System.out.println(classesService.getAllClasses());
		//System.out.println("check");
		return /*(Map<String, Classcc>)*/ classesservice.getAllClasses();
	}
	
	@POST
	public Classcc addClasscc(Classcc classcc) {
		return classesservice.addClasscc(classcc);
	}
	
	@PUT
	@Path("/{classId}")
	public Classcc updateClasscc(@PathParam("classId") String classId, Classcc classcc) {
		classcc.setClassId(classId);
		return classesservice.updateClasscc(classcc);
	}
	
	@DELETE
	@Path("/{classId}")
	public void deleteClasscc(@PathParam("classId") String classId) {
		classesservice.removeClasscc(classId);
	}
	
	@GET
	@Path("/{classId}")
	public Classcc getClassName(@PathParam("classId") String classId) {
		//System.out.println("check");
		//System.out.println(classesmap.getAllClasses().get(classId));
		return classesservice.getAllClasses().get(classId);
	}
}
