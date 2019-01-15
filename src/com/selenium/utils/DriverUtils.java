package com.selenium.utils;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverUtils {

	static WebDriver driver = null;

	/**
	 * By default it creates an object to Chrome  Browser
	 * @author ahb
	 * @return Chrome browser object 
	 */
	public static WebDriver getMyDriver() {
		try {
			Runtime.getRuntime().exec("TaskKill /F /IM chromedriver.exe");
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;

	}

	/**
	 * 
	 * @param type - chrome,ff,ie
	 * @return
	 */
	public static WebDriver getMyDriver(String type)
	{
		try {
			Runtime.getRuntime().exec("TaskKill /F /IM chromedriver.exe");
			Runtime.getRuntime().exec("TaskKill /F /IM geckodriver.exe");
			Runtime.getRuntime().exec("TaskKill /F /IM IEDriverServer.exe");
		} catch (IOException e) {
			System.out.println("Exception while killing the driver..");
			e.printStackTrace();
		}
		
		switch(type.toLowerCase())
		{
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
			driver = new ChromeDriver();
			break;

		case "ff":
			System.setProperty("webdriver.gecko.driver", "driver\\geckodriver.exe");
			driver = new FirefoxDriver();
			break;
		case "ie":
			System.setProperty("webdriver.ie.driver", "driver\\IEDriverServer.exe");
			driver= new InternetExplorerDriver();
			break;

		default:
			System.out.println("Please pass valid browser type.. Refer FrameWork Document!!!");
			break;
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;
		
	}
	/**
	 * 
	 * @param locator
	 *            --> id,name,classname,tagname,linktext, partiallinktext,css,xpath
	 * @param value
	 *            -->value corresponding to locator
	 * @return
	 */

	public static WebElement getMyElement(String locator, String value) {
		System.out.println("**** Finding element with " + locator + " and " + value);
		WebElement ele= null;
		switch (locator) {
		case "id":
				ele = driver.findElement(By.id(value));
			break;
		case "name":
				ele = driver.findElement(By.name(value));
			break;
		case "classname":
				ele = driver.findElement(By.className(value));
			break;
		case "tagname":
				ele = driver.findElement(By.tagName(value));
			break;
		case "linktext":
				ele = driver.findElement(By.linkText(value));
			break;
		case "partiallinktext":
				ele = driver.findElement(By.partialLinkText(value));
			break;
		case "css":
				ele = driver.findElement(By.cssSelector(value));
			break;
		case "xpath":
				ele = driver.findElement(By.xpath(value));
			break;

		default:
			System.out.println("Please pass valid locator..");
			break;
		}
		
		return ele;
	}
	
	public static void clickOnEle(String locator, String value)
	{
		System.out.println("clicking on element using " + locator);
		getMyElement(locator, value).click();
	}
	
	
	public static void typeOnEle(String locator, String value,String textToType )
	{
		System.out.println("typing on element using " + locator + "--" + textToType);
		getMyElement(locator, value).sendKeys(textToType);
	}
	
	
	
	
	
	
	
	
	
	
}
