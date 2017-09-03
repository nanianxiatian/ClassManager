package com.sz.action;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionSupport;
import com.sz.model.Course;
import com.sz.model.Grade;
import com.sz.model.GradeId;
import com.sz.model.Student;
import com.sz.service.GradeManager;
import com.sz.service.impl.GradeManagerImpl;
@Component("gradeAction")
@Scope("prototype")
public class GradeAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Grade grade;
	private GradeId id;
	private List<Grade> grades;
	private List<Grade> grades1 = new ArrayList<Grade>();
	private int studentId;
	private int courseId;
	private GradeManager gradeManager;
	
	public String studentChooseCourse()
	{
		//System.out.println(student.getStudentId());
		System.out.println("¿Î³Ì"+grade.getId().getCourseId());
		System.out.println("Ñ§ºÅ"+grade.getId().getStudentId());
		String flag ="";
		if(gradeManager.addStudentandCourse(grade))
		{
			flag ="success";
		}
		else
		{
			flag="fail";
		}
		return flag;
	}

	public String checkSelectCousrse()
	{
		grades =gradeManager.getGradesbyStudentId(studentId);
		return "success";
	}
	
	public String studentGradeInput()
	{
		grades =gradeManager.getGradesbyCourseId(courseId);
		return "success";
	}
	
	public String scoreInput()
	{
		System.out.println(grades1.size());
		for(int i=0; i<grades1.size();i++)
		{
			System.out.println(grades1.get(i).getId().getStudentId());
		}
		String flag ="";
		if(gradeManager.InputStudentScore(grades1))
		{
			flag = "success";
		}
		else
		{
			flag = "fail";
		}
		return flag;
	}
	
	
	public Grade getGrade() {
		return grade;
	}

	public void setGrade(Grade grade) {
		this.grade = grade;
	}


	public GradeId getId() {
		return id;
	}

	public void setId(GradeId id) {
		this.id = id;
	}

	public List<Grade> getGrades() {
		return grades;
	}

	public void setGrades(List<Grade> grades) {
		this.grades = grades;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public GradeManager getGradeManager() {
		return gradeManager;
	}
	@Resource
	public void setGradeManager(GradeManager gradeManager) {
		this.gradeManager = gradeManager;
	}

	public List<Grade> getGrades1() {
		return grades1;
	}

	public void setGrades1(List<Grade> grades1) {
		this.grades1 = grades1;
	}


}
