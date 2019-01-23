package com.testng.asserts;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LogintoActitime {

	
	@Parameters({"url"})
	@BeforeTest
	public void launch(String url)
	{
		System.out.println(url);
	}
	
	@Parameters({"username","password"})
	@Test
	public void login(String un,String pwd)
	{
		System.out.println("Username " + un);
		System.out.println("Password " + pwd);
	}
	
	@AfterTest
	public void logout()
	{
		
	}
}

