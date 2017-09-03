package com.sz.dao;

import java.util.List;

import com.sz.model.Student;

public interface StudentDao {
	//检查学生是否存在
	public boolean checkStudentByNamePass(Student student);

	//获取所有的学生
	public List<Student> loadAllStudents();

	//添加学生信息
	public boolean addStudent(Student student);

	//删除学生信息
	public boolean deleteStudent(int studentId);

	//获取特定Id的学生信息
	public Student loadStudentById(int studentId);

	//更新学生信息
	public boolean updateStudentInfo(Student student);
	
	
}
