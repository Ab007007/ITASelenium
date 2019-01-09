package com.selenium.browser;

import org.openqa.selenium.WebDriver;

import com.selenium.utils.DriverUtils;

public class BrowserOperationsDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = DriverUtils.getMyDriver();
		driver.get("http://localhost:8080/login.do");
		driver.manage().window().maximize();
		
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(2000);
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(2000);
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(2000);
		driver.navigate().refresh();
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(2000);
		driver.manage().deleteAllCookies();
		
		Thread.sleep(2000);
		driver.close();
		
		
	}
}
