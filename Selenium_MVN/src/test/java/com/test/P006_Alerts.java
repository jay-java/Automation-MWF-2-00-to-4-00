package com.test;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import driverConnection.DriverConnection;

public class P006_Alerts {
	public static void main(String[] args) throws InterruptedException {
		String url = "https://demoqa.com/alerts";
		WebDriver driver = DriverConnection.getDriver(url);
		
		//1.Alert
//		WebElement btn1 = driver.findElement(By.id("alertButton"));
//		btn1.click();	
//		Alert alert = driver.switchTo().alert();
//		Thread.sleep(3000);
//		alert.accept();
		
		//2.Alert
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//		WebElement btn = driver.findElement(By.id("timerAlertButton"));
//		btn.click();
//		wait.until(ExpectedConditions.alertIsPresent());
//		Alert alert= driver.switchTo().alert();
//		Thread.sleep(3000);
//		alert.accept();
		
		
		//3.Alert
//		WebElement btn1 = driver.findElement(By.id("confirmButton"));
//		btn1.click();	
//		Alert alert = driver.switchTo().alert();
//		Thread.sleep(3000);
//		alert.dismiss();
		
		//4.Alert
		WebElement btn1 = driver.findElement(By.id("promtButton"));
		btn1.click();	
		Alert alert = driver.switchTo().alert();
		Thread.sleep(3000);
		alert.sendKeys("selenium automation");
		alert.accept();
	}
}
