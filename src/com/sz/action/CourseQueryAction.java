package com.sz.action;

import javax.annotation.Resource;

import org.apache.struts2.json.annotations.JSON;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionSupport;
import com.sz.service.GradeManager;
import com.sz.vo.GradeCourseInfo;
@Component("courseQueryAction")
@Scope("prototype")
public class CourseQueryAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private GradeManager gradeManager;
	private GradeCourseInfo gradeCourseInfo;
	private int courseId; 
	
	public String getCourseInfo()
	{
		System.out.println(courseId);
		gradeCourseInfo = gradeManager.getCourseInfoById(courseId);
		return "success";
	}
	
	@JSON(serialize=false)
	public GradeManager getGradeManager() {
		return gradeManager;
	}
	@Resource
	public void setGradeManager(GradeManager gradeManager) {
		this.gradeManager = gradeManager;
	}
	@JSON(serialize=false)
	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	
	public GradeCourseInfo getGradeCourseInfo() {
		return gradeCourseInfo;
	}

	public void setGradeCourseInfo(GradeCourseInfo gradeCourseInfo) {
		this.gradeCourseInfo = gradeCourseInfo;
	}

}
