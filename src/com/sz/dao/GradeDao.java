package com.sz.dao;

import java.util.List;

import com.sz.model.Grade;
import com.sz.vo.GradeCourseInfo;

public interface GradeDao {

	//����ѧ��ѡ����Ϣ
	public boolean saveStudentandCourse(Grade grade);

	//��ȡ��Ӧ��ѧ�ŵ�ѧ��ѡ�Ŀε���Ϣ
	public List<Grade> getGradesbyStudentId(int studentId);
	
	//��ȡ�γ̱�Ŷ�Ӧ��ѧ����Ϣ
	public List<Grade> getGradesbyCourseId(int courseId);

	//��������ѧ����Ϣ
	public boolean InputStudentScore(List<Grade> grades1);

	//���ݿγ̱�Ż�ÿγ̵�ƽ���ֵ���Ϣ
	public GradeCourseInfo getCourseInfo(int courseId);

}
