package Utilities;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import dsalgobase.dsalgobase;

public class ITestListenerClass extends dsalgobase implements ITestListener{

	@Override
	public void onTestFailure(ITestResult result) {
		try {
			captureScreen(result.getMethod().getMethodName());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	
	

}
