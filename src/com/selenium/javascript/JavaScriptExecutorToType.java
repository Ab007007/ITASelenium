package com.selenium.javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.selenium.utils.ActitimeUtils;

public class JavaScriptExecutorToType {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver =  ActitimeUtils.getMyDriver();
		ActitimeUtils.launch("http://formy-project.herokuapp.com/enabled");
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.getElementById('disabledInput').value='Hacker input';");
	}
}
