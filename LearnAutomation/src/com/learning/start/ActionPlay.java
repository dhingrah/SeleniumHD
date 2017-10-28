package com.learning.start;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionPlay {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Dhingra_java\\LearnAutomation\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().fullscreen();
		WebElement element=driver.findElement(By.id("abc"));
		Actions action= new Actions(driver);
		action.keyDown(Keys.ARROW_DOWN);
	
	}

}
