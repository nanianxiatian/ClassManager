package com.sz.dao;

import java.util.List;

import com.sz.model.Tclass;

public interface ClassDao {
	//获取所有班级信息列表
	public List<Tclass> getAllClass();
	//将班级信息进行保存
	public boolean saveClass(Tclass tclass);
	//删除班级信息
	public boolean deleteClass(String classId);
	
	//查出相应id的班级信息
	public Tclass getClassById(String classId);
	
	//修改班级信息
	public boolean UpdateClass(Tclass tclass);
	
	//获得学生添加时班级信息
	public List<Tclass> getAllStudentClasses();
	
}
