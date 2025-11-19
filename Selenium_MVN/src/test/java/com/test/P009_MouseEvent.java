package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import driverConnection.DriverConnection;

public class P009_MouseEvent {
	public static void main(String[] args) throws InterruptedException {
		String url = "https://www.amazon.in/";
		WebDriver driver  = DriverConnection.getDriver(url);
		
		WebElement fresh= driver.findElement(By.linkText("Fresh"));
		WebElement MXPlayer= driver.findElement(By.linkText("MX Player"));
		WebElement sell= driver.findElement(By.linkText("Sell"));
		WebElement bs = driver.findElement(By.linkText("Bestsellers"));
		
		
		Actions action = new Actions(driver);
		action.moveToElement(fresh).build().perform();
		Thread.sleep(3000);
		action.moveToElement(MXPlayer).build().perform();
		Thread.sleep(3000);
		action.moveToElement(sell).build().perform();
		Thread.sleep(3000);
		action.moveToElement(bs).build().perform();
		
	}
}
