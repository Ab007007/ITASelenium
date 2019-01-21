package com.testng;

import org.testng.annotations.Test;

public class TestNGDemo {

	@Test
	public void launch()
	{
		System.out.println("launching the application");
	}
	@Test
	public void login()
	{
		System.out.println("login to the application");
	}
	
	@Test
	public void createCustomer()
	{
		System.out.println("Create customer");
	}
	@Test
	public void logout()
	{
		System.out.println("logging out of the application");
	}
}
