package reportsDemo;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestEventsDemo implements ITestListener
{

	public void onStart() 
	{
	
		System.out.println("Test started");
		
		
	}
	
	
	public void onTestSuccess(ITestResult result) 
	{
	
		System.out.println("Test success: "+result.getName());
		
		
	}
	
	
	public void onTestFailure(ITestResult result) 
	{
	
		System.out.println("Test fail: "+result.getName());
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
