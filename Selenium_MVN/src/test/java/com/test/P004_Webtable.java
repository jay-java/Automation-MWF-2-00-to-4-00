package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import driverConnection.DriverConnection;

public class P004_Webtable {
	public static void main(String[] args) {
		String url = "https://cosmocode.io/automation-practice-webtable/";
		WebDriver driver = DriverConnection.getDriver(url);

		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='countries']/tbody/tr"));
		System.out.println(rows.size());

		String text = "Burundi Franc";

		for (int i = 1; i <= rows.size(); i++) {
			List<WebElement> cols = driver.findElements(By.xpath("//table[@id='countries']/tbody/tr[" + i + "]/td"));
			for (int j = 2; j <= cols.size(); j++) {
				List<WebElement> data = driver
						.findElements(By.xpath("//table[@id='countries']/tbody/tr[" + i + "]/td[" + j + "]"));
				for (WebElement d : data) {
					System.out.print(d.getText() + " ");
					if (d.getText().equals(text)) {
						System.out.println(d.getText());
					}
				}
			}
			System.out.println();
		}
	}
}
