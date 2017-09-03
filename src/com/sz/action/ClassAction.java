package com.sz.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.inject.Scoped;
import com.sz.model.Tclass;
import com.sz.service.ClassManager;
import com.sz.service.impl.ClassManagerImpl;

@Component("classAction")
@Scope("prototype")
public class ClassAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<Tclass> tclasses;
	
	private Tclass tclass;
	private ClassManager classManager;
	private String classId;
	
	public String classLoad(){
		tclasses = classManager.getClasses();
		return "success";
	}

	public String classAdd(){
		String flag="";
		if(classManager.AddClass(tclass))
		{
			flag="success";
		}
		else{
			flag="fail";
		}
		return flag;
	}
	
	public String classDelete()
	{
		System.out.println(classId);
		String flag="";
		if(classManager.DeleteClass(classId))
		{
			flag="success";
		}
		else
		{
			flag="fail";
		}
		
		return flag;
	}

	public String classUpdateload()
	{
		tclass = classManager.getClassById(classId);
		return "success";
	}
	
	
	public String classUpdate()
	{
		String flag="";
		if(classManager.UpdateClass(tclass))
		{
			flag="success";
		}
		else{
			flag="fail";
		}
		
		return flag;
	}
	
	
	
	public List<Tclass> getTclasses() {
		return tclasses;
	}


	public void setTclasses(List<Tclass> tclasses) {
		this.tclasses = tclasses;
	}

	public Tclass getTclass() {
		return tclass;
	}

	public void setTclass(Tclass tclass) {
		this.tclass = tclass;
	}

	public String getClassId() {
		return classId;
	}

	public void setClassId(String classId) {
		this.classId = classId;
	}

	public ClassManager getClassManager() {
		return classManager;
	}
	@Resource
	public void setClassManager(ClassManager classManager) {
		this.classManager = classManager;
	}


}
