package com.testng.order;

import org.testng.annotations.Test;

public class OrderOfExecutionUsingDependsOn {

	@Test
	public void launch() {
		System.out.println("launching the application");
	}

	@Test(dependsOnMethods="launch")
	public void login() {
		System.out.println("login to the application");
	}

	@Test(dependsOnMethods= {"launch","login"})
	public void createCustomer() {
		System.out.println("Create customer");
	}

	@Test(dependsOnMethods="createCustomer")
	public void logout() {
		System.out.println("logging out of the application");
	}
	
	@Test(dependsOnMethods="logout")
	public void testcase1()
	{
		System.out.println("login and logout TESt"); 
		
		launch();
		login();
		createCustomer();
		logout();
	}
	
	
}
