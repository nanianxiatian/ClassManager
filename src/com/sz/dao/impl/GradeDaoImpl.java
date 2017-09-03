package com.sz.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.sz.dao.GradeDao;
import com.sz.model.Grade;
import com.sz.model.Student;
import com.sz.util.HibernateSessionFactory;
import com.sz.vo.GradeCourseInfo;
@Component("gradeDao")
public class GradeDaoImpl implements GradeDao {
	private HibernateTemplate hibernateTemplate;
	@Override
	public boolean saveStudentandCourse(Grade grade) {
		try {
			hibernateTemplate.save(grade);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public List<Grade> getGradesbyStudentId(int studentId) {
		List<Grade> grades = hibernateTemplate.find("from Grade g where g.id.studentId="+studentId);
		return grades;
	}

	@Override
	public List<Grade> getGradesbyCourseId(int courseId) {
		List<Grade> grades = hibernateTemplate.find("from Grade g where g.id.courseId="+courseId);
		return grades;
	}
	
	@Override
	public boolean InputStudentScore(List<Grade> grades1) {
		try {
			for(Grade g:grades1)
			{
				hibernateTemplate.update(g);
			}

		} catch (Exception e) {
			e.printStackTrace();
			return  false;
			// TODO: handle exception
		}
		return true;
	}
	
	
	@Override
	public GradeCourseInfo getCourseInfo(int courseId) {
		List<Grade> grades = hibernateTemplate.find("from Grade g where g.id.courseId="+courseId);
		GradeCourseInfo  gradeCourseInfo = new GradeCourseInfo();
		gradeCourseInfo.setCourseId(courseId);
		String courseName ="";
		double sum = 0;
		int sumNum = 0;
		double max = -1;
		double min = -1;
		System.out.println("size:"+grades.size());
		for (int i=0;i<grades.size();i++)
		{
			courseName = grades.get(i).getCourse().getCourseName();
			if(grades.get(i).getGradeNumber()!=null)
			{
				min = grades.get(i).getGradeNumber();
				break;
			}
		}
		
		for(Grade g:grades)
		{
			if(g.getGradeNumber()!=null)
			{
				sum += g.getGradeNumber();
				sumNum ++;
				if(g.getGradeNumber()>max)
				{
					max = g.getGradeNumber();
				}
				if(g.getGradeNumber()<min)
				{
					min = g.getGradeNumber();
				}
			}
		}
		System.out.println("courseName:"+courseName);
		gradeCourseInfo.setCourseName(courseName);
		gradeCourseInfo.setMaxNumber(max);
		gradeCourseInfo.setMinNumber(min);
		if(sumNum==0)
		{gradeCourseInfo.setAveNumber(0);}
		else
		{
		gradeCourseInfo.setAveNumber((sum/sumNum));
		}
		return gradeCourseInfo;
	}

	

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
	@Resource
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}


}
