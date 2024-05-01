package com.SwagLabs.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OverviewPage 
{

	private WebDriver driver;
	public OverviewPage (WebDriver driver)
	{
		this.driver=driver;
	}
	
	//Locator
	
	private By getData= By.id("checkout_summary_container");
	private By finish=By.id("finish");
	private By end=By.id("checkout_complete_container");
	
	//Methods
	
	public String verifyUrl()
	{
		return driver.getCurrentUrl();
	}
	
	
	public void doProductDetails() 
	{
		System.out.println("Selected product details are: ");;
      System.out.println(driver.findElement(getData).getText());
		
	}
	
	
	public void doFinish()
	{
		driver.findElement(finish).click();
		System.out.println(driver.findElement(end).getText());
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
