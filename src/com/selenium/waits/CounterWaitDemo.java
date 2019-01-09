package com.selenium.waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.selenium.utils.DriverUtils;

public class CounterWaitDemo {

	public static void main(String[] args) {
		WebDriver driver = DriverUtils.getMyDriver();
		driver.get("file:///D:/ITAAutomation/html/CounterText.html");
		
		WebDriverWait wait  = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.id("counter")), "2"));
		
		driver.close();
	
	}
}
