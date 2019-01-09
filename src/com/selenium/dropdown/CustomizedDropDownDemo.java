package com.selenium.dropdown;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.selenium.utils.ActitimeUtils;
import com.selenium.utils.DriverUtils;

public class CustomizedDropDownDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = DriverUtils.getMyDriver();
		ActitimeUtils.launch("http://localhost:8080/login.do");
		ActitimeUtils.login("admin", "manager");
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//tr[td[@class='userSelectorButton']]"))));
		driver.findElement(By.xpath("//tr[td[@class='userSelectorButton']]")).click();
		driver.findElement(By.xpath("//span[contains(text(), 'Dowd, Roy')]")).click();
		String expectedText = driver.findElement(By.xpath("//tr[td[@class='pagetitle' and text()='Enter Time-Track']]//span[@class='dashedLink']")).getText();
		
		System.out.println(expectedText);
		driver.close();
	}
}
