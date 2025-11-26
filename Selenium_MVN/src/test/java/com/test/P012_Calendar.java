package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import driverConnection.DriverConnection;

public class P012_Calendar {
	public static void main(String[] args) {
		String url = "https://www.globalsqa.com/demo-site/datepicker/";
		WebDriver driver = DriverConnection.getDriver(url);
		WebElement iframe = driver.findElement(By.xpath("//*[@id=\"post-2661\"]/div[2]/div/div/div[1]/p/iframe"));
		driver.switchTo().frame(iframe);
		driver.findElement(By.id("datepicker")).click();
		String myDay = "18";
		String myMonth = "July";
		String myYear = "2015";
		WebElement currentYear = driver.findElement(By.className("ui-datepicker-year"));
		System.out.println(currentYear.getText());
		int y1 = Integer.parseInt(myYear);
		int y2 = Integer.parseInt(currentYear.getText());
		while (!myYear.equals(driver.findElement(By.className("ui-datepicker-year")).getText())) {
			if (y1 > y2) {
				driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span")).click();
			} else {
				driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[1]/span")).click();
			}
		}
		while (!myMonth.equals(driver.findElement(By.className("ui-datepicker-month")).getText())) {
			if (y1 > y2) {
				driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span")).click();
			} else {
				driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[1]/span")).click();
			}
		}
		List<WebElement> allDates = driver
				.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td/a"));
		for (WebElement ele : allDates) {
			if (myDay.equals(ele.getText())) {
				ele.click();
			}
		}
	}
}
