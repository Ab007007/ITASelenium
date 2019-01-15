package com.selenium.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.selenium.waits.WebdriverWaitDemo;

public class ActitimeUtils extends DriverUtils {

	/**
	 * launch function is used to launch the application  which accepts arbitarary number of args
	 * @author ahb
	 * @param url - pass the applicaiton url if nothing passed by default it lanuch actitime application
	 */
	public static void launch(String... url)
	{
		if(url.length==1)
		{
			driver.get(url[0]);
		}
		else
		{
			driver.get("http://localhost:8080/login.do");
		}
		System.out.println("launching the applicaiton ..." + url);
	
	}
	
	
	/**
	 * @author ahb
	 * @param username - valid user name to login to application
	 * @param password - valid password to login to applicaiton 
	 */
	public static void login(String username, String password)
	{
		System.out.println("login function is called " + username + " : " + password);
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
	/**
	 * Function will click on Add New Button and then Create customer button present 
	 * in Tasks page
	 * @author ahb
	 */
	public static void clickOnNewCustomer()
	{
		System.out.println("Clicking on Add New Button ");
		clickOnEle("xpath", "//div[text()='Add New']");
		
		System.out.println("clicking on New Customer Button");
		clickOnEle("xpath", "//div[contains(text(),'New Customer')]");
		
	}
	/**
	 * Function will click on Add New Button and then Create Project button present 
	 * in Tasks page
	 * @author ahb
	 */
	public static void clickOnNewProject()
	{
		System.out.println("Clicking on Add New Button ");
		clickOnEle("xpath", "//div[text()='Add New']");
		
		System.out.println("clicking on New Project Button");
		clickOnEle("xpath", "//div[contains(text(),'New Project')]");
		
	}
	/**
	 * @author ahb
	 * @param customerName -> name of the customer to be created
	 * @param customerDesc -> optional customer description
	 */
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
	
	/**
	 * function which takes care of logging out of the applicaiton
	 * and close the browser
	 */
	public static void logout()
	{
		System.out.println("logging out of the applicaiton and closing the browser");
		clickOnEle("id", "logoutLink");
		driver.close();
	}
	
	/**
	 * function to create a project for the existing customer
	 * @param projectName -> Name of the project
	 * @param customerName -> Existing customer 
	 * @param projectDesc -> description about the project
	 */
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
