package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;

public class Staff_Test {

	@BeforeClass
	public static void setup() {
	}
	
	@Test
	public void test() throws PersonException {
		Staff StaffOne = new Staff("Morgan","Megan","Mary", new Date(), "87 Alpine Rd", "2345678900" , "morganmary@gmail.com",
				"Monday 11am", 3, 32, new Date(), eTitle.MR);
		Staff StaffTwo = new Staff("Alex","ALber","Andrew", new Date(), "87 Alpine Rd", "2345678900" , "andrew@gmail.com",
				"Tuesday 9pm", 5, 350700, new Date(), eTitle.MRS);
		Staff StaffThree = new Staff("Paul","Brad","Chad", new Date(), "87 Alpine Rd", "2345678900" , "paul@gmail.com",
				"Wednesday 2pm", 11, 90, new Date(), eTitle.MR);
		Staff StaffFour = new Staff("Kendall","Deborah","Kim", new Date(), "87 Alpine Rd", "2345678900" , "deborah@gmail.com",
				"Thursday 8pm", 2, 1224, new Date(), eTitle.MR);
		Staff StaffFive = new Staff("Janice","Lary","Joe", new Date(), "87 Alpine Rd", "2345678900" , "janice@gmail.com",
				"Friday 7pm", 0, 78000, new Date(), eTitle.MR);
	
		double PredictedAvgSalary = 86009.2;
		double avgSalary = (StaffOne.getSalary() + StaffTwo.getSalary() + StaffThree.getSalary() + StaffFour.getSalary() + StaffFive.getSalary())/5;
		
		assert(PredictedAvgSalary==avgSalary);
	}	

}

	