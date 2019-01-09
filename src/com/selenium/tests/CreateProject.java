package com.selenium.tests;

import org.openqa.selenium.WebDriver;

import com.selenium.utils.ActitimeUtils;
import com.selenium.utils.DriverUtils;

public class CreateProject {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = DriverUtils.getMyDriver();
		ActitimeUtils.launch("http://localhost:8080/login.do");
		ActitimeUtils.login("admin", "manager");
		Thread.sleep(3000);
		ActitimeUtils.selectModule("TASKS");
		ActitimeUtils.clickOnNewProject();
		ActitimeUtils.createProject("FirstProject", "ITA-Auto_cust_1", "First Project Desc");
		ActitimeUtils.logout();
		
	}
}
