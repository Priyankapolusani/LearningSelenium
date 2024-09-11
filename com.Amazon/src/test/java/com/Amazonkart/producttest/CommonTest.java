 package com.Amazonkart.producttest;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.amazon.generic.common.BaseClass;

public class CommonTest extends BaseClass {
	@Test(groups = "FT")
	public void addProduct()
	{
		Reporter.log("Addproduct--Common-- Sucessfully",true);
	}
	@Test(groups = "IT")
	public void updateProduct()
	{
		Reporter.log("Updateproduct--Common-- Product Sucessfully",true);
	}
	@Test(groups = "ST")
	public void deleteProduct()
	{
		Reporter.log("DeleteProduct--Common--Product Sucessfully",true);
	}


}
