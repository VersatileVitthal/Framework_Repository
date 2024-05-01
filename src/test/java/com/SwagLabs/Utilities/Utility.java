package com.SwagLabs.Utilities;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utility 
{
	
	public static void getScreenshot(WebDriver driver)
	{
		//WebDriver driver=new ChromeDriver(); 
		 
		// driver.get("https://www.amazon.in/?");
		 
		 TakesScreenshot ts=(TakesScreenshot) driver;
		 File temp=ts.getScreenshotAs(OutputType.FILE);
		 File dest=new File(System.getProperty("user.dir")+"//Screenshots//amazon"+System.currentTimeMillis()+".png");
		 try {
			FileHandler.copy(temp, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//Explicit wait
	
	public static WebElement waitForPresenceofEle(WebDriver driver, By loc) 
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		 return wait.until(ExpectedConditions.presenceOfElementLocated(loc));
	}
	
	public static WebElement waitForVisibilityofEle(WebDriver driver, By loc) 
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		 return wait.until(ExpectedConditions.visibilityOfElementLocated(loc));
	}
	public static WebElement waitForElementToclick(WebDriver driver, By loc) 
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		 return wait.until(ExpectedConditions.elementToBeClickable(loc));
	}
	public static Boolean waitForTitle(WebDriver driver, String title) 
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		 return wait.until(ExpectedConditions.titleContains(title));

	}
	public static Boolean waitForUrl(WebDriver driver, String url) 
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		 return wait.until(ExpectedConditions.urlContains(url));

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
