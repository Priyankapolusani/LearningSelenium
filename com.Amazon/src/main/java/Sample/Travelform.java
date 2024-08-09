package Sample;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Travelform {
	public static void main(String[] args) throws Throwable {
		
		//Configure the browser
		WebDriver driver=new ChromeDriver();
		
		//Launch The Browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Navigate to url
		driver.get("file:///C:/Users/USER/AppData/Local/Temp/Rar$EXa15068.25612/Webpage/webpage.html");

		//Verify The Travel Page use Title
		String title=driver.getTitle();
		System.out.println("Travel Page Title is Verified:"+title);
		
		//Clear the data in the TextField
		driver.findElement(By.xpath("//input[@name='name']")).clear();
		
		//Enter the User Name in the TextField
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Priyanka");
		
		//Enter the Email in the TextField
		driver.findElement(By.xpath("//input[@id='email']/../../td[2]/input")).sendKeys("priyankapolusani666@gmail.com");
		
		//Enter the Password in the TextField
		driver.findElement(By.xpath("//label[text()='Password:']/../following-sibling::td/input")).sendKeys("Priya@123");
		
		//Enter the Phonenumber in the TextField
		driver.findElement(By.xpath("//input[@name='mobile']/../input")).sendKeys("9392814703");
		
		//Enter the DOB in the TextField
		driver.findElement(By.xpath("//label[text()='DOB:']/../following-sibling::td/input")).sendKeys("07/24/2024");
		
	    //Click on male Radio button
		//driver.findElement(By.xpath("//label[text()='Gender:']/../following-sibling::td/input")).click();
		driver.findElement(By.xpath("//label[text()='Gender:']/../following-sibling::td/input[1]")).click();
		
		//Click On Female Radio button
		driver.findElement(By.xpath("//label[text()='Gender:']/../following-sibling::td/input[2]")).click();
		//driver.findElement(By.xpath("//input[@id='male']")).click();
		//driver.findElement(By.xpath("//input[@value='female']")).click();
		
		//Click on Other Radioo Button
		driver.findElement(By.xpath("//label[text()='Gender:']/../following-sibling::td/input[3]")).click();
		
		//Click on Goa CheckBox Button
		driver.findElement(By.xpath("//label[text()='GOA']"));
		
		//Click on manali CheckBox Button
		driver.findElement(By.xpath("//label[text()='Manali']/../input[2]")).click();
		
		//Click on Bangalore  CheckBox Button
		driver.findElement(By.xpath("//label[text()='Manali']/../input[3]")).click();
		
		WebElement ele=driver.findElement(By.xpath("//input[@id='Kerala']"));
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView(true)",ele);
		Thread.sleep(3000);
		
		jse.executeScript("arguments[0].click()", driver.findElement(By.xpath("//input[@id='Kerala']")));
		
		
		driver.findElement(By.xpath("//label[text()='Country:']/../following-sibling::td/select[2]/option")).click();
		driver.findElement(By.xpath("//label[text()='Country:']/../following-sibling::td/select[2]/option[2]")).click();
		driver.findElement(By.xpath("//textarea[@placeholder='Enter feedback']")).sendKeys("Welcome");
		driver.findElement(By.xpath("//input[@value='Register']")).click();
		driver.findElement(By.xpath("//input[@type='submit']/../following-sibling::td/a")).click();
		
		//Execution competed
		System.out.println("ExecutionCompleted");
		
	
	
	
		
		
	}
	
}
