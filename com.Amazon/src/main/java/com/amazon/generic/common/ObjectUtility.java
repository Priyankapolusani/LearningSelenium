package com.amazon.generic.common;

import com.Amazonkart.generic.excelutility.ReadExcelFile;
import com.Amokar.generic.javautility.Javautility;
import com.Amokart.generic.webdriverutility.WebdriverUtility;
import com.amazon.generic.propertyfileutility.ReadPropertyFile;

public class ObjectUtility implements FrameworkConstant {
	
	ReadExcelFile excelobj;
	Javautility javaobj;
	ReadPropertyFile propertyobj;
	WebdriverUtility webdriverobj;
	
	
	public void objectCreation() {
		 excelobj=new ReadExcelFile();
		 javaobj=new Javautility();
		 propertyobj= new ReadPropertyFile();
		 webdriverobj=new WebdriverUtility();
		
		
	}
}
