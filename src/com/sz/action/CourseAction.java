package com.sz.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionSupport;
import com.sz.model.Course;
import com.sz.service.CourseManager;
import com.sz.service.impl.CourseManagerImpl;

@Component("courseAction")
@Scope("prototype")
public class CourseAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<Course> courses;
	private Course course;
	private int courseId;
	private CourseManager courseManager;
	
	public String courseLoad()
	{
		courses = courseManager.getAllCourse();
		return "success";
	}
	
	public String courseAdd()
	{
		String flag="";
		if(courseManager.addCourse(course))
		{
			flag ="success";
		}
		else
		{
			flag="fail";
		}
		return flag;
	}
	
	public String courseDelete()
	{
		String flag="";
		if(courseManager.deleteCourseById(courseId))
		{
			flag="success";
		}
		else
		{
			flag="fail";
		}
		
		return flag;
	}
	
	public String courseUpdateload()
	{
		course = courseManager.getCourseById(courseId);
		return "success";
	}
	
	public String courseUpdate()
	{
		String flag="";
		if(courseManager.updateCourseInfo(course))
		{
			flag="success";
		}
		else
		{
			flag="fail";
		}
		
		return flag;
	}
	
	
	public List<Course> getCourses() {
		return courses;
	}
	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public CourseManager getCourseManager() {
		return courseManager;
	}
	@Resource
	public void setCourseManager(CourseManager courseManager) {
		this.courseManager = courseManager;
	}
	

}
