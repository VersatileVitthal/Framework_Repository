package reportsDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTitleValidation {
  @Test
  public void GoogleTitle() 
  {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.co.in/");
	Assert.assertTrue(driver.getTitle().contains("Google"), "Title not matched");
	System.out.println("title matched");
	  
	  
  }
  
  
  
  
  
  
}
