package com.selenium.popup;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.selenium.utils.ActitimeUtils;

public class AuthenticationPopUpDemo {

	public static void main(String[] args) throws IOException 
	{
		
		Runtime.getRuntime().exec("D:\\ITAAutomation\\Eclipse_WS\\SeleniumPractice\\autoit\\fileupload.exe");
		WebDriver driver = ActitimeUtils.getMyDriver("ie");
		ActitimeUtils.launch("https://www.engprod-charter.net/");
		
			
		//driver.close();
	}
	
}
