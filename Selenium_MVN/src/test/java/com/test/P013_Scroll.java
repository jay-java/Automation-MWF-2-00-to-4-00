package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import driverConnection.DriverConnection;

public class P013_Scroll {
	public static void main(String[] args) {
		String url = "https://demoqa.com/automation-practice-form";
		WebDriver driver = DriverConnection.getDriver(url);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		// scroll by pixels

//		js.executeScript("window.scrollBy(0, 350)", "");

		
		//scroll by ele
//		WebElement address = driver.findElement(By.id("currentAddress"));
//		js.executeScript("arguments[0].scrollIntoView();", address);
		
		//scroll by height
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		
	}
}
