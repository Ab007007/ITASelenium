package com.selenium.waits.switchto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.selenium.utils.ActitimeUtils;
import com.selenium.utils.DriverUtils;

public class HandlingFramesDemo {

	public static void main(String[] args) {
		WebDriver driver = DriverUtils.getMyDriver();
		ActitimeUtils.launch("http://jqueryui.com/droppable/");
//		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@src,'default')]")));
		driver.switchTo().frame(ActitimeUtils.getMyElement("xpath", "//iframe[contains(@src,'default')]"));
		String txt = driver.findElement(By.id("draggable")).getText();
		
		System.out.println("Text inside frame ele-->" + txt);
		
		driver.switchTo().defaultContent();
		ActitimeUtils.clickOnEle("linktext", "Resizable");
		

	}

}
