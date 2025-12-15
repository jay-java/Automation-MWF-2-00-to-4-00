package com.test;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import driverConnection.DriverConnection;

@RunWith(Parameterized.class)
public class P008_PararmetersPrac {

	String email;
	String password;

	public P008_PararmetersPrac(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}

	static WebDriver driver = null;

//	@BeforeClass
//	public static void openBrowser() {
//		String url = "https://www.facebook.com/";
//		driver = DriverConnection.getDriver(url);
//	}
	@Before
	public void openBrowser() {
		String url = "https://www.facebook.com/";
		driver = DriverConnection.getDriver(url);
	}

	@Test
	public void loginTest() throws InterruptedException {
		WebElement emailEle = driver.findElement(By.name("email"));
		emailEle.clear();
		emailEle.sendKeys(email);
		WebElement passEle = driver.findElement(By.name("pass"));
		passEle.clear();
		passEle.sendKeys(password);
//		Thread.sleep(3000);
	}

	@Parameters
	public static List<Object[]> getData() {

		Object o[][] = new Object[4][2];
		o[0][0] = "correct@gmail.com";
		o[0][1] = "correct@123";

		o[1][0] = "incorrect@gmail.com";
		o[1][1] = "correct@123";

		o[2][0] = "correct@gmail.com";
		o[2][1] = "incorrect@123";

		o[3][0] = "incorrect@gmail.com";
		o[3][1] = "incorrect@123";

		return Arrays.asList(o);
	}

}
