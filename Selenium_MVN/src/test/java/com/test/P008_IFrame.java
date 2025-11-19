package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import driverConnection.DriverConnection;

public class P008_IFrame {
	public static void main(String[] args) {
		String url = "https://demoqa.com/frames";
		WebDriver driver = DriverConnection.getDriver(url);

		WebElement iframe1 = driver.findElement(By.id("frame1"));
		driver.switchTo().frame(iframe1);
		
		WebElement text1 = driver.findElement(By.id("sampleHeading"));
		System.out.println(text1.getText());
		
		driver.switchTo().window(driver.getWindowHandle());
		
		WebElement iframe2 = driver.findElement(By.id("frame2"));
		driver.switchTo().frame(iframe2);
		
		WebElement text2 = driver.findElement(By.id("sampleHeading"));
		System.out.println(text2.getText());
		
	}
}
