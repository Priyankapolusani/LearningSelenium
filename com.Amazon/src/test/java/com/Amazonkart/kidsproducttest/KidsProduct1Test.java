package com.Amazonkart.kidsproducttest;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.amazon.generic.common.BaseClass;

public class KidsProduct1Test extends BaseClass {
	
	@Test(priority = 3,groups="ST")
	public void deleteProduct()
	{
		Reporter.log("DeleteProduct--Kids Product 1 sucessfully",true);
	}
	
	@Test(priority = 2,groups = "IT")
	public void updateProduct()
	{
		Reporter.log("Updateproduct--Kids Product 1 sucessfully",true);
	}

	@Test(priority = 1 ,groups = "FT")
	public void addProduct()
	{
		Reporter.log("Addproduct--Kids Product 1 sucessfully",true);
	}
	
	
	


}
