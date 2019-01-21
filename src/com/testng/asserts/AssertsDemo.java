package com.testng.asserts;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class AssertsDemo {

	
	
	@Test
	public void assertsDemo()
	{
		
		Reporter.log("Strarting addition program <br>");
		
		int a =20;
		int b = 30;
		Reporter.log("Sum of two numbers validation...");
		Assert.assertEquals((a+b), 30);
		Assert.assertEquals((a+b), 31);
		
		a =0;
		b = 30;
		Reporter.log("Sum of two numbers validation...");
		Assert.assertEquals((a+b), 30);
		Reporter.log("ended**********************************************************");
		System.out.println("ended**********************************************************");
	}
	
	@Test
	public void softAssertsDemo()
	{
		SoftAssert sa = new SoftAssert();
		Reporter.log("Strarting addition program <br>");
		
		int a =20;
		int b = 30;
		Reporter.log("Sum of two numbers validation...");
		sa.assertEquals((a+b), 30);
		sa.assertEquals((a+b), 31);
		
		a =0;
		b = 30;
		Reporter.log("Sum of two numbers validation...");
		sa.assertEquals((a+b), 30);
		Reporter.log("ended**********************************************************");
		System.out.println("ended**********************************************************");
		sa.assertAll();
	}
}
