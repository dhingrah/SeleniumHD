package com.learning.start;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Starting {
	@BeforeMethod
	public void beforetest(){
		System.out.println("before test starts");
	}
       @Test
	public void show(){
		System.out.println("In test");
		assertEquals(12, 12);
	}
       
       @AfterMethod
       public void showresult(){
    	   System.out.println("test result");
       }
}
