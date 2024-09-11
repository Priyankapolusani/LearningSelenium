package com.amazon.generic.common;

import com.Amazonkart.generic.excelutility.ReadExcelFile;
import com.Amokar.generic.javautility.Javautility;
import com.Amokart.generic.webdriverutility.WebdriverUtility;
import com.amazon.generic.propertyfileutility.ReadPropertyFile;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ObjectUtility implements FrameworkConstant {
	
	public ReadExcelFile excelobj;
	public Javautility javaobj;
	public ReadPropertyFile propertyobj;
	public WebdriverUtility webdriverobj;
	public ExtentSparkReporter spark;
	public ExtentReports report;
	public ExtentTest test;
	
	
	
	public void objectCreation() {
		 excelobj=new ReadExcelFile();
		 javaobj=new Javautility();
		 propertyobj= new ReadPropertyFile();
		 webdriverobj=new WebdriverUtility();
		 
		
		//Create the SparkReport
		 spark= new ExtentSparkReporter(reportpath);
		 
		 //create the Extent Report
		 report=new ExtentReports();
		 
		 
		
		
	}
}
