package com.selenium.tests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.selenium.utils.ActitimeUtils;
import com.selenium.utils.DriverUtils;

public class CreateCustomerUsingGrid
{

	public static void main(String[] args) throws InterruptedException, MalformedURLException 
	{
		String nodeUrl  = "http://192.168.1.104:5555/wd/hub";
/*//		FirefoxOptions options = new FirefoxOptions();
//		options.addPreference("browserName", "firefox");
//		options.addPreference("browserversion", "55.0.2");
//		options.addPreference("network.proxy.type", 0);
//		options.setAcceptInsecureCerts(true);
//		ChromeOptions options = new ChromeOptions();
//		options.setCapability(CapabilityType.PLATFORM_NAME, Platform.WINDOWS);
//		options.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.ACCEPT);
//		options.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
//		options.addArguments("disable-infobars");
		
		InternetExplorerOptions options = new InternetExplorerOptions();
		options.setCapability(CapabilityType.PLATFORM_NAME, Platform.WINDOWS);
		options.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.ACCEPT);
		options.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
	*/			
		
		WebDriver driver = ActitimeUtils.getRemoteDriver(nodeUrl, "chrome");
		ActitimeUtils.launch("http://localhost:8080/login.do");
		ActitimeUtils.login("admin", "manager");
		Thread.sleep(3000);
		ActitimeUtils.selectModule("TASKS");
		ActitimeUtils.clickOnNewCustomer();
		ActitimeUtils.createCustomer("ITA-Auto_Gridcust_18", "ITA_Auto_Gridcust_18");
		ActitimeUtils.logout();
	}
}
