package com.selenium.popup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

import com.selenium.utils.ActitimeUtils;
import com.selenium.utils.DriverUtils;

public class FileDownloadPopUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//To launch the browser with perdefined settings
		
		FirefoxProfile fp = new FirefoxProfile();
		fp.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/zip,text/plain");
		fp.setPreference("browser.download.folderList", 2);
		fp.setPreference("browser.download.dir", "D:\\ITAAutomation\\Eclipse_WS\\SeleniumPractice\\autoDownloads\\win32_autodonload1.zip");
		
		FirefoxOptions options =  new FirefoxOptions();
		options.setProfile(fp);
		
		System.setProperty("webdriver.gecko.driver", "driver\\geckodriver.exe");
		WebDriver driver =  new FirefoxDriver(options);
		
		DriverUtils.driver = driver;
		ActitimeUtils.launch("https://www.seleniumhq.org/download/");
		ActitimeUtils.clickOnEle("xpath", "//a[text()='32 bit Windows IE']");
		
		
		
		
		
		
	}

}
