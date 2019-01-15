package com.selenium.options;

import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class FireFoxOptionsDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "driver\\geckodriver.exe");	
		FirefoxOptions options =  new FirefoxOptions();
		//options.addArguments("--disable-notifications");
		options.setAcceptInsecureCerts(true);
		options.setUnhandledPromptBehaviour(UnexpectedAlertBehaviour.DISMISS);
		WebDriver driver=  new FirefoxDriver(options);
		driver .get("https://www.redbus.in/");
	}
}
