package com.testng.group;

import org.testng.annotations.Test;

public class Cars {

	
	@Test(groups= {"honda","car"})
	public void hondaCity()
	{
		System.out.println("Test Related to Honda city");
	}
	
	@Test(groups= {"honda","car"})
	public void hondacivic()
	{
		System.out.println("Test Related to Honda civic");
	}
	
	@Test(groups= {"mahendra","car"})
	public void xuv500()
	{
		System.out.println("Test Related to XUV500");
	}
	
	@Test(groups= {"mahendra","car"})
	public void xuv300()
	{
		System.out.println("Test Related to XUV300");
	}
	
	@Test(groups= {"maruthi","car"})
	public void swift()
	{
		System.out.println("Test Related to swift");
	}
	
	@Test(groups= {"maruthi","car"})
	public void swift2()
	{
		System.out.println("Test Related to swift2");
	}
	
	
	
	
	
	
	
	
	
}
