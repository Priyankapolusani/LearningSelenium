package com.amazon.generic.listenerutility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.amazon.generic.common.BaseClass;
import com.google.common.io.Files;

public class Listener extends BaseClass  implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
	
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		String name=result.getName();
		Reporter.log("TAKING SCREENSHOT --start--"+ name, true);
		
		// Perform Typecasting-WebdriverType to takeScreenshot
		TakesScreenshot sh=(TakesScreenshot) BaseClass.driver_static;
		
		//call the screenshot method and save in temp path
		File temp=sh.getScreenshotAs(OutputType.FILE);
		
		//create a perment path and save it
		File permanent =new File("./src/test/resources/Screenshot/"+name+".png");
		
		//copy the file from temp to permanent
		try {
			FileHandler.copy(temp, permanent);
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}

	@Override
	public void onTestSkipped(ITestResult result) {
	
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
