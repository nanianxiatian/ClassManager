package com.sz.action;

import java.util.List;

import javax.annotation.Resource;

import org.apache.struts2.json.annotations.JSON;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionSupport;
import com.sz.model.Tclass;
import com.sz.service.ClassManager;

@Component("classLoadAction")
@Scope("prototype")
public class ClassLoadAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<Tclass> tclasses1;
	private ClassManager classManager;
	//获取学生添加时班级下拉框中的值
	public String loadtclasses()
	{
		tclasses1 = classManager.getStudentClasses();
		return "success";
	}

	public List<Tclass> getTclasses1() {
		return tclasses1;
	}
	public void setTclasses1(List<Tclass> tclasses1) {
		this.tclasses1 = tclasses1;
	}
	
	@JSON(serialize=false)
	public ClassManager getClassManager() {
		return classManager;
	}
	@Resource
	public void setClassManager(ClassManager classManager) {
		this.classManager = classManager;
	}
}
