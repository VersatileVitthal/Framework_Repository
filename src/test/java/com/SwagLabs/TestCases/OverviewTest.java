package com.SwagLabs.TestCases;

import org.testng.annotations.Test;

import com.SwagLabs.Utilities.Utility;

import org.testng.annotations.Test;

public class OverviewTest extends BaseClass
{
  @Test(priority=1)
  public void verifyUrl() 
  {
	String curl=op.verifyUrl();
	System.out.println(curl);
	
	
	
	  
  }
  
  
  
  @Test(priority=2)
  public void getProductDetails() 
  {
	op.doProductDetails();
	Utility.getScreenshot(driver);
	  
  }
  
  
  @Test(priority=3)
  public void docomplete() 
  {
	
	  op.doFinish();
	  Utility.getScreenshot(driver);
	  
	  
  }

  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}
