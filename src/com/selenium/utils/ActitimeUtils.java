package com.selenium.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.selenium.waits.WebdriverWaitDemo;

public class ActitimeUtils extends DriverUtils {

	/**
	 * launch function is used to launch the application  
	 * @author ahb
	 * @param driver - pass the valid driver object created in Test
	 * @param url - pass the applicaiton url
	 */
	public static void launch(String url)
	{
		System.out.println("launching the applicaiton ..." + url);
		driver.get(url);
	}
	
	
	/**
	 * @author ahb
	 * @param driver -pass the valid driver object created in Test
	 * @param username - valid user name to login to application
	 * @param password - valid password to login to applicaiton 
	 */
	public static void login(String username, String password)
	{
		System.out.println("login function is called " + username + " : " + password);
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();
	}
	
	/**
	 * 
	 * @param driver
	 * @param moduleName - TIME-TRACK,TASKS,REPORTS,USERS 
	 */
	public static void selectModule(String moduleName)
	{
		System.out.println("Selecting module " + moduleName);
		//driver.findElement(By.linkText(moduleName)).click();
		clickOnEle("linktext", moduleName);
	
	}
	
	
	public static void clickOnNewCustomer()
	{
		System.out.println("Clicking on Add New Button ");
		clickOnEle("xpath", "//div[text()='Add New']");
		
		System.out.println("clicking on New Customer Button");
		clickOnEle("xpath", "//div[contains(text(),'New Customer')]");
		
	}
	
	public static void clickOnNewProject()
	{
		System.out.println("Clicking on Add New Button ");
		clickOnEle("xpath", "//div[text()='Add New']");
		
		System.out.println("clicking on New Project Button");
		clickOnEle("xpath", "//div[contains(text(),'New Project')]");
		
	}
	
	public static void createCustomer(String customerName,String customerDesc)
	{
		System.out.println("Creating a customer with " + customerName + " and " + customerDesc);
		typeOnEle("id", "customerLightBox_nameField", customerName);
		typeOnEle("id", "customerLightBox_descriptionField", customerDesc);
		clickOnEle("id", "customerLightBox_commitBtn");
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(getMyElement("xpath", "//div[@class='toasts']//span")));
		System.out.println("Success message is dispalyed-->#######" + getMyElement("xpath", "//div[@class='toasts']//span").getText());
		WebDriverWait wait1 = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.invisibilityOf(getMyElement("xpath", "//div[@class='toasts']//span")));
		System.out.println("toast message dissappeared..");
	}
	
	public static void logout()
	{
		System.out.println("logging out of the applicaiton and closing the browser");
		clickOnEle("id", "logoutLink");
		driver.close();
	}
	
	public static void createProject(String projectName,String customerName,String projectDesc)
	{
		typeOnEle("id", "projectPopup_projectNameField", projectName);
		clickOnEle("xpath", "//button[contains(text(),'Please')]");
		clickOnEle("linktext", customerName);
		typeOnEle("name", "projectDescriptionField"	, projectDesc);
		clickOnEle("id", "projectPopup_commitBtn");
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(getMyElement("xpath", "//div[@class='toasts']//span")));
		System.out.println("Success message is dispalyed-->#######" + getMyElement("xpath", "//div[@class='toasts']//span").getText());
		WebDriverWait wait1 = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.invisibilityOf(getMyElement("xpath", "//div[@class='toasts']//span")));
		System.out.println("toast message dissappeared..");

	}
	
	
}
