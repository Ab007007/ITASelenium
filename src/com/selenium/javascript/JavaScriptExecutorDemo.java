package com.selenium.javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.selenium.utils.ActitimeUtils;

public class JavaScriptExecutorDemo {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver =  ActitimeUtils.getMyDriver();
		ActitimeUtils.launch("http://formy-project.herokuapp.com/scroll");
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
	//	js.executeScript("window.scrollTo(0, 500);");
		js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.id("name")));
		
		}
}
