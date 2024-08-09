package com.Amazonkart.kidsproducttest;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class KidsProductTest3 {
	@Test(enabled = false,groups="integration")
	public void addProduct()
	{
		Reporter.log("Addproduct--Kids Product sucessfully",true);
	}
	@Test(invocationCount = 0,groups = "Functionality")
	public void updateProduct()
	{
		Reporter.log("Updateproduct--Kids Product sucessfully",true);
	}
	@Test(groups = "Smoke")
	public void deleteProduct()
	{
		Reporter.log("DeleteProduct--Kids Product sucessfully",true);
	}


}
