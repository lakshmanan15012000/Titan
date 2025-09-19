package GenericUtility;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzerImplementation implements IRetryAnalyzer {
	
	int count=1;
	int maxCount=4;    //found by manual interpretation
	@Override
	public boolean retry(ITestResult result) {
		while (count<=maxCount) {
			count ++;
			return true;
		}
		return false;
			
			


}
}