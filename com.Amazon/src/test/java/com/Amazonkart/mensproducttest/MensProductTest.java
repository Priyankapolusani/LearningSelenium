package com.Amazonkart.mensproducttest;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.amazon.generic.common.BaseClass;

public class MensProductTest extends BaseClass {
	@Test(groups = "FT")
	public void addProduct()
	{
		Reporter.log("Addproduct--Mens Product sucessfully",true);
	}
	@Test(groups = "IT")
	public void updateProduct()
	{
		Reporter.log("Updateproduct--Mens Product sucessfully",true);
	}
	@Test(groups = "ST")
	public void deleteProduct()
	{
		Reporter.log("DeleteProduct--Mens Product sucessfully",true);
	}


}
