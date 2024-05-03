package reportsDemo;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportDemo 
{
  @Test
  public void ExtentReport() 
  
  {
	  ExtentReports extent=new ExtentReports();
	  
	  ExtentSparkReporter spark =new ExtentSparkReporter(System.getProperty("user.dir")+"//Reports/AutomationReport.HTML");
	  
	  spark.config().setReportName("Automation sprint-1 report");
	  spark.config().setDocumentTitle("AutomationTestReport");
	  spark.config().setTheme(Theme.STANDARD);
	  
	  extent.attachReporter(spark);
	  ExtentTest test=extent.createTest("ExtentReportTest");
	  test.log(Status.PASS, "This is pass status");
	  test.log(Status.FAIL, "This is fail status");
	  test.log(Status.INFO, "this is indo status");
	  test.log(Status.SKIP, "This skip status");
	  
	  extent.flush();
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}
