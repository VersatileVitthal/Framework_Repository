package reportsDemo;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestListeners {
  @Test
  public void testcase1() 
  
  {
	
	WebDriver driver=new ChromeDriver(); 
	driver.get("https://www.google.co.in/");
	Assert.assertTrue(driver.getTitle().contains("Google"),"Test case failed");
	System.out.println("Test case pass");
	  
	  
  }
  
  
  
  @Test
  public void testcase2() 
  
  {
	
	WebDriver driver=new ChromeDriver(); 
	driver.get("https://www.google.co.in/");
	Assert.assertTrue(driver.getTitle().contains("Googleapp"),"Test case failed");
	System.out.println("Test case pass");
	  
	  
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}
