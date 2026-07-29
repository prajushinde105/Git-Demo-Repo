package testsite;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListner implements ITestListener
{
   public void onTestStart(ITestResult result) {
   
   System.out.println("Login Test Start "+ result.getName());
   }
   
   public void onTestSuccess(ITestResult result) {
	   
	   System.out.println("Test Passed "+ result.getName());
	   }
}
