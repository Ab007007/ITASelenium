package com.selenium.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.selenium.utils.ActitimeUtils;

public class CreateCustomerUsingTestNGDataProvider {

	
	WebDriver driver= null;
	
	@Parameters({"username","password"})
	@BeforeMethod
	public void setup(String username,String password)
	{
		driver = ActitimeUtils.getMyDriver();
		ActitimeUtils.launch();
		ActitimeUtils.login(username, password);
		ActitimeUtils.selectModule("TASKS");
	}
	
	 @DataProvider
	  public Object[][] createcustomerdata() {
	    return new Object[][] {
	      new Object[] { "Customr-1","customer-Desc1" },
	      new Object[] { "Customr-2","customer-Desc2" },
	      new Object[] { "Customr-3","customer-Desc3" },
	      new Object[] { "Customr-4","customer-Desc4" },
	      
	    };
	  }
	
	@Test(dataProvider="createcustomerdata")
	public void createCustomer(String customerName,String customerDesc)
	{
		ActitimeUtils.clickOnNewCustomer();
		ActitimeUtils.createCustomer(customerName, customerDesc);
			
	}
	
	@AfterMethod
	public void logout()
	{
		ActitimeUtils.logout();
	}
	
}
