package com.selenium.cal;

import java.util.Date;

import org.openqa.selenium.WebDriver;

import com.selenium.utils.ActitimeUtils;
import com.selenium.utils.DriverUtils;

public class RedBusCalDemo {

	public static void main(String[] args) {
		
		WebDriver driver  =  DriverUtils.getMyDriver();
		Date d = new Date();
		int futureday = d.getDate()+1;
		System.out.println("Current text" + d.toString());
		System.out.println(d.getDate());
		ActitimeUtils.launch("https://www.redbus.in/");
		DriverUtils.clickOnEle("xpath", "//label[text()='Onward Date']");
		DriverUtils.clickOnEle("xpath", "//div[@id='rb-calendar_onward_cal']//td[(@class='current day' or @class='wd day' or @class='we day') and text()='"+futureday+"']");
		
	}
}
