package com.Amazonkart.electronicproducttest;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.amazon.generic.common.BaseClass;

public class ElectronicProductTest extends BaseClass {
	@Test(groups = "FT")
	public void addProduct()
	{
		Reporter.log("Addproduct--Electronic Product sucessfully",true);
	}
	@Test(groups = "IT")
	public void updateProduct()
	{
		Reporter.log("Updateproduct--Electronic Product sucessfully",true);
	}
	@Test(groups = "ST")
	public void deleteProduct()
	{
		Reporter.log("DeleteProduct--Electronic Product sucessfully",true);
	}

}
