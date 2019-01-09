package com.selenium.waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

public class FluentWaitDemo {

	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.get("file:///D:/ITAAutomation/html/tiimeout.html");
		
		driver.findElement(By.xpath("//button[text()='Start']")).click();
		
		FluentWait<WebElement> wait = new FluentWait<WebElement>(driver.findElement(By.id("demo")))
		.withTimeout(Duration.ofSeconds(20))
		.pollingEvery(Duration.ofMillis(500))
		.ignoring(Exception.class);
		
		Function<WebElement, Boolean> fun = new Function<WebElement, Boolean>() {
			@Override
			public Boolean apply(WebElement ele) {
				if(ele.getText().equals("Hello")) {
					System.out.println("Found!!!!!!");
					return true;
				}
				else
				{
					System.out.println("Waiting!!!!!!");
					return false;
				}
			}
		
		};
		
		wait.until(fun);
		
		String str = driver.findElement(By.id("demo")).getText();
		System.out.println(str);
		
	}
}
