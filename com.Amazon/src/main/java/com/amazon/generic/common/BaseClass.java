package com.amazon.generic.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.WebDriverManager;



public class BaseClass extends ObjectUtility{
	
	public WebDriver driver=null;
	public static WebDriver driver_static=null;
	
	
	@DataProvider(name="register")
	
	public Object[][] registerdata()
	{
		Object[][] data=new Object[3][3];
		data[0][0]="Priya";
		data[0][1]="priya@gmail.com";
		data[0][2]="Testing";
		
		data[1][0]="Reshma";
		data[1][1]="priyanka@gmail.com";
		data[1][2]="Developer";
		
		data[2][0]="Priyanka";
		data[2][1]="priyapolusani@gmail.com";
		data[2][2]="Devops";
		
		return data;
		
	}
	@BeforeMethod
	public void login()
	{
		Reporter.log(" login sucessfully",true);
		
	}
	@AfterMethod
	public void logout()
	
	{
		Reporter.log(" logout sucessfully",true);
	}
	@Parameters("browser")
	@BeforeClass
	public void browserSetup(String browsername)
	
	{
		
		
	
		//Create the TestReport
		test=	report.createTest("registerValidData");
		

		
		//Step 1:Launch the browser
		webdriverobj.launchBrowser(browsername);
		
		//Step 2: Maximize the browser
		webdriverobj.maximizeBrowser();
		
		
		// Fetch url data property file
		String url = propertyobj.readdata("url");


		    webdriverobj.navigateToApp(url);
		    
		Reporter.log("BrowserSetup "+browsername+"successful", true);
		
		
		
		
	}
	@AfterClass
	public void closebrowser()
	{
		//Close The Browser
		webdriverobj.closeWindow();
	Reporter.log("CloseBrowser Sucessfully",true);	
	}
	@BeforeTest
	public void precondition()
	
	{
		//create object for all library
		objectCreation();
		
		//configure the SparkReport Information
		spark.config().setDocumentTitle("Regresstion testing For the RegisterPage");
		spark.config().setReportName("RegressionSuite");
		spark.config().setTheme(Theme.DARK);
		
		//Attach the Spark Report and ExtentReport
		report.attachReporter(spark);
		
		//configure the system information in Extent Report
		report.setSystemInfo("DeviceName:","Priyanka");
		report.setSystemInfo("OperatingSystem:", "Windows 10");
		report.setSystemInfo("Browser:", "Chrome");
		report.setSystemInfo("BrowserVersion", "chrome-127.0.6533.120");
		
		
		Reporter.log("PreCondition Done Sucessfully",true);	
	}
	
	

	
	
	@AfterTest
	public void postcondition()
	{
		report.flush();
		Reporter.log("PostCondition Done Sucessfully",true);	
	}
	@BeforeSuite
	public void getSuiteconnection()
	{
		Reporter.log("get SuiteConnections Done Sucessfully",true);	
	}
	@AfterSuite
	public void terminateSuiteconnection()
	{
		Reporter.log("Terminate SuiteConnections Done Sucessfully",true);	
	}
	

}
