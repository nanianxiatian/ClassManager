package com.sz.action;

import java.util.List;

import javax.annotation.Resource;

import org.apache.struts2.json.annotations.JSON;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionSupport;
import com.sz.model.Grade;
import com.sz.service.GradeManager;

@Component("studentQueryAction")
@Scope("prototype")
public class StudentQueryAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int studentId;
	private GradeManager gradeManager;
	private List<Grade> grades;
	
	public String getStudentInfo()
	{
		grades = gradeManager.getGradesbyStudentId(studentId);
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
	public List<Grade> getGrades() {
		return grades;
	}
	public void setGrades(List<Grade> grades) {
		this.grades = grades;
	}
	@JSON(serialize=false)
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	

}
