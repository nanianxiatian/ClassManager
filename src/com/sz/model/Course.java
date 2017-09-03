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
 * Course entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "course", catalog = "classmanager")
public class Course implements java.io.Serializable {

	// Fields

	private Integer courseId;
	private String courseName;
	private String courseProperty;
	private Double courseScore;
	private Set<Grade> grades = new HashSet<Grade>(0);

	// Constructors

	/** default constructor */
	public Course() {
	}

	/** minimal constructor */
	public Course(Integer courseId) {
		this.courseId = courseId;
	}

	/** full constructor */
	public Course(Integer courseId, String courseName, String courseProperty,
			Double courseScore, Set<Grade> grades) {
		this.courseId = courseId;
		this.courseName = courseName;
		this.courseProperty = courseProperty;
		this.courseScore = courseScore;
		this.grades = grades;
	}

	// Property accessors
	@Id
	@Column(name = "courseId", unique = true, nullable = false)
	public Integer getCourseId() {
		return this.courseId;
	}

	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}

	@Column(name = "courseName", length = 30)
	public String getCourseName() {
		return this.courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	@Column(name = "courseProperty", length = 30)
	public String getCourseProperty() {
		return this.courseProperty;
	}

	public void setCourseProperty(String courseProperty) {
		this.courseProperty = courseProperty;
	}

	@Column(name = "courseScore", precision = 22, scale = 0)
	public Double getCourseScore() {
		return this.courseScore;
	}

	public void setCourseScore(Double courseScore) {
		this.courseScore = courseScore;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "course")
	public Set<Grade> getGrades() {
		return this.grades;
	}

	public void setGrades(Set<Grade> grades) {
		this.grades = grades;
	}

}