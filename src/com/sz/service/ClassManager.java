package com.sz.service;

import java.util.List;

import com.sz.model.Tclass;

public interface ClassManager {
	//������еİ༶��Ϣ
	public List<Tclass> getClasses();
	
	//��Ӱ༶��Ϣ
	public boolean AddClass(Tclass tclass);
	
	//ɾ���༶��Ϣ
	public boolean DeleteClass(String classId);

	//���id����Ӧ�İ༶��Ϣ
	public Tclass getClassById(String classId);

	//�޸İ༶��Ϣ
	public boolean UpdateClass(Tclass tclass);

	//���ѧ�����ʱ�İ༶��Ϣ
	public List<Tclass> getStudentClasses();
	
}
