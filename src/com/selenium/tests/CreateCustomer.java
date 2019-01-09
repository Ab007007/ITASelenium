package com.selenium.tests;

import org.openqa.selenium.WebDriver;

import com.selenium.utils.ActitimeUtils;
import com.selenium.utils.DriverUtils;

public class CreateCustomer
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.out.println("Create Customer Test");
		WebDriver driver = DriverUtils.getMyDriver();
		ActitimeUtils.launch("http://localhost:8080/login.do");
		ActitimeUtils.login("admin", "manager");
		Thread.sleep(3000);
		ActitimeUtils.selectModule("TASKS");
		ActitimeUtils.clickOnNewCustomer();
		ActitimeUtils.createCustomer("ITA-Auto_cust_4", "ITA_Auto_cust_4");
		ActitimeUtils.logout();
	}
}