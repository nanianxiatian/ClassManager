package com.sz.dao;

import java.util.List;

import com.sz.model.Course;

public interface CourseDao {

	//��ȡ���еĿγ���Ϣ
	public List<Course> LoadAllCourse();

	//����γ���Ϣ
	public boolean saveCourse(Course course);

	//���ݿγ̱��ɾ���γ���Ϣ
	public boolean deleteCourseById(int courseId);

	//���ݿγ̺ŵõ���Ӧ�Ŀγ���Ϣ
	public Course loadCourseById(int courseId);

	//���¿γ���Ϣ
	public boolean updateCourse(Course course);

}
