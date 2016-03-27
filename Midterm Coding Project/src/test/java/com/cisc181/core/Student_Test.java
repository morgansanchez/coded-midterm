package com.cisc181.core;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;
import static org.junit.Assert.*;


import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;
public class Student_Test {

	
	static ArrayList<Course> courseList = new ArrayList<Course>();
	static ArrayList<Semester> semesterList = new ArrayList<Semester>();
	static ArrayList<Section> sectionList = new ArrayList<Section>();
	static ArrayList<Student> studentList = new ArrayList<Student>();
	

	
	@SuppressWarnings("deprecation")
	@BeforeClass
	
	
	public void test() {
		Course CHEM = new Course(UUID.randomUUID(), "CHEM", 100, eMajor.CHEM);
		Course COMPSCI = new Course(UUID.randomUUID(), "CISC", 200, eMajor.COMPSCI);
		Course PHYSICS = new Course(UUID.randomUUID(), "PHYS", 150, eMajor.PHYSICS);
		courseList.add(CHEM);
		courseList.add(COMPSCI);
		courseList.add(PHYSICS);
	
	Semester fall = new Semester(UUID.randomUUID(), new Date(11, 9, 4), new Date(23, 1, 90));
	Semester spring = new Semester(UUID.randomUUID(), new Date(6, 2, 34), new Date(4, 1, 2));
	semesterList.add(fall);
	semesterList.add(spring);
	

	
	Student student1 = new Student("Morgan", "Gabrielle", "Sanchez",new Date(1, 2, 33), eMajor.CHEM, "55 Alpine Rd",
			"(000)-000-0000", "msanchez@udel.edu");
	Student student2 = new Student("Renee", "Elizabeth", "Staub", new Date(1, 2, 33), eMajor.CHEM, "55 Alpine Rd",
			"(000)-000-0000", "rstaub@udel.edu");
	Student student3 = new Student("Rachel", "Doug", "Mary", new Date (1, 2, 33), eMajor.CHEM, "55 Alpine Rd",
			"(000)-000-0000", "rachel@udel.edu");
	Student student4 = new Student("Raymond", "Rodger", "Sanchez", new Date(1, 2, 33), eMajor.CHEM, "55 Alpine Rd",
			"(000)-000-0000", "rsanchez@udel.edu");
	Student student5 = new Student("Nancy", "Nancy", "Sanchez", new Date(1, 2, 33), eMajor.CHEM, "55 Alpine Rd",
			"(000)-000-0000", "nsanchez@udel.edu");
	Student student6 = new Student("Kristen", "Liz", "Frishera", new Date(1, 2, 33), eMajor.CHEM, "55 Alpine Rd",
			"(000)-000-0000", "kfrishera@udel.edu");
	Student student7 = new Student("Thomas", "Ryan", "Clark", new Date(1, 2, 33), eMajor.CHEM, "55 Alpine Rd",
			"(000)-000-0000", "thomasc@udel.edu");
	Student student8 = new Student("Godfry", "Julian", "Jake", new Date(1, 2, 33), eMajor.CHEM, "55 Alpine Rd",
			"(000)-000-0000", "jjulian@udel.edu");
	Student student9 = new Student("Tara", "Lexi", "Nancy", new Date(1, 2, 33), eMajor.CHEM, "55 Alpine Rd",
			"(000)-000-0000", "tara@udel.edu");
	Student student10 = new Student("Barb", "Mary", "Tiller", new Date(1, 2, 33), eMajor.CHEM, "55 Alpine Rd",
			"(000)-000-0000", "Barb@udel.edu");

	studentList.add(student1);
	studentList.add(student2);
	studentList.add(student3);
	studentList.add(student4);
	studentList.add(student5);
	studentList.add(student6);
	studentList.add(student7);
	studentList.add(student8);
	studentList.add(student9);
	studentList.add(student10);
	 
	
	Course chemistry = new Course(UUID.randomUUID(),"CHEM", 90, eMajor.CHEM);
	Course compsci = new Course(UUID.randomUUID(), "COMPSCI", 90, eMajor.COMPSCI);
	Course physics = new Course(UUID.randomUUID(), "Buisness", 90, eMajor.PHYSICS);
	courseList.add(chemistry);
	courseList.add(compsci);
	courseList.add(physics);
	} 

	@Test
	public void studentTest() {
		assertEquals(studentList[0] = 2.0);
		assertEquals(studentList[1] = 2.0);
		assertEquals(studentList[2] = 2.0);
		assertEquals(studentList[3] = 2.0);
		assertEquals(studentList[4] = 2.0);
		assertEquals(studentList[5] = 2.0);
		assertEquals(studentList[6] = 2.0);
		assertEquals(studentList[7] = 2.0);
		assertEquals(studentList[8] = 2.0);
		assertEquals(studentList[9] = 2.0);


	}
	@Test
	public void testChangeMajor() {
		assertTrue(studentList.get(0).getMajor() == eMajor.CHEM);
		studentList.get(0).setMajor(eMajor.BUSINESS);
		assertTrue(studentList.get(0).getMajor() == eMajor.BUSINESS);
	}
}



