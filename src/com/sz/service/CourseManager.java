package com.sz.service;

import java.util.List;

import com.sz.model.Course;

public interface CourseManager {

	//��ȡ���еĿγ���Ϣ
	public List<Course> getAllCourse();

	//��ӿγ���Ϣ
	public boolean addCourse(Course course);

	//���ݿγ̱��ɾ���γ�
	public boolean deleteCourseById(int courseId);

	//���ݿγ̺ŵõ���Ӧ�Ŀγ���Ϣ
	public Course getCourseById(int courseId);

	//���¿γ���Ϣ
	public boolean updateCourseInfo(Course course);

}
