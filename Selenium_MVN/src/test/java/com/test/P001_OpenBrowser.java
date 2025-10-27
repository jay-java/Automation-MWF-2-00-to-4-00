package com.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class P001_OpenBrowser {
	public static void main(String[] args) throws InterruptedException {
		// 1.for chrome
		String url = "https://www.facebook.com/";
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement emailEle = driver.findElement(By.name("email"));
		emailEle.sendKeys("selenium@gmail.com");
		
		WebElement passEle = driver.findElement(By.name("pass"));
		passEle.sendKeys("seelnium@123");
		
		WebElement loginBTN = driver.findElement(By.name("login"));
		loginBTN.click();
		
//		Thread.sleep(3000);
//		driver.close();

		// 2.firefox
//		String url1 = "https://www.facebook.com/";
//		System.setProperty("webdriver.gecko.driver",
//				"C:\\Users\\Admin\\Downloads\\geckodriver-v0.36.0-win64(1)\\geckodriver.exe");
//		WebDriver driver1 = new FirefoxDriver();
//		driver1.manage().window().maximize();
//		driver1.get(url1);
//		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		Thread.sleep(3000);
//		driver1.close();

		// 3.edge driver
//		String url2 = "https://www.facebook.com/";
//		System.setProperty("webdriver.edge.driver", "C:\\Users\\Admin\\Downloads\\edgedriver_win64\\msedgedriver.exe");
//		WebDriver driver2 = new EdgeDriver();
//		driver2.manage().window().maximize();
//
//		driver2.get(url2);
//		driver2.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		Thread.sleep(3000);
//		driver2.close();
	}
}
