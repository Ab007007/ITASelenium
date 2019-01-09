package com.selenium.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.selenium.utils.DriverUtils;

public class DropDownDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =  DriverUtils.getMyDriver();
		
		driver.get("file:///D:/ITAAutomation/html/dropDown.html");
		
		WebElement dropdown = driver.findElement(By.xpath("//select"));
		
		Select sel = new Select(dropdown);
		
		sel.selectByIndex(3);
		
		Thread.sleep(2000);
		
		sel.selectByVisibleText("Volvo");
		
		Thread.sleep(2000);
		
		sel.selectByVisibleText("Mercedes");
		
		Thread.sleep(2000);
		sel.deselectByIndex(3);
		Thread.sleep(2000);
		sel.deselectByVisibleText("Volvo");
		
		
		
	}
}
