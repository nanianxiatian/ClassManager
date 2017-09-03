package com.sz.dao;

import java.util.List;

import com.sz.model.Student;

public interface StudentDao {
	//���ѧ���Ƿ����
	public boolean checkStudentByNamePass(Student student);

	//��ȡ���е�ѧ��
	public List<Student> loadAllStudents();

	//���ѧ����Ϣ
	public boolean addStudent(Student student);

	//ɾ��ѧ����Ϣ
	public boolean deleteStudent(int studentId);

	//��ȡ�ض�Id��ѧ����Ϣ
	public Student loadStudentById(int studentId);

	//����ѧ����Ϣ
	public boolean updateStudentInfo(Student student);
	
	
}
