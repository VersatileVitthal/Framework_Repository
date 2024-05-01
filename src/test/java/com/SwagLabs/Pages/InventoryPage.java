package com.SwagLabs.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InventoryPage 
{

	private WebDriver driver;
	
	public InventoryPage(WebDriver driver)
	
	{
	
		this.driver=driver;
		
	}
	
	//Locators
	
	private By allProducts=By.xpath("//div[@class='inventory_list']//div[@class='inventory_item']");
	private By allProductsName=By.xpath("//div[@class='inventory_list']//div[@class='inventory_item_name ']");
	private By addTocartbtn=By.xpath("//button[text()='Add to cart']");
	
	//methods
	
	public int getProductCount()
	{
		 int count=driver.findElements(allProducts).size();
	     return count;
	}
	
	public void getProductName()
	{
		List<WebElement>productName=driver.findElements(allProductsName);
		System.out.println("Product names are:");
		
		for(WebElement i:productName)
		{
			System.out.println(i.getText());
		}
		
		
	}
	
	public void addProductToCart(String pname)
	{
	  
		List<WebElement>productN=driver.findElements(allProductsName);
		for(WebElement j:productN)
		{
			//System.out.println("Product names are:"+i.getText());
			
			if(j.getText().contains(pname))
			{
				j.click();
				break;
			}
			
		}
		
		driver.findElement(addTocartbtn).click();
		System.out.println("Product"+pname+ "is added to the cart");
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
