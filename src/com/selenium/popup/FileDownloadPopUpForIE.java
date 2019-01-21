package com.selenium.popup;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

import com.selenium.utils.ActitimeUtils;
import com.selenium.utils.DriverUtils;

public class FileDownloadPopUpForIE {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Runtime.getRuntime().exec("D:\\ITAAutomation\\Eclipse_WS\\SeleniumPractice\\autoit\\IEFileDownload.exe");
		WebDriver driver =  ActitimeUtils.getMyDriver("ie");
		
		ActitimeUtils.launch("https://www.seleniumhq.org/download/");
		ActitimeUtils.clickOnEle("xpath", "//a[text()='32 bit Windows IE']");
		
		
		
		
		
		
	}

}
