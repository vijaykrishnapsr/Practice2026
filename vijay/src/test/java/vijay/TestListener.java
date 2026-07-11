package vijay;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {

	@Override
	public void onTestSuccess(ITestResult result) {
		ITestListener.super.onTestSuccess(result);
		System.out.println("Success");
	}
    
	@Override
	public void onTestFailure(ITestResult result) {
		ITestListener.super.onTestFailure(result);
		System.out.println("Failed Screenshot");
	}
    
	@Override
	public void onStart(ITestContext context) {
		ITestListener.super.onStart(context);
		System.out.println("Starting");
	}

	@Override
	public void onFinish(ITestContext context) {
		ITestListener.super.onFinish(context);
		System.out.println("Finished test");
	}

	@Override
	public void onTestStart(ITestResult result) {
		ITestListener.super.onTestStart(result);
		System.out.println("Starting test");
	}

}
