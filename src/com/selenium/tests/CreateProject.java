package com.selenium.tests;

import org.openqa.selenium.WebDriver;

import com.selenium.utils.ActitimeUtils;
import com.selenium.utils.ConfigReader;
import com.selenium.utils.DriverUtils;
import com.selenium.utils.ExcelUtility;

public class CreateProject {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = DriverUtils.getMyDriver();
		ActitimeUtils.launch(ConfigReader.getUrl());
		ActitimeUtils.login(ConfigReader.getUserName(),ConfigReader.getPassword());
		Thread.sleep(3000);
		String customerName,projectName,projectDesc;
		
		for (int i = 1; i < ExcelUtility.getExcelRowCount("projectdata"); i++) 
		{
			ActitimeUtils.selectModule("TASKS");
			projectName= null;
			customerName = null;
			projectDesc = null;
			projectName = ExcelUtility.getMyCellValue("projectdata", i, 0);
			projectDesc = ExcelUtility.getMyCellValue("projectdata", i, 1);
			customerName = ExcelUtility.getMyCellValue("projectdata", i, 2);
			
			ActitimeUtils.clickOnNewProject();
			ActitimeUtils.createProject(projectName, customerName, projectDesc);
			ActitimeUtils.selectModule("TIME-TRACK");
		
		}
		ActitimeUtils.logout();
		
	}
}
