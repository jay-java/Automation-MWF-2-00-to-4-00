package com.test;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import driverConnection.DriverConnection;

public class P005_AnnotationPrac {

	static WebDriver driver = null;

	@BeforeClass
	public static void openBrowser() {
		String url = "https://www.facebook.com/";
		driver = DriverConnection.getDriver(url);
	}

	@Test
	public void titleCheck() {
		String expectedTitle = "Facebook";
		String actualTitle = driver.getTitle();
		assertEquals(expectedTitle, actualTitle);
	}

//	@Test
//	public void test1() {
//		driver.findElement(By.name("email")).sendKeys("selenium@gmail.com");
//		driver.findElement(By.name("pass")).sendKeys("selenium@123");
//		driver.findElement(By.name("login")).click();
//	}

	@AfterClass
	public static void tearDown() {
		driver.quit();
	}
}
