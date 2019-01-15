package com.selenium.popup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.selenium.utils.ActitimeUtils;
import com.selenium.utils.DriverUtils;

public class HiddenDivisionPopUpDemo {

	public static void main(String[] args) {
		
		WebDriver driver = DriverUtils.getMyDriver();
		ActitimeUtils.launch();
		ActitimeUtils.login("admin", "manager");
		ActitimeUtils.selectModule("TASKS");
		
		Actions act =  new Actions(driver);
		act.moveToElement(DriverUtils.getMyElement("xpath", "//div[text()='ITA-Auto_cust_3 ' and @class='title']/following-sibling::div")).click().build().perform();
		ActitimeUtils.clickOnEle("xpath", "//div[div[div[div[@class='nameLabel' and text()='ITA-Auto_cust_3']]]]//div[text()='ACTIONS']");
	
		ActitimeUtils.clickOnEle("xpath", "//div[@class='edit_customer_sliding_panel sliding_panel']//div[text()='Delete']");
		
		ActitimeUtils.clickOnEle("id", "customerPanel_deleteConfirm_submitTitle");
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(ActitimeUtils.getMyElement("xpath", "//div[@class='toasts']//span")));
		System.out.println("Success message is dispalyed-->#######" + ActitimeUtils.getMyElement("xpath", "//div[@class='toasts']//span").getText());
		WebDriverWait wait1 = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.invisibilityOf(ActitimeUtils.getMyElement("xpath", "//div[@class='toasts']//span")));
		System.out.println("toast message dissappeared..");
		
		ActitimeUtils.logout();
		
		
	}

}
