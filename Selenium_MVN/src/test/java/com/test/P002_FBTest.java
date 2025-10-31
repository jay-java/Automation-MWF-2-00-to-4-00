package com.test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import driverConnection.DriverConnection;

public class P002_FBTest {
	public static void main(String[] args) {
		String url = "https://www.facebook.com/";
		WebDriver driver = DriverConnection.getDriver(url);
		
		WebElement CA = driver.findElement(By.linkText("Create new account"));
		CA.click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement firstName = driver.findElement(By.name("firstname"));
		firstName.sendKeys("selenium");
		
		WebElement surName = driver.findElement(By.name("lastname"));
		surName.sendKeys("selenium");
		
		
		//02-02-2001
		//1. select by index
		WebElement days = driver.findElement(By.id("day"));
		Select day = new Select(days);
		day.selectByIndex(0);
		
		//2.select by value
		WebElement months = driver.findElement(By.id("month"));
		Select month = new Select(months);
		month.selectByValue("2");
		
		//3.select by visible text
		WebElement years = driver.findElement(By.id("year"));
		Select year = new Select(years);
		year.selectByVisibleText("2001");
		
		
		List<WebElement> gender = driver.findElements(By.id("sex"));
		System.out.println(gender.size());
		gender.get(1).click();
	}
}
