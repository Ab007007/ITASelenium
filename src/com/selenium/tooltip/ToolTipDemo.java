package com.selenium.tooltip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTipDemo {

	public static void main(String[] args) {
		String exptectedtoolTip = "Warning! Password recovery function is disabled as email settings are not configured.";
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8080/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");

		driver.findElement(By.id("loginButton")).click();
		
		WebElement settingsButton = driver.findElement(By.xpath("//div[@class='popup_menu_icon warning_icon']"));
		
		String toolTip = settingsButton.getAttribute("title");
		
		System.out.println(toolTip);
		if(exptectedtoolTip.equals(toolTip))
		{
			System.out.println("PASS"); 
			
		}
		else
		{
			System.out.println("FAIL");
		}
	}
	
}
