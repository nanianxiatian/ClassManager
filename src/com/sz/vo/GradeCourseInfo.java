package com.sz.vo;

import org.springframework.stereotype.Component;

@Component("gradeCourseInfo")
public class GradeCourseInfo {
	private int courseId;
	private String courseName;
	private double MaxNumber;
	private double MinNumber;
	private double AveNumber;
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public double getMaxNumber() {
		return MaxNumber;
	}
	public void setMaxNumber(double maxNumber) {
		MaxNumber = maxNumber;
	}
	public double getMinNumber() {
		return MinNumber;
	}
	public void setMinNumber(double minNumber) {
		MinNumber = minNumber;
	}
	public double getAveNumber() {
		return AveNumber;
	}
	public void setAveNumber(double aveNumber) {
		AveNumber = aveNumber;
	}
}
