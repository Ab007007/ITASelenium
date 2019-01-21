package com.selenium.tests;

import org.openqa.selenium.WebDriver;

import com.selenium.utils.ActitimeUtils;
import com.selenium.utils.ConfigReader;
import com.selenium.utils.DriverUtils;

public class CreateCustomerUsingExternalData
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.out.println("Create Customer Test");
		WebDriver driver = DriverUtils.getMyDriver(ConfigReader.getBrowser());
		ActitimeUtils.launch(ConfigReader.getUrl());
		ActitimeUtils.login(ConfigReader.getUserName(),ConfigReader.getPassword());
		Thread.sleep(3000);
		ActitimeUtils.selectModule("TASKS");
		ActitimeUtils.clickOnNewCustomer();
		ActitimeUtils.createCustomer("ITA-Auto_cust_125", "ITA_Auto_cust_125");
		ActitimeUtils.logout();
	}
}
