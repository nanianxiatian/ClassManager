package com.sz.service;

import java.util.List;

import com.sz.model.Grade;
import com.sz.vo.GradeCourseInfo;

public interface GradeManager {
	
	//保存学生的选课信息
	public boolean addStudentandCourse(Grade grade);

	//获取学生的选课程的信息
	public List<Grade> getGradesbyStudentId(int studentId);

	//根据课程编号获取学生信息
	public List<Grade> getGradesbyCourseId(int courseId);

	//将学生的成绩批量录入
	public boolean InputStudentScore(List<Grade> grades1);

	//根据课程编号查询平均成绩等课程信息
	public GradeCourseInfo getCourseInfoById(int courseId);

}
