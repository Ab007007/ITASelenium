package com.testng;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DataProviderDemo {

	@Test(dataProvider = "mytestdata")
	public void testCase1(Integer n, String s, Integer n2) {
		System.out.println(n + "--" + s + "--" + n2);
	}

	@DataProvider
	public Object[][] mytestdata() {
		return new Object[][] { new Object[] { 1, "a", 123 }, new Object[] { 2, "b", 456 },
				new Object[] { 1, "a", 444 }, new Object[] { 2, "b", 333 }, };
	}
	
	
	 @DataProvider
	  public Object[][] createcustomerdata() {
	    return new Object[][] {
	      new Object[] { "Customr-1","customer-Desc1" },
	      new Object[] { "Customr-2","customer-Desc2" },
	      new Object[] { "Customr-3","customer-Desc3" },
	      new Object[] { "Customr-4","customer-Desc4" },
	      
	    };
	  }
	 
	 
	 @Test(dataProvider="createcustomerdata")
	 public void createCustomerTest(String cn , String cd)
	 {
		 System.out.println(cn + "---" + cd);
		 
	 }
}
