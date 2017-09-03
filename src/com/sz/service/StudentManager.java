package com.sz.service;

import java.util.List;

import com.sz.model.Student;

public interface StudentManager {
	//���ѧ���Ƿ����
	public boolean existStudent(Student student);
	//��ȡ���е�ѧ��
	public List<Student> getAllStudents();
	
	//���ѧ����Ϣ
	public boolean addStudent(Student student);
	
	//����ѧ��ɾ��ѧ����Ϣ
	public boolean deleteStudentById(int studentId);
	
	//���ָ��id��ѧ����Ϣ
	public Student getStudentById(int studentId);
	
	//�޸�ѧ����Ϣ
	public boolean updateStudent(Student student);
}
