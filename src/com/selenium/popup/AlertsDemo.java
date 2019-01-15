package com.selenium.popup;

import org.openqa.selenium.WebDriver;

import com.selenium.utils.ActitimeUtils;
import com.selenium.utils.DriverUtils;

public class AlertsDemo {

	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = DriverUtils.getMyDriver();
		ActitimeUtils.launch();
		ActitimeUtils.login("admin", "manager");
		ActitimeUtils.selectModule("TASKS");
		ActitimeUtils.clickOnNewCustomer();
		DriverUtils.typeOnEle("id", "customerLightBox_nameField", "DummyText");
		DriverUtils.clickOnEle("id", "customerLightBox_cancelBtn");
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		Thread.sleep(2000);
		DriverUtils.clickOnEle("id", "customerLightBox_cancelBtn");
		Thread.sleep(2000);
		String textonAlert = driver.switchTo().alert().getText();
		System.out.println(textonAlert);
		driver.switchTo().alert().accept();
		
		driver.close();
	}
}
