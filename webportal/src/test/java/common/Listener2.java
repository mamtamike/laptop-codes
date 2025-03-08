package common;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import Utilities.TestUtilScreenshot;

public class Listener2 extends TestUtilScreenshot implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
	Reporter.log("method name is: "+result.getName());

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("status is: "+result.getStatus());


	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("test failed-captured screenshot");

		try {
			getScreenshot();
		} catch (IOException e) {
			e.printStackTrace();
		}
		Reporter.log("<a href=\"C:\\eclipse_workspace\\webportal\\screenshot\\Mon-Mar-03-17-25-03-IST-2025.png\">TestResult</a>");
	
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSkipped(result);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onStart(context);
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onFinish(context);
	}
	

}
