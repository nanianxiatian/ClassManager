package com.sz.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.sz.dao.CourseDao;
import com.sz.model.Course;
import com.sz.model.Student;
import com.sz.util.HibernateSessionFactory;

@Component("courseDao")
public class CourseDaoImpl implements CourseDao{

	private HibernateTemplate hibernateTemplate;
	@Override
	public List<Course> LoadAllCourse() {
			
			
			List<Course> courses = hibernateTemplate.find("from Course");;
			return courses;
		
	}

	@Override
	public boolean saveCourse(Course course) {
		try {
			hibernateTemplate.save(course);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public boolean deleteCourseById(int courseId) {
		try {
			hibernateTemplate.delete(hibernateTemplate.get(Course.class, courseId));
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public Course loadCourseById(int courseId) {
		Course course = new Course();
		try {
			course = (Course) hibernateTemplate.get(Course.class, courseId);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return course;
	}

	@Override
	public boolean updateCourse(Course course) {
		try {
			
			hibernateTemplate.update(course);
		} catch (Exception e) {
			e.printStackTrace();
			return  false;
			// TODO: handle exception
		}
		return true;
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
	@Resource
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}


}
