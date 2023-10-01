package utility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListener implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test case start");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test case Success");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test case Failure");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test case Skipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
	}
	
	

}
