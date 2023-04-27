package TutorialsNinja;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListener implements ITestListener {

    @Override
	public void onTestStart(ITestResult result) {
	System.out.println("I registered:" + result.getName());
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
	System.out.println("I Loggedin:" + result.getName());	
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
	System.out.println("I searched:" + result.getName());	
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
	System.out.println("I searched:" + result.getName());	
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	System.out.println("The test was Skipped:" + result.getName());	
		
	}

	@Override
	public void onStart(ITestContext context) {
	System.out.println("I'm the first one to be executed:" + context.getName());	
		
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("I'm the last one to be executed:" + context.getName());		
		
	}

}
