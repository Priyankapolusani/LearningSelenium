
package com.amazon.registertest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Amazonkart.generic.excelutility.ReadExcelFile;
import com.amazon.generic.common.BaseClass;
//@Listeners(com.amazon.generic.listenerutility.Listener.class)
public class RegisterTest extends BaseClass {
	
	@Test(enabled=false)
	public void createUser_validData()
	{
		try {
			Thread.sleep(3000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		//Verify Page Using Assert
		String exp_title="LEarning WEB TECHNOLOGY FORMS";
		String act_title=driver.getTitle();
		System.out.println(act_title);
		Assert.assertEquals(act_title, exp_title);
		
		//Create Object for RegisterPage
		//Registerpage regpage = new Registerpage(driver);
		
		// Step1:Clear the Name in The Name TextField
		//regpage.getName().clear();
		
		WebElement ele=driver.findElement(By.xpath("//input[@name='name']"));
		ele.clear();
		       //Create an Object for ExcelUtilityFile class
				ReadExcelFile excel_f = new ReadExcelFile();
				
				//Step 2: write the Name in the Name Text Field
				ele.sendKeys(excel_f.readdata("sheet1", 1, 1));
				
				//Step3:Display the Email
				System.out.println(excel_f.readdata("sheet1", 1, 2));	
				
				//Step4:Write the Data
				excel_f.writedata("sheet1", 2, 1,"Pravalika");
				
				//Execution Completed Message
		Reporter.log("createUser_validData for register Test",true);
	}
	
	
	@Test(dataProvider = "register")
	public void createUser_invalidData(String name, String email,String password)
	
	{
		
		//step1:Identify name Textfiled
		driver.findElement(By.id("name")).clear();
		driver.findElement(By.id("name")).sendKeys(name);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//step1:Identify emailTextfiled
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys(email);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//step1:Identify passwordTextfiled
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys(password);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Name:"+name);
		System.out.println("email:"+email);
		System.out.println("Password:"+password);
		Reporter.log("createUser_invalidData for register Test",true);
		
		
	}



}
