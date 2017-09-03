package com.sz.service;

import java.util.List;

import com.sz.model.Student;

public interface StudentManager {
	//检查学生是否存在
	public boolean existStudent(Student student);
	//获取所有的学生
	public List<Student> getAllStudents();
	
	//添加学生信息
	public boolean addStudent(Student student);
	
	//根据学号删除学生信息
	public boolean deleteStudentById(int studentId);
	
	//查出指定id的学生信息
	public Student getStudentById(int studentId);
	
	//修改学生信息
	public boolean updateStudent(Student student);
}
