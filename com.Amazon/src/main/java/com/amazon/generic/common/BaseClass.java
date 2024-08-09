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
	public void browserSetup(String bname)
	
	{
		/*//Configure the Browser
		System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./src\\main\\resources\\geckodriver.exe");
		System.setProperty("webdriver.edge.driver","./src\\main\\resources\\msedgedriver.exe");*/
		
		//Using Scanner Class
		//Scanner sc=new Scanner(System.in);
		//System.out.println("Enter The Browser Name:");
		//String bname=sc.next();
		
		//if User Gives Browsername="chrome"
		if(bname.equals("chrome")) {
			//Launch The Browser-Chrome
			driver=new ChromeDriver();
		}
		//if User Gives Browsername="firefox"
		else if(bname.equals("firefox")) {
			//Launch The Browser-Firefox
			driver=new FirefoxDriver();
		}
		//if User Gives Browsername="edge"
		else if(bname.equals("edge")) {
			//Launch The Browser-Edge
			driver=new EdgeDriver();
		}
		else
		{
			System.out.println("U have Enter the Invalid Browser name and i am executing default Browser");
			driver=new ChromeDriver();
		}
		
		//create object for all
		objectCreation();
		
		//create object of property file 
		//ReadPropertyFile p_ref=new ReadPropertyFile();
		
		//fetch data
		String url=propertyobj.readdata("url");
		//propertyobj.displaydata("url");
		//propertyobj.writeData("ename", "test@gmail.com");
		
		
		// Navigate to the Application via URL
		driver.get(url);
		
		Reporter.log("BrowserSetup sucessfully",true);
	}
	@AfterClass
	public void closebrowser()
	{
		//Close The Browser
		driver.close();
	Reporter.log("CloseBrowser Sucessfully",true);	
	}
	@BeforeTest
	public void precondition()
	
	{
		Reporter.log("PreCondition Done Sucessfully",true);	
	}
	@AfterTest
	public void postcondition()
	{
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
