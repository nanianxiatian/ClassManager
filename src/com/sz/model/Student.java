package com.sz.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Student entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "student", catalog = "classmanager")
public class Student implements java.io.Serializable {

	// Fields

	private Integer studentId;
	private Tclass tclass;
	private String studentName;
	private String studentSex;
	private Date studentBirthday;
	private String studentPass;
	private String studentPhone;
	private String studentAddress;
	private Set<Grade> grades = new HashSet<Grade>(0);

	// Constructors

	/** default constructor */
	public Student() {
	}

	/** minimal constructor */
	public Student(Integer studentId, Tclass tclass) {
		this.studentId = studentId;
		this.tclass = tclass;
	}

	/** full constructor */
	public Student(Integer studentId, Tclass tclass, String studentName,
			String studentSex, Date studentBirthday, String studentPass,
			String studentPhone, String studentAddress, Set<Grade> grades) {
		this.studentId = studentId;
		this.tclass = tclass;
		this.studentName = studentName;
		this.studentSex = studentSex;
		this.studentBirthday = studentBirthday;
		this.studentPass = studentPass;
		this.studentPhone = studentPhone;
		this.studentAddress = studentAddress;
		this.grades = grades;
	}

	// Property accessors
	@Id
	@Column(name = "studentId", unique = true, nullable = false)
	public Integer getStudentId() {
		return this.studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "classId", nullable = false)
	public Tclass getTclass() {
		return this.tclass;
	}

	public void setTclass(Tclass tclass) {
		this.tclass = tclass;
	}

	@Column(name = "studentName", length = 30)
	public String getStudentName() {
		return this.studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	@Column(name = "studentSex", length = 10)
	public String getStudentSex() {
		return this.studentSex;
	}

	public void setStudentSex(String studentSex) {
		this.studentSex = studentSex;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "studentBirthday", length = 10)
	public Date getStudentBirthday() {
		return this.studentBirthday;
	}

	public void setStudentBirthday(Date studentBirthday) {
		this.studentBirthday = studentBirthday;
	}

	@Column(name = "studentPass", length = 30)
	public String getStudentPass() {
		return this.studentPass;
	}

	public void setStudentPass(String studentPass) {
		this.studentPass = studentPass;
	}

	@Column(name = "studentPhone", length = 30)
	public String getStudentPhone() {
		return this.studentPhone;
	}

	public void setStudentPhone(String studentPhone) {
		this.studentPhone = studentPhone;
	}

	@Column(name = "studentAddress", length = 30)
	public String getStudentAddress() {
		return this.studentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "student")
	public Set<Grade> getGrades() {
		return this.grades;
	}

	public void setGrades(Set<Grade> grades) {
		this.grades = grades;
	}

}