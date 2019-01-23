package com.selenium.tests;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.selenium.utils.ActitimeUtils;
import com.selenium.utils.DriverUtils;

public class CreateCustomerUsingTestNGDataProvider2 {

	WebDriver driver = null;

	@Test
	public void createCustomer() {
		driver = ActitimeUtils.getMyDriver();
		ActitimeUtils.launch();
		ActitimeUtils.login("admin", "manager");
		ActitimeUtils.selectModule("TASKS");
		ActitimeUtils.clickOnNewCustomer();
		ActitimeUtils.createCustomer("ITA-Auto_cust_14", "D1");
		ActitimeUtils.logout();

	}
	
	@AfterMethod
	public void checkTestExecutionStatus(ITestResult result) 
	{
		
		if(result.getStatus()==ITestResult.FAILURE)
		{
			DriverUtils.takeScreenShot();
		}
	}

	
	
	
	
	
	
	
	
	
	

}
