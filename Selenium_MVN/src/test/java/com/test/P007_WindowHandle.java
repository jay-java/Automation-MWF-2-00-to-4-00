package com.test;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import driverConnection.DriverConnection;

public class P007_WindowHandle {
	public static void main(String[] args) {
		String url = "https://www.demo.guru99.com/popup.php";
		WebDriver driver = DriverConnection.getDriver(url);

		WebElement link = driver.findElement(By.linkText("Click Here"));
		link.click();

		String mainWin = driver.getWindowHandle();
		System.out.println(mainWin);

		Set<String> allWin = driver.getWindowHandles();
		for (String s : allWin) {
			System.out.println(s);
			if (!s.equals(mainWin)) {
				driver.switchTo().window(s);

				WebElement emailEle = driver.findElement(By.name("emailid"));
				emailEle.sendKeys("selenium@gmail.com");

				driver.findElement(By.name("btnLogin")).click();

			}
		}
	}
}
