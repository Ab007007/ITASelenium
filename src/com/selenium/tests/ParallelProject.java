package com.selenium.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.selenium.utils.ActitimeUtils;
import com.selenium.utils.DriverUtils;
import com.selenium.utils.GlobalVariables;

public class ParallelProject {
	WebDriver driver=null;
	
	@Test
	public void CreateProjec()
	{
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		DriverUtils.driver = driver;
		driver.get("http://localhost:8080/login.do");
		Assert.assertEquals(driver.getTitle(), GlobalVariables.LOGIN_PAGE_TITLE);
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertEquals(driver.getTitle(), GlobalVariables.HOME_PAGE_TITLE);
		
		driver.findElement(By.linkText("TASKS")).click();
		driver.findElement(By.id("logoutLink")).click();
		driver.close();
		
	}
}
