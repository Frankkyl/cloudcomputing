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

import org.frank.cloudproject.StudentInformationSystem.service.Coursesservice;
import org.frank.cloudproject.StudentInformationSystem.model.Course;

@Path("/")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class CoursesResource {

	private Coursesservice coursesservice = new Coursesservice();

	@GET
	public Map<String, Course> getCourses(){
		return coursesservice.getAllCourses();
	}

	@POST
	public Course addCourse(Course course) {
		return coursesservice.addCourse(course);
	}

	@PUT
	@Path("/{courseId}")
	public Course updateCourse(@PathParam("courseId") String courseId, Course course) {
		course.setCourseId(courseId);
		return coursesservice.updateCourse(course);
	}

	@DELETE
	@Path("/{courseId}")
	public void deleteCourse(@PathParam("courseId") String courseId) {
		coursesservice.removeCourse(courseId);
	}

	@GET
	@Path("/{courseId}")
	public Course getCourseName(@PathParam("courseId") String courseId) {
		return coursesservice.getAllCourses().get(courseId);
	}

	@Path("/{courseId}/students")
	public StudentsResource getStudentsRecource() {
		return new StudentsResource();
	}

}
