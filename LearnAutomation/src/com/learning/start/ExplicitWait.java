package com.learning.start;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.google.common.base.Function;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ExplicitWait {

	public static void main(String...s){
		System.setProperty("webdriver.chrome.driver","E:\\Dhingra_java\\LearnAutomation\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//WebDriverWait wait = new WebDriverWait(driver,20);
		//WebElement element = wait
			//	.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='WebDriver']")));
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(60,TimeUnit.SECONDS).pollingEvery(2,TimeUnit.SECONDS).ignoring(NoSuchElementException.class);



				WebElement foo = wait.until(new Function<WebDriver, WebElement>() {

				 public WebElement apply(WebDriver driver) {

				 return driver.findElement(By.id("foo"));

                   }
				});
	}
	
}
