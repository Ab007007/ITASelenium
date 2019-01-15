package com.selenium.actions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.selenium.utils.ActitimeUtils;
import com.selenium.utils.DriverUtils;

public class ActionsKBDemo {

	public static void main(String[] args) {
		
		WebDriver driver = DriverUtils.getMyDriver("chrome");
		
		ActitimeUtils.launch();
		Actions act =  new Actions(driver);
		act.sendKeys("admin").perform();
		act.sendKeys(Keys.TAB).perform();
		act.sendKeys("manager").perform();
		act.sendKeys(Keys.TAB).perform();
		act.sendKeys(Keys.TAB).perform();
		act.sendKeys(Keys.ENTER).perform();
		
	}
	
}
