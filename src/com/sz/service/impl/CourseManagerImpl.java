package com.sz.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.sz.dao.CourseDao;
import com.sz.dao.impl.CourseDaoImpl;
import com.sz.model.Course;
import com.sz.service.CourseManager;

@Component("courseManager")
public class CourseManagerImpl implements CourseManager {

	private CourseDao courseDao;
	@Override
	public List<Course> getAllCourse() {
		
		return courseDao.LoadAllCourse();
	}
	@Override
	public boolean addCourse(Course course) {
		return courseDao.saveCourse(course);
	}
	@Override
	public boolean deleteCourseById(int courseId) {
		
		return courseDao.deleteCourseById(courseId);
	}
	@Override
	public Course getCourseById(int courseId) {

		return courseDao.loadCourseById(courseId);
	}
	@Override
	public boolean updateCourseInfo(Course course) {
		
		return courseDao.updateCourse(course);
	}
	public CourseDao getCourseDao() {
		return courseDao;
	}
	@Resource
	public void setCourseDao(CourseDao courseDao) {
		this.courseDao = courseDao;
	}

}
