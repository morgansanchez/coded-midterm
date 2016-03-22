package com.cisc181.core;

import static org.junit.Assert.*;


import java.util.ArrayList;
import java.util.Calendar;

import org.junit.BeforeClass;
import org.junit.Test;

package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;
public class Student_Test {


	@BeforeClass
	public void test() {
		Course CHEM = new Course(UUID.randomUUID(), "CHEM104", 100, eMajor.CHEM);
		Course COMPSCI = new Course(UUID.randomUUID(), "CISC181", 200, eMajor.COMPSCI);
		Course PHYSICS = new Course(UUID.randomUUID(), "PHYS207", 150, eMajor.PHYSICS);
		Courses.add(CHEM);
		Courses.add(COMPSCI);
		Courses.add(PHYSICS);
	}
	ArrayList<Course> Courses = new ArrayList<Course>();
	
	ArrayList<String> Semester = new ArrayList<String>();
	Semester.add("Fall");
	Semester.add("Spring");
	


	}

}






}