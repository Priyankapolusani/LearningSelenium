package com.Amazonkart.kidsproducttest;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.amazon.generic.common.BaseClass;

public class KidsProduct3Test extends BaseClass {
	@Test(groups="FT")
	public void addProduct()
	{
		Reporter.log("Addproduct--Kids Product 3 sucessfully",true);
	}
	@Test(groups = "IT")
	public void updateProduct()
	{
		Reporter.log("Updateproduct--Kids Product 3 sucessfully",true);
	}
	@Test(groups = "ST")
	public void deleteProduct()
	{
		Reporter.log("DeleteProduct--Kids Product 3 sucessfully",true);
	}


}
