package com.selenium.tests;

import org.openqa.selenium.WebDriver;

import com.selenium.utils.ActitimeUtils;
import com.selenium.utils.DriverUtils;

public class CreateCustomer2
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.out.println("Create Customer Test");
		WebDriver driver = DriverUtils.getMyDriver();
		ActitimeUtils.launch("https://online.actitime.com/snomula/login.do");
		ActitimeUtils.login("nomulasruthi", "sruthireddy@5");
		ActitimeUtils.selectModule("TASKS");
		ActitimeUtils.clickOnNewCustomer();
		ActitimeUtils.createCustomerinOnlineAPP("ITA-Auto_cust_151", "ITA_Auto_cust_151");
		ActitimeUtils.logout();
	}
}
