package com.sz.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.sz.dao.StudentDao;
import com.sz.model.Student;
import com.sz.model.Tclass;
import com.sz.util.HibernateSessionFactory;

@Component("studentDao")
public class StudentDaoImpl implements StudentDao {

	private HibernateTemplate hibernateTemplate;
	@Override
	public boolean checkStudentByNamePass(Student student) {
		List<Student> Students=  hibernateTemplate.find("from Student s where s.studentId ="+student.getStudentId()+" and s.studentPass ="+student.getStudentPass());
		if(Students!=null&&Students.size()>0)
		{
			return true;
		}
		return false;	
	}

	@Override
	public List<Student> loadAllStudents() {
		
		List<Student> students = hibernateTemplate.find("from Student");
		return students;
	}

	@Override
	public boolean addStudent(Student student) {
		try {
			hibernateTemplate.save(student);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public boolean deleteStudent(int studentId) {
		try {
			hibernateTemplate.delete(hibernateTemplate.get(Student.class,studentId));
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public Student loadStudentById(int studentId) {
		Student student = new Student();
		try {
			student = (Student) hibernateTemplate.get(Student.class, studentId);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return student;
	}

	@Override
	public boolean updateStudentInfo(Student student) {
		try {
			
			hibernateTemplate.update(student);
			
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
