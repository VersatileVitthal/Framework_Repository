package com.SwagLabs.TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import com.SwagLabs.Pages.*;
import com.SwagLabs.Utilities.ReadProperties;
import com.SwagLabs.Utilities.Utility;

public class BaseClass 
{

	public WebDriver driver;
	public ReadProperties rp;
	public LoginPage lp;
	public InventoryPage ip;
	public AddToCartPage ap;
	public CheckOutPage cp;
	public OverviewPage op;
	@BeforeTest
	
	public void AppsetUp()

	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.saucedemo.com/");
		//driver.manage().window().maximize();
		rp=new ReadProperties("TestData//config");
		lp=new LoginPage(driver);
		ip=new InventoryPage(driver);
		ap=new AddToCartPage(driver);
		cp=new CheckOutPage(driver);
		op=new OverviewPage(driver);
		
		
	}
	
	@BeforeClass
	
	public void PageSetUp() throws InterruptedException 
	{
	
		System.out.println("*******************Login*****************");
		System.out.println("App url is:"+lp.getAppUrl());
		System.out.println("App title is:"+lp.getAppTitle());
		lp.doLogin(rp.getData("un"), rp.getData("psw"));
		addPause();
		System.out.println("*******************Login completed*****************");
		System.out.println("*******************Inventory*****************");
		//Thread.sleep(3000);
		System.out.println("Total products are: "+ip.getProductCount());
		ip.getProductName();
		Utility.getScreenshot(driver);
		addPause();
		ip.addProductToCart(rp.getData("pname1"));
		addPause();
		Utility.getScreenshot(driver);
		System.out.println("*********************CartPage**********************");
		ap.doClickCart();
		addPause();
		Utility.getScreenshot(driver);
		ap.doRemove();
		addPause();
		Utility.getScreenshot(driver);
		ap.doContinue();
		addPause();
		Utility.getScreenshot(driver);
		ip.addProductToCart(rp.getData("pname2"));
		addPause();
		ap.doClickCart();
		addPause();
		ap.doCheckOut();
		addPause();
		Utility.getScreenshot(driver);
		System.out.println("******************CheckOutPage************************");
		addPause();
		cp.doContinue(rp.getData("fn"),rp.getData("ln"), rp.getData("zc"));
		Utility.getScreenshot(driver);
		addPause();
		
		
		
	}
	
	
	public void addPause()
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
