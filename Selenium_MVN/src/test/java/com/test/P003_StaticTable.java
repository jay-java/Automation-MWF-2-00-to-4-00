package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import driverConnection.DriverConnection;

public class P003_StaticTable {
	public static void main(String[] args) {
		String url = "https://www.tutorialspoint.com/selenium/practice/webtables.php";

		WebDriver driver = DriverConnection.getDriver(url);

		WebElement email = driver
				.findElement(By.xpath("//div[@class='container']/div/div[2]/form/div[2]/table/tbody/tr[3]/td[4]"));
		System.out.println(email.getText());
	}
}
