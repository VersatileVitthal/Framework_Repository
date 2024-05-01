package com.SwagLabs.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class InventoryPageTest extends BaseClass
{
  @Test(priority=1)
  public void verifyProductCount() 
  {
	  
	 int pcount=ip.getProductCount();
	 Assert.assertEquals(pcount, 6, "Product counts are not matched");
	 System.out.println("Product counts are matched");
	 System.out.println("Total Products are:"+pcount);
	 
	  
  }
  
  @Test(priority=2)
  public void verifyProductsName() 
  {
	  ip.getProductName();
	  
	  
  }
  
  
  @Test(priority=3)
  public void addToCartProduct() 
  {
	  
	 ip.addProductToCart("Sauce Labs Fleece Jacket"); 
	  
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}
