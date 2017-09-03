package com.sz.service;

import java.util.List;

import com.sz.model.Tclass;

public interface ClassManager {
	//获得所有的班级信息
	public List<Tclass> getClasses();
	
	//添加班级信息
	public boolean AddClass(Tclass tclass);
	
	//删除班级信息
	public boolean DeleteClass(String classId);

	//查出id所对应的班级信息
	public Tclass getClassById(String classId);

	//修改班级信息
	public boolean UpdateClass(Tclass tclass);

	//获得学生添加时的班级信息
	public List<Tclass> getStudentClasses();
	
}
