package com.SwagLabs.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage 
{

	private WebDriver driver;
	
	 public LoginPage(WebDriver driver)
	 {
		 this.driver=driver;
	 }
	
	//By locator technique
	
	private By usern=By.id("user-name");
	private By psw=By.id("password");
	private By btn=By.id("login-button");
	
	//methods
	
	public String getAppTitle()
	{
		 return driver.getTitle();
	}
	
	
	public String getAppUrl() 
	{
		 return driver.getCurrentUrl();
	}
	
    public void doLogin(String un, String ps)
   {
	
    	driver.findElement(usern).sendKeys(un);
    	driver.findElement(psw).sendKeys(ps);
    	driver.findElement(btn).click();
    	
   }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
