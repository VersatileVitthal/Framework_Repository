package com.SwagLabs.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddToCartPage 
{

	private WebDriver driver;
	
	public AddToCartPage(WebDriver driver)
	
	{
	   this.driver=driver;
	   
	}
	
	//Locators
	
	private By cartBtn=By.xpath("//a[@class='shopping_cart_link']");
	private By rbtn=By.xpath("//button[text()='Remove']");
	private By cbtn=By.id("continue-shopping");
	private By chebtn=By.id("checkout");
	
	//methods
	public void doClickCart()

	{
	 driver.findElement(cartBtn).click();	
		
	}
	
	public void doRemove()
	{
		driver.findElement(rbtn).click();
		System.out.println("Product removed from the cart");
	}
	
	public String doContinue()

	{
		driver.findElement(cbtn).click();
		System.out.println("It should navigate on Inventory page");
		String curl=driver.getCurrentUrl();
		return curl;
		
	}
	
	public String doCheckOut()
	
	{
	
	driver.findElement(chebtn).click();
	return driver.getCurrentUrl();
	
	
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
