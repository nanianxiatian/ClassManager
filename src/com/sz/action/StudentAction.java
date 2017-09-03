package com.sz.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionSupport;
import com.sz.model.Student;
import com.sz.model.Tclass;
import com.sz.service.StudentManager;
import com.sz.service.impl.StudentManagerImpl;
@Component("studentAction")
@Scope("prototype")
public class StudentAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Student student;
	private Tclass tclass;
	private List<Student> students;
	private StudentManager studentManager;
	private int studentId;
	
	public String studentLogin(){
		System.out.println("studentLogin±»µ÷ÓÃ");
		String flag ="";
		if(studentManager.existStudent(student))
		{
			flag = "success";
		}else
		{
			flag = "fail"; 
		}
		
		return flag;
	}

	public String studentLoad(){
		
		students=studentManager.getAllStudents();
		
		return "success";
	}
	
	public String studentAdd(){
		String flag="";
		if(studentManager.addStudent(student))
		{
			flag = "success";
		}
		else
		{
			flag = "fail";
		}
		return flag;
	}
	
	public String studentDelete()
	{
		String flag="";
		if(studentManager.deleteStudentById(studentId)){
			flag = "success";
		}
		else
		{
			flag = "fail";
		}
		return flag;
	}
	
	public String studentUpdateload()
	{
		student = studentManager.getStudentById(studentId);
		return "success";
	}
	
	public String studentUpdate()
	{
		String flag="";
		
		if(studentManager.updateStudent(student))
		{
			flag="success";
		}
		else
		{
			flag="fail";
		}
		return flag;
	}
	
	public Student getStudent() {
		return student;
	}


	public void setStudent(Student student) {
		this.student = student;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public Tclass getTclass() {
		return tclass;
	}

	public void setTclass(Tclass tclass) {
		this.tclass = tclass;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public StudentManager getStudentManager() {
		return studentManager;
	}
	@Resource
	public void setStudentManager(StudentManager studentManager) {
		this.studentManager = studentManager;
	}


}
