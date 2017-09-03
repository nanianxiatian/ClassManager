package com.sz.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.sz.dao.ClassDao;
import com.sz.model.Tclass;
import com.sz.util.HibernateSessionFactory;

@Component("classDao")
public class ClassDaoImpl implements ClassDao {

	private HibernateTemplate hibernateTemplate;
	@Override
	public List<Tclass> getAllClass() {
		List<Tclass> tclasses = hibernateTemplate.find("from Tclass");
		return tclasses;
	}

	@Override
	public boolean saveClass(Tclass tclass) {
		
		try {
			hibernateTemplate.save(tclass);
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		return true;
		
	}

	@Override
	public boolean deleteClass(String classId) {
		
		try {
			hibernateTemplate.delete(hibernateTemplate.get(Tclass.class, Integer.parseInt(classId)));
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
		
		
	}

	@Override
	public Tclass getClassById(String classId) {
		Tclass tclass = new Tclass();
		try {
			tclass = (Tclass) hibernateTemplate.get(Tclass.class, Integer.parseInt(classId));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return tclass;
	}

	@Override
	public boolean UpdateClass(Tclass tclass) {
		
		try {
			hibernateTemplate.update(tclass);
		} catch (Exception e) {
			e.printStackTrace();
			return  false;
			// TODO: handle exception
		}
		return true;
	}

	@Override
	public List<Tclass> getAllStudentClasses() {
		
		List<Tclass> tclasses = hibernateTemplate.find("from Tclass");
		return tclasses;
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
	@Resource
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

}
