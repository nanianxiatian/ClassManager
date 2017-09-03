package com.sz.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.sz.dao.GradeDao;
import com.sz.dao.impl.GradeDaoImpl;
import com.sz.model.Grade;
import com.sz.service.GradeManager;
import com.sz.vo.GradeCourseInfo;
@Component("gradeManager")
public class GradeManagerImpl implements GradeManager {

	private GradeDao gradeDao;
	
	@Override
	public boolean addStudentandCourse(Grade grade) {
		
		return gradeDao.saveStudentandCourse(grade);
	}

	@Override
	public List<Grade> getGradesbyStudentId(int studentId) {

		return gradeDao.getGradesbyStudentId(studentId);
	}

	@Override
	public List<Grade> getGradesbyCourseId(int courseId) {
		
		return gradeDao.getGradesbyCourseId(courseId);
	}

	@Override
	public boolean InputStudentScore(List<Grade> grades1) {
	
		return gradeDao.InputStudentScore(grades1);
	}
	
	@Override
	public GradeCourseInfo getCourseInfoById(int courseId) {
		
		return gradeDao.getCourseInfo(courseId);
	}
	
	
	public GradeDao getGradeDao() {
		return gradeDao;
	}
	@Resource
	public void setGradeDao(GradeDao gradeDao) {
		this.gradeDao = gradeDao;
	}

	
}
