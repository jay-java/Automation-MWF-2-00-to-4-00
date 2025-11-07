package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import driverConnection.DriverConnection;

public class P005_WebTable {
	public static void main(String[] args) {
		String url = "https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html#main";
		WebDriver driver = DriverConnection.getDriver(url);

		List<WebElement> thead = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[1]/th/span"));
		for (WebElement e : thead) {
			System.out.print(e.getText() + " ");
		}
		System.out.println();
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
		for (int i = 2; i <= rows.size(); i++) {
			List<WebElement> cols = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[" + i + "]/td"));
			for (int j = 1; j <= cols.size(); j++) {
				List<WebElement> data = driver
						.findElements(By.xpath("//table[@id='customers']/tbody/tr[" + i + "]/td[" + j + "]/span"));
				for (WebElement e : data) {
					System.out.print(e.getText() + " ");
				}
			}
			System.out.println();
		}
	}
}
