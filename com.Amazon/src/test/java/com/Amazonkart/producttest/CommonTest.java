package com.Amazonkart.producttest;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class CommonTest {
	@Test
	public void addProduct()
	{
		Reporter.log("Addproduct--Common-- Sucessfully",true);
	}
	@Test
	public void updateProduct()
	{
		Reporter.log("Updateproduct--Common-- Product Sucessfully",true);
	}
	@Test
	public void deleteProduct()
	{
		Reporter.log("DeleteProduct--Common--Product Sucessfully",true);
	}


}
