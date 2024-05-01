package com.SwagLabs.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutPage 
{

	private WebDriver driver;
	
	public CheckOutPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//Locators
	
	private By fn=By.id("first-name");
	private By ln=By.id("last-name");
	private By pc=By.id("postal-code");
	private By cancel=By.id("cancel");
	private By contin=By.id("continue");
	
	//Methods
	
	public void doContinue(String FirstN, String LastN, String zc)

	{
		
		driver.findElement(fn).sendKeys(FirstN);
		driver.findElement(ln).sendKeys(LastN);
		driver.findElement(pc).sendKeys(zc);
		driver.findElement(contin).click();
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
