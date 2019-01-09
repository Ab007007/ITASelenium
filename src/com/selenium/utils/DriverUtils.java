package com.selenium.utils;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverUtils {

	static WebDriver driver = null;
	
	/**
	 * @author ahb
	 * @return
	 */
	public static WebDriver getMyDriver()
	{
		try {
			Runtime.getRuntime().exec("TaskKill /F /IM chromedriver.exe");
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver =  new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
		
	}
}
