package com.learning.start;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class TestFirefoxChromeIE {

	public static void main(String[] args) {
		//String path =System.getProperty("user.dir")+"//Drivers//geckodriver.exe";
		//System.setProperty("webdriver.gecko.driver","E:\\Dhingra_java\\LearnAutomation\\Drivers\\geckodriver.exe");
		//System.setProperty("webdriver.chrome.driver","E:\\Dhingra_java\\LearnAutomation\\Drivers\\chromedriver.exe");
		System.setProperty("webdriver.ie.driver","E:\\Dhingra_java\\LearnAutomation\\Drivers\\IEDriverServer.exe");
		//WebDriver driver= new FirefoxDriver();
		//WebDriver driver= new ChromeDriver();
		WebDriver driver= new InternetExplorerDriver();
		driver.get("http://www.facebook.com");
        System.out.println("Application title is ============="+driver.getTitle());
        driver.quit();
		

	}

}
