package com.selenium.waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebdriverWaitDemo {

	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.get("file:///D:/ITAAutomation/html/tiimeout.html");
		
		driver.findElement(By.xpath("//button[text()='Start']")).click();
		
		WebDriverWait wait =  new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("demo"))));
		
		String str = driver.findElement(By.id("demo")).getText();
		System.out.println(str);
		
	}
}
