package com.selenium.tests;

import org.testng.annotations.DataProvider;

public class TestData {
	
	 @DataProvider
	  public Object[][] customerdata() {
	    return new Object[][] {
	      new Object[] { "T1Customr-1","customer-Desc1" },
	      new Object[] { "T1Customr-2","customer-Desc2" },
	      new Object[] { "T1Customr-3","customer-Desc3" },
	      new Object[] { "T1Customr-4","customer-Desc4" },
	      
	    };
	  }
	 
	 
	 @DataProvider
	  public Object[][] projectData() {
	    return new Object[][] {
	      new Object[] { "TCustomr-1","Project-1","customer-Desc1" },
	      new Object[] { "TCustomr-2","Project-2","customer-Desc2" },
	      new Object[] { "TCustomr-3","Project-3","customer-Desc3" },
	      new Object[] { "TCustomr-4","Project-4","customer-Desc4" },
	      
	    };
	  }
	 

}
