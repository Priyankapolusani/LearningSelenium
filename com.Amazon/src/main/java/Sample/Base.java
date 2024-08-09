package Sample;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Base {
	public WebDriver driver;
	@BeforeSuite
	public void jdbcConnection()
	{
		Reporter.log("jdbc connected",true);
	}
	@BeforeTest
	public void extraConnection()
	{
		Reporter.log("connected",true);
	}
	@BeforeClass
	public void appOpen()
	{
		Reporter.log("App opened",true);
	}
	@BeforeMethod
	public void openBrowser()
	{
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
		Reporter.log("browser is close",true);
	}
	@AfterClass
	public void closeApp()
	{
		Reporter.log("App closed",true);
	}
	
	@AfterSuite
	public void jdbcDisConnection()
	{
		Reporter.log("jdbc Disconnected",true);
	}
	@BeforeTest
	public void extraConnectionDisCon()
	{
		Reporter.log("Disconnected",true);
	}
	
}

