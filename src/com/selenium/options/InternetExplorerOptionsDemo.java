package com.selenium.options;

import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;

public class InternetExplorerOptionsDemo {

	public static void main(String[] args) {
	
		
		System.setProperty("webdriver.ie.driver", "driver\\IEDriverServer.exe");
		InternetExplorerOptions options = new InternetExplorerOptions();
		options.setUnhandledPromptBehaviour(UnexpectedAlertBehaviour.DISMISS);
		WebDriver driver = new InternetExplorerDriver(options);
		driver.get("https://www.redbus.in/");
		
	}
}
