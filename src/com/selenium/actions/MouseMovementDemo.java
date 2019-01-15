package com.selenium.actions;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.selenium.utils.ActitimeUtils;
import com.selenium.utils.DriverUtils;

public class MouseMovementDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = DriverUtils.getMyDriver();
		ActitimeUtils.launch("https://www.flipkart.com/");
		Thread.sleep(5000);
		
		Actions act = new Actions(driver);
		WebElement womenTab = DriverUtils.getMyElement("xpath", "//span[text()='Women']");
		WebElement menTab = DriverUtils.getMyElement("xpath", "//span[text()='Men']");
		WebElement electronicsTab = DriverUtils.getMyElement("xpath", "//span[text()='Electronics']");
		
		
		act.moveToElement(womenTab).perform();
		Thread.sleep(3000);
		
		act.moveToElement(menTab).perform();
		Thread.sleep(3000);
		act.moveToElement(electronicsTab).perform();
	}
}
