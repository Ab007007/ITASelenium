package com.testng.group;

import org.testng.annotations.Test;

public class Bikes {

	
	@Test(groups= {"yamaha","bike"})
	public void R15()
	{
		System.out.println("R15");
	}
	
	@Test(groups= {"yamaha","bike"})
	public void FZ()
	{
		System.out.println("FZ");
	}
	
	@Test(groups= {"suzuki","bike"})
	public void SS()
	{
		System.out.println("SS");
	}
	
	@Test(groups= {"suzuki","bike"})
	public void SS2()
	{
		System.out.println("SS2");
	}
}
