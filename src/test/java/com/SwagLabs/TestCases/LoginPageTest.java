package com.SwagLabs.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.SwagLabs.Utilities.Utility;

public class LoginPageTest extends BaseClass 

{
  @Test(priority=1)
  public void verifyURL()
  
  {
	 String curl=lp.getAppUrl(); 
	 Assert.assertTrue(curl.contains("demo"), "Url not matched");
	 System.out.println("Url matched");
	 
	  
  }
  
  @Test(priority=2)
  public void verifyTitle()
  
  {
	 String atitle=lp.getAppTitle(); 
	 Assert.assertTrue(atitle.contains("Swag"), "Title not matched");
	 System.out.println("Title matched");
	 
	  
  }
  
  @Test(priority=3)
  public void validateLogin()
  
  {
	  lp.doLogin("problem_user", "secret_sauce");
	  Utility.getScreenshot(driver);
	  Assert.assertTrue(lp.getAppUrl().contains("inventory"),"Login Failed");
	  System.out.println("Login Done");
	 
	  
  }
  
  
  
  
  
}
