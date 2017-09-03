package com.sz.model;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Tclass entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "tclass", catalog = "classmanager")
public class Tclass implements java.io.Serializable {

	// Fields

	private Integer classId;
	private String className;
	private Set<Student> students = new HashSet<Student>(0);

	// Constructors

	/** default constructor */
	public Tclass() {
	}

	/** minimal constructor */
	public Tclass(Integer classId) {
		this.classId = classId;
	}

	/** full constructor */
	public Tclass(Integer classId, String className, Set<Student> students) {
		this.classId = classId;
		this.className = className;
		this.students = students;
	}

	// Property accessors
	@Id
	@Column(name = "classId", unique = true, nullable = false)
	public Integer getClassId() {
		return this.classId;
	}

	public void setClassId(Integer classId) {
		this.classId = classId;
	}

	@Column(name = "className", length = 30)
	public String getClassName() {
		return this.className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "tclass")
	public Set<Student> getStudents() {
		return this.students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}

}