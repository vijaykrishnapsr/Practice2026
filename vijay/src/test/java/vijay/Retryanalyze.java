package vijay;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retryanalyze implements IRetryAnalyzer {

	int minRetryCount = 0;
	int maxRetryCount = 5;

	@Override
	public boolean retry(ITestResult result) {
		if (minRetryCount <= maxRetryCount) {
        
			minRetryCount++;
        
			return true;
		} else {
			return false;
		}
	}

}
