package com.selenium.actions;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.selenium.utils.ActitimeUtils;
import com.selenium.utils.DriverUtils;

public class DragAndDropDemo {

	public static void main(String[] args) {
		
		WebDriver driver =  DriverUtils.getMyDriver();
		ActitimeUtils.launch("http://jqueryui.com/droppable/");
		driver.switchTo().frame(DriverUtils.getMyElement("xpath", "//iframe[@class='demo-frame']"));
		
		Actions act =  new Actions(driver);
		act.dragAndDrop(DriverUtils.getMyElement("id", "draggable"), DriverUtils.getMyElement("id", "droppable")).perform();
				
		String text = DriverUtils.getMyElement("id", "droppable").getText();
				
		System.out.println(text);
	}
}
