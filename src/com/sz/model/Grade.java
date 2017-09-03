package com.sz.model;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Grade entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "grade", catalog = "classmanager")
public class Grade implements java.io.Serializable {

	// Fields

	private GradeId id;
	private Course course;
	private Student student;
	private Double gradeNumber;

	// Constructors

	/** default constructor */
	public Grade() {
	}

	/** minimal constructor */
	public Grade(GradeId id, Course course, Student student) {
		this.id = id;
		this.course = course;
		this.student = student;
	}

	/** full constructor */
	public Grade(GradeId id, Course course, Student student, Double gradeNumber) {
		this.id = id;
		this.course = course;
		this.student = student;
		this.gradeNumber = gradeNumber;
	}

	// Property accessors
	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "studentId", column = @Column(name = "studentId", nullable = false)),
			@AttributeOverride(name = "courseId", column = @Column(name = "courseId", nullable = false)) })
	public GradeId getId() {
		return this.id;
	}

	public void setId(GradeId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "courseId", nullable = false, insertable = false, updatable = false)
	public Course getCourse() {
		return this.course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "studentId", nullable = false, insertable = false, updatable = false)
	public Student getStudent() {
		return this.student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Column(name = "gradeNumber", precision = 22, scale = 0)
	public Double getGradeNumber() {
		return this.gradeNumber;
	}

	public void setGradeNumber(Double gradeNumber) {
		this.gradeNumber = gradeNumber;
	}

}