package com.sz.service;

import java.util.List;

import com.sz.model.Grade;
import com.sz.vo.GradeCourseInfo;

public interface GradeManager {
	
	//����ѧ����ѡ����Ϣ
	public boolean addStudentandCourse(Grade grade);

	//��ȡѧ����ѡ�γ̵���Ϣ
	public List<Grade> getGradesbyStudentId(int studentId);

	//���ݿγ̱�Ż�ȡѧ����Ϣ
	public List<Grade> getGradesbyCourseId(int courseId);

	//��ѧ���ĳɼ�����¼��
	public boolean InputStudentScore(List<Grade> grades1);

	//���ݿγ̱�Ų�ѯƽ���ɼ��ȿγ���Ϣ
	public GradeCourseInfo getCourseInfoById(int courseId);

}
