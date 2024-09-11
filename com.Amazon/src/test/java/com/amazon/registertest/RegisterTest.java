
package com.amazon.registertest;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.amazon.generic.common.BaseClass;
import com.amazon.generic.pagerepository.RegisterPage;
import com.aventstack.extentreports.Status;

//@Listeners(com.amazon.generic.listenerutility.Listener.class)
public class RegisterTest extends BaseClass {
	@Test
	public void registerValidData() {
		
	
		
		String name=excelobj.readdata("Sheet1", 1, 1);
		String email=excelobj.readdata("Sheet1", 1, 2);
		String password=excelobj.readdata("Sheet1", 1, 3);
		String mobno=excelobj.readdata("Sheet1", 1, 4);
		String feedback=excelobj.readdata("Sheet1", 1, 6);
		test.log(Status.INFO, "Data Taken From Excel File Success");
		
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//provide implicitly wait
				webdriverobj.waitUntilElementFound();
				
				String exptitle="LEarning WEB TECHNOLOGY FORMS";
				
				String acttitle=webdriverobj.driver.getTitle();
				System.out.println(acttitle);

		// Step 1: Verify Register page using Assert
		Assert.assertEquals(exptitle, acttitle);
		test.log(Status.PASS, "Step1: Verified-Title, Register Page is Displayed");
		
		//Create an object for Register Page
				RegisterPage regpage=new RegisterPage(webdriverobj.driver);
				
				boolean elementExpCondition=true;
				boolean elementActualCondition=regpage.getName().isDisplayed();
				
				//Step 2: Verify the element
				Assert.assertEquals(elementExpCondition, elementActualCondition,"Verified NameTextField Webelement -It is Displayed");
				test.log(Status.PASS, "Step2: Verified- NameTextField, it is Displayed");
			    	
				//Step 3: Perform Actions --clear
				regpage.getName().clear();
				test.log(Status.PASS, "Step3: NameTextField Cleared success");
				
				//Step 4: Perform Actions --Enter Name
				regpage.getName().sendKeys(name);
				test.log(Status.PASS, "Step4: Entered UserName in NameTextField  success");
				
				//Step 5: Perform Actions --Enter Email
				regpage.getEmail().sendKeys(email);
				test.log(Status.PASS, "Step5: Entered Email in EmailTextFiled success");
						
				
				//Step 6: Perform Actions --Enter Password
				regpage.getPassword().sendKeys(password);
				test.log(Status.PASS, "Step6: Entered Password in PasswordTextFiled success");
				
				//Step 7: Perform Actions --Enter Mobile number
				regpage.getMobile().sendKeys(mobno);
				test.log(Status.INFO, "Step7: Entered Mobile no in MobileTextFiled success");
				
				//Step 8: Perform Actions --Enter Feedback
						//regpage.getFeedback().sendKeys(feedback);
	}
	@Test
	public void validateRegisterButtoncolour()
	{
		
		 webdriverobj.waitUntilElementFound();
			
			String exptitle="LEarning WEB TECHNOLOGY FORMS";
			
			String acttitle=webdriverobj.driver.getTitle();
			System.out.println(acttitle);
			
			// Step 1: Verify Register page using Assert
			Assert.assertEquals(exptitle, acttitle,"verified Register Page");
			
			//Create an object for Register Page
			RegisterPage regpage=new RegisterPage(webdriverobj.driver);
			
			boolean elementExpCondition=true;
			boolean elementActualCondition=regpage.getRegister().isDisplayed();
			
			//Step 2: Verify the element
			Assert.assertEquals(elementExpCondition, elementActualCondition,"Verified NameTextField Webelement -It is Displayed");
		    
			String color=regpage.getRegister().getCssValue("color");
			
			System.out.println("color of webelement is "+color);
			
	}
	@Test
	public void validateRegisterButtonposition()
	{
		webdriverobj.waitUntilElementFound();
		
		String exptitle="LEarning WEB TECHNOLOGY FORMS";
		
		String acttitle=webdriverobj.driver.getTitle();
		System.out.println(acttitle);
		
		// Step 1: Verify Register page using Assert
		Assert.assertEquals(exptitle, acttitle,"verified Register Page");
		
		//Create an object for Register Page
		RegisterPage regpage=new RegisterPage(webdriverobj.driver);
		
		boolean elementExpCondition=true;
		boolean elementActualCondition=regpage.getRegister().isDisplayed();
		
		//Step 2: Verify the element
		Assert.assertEquals(elementExpCondition, elementActualCondition,"Verified NameTextField Webelement -It is Displayed");
	    
        org.openqa.selenium.Dimension size=regpage.getRegister().getSize();
		
		int width=size.getWidth();
		
		int height=size.getHeight();
		
		
		System.out.println("Width :"+width);
		

		System.out.println("Height  :"+height);

	
	}
	
	@Test
	public void validateRegisterButtonsize()
	{
		 webdriverobj.waitUntilElementFound();
			
			String exptitle="LEarning WEB TECHNOLOGY FORMS";
			
			String acttitle=webdriverobj.driver.getTitle();
			System.out.println(acttitle);
			
			// Step 1: Verify Register page using Assert
			Assert.assertEquals(exptitle, acttitle,"verified Register Page");
			
			//Create an object for Register Page
			RegisterPage regpage=new RegisterPage(webdriverobj.driver);
			
			boolean elementExpCondition=true;
			boolean elementActualCondition=regpage.getRegister().isDisplayed();
			
			//Step 2: Verify the element
			Assert.assertEquals(elementExpCondition, elementActualCondition,"Verified NameTextField Webelement -It is Displayed");
	        org.openqa.selenium.Point location=regpage.getRegister().getLocation();
			
			int x=location.getX();
			
			int y=location.getY();
			
			
			System.out.println("x axis :"+x);
			
			System.out.println("y axis  :"+y);
		
	}

	}


