package com.learning.start;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class StartJenkins {

	@Test
	public void testjenkins(){
		System.out.println("Welcome to jenkins");
		
		System.setProperty("webdriver.chrome.driver","E:\\Dhingra_java\\LearnAutomation\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		System.out.println(driver.getTitle());
		
		
	}
}
