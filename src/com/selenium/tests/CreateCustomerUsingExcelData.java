package com.selenium.tests;

import org.openqa.selenium.WebDriver;

import com.selenium.utils.ActitimeUtils;
import com.selenium.utils.ConfigReader;
import com.selenium.utils.DriverUtils;
import com.selenium.utils.ExcelUtility;

public class CreateCustomerUsingExcelData
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.out.println("Create Customer Test");
		WebDriver driver = DriverUtils.getMyDriver(ConfigReader.getBrowser());
		ActitimeUtils.launch(ConfigReader.getUrl());
		ActitimeUtils.login(ConfigReader.getUserName(),ConfigReader.getPassword());
		Thread.sleep(3000);
		ActitimeUtils.selectModule("TASKS");
		String customerName,customerDesc;
		
		for (int i = 1; i < ExcelUtility.getExcelRowCount("customerdata"); i++) 
		{
			customerDesc= null;
			customerName = null;
			
			customerName = ExcelUtility.getMyCellValue("customerdata", i, 0);
			customerDesc = ExcelUtility.getMyCellValue("customerdata", i, 1);
			
			ActitimeUtils.clickOnNewCustomer();
			ActitimeUtils.createCustomer(customerName, customerDesc);
			
		}
		
		ActitimeUtils.logout();
	}
}
