package com.sz.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.sz.dao.ClassDao;
import com.sz.dao.impl.ClassDaoImpl;
import com.sz.model.Tclass;
import com.sz.service.ClassManager;

@Component("classManager")
public class ClassManagerImpl implements ClassManager {

	private ClassDao classDao;
	
	@Override
	public List<Tclass> getClasses() {
		// TODO Auto-generated method stub
		return classDao.getAllClass();
	}

	@Override
	public boolean AddClass(Tclass tclass) {
		
		return classDao.saveClass(tclass);
	}

	@Override
	public boolean DeleteClass(String classId) {
		
		return classDao.deleteClass(classId);
	}

	@Override
	public Tclass getClassById(String classId) {
		
		return classDao.getClassById(classId);
	}

	@Override
	public boolean UpdateClass(Tclass tclass) {

		return classDao.UpdateClass(tclass);
	}

	@Override
	public List<Tclass> getStudentClasses() {
		
		return classDao.getAllStudentClasses();
	}

	public ClassDao getClassDao() {
		return classDao;
	}
	@Resource
	public void setClassDao(ClassDao classDao) {
		this.classDao = classDao;
	}
	
	

}
