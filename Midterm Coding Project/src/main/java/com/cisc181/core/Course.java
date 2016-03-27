package com.cisc181.core;

import java.util.UUID;

import com.cisc181.eNums.eMajor;

public class Course {
	
	private int CourseUUID;
	private String CourseName;
	private int Grade;
	private eMajor Major;
	
	public Course(UUID randomUUID, String courseName, int grade, eMajor major) {
		//Getters and setters for attributes
	}
	public int getCourseID(){
		return this.CourseUUID;
	}
	public void SetCourseID(int courseUUID){
		this.CourseUUID = courseUUID;

	}
	public String CourseName(){
		return this.CourseName;
	}
	
	public void CourseName(String courseName){
		this.CourseName = courseName;
	}

	public int GradePoint(){
		return this.Grade;
	}
	public void SetGradePoint(int grade){
		this.Grade = grade;
	}

	public eMajor getMajor() {
		return Major;
	}
	public void setMajor(eMajor major) {
		this.Major = major;
	}
	
}
