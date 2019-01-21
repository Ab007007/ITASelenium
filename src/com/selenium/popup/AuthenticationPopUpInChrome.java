package com.selenium.popup;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.selenium.utils.ActitimeUtils;

public class AuthenticationPopUpInChrome {

	public static void main(String[] args) throws IOException, InterruptedException  {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = ActitimeUtils.getMyDriver("ff");
		Runtime.getRuntime().exec("D:\\ITAAutomation\\Eclipse_WS\\SeleniumPractice\\autoit\\pageloadforChrome.exe");
		ActitimeUtils.launch("https://www.engprod-charter.net/");
		Thread.sleep(2000);
			}

}
