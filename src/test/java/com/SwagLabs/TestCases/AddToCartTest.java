package com.SwagLabs.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AddToCartTest extends BaseClass
{
  @Test(priority=1)
  public void validateCartButton() 
  {
	  ap.doClickCart();
	  //Assert.assertTrue(driver.getTitle().contains("cart"),"Cart button not clickable");
	  System.out.println("Clicked successfully on cart button");
	  addPause();
	  
  }
  
  
  @Test(priority=2)
  public void validateRemoveButton() 
  {
	  ap.doRemove();
	  addPause();
  }
  
  
  @Test(priority=3)
  public void validateContinueButton() 
  {
	  
	  ap.doContinue();
	  addPause();
	  ip.addProductToCart("Sauce Labs Bolt T-Shirt");
	  addPause();
	  ap.doClickCart();
	  addPause();
  }
  
  
  
  @Test(priority=4)
  public void validateCheckOutButton() 
  {
	ap.doCheckOut();  
	  
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}
