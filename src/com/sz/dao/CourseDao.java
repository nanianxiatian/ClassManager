package com.sz.dao;

import java.util.List;

import com.sz.model.Course;

public interface CourseDao {

	//获取所有的课程信息
	public List<Course> LoadAllCourse();

	//保存课程信息
	public boolean saveCourse(Course course);

	//根据课程编号删除课程信息
	public boolean deleteCourseById(int courseId);

	//根据课程号得到相应的课程信息
	public Course loadCourseById(int courseId);

	//更新课程信息
	public boolean updateCourse(Course course);

}
