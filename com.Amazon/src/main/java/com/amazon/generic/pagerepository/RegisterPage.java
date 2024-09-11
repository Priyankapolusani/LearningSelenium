package com.amazon.generic.pagerepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	
	@FindBy(id="name")
	private WebElement name;
	public RegisterPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	public WebElement getName() {
		return name;
		
	}
	@FindBy(id="email")
	private WebElement email;
	public WebElement getEmail() {
		return email;
	}
	@FindBy(xpath="//label[text()='Password:']/../following-sibling::td/input")
	private WebElement password;
	public WebElement getPassword() {
		return password;
		
	}
	@FindBy(xpath="//input[@name='mobile']/../input")
	private WebElement mobile;
	public WebElement getMobile()
	{
		return mobile;
	}
	@FindBy(xpath="//label[text()='DOB:']/../following-sibling::td/input")
	private WebElement DOB;
	public WebElement getDOB() {
		return DOB;
		
	}
	@FindBy(xpath="//label[text()='Gender:']/../following-sibling::td/input[1]")
	private WebElement male;
	public WebElement getMale() {
		return male;
		
	}
	@FindBy(xpath="//label[text()='Gender:']/../following-sibling::td/input[2]")
	private WebElement female;
	public WebElement getFemale() {
		return female;
	}
	@FindBy(xpath="//label[text()='Gender:']/../following-sibling::td/input[3]")
	private WebElement others;
	public WebElement getOther() {
		return others;
	}
	@FindBy(xpath="//input[@type='submit']")
	private WebElement register;
	public WebElement getRegister()
	{
		return register;
	}

}
