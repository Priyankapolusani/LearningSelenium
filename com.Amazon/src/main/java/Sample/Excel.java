package Sample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.time.Duration;

import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class Excel {
	public static void main(String[] args) throws Throwable {
		//Convert the Physical file int java
	FileInputStream fis=new FileInputStream("D:\\Java\\Book2.xlsx");
	//create workbook
	Workbook book=WorkbookFactory.create(fis);
	
	//UsingWorkBook go to Sheet,row,column and cell fetch the data
	String data=book.getSheet("sheet1").getRow(1).getCell(3).getStringCellValue();
	
	//Create a new column and write
	book.getSheet("sheet1").getRow(0).createCell(4).setCellValue("Status");
	
	//Update the exixting Data in Excel
	book.getSheet("sheet1").getRow(1).createCell(4).setCellValue("fail");
	
	//Convert java data into physical file
	FileOutputStream fos=new FileOutputStream("D:\\\\Java\\\\Book2.xlsx");
	
	//write the Data
	book.write(fos);
	
	//close the excel
	book.close();
	
	/*DataFormatter df=new DataFormatter();
	book.getSheet("sheet1").getRow(0).createCell(0).setCellValue("Name");
	book.getSheet("sheet1").getRow(0).createCell(1).setCellValue("Email");
	book.getSheet("sheet1").getRow(0).createCell(2).setCellValue("Password");
	
	FileOutputStream fos= new FileOutputStream("D:\\\\Java\\\\Book2.xlsx");
	book.write(fos);*/
	
	
	System.out.println("pass");
	System.out.println(data);
	
	}

}
