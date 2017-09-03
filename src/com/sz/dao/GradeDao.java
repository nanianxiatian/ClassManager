package com.sz.dao;

import java.util.List;

import com.sz.model.Grade;
import com.sz.vo.GradeCourseInfo;

public interface GradeDao {

	//保存学生选课信息
	public boolean saveStudentandCourse(Grade grade);

	//获取相应的学号的学生选的课的信息
	public List<Grade> getGradesbyStudentId(int studentId);
	
	//获取课程编号对应的学生信息
	public List<Grade> getGradesbyCourseId(int courseId);

	//批量输入学生信息
	public boolean InputStudentScore(List<Grade> grades1);

	//根据课程编号获得课程的平均分的信息
	public GradeCourseInfo getCourseInfo(int courseId);

}
