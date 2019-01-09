package com.selenium.autosuggestions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutoSuggestionsDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("IT Automation");
		//jquery or javascript or Ajax 
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//ul[@class='erkvQe']"))));
		
		List<WebElement> autoSuggestions = driver.findElements(By.xpath("//li[@class='sbct']//div[@class='sbl1']"));
		
		System.out.println(autoSuggestions.size());
		
		for (WebElement suggestion : autoSuggestions) {
			
			System.out.println(suggestion.getText());
			if(suggestion.getText().equals("it automation engineer"))
			{
				suggestion.click();
				break;
			}
		}
		driver.close();
	}
}
