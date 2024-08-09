package com.amazon.generic.propertyfileutility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import com.amazon.generic.common.FrameworkConstant;

public class ReadPropertyFile implements FrameworkConstant {
	FileInputStream fis;
	FileOutputStream fos;
	Properties p;
	
	public String readdata(String key)  {
		//Convert the Physical file into java understandable
		try {
			fis=new FileInputStream(PropertyPath);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//creating Instance for Properties class
		p=new Properties();
		
		//load the all common Data
		try {
			p.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// fetch the data
				String data = p.getProperty(key);

				return data;
		
		
		
	}
	public void writeData(String key,String value)  {
		//Enter the data
		p.put(key, value);
		
		//Create instance for FILE output Stream
		try {
			fos= new FileOutputStream(PropertyPath);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Store the data
		try {
			p.store(fos, "Updated the New Key-value Sucessfully");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void displaydata(String key) {
		// Convert the Physical file into Java Understandable
		try {
			fis=new FileInputStream(PropertyPath);
		} catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		//creating Instance for Properties class
		p= new Properties();
		// load the all Common Data
				try {
					p.load(fis);
				} catch (IOException e) {
					e.printStackTrace();
				}
		//fetch the data
		String data=p.getProperty(key);
		
		//print on console
		System.out.println(data);
	}

}
