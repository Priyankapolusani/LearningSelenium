package com.amazon.logintest;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class LoginTest {
	@Test
	public void login_validData()
	{
		Reporter.log("login_validData sucessfuly",true);
	}
	@Test
	public void login_invalidData()
	{
		Reporter.log("login_invalidData sucessfuly",true);
	}



}
