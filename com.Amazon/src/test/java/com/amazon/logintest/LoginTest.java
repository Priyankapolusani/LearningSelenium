package com.amazon.logintest;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.amazon.generic.common.BaseClass;

public class LoginTest extends BaseClass {
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
