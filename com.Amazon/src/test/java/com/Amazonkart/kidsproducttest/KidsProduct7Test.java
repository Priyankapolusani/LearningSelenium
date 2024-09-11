package com.Amazonkart.kidsproducttest;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.amazon.generic.common.BaseClass;

public class KidsProduct7Test extends BaseClass {
	
	@Test(groups = "FT")
	public void deleteProduct()
	{
		Reporter.log("DeleteProduct--Kids Product 7 sucessfully",true);
	}
	
	@Test(groups = "IT")
	public void updateProduct()
	{
		Reporter.log("Updateproduct--Kids Product 7 sucessfully",true);
	}
	
	@Test(groups = "ST")
	public void addProduct()
	{
		Reporter.log("Addproduct--Kids Product 7 sucessfully",true);
	}
	
	
	


}
