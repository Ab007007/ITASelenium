package com.testng.order;

import org.testng.annotations.Test;

public class OrderOfExecution {

	@Test(priority=1)
	public void launch() {
		System.out.println("launching the application");
	}

	@Test(priority=2)
	public void login() {
		System.out.println("login to the application");
	}

	@Test(priority=3)
	public void createCustomer() {
		System.out.println("Create customer");
	}

	@Test(priority=4)
	public void logout() {
		System.out.println("logging out of the application");
	}
}
