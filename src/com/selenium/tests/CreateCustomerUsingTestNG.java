package com.selenium.tests;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.selenium.utils.ActitimeUtils;
import com.selenium.utils.DriverUtils;

public class CreateCustomerUsingTestNG {

	WebDriver driver = null;
	
	@BeforeClass
	public void createDriver()
	{
		Reporter.log("<b>Creating a default driver<b><br>");
		driver = DriverUtils.getMyDriver();
		
	}
	
	@Parameters({"url","username","password"})
	@BeforeMethod
	public void launchApplication(String url,String un,String pwd)
	{
		ActitimeUtils.launch();
		ActitimeUtils.login(un, pwd);
		ActitimeUtils.selectModule("TASKS");
	}
	
	@Test(priority=1,dataProvider="customerdata", dataProviderClass=TestData.class)
	public void createCustomerTest(String cn ,String cd)
	{
		
		ActitimeUtils.clickOnNewCustomer();
		ActitimeUtils.createCustomer(cn, cd);
	}
	
	
	
	
	@Test(priority=2,dataProvider="projectData", dataProviderClass=TestData.class )
	public void createProjectTest(String cn,String pn,String pd)
	{
		ActitimeUtils.clickOnNewProject();
		ActitimeUtils.createProject(pn, cn, pd);
	}
	
	
	
	@AfterMethod
	public void logout()
	{
		ActitimeUtils.logout();
	}
	
	@AfterClass
	public void closeDriver()
	{
		driver.close();
	}
	
	
}
