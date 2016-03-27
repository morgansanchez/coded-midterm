package com.cisc181.core;
import java.util.UUID;

public class Enrollment {

	private UUID SectionID;
	private UUID SemesterID;
	private UUID EnrollmentID;
	private double Grade;

	private Enrollment() {
	}

	public void setEnrollmentID(UUID StudentID, UUID sectionID, UUID EnrollmentID){
		this.setSemUUID(EnrollmentID);
	}

	public void SetSectionId(UUID sectionID){
		this.SectionID = sectionID;
	}
	public UUID SectionID(){
		return this.SectionID;
	}

	public UUID getSemUUID() {
		return SemesterID;
	}
	public void setSemUUID(UUID semesterID) {
		SemesterID = semesterID;
	}

	public double getGrade() {
		return Grade;
	}
	public void setGrade(double grade) {
		Grade = grade;
	}

	public UUID getEnrUUID() {
		return EnrollmentID;
	}




}
