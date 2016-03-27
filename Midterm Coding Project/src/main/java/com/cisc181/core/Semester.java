package com.cisc181.core;
import java.util.Date;
import java.util.UUID;


public class Semester {
	
	private UUID SemesterID;
	private Date start;
	private Date end;


	public UUID getSemesterID() {
		return this.SemesterID;
	}
	public void setSemesterID(UUID semesterID) {
		this.SemesterID = semesterID;
	}

	public void SetStartDate(Date start){
		this.start = start;
	}
	public Date StartDate(){
		return this.start;
	}
	
	public void SetEndDate(Date end){
		this.end = end;
	}
	public Date EndDate(){
		return this.end;
	}
	public Semester(UUID randomUUID, Date start, Date end) {
		
	}
}
