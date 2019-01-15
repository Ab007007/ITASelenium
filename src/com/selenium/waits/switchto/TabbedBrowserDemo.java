package com.selenium.waits.switchto;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

import com.selenium.utils.ActitimeUtils;
import com.selenium.utils.DriverUtils;

public class TabbedBrowserDemo {

	public static void main(String[] args) {
		WebDriver driver = DriverUtils.getMyDriver();
		ActitimeUtils.launch("http://formy-project.herokuapp.com/switch-window");
		
		System.out.println(driver.getWindowHandles().size());
		ActitimeUtils.clickOnEle("id", "new-tab-button");
		Set<String> windowIDs = driver.getWindowHandles();
		
		Iterator<String> it  = windowIDs.iterator();
		String parentID = it.next();
		String childID = it.next();
		
		driver.switchTo().window(childID);
		ActitimeUtils.clickOnEle("linktext", "Autocomplete");
		
		
		System.out.println(windowIDs.size());
		driver.close();
		
				
	}
}
