package TestSuite;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Sample.Base;

public class Flipkart extends Base {
public WebDriver driver;


@Test(priority =2,dependsOnMethods = {"fetchURL"}, invocationCount = 2 )
public void fetchTitle()
{
	driver.get("https://www.flipkart.com/");
String title=driver.getTitle();
Reporter.log("title:"+title,true);
	
}
@Test(priority = 1)
public void fetchURL()
{
	driver.get("https://www.flipkart.com/");
	String url=driver.getCurrentUrl();
	Reporter.log("url:"+url,true);
}


}


