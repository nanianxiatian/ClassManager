package com.sz.dao;

import java.util.List;

import com.sz.model.Tclass;

public interface ClassDao {
	//��ȡ���а༶��Ϣ�б�
	public List<Tclass> getAllClass();
	//���༶��Ϣ���б���
	public boolean saveClass(Tclass tclass);
	//ɾ���༶��Ϣ
	public boolean deleteClass(String classId);
	
	//�����Ӧid�İ༶��Ϣ
	public Tclass getClassById(String classId);
	
	//�޸İ༶��Ϣ
	public boolean UpdateClass(Tclass tclass);
	
	//���ѧ�����ʱ�༶��Ϣ
	public List<Tclass> getAllStudentClasses();
	
}
