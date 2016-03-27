package com.cisc181.core;

import java.util.UUID;

public class Section {

	private UUID CourseID;
	private UUID SemesterID;
	private UUID SectionID;
	private int RoomID;
	
	public Section(int courseID, int semesterID, UUID randomUUID) {
	
	}
	public UUID getCourseID(){
		return this.CourseID;
	}
	public void SetCourseID(UUID courseID){
		this.CourseID = courseID;
	}
	public void SetSemesterId(UUID semesterUUID){
		this.SemesterID = semesterUUID;
	}
	public UUID SemesterID(){
		return this.SemesterID;
	}
	
	public void SetSectionId(UUID sectionID){
		this.SectionID = sectionID;
	}
	public  UUID getSectionID(){
		return this.SectionID;
	}
	
	public void setRoomID(int roomID){
		this.RoomID = roomID;
	}
	public int setRoomID(){
		return this.RoomID;
	}
	
	
}