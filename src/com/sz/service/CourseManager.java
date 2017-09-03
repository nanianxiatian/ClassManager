package com.sz.service;

import java.util.List;

import com.sz.model.Course;

public interface CourseManager {

	//获取所有的课程信息
	public List<Course> getAllCourse();

	//添加课程信息
	public boolean addCourse(Course course);

	//根据课程编号删除课程
	public boolean deleteCourseById(int courseId);

	//根据课程号得到相应的课程信息
	public Course getCourseById(int courseId);

	//更新课程信息
	public boolean updateCourseInfo(Course course);

}
