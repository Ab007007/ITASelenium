package com.selenium.waits.switchto;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.selenium.utils.ActitimeUtils;
import com.selenium.utils.DriverUtils;

public class MultiBrowserDemo {

	public static void main(String[] args) {
		WebDriver driver = DriverUtils.getMyDriver();
		ActitimeUtils.launch("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		ActitimeUtils.clickOnEle("linktext", "Contact Us");
		
		Set<String> windowIds = driver.getWindowHandles();
		
		Iterator<String> it =  windowIds.iterator();
		
		String parentID = it.next();
		String childID = it.next();
		
		
		System.out.println("Parent ID " + parentID);
		System.out.println("Child ID " + childID);
		
		driver.switchTo().window(childID);
		
		List<WebElement> childBrowserHyperlinks = driver.findElements(By.xpath("//a"));

		System.out.println("childBrowserHyperlinks-->" + childBrowserHyperlinks.size());
		printCollection(childBrowserHyperlinks);
		
		
	//	driver.close();
		
		driver.switchTo().window(parentID);
		
		List<WebElement>parentrowserHyperlinks = driver.findElements(By.xpath("//a"));

		System.out.println("parentrowserHyperlinks-->" + parentrowserHyperlinks.size());
		printCollection(parentrowserHyperlinks);
	//	driver.close();
		driver.quit();
	}

	public static void printCollection(List<WebElement> hyperlinks)
	{
		for (WebElement hyperlink : hyperlinks) {
			
			System.out.println(hyperlink.getText());
		}
	}
	
	
	
	
	
	
}
