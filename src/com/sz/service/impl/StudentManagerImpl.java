package com.sz.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.sz.dao.StudentDao;
import com.sz.dao.impl.StudentDaoImpl;
import com.sz.model.Student;
import com.sz.service.StudentManager;

@Component("studentManager")
public class StudentManagerImpl implements StudentManager{

	private StudentDao studentDao ; 
	
	@Override
	public boolean existStudent(Student student) {
		return studentDao.checkStudentByNamePass(student);
	}

	@Override
	public List<Student> getAllStudents() {
		return studentDao.loadAllStudents();
	}

	@Override
	public boolean addStudent(Student student) {
		
		return studentDao.addStudent(student);
	}

	@Override
	public boolean deleteStudentById(int studentId) {

		return studentDao.deleteStudent(studentId);
	}

	@Override
	public Student getStudentById(int studentId) {

		return studentDao.loadStudentById(studentId);
	}

	@Override
	public boolean updateStudent(Student student) {
		
		return studentDao.updateStudentInfo(student);
	}

	public StudentDao getStudentDao() {
		return studentDao;
	}
	@Resource
	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}
	
}
