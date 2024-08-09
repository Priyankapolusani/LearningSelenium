package TestSuite;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Sample.Base;

public class Amazon extends Base  {
	
	
	
	@Test(priority =2,dependsOnMethods = {"fetchURL"}, invocationCount = 2 )
	public void fetchTitle()
	{
    driver.get("https://www.amazon.in/");
	String title=driver.getTitle();
	Reporter.log("title:"+title,true);
	WebElement ele=driver.findElement(By.id("twotabsearchtextbox"));
	if(ele.isDisplayed())
	{
		Reporter.log("search box is displayed",true);
	}
	else
	{
		Reporter.log("search box is not displayed",true);
	}
		
	}
	@Test(priority = 1)
	public void fetchURL()
	{
		 driver.get("https://www.amazon.in/");
		String url=driver.getCurrentUrl();
		Reporter.log("url:"+url,true);
	}
	
	
}
