package Sample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
//write the data in excel
public class ExcelTravel {
	public static void main(String[] args) throws Throwable {
		FileInputStream fis=new FileInputStream("D:\\Java\\Book2.xlsx");
		Workbook book=WorkbookFactory.create(fis);
		//row constant cell is changing
		book.getSheet("sheet1").createRow(1).createCell(1).setCellValue("Priya");
		book.getSheet("sheet1").getRow(1).createCell(2).setCellValue("priya@gmail.com");
		book.getSheet("sheet1").getRow(1).createCell(3).setCellValue("Priya@123");
		book.getSheet("sheet1").getRow(1).createCell(4).setCellValue("9328653456");
		book.getSheet("sheet1").getRow(1).createCell(5).setCellValue("31/12/2000");
		book.getSheet("sheet1").getRow(1).createCell(6).setCellValue("welcome");
		book.getSheet("sheet1").createRow(2).createCell(1).setCellValue("Pravalika");
		book.getSheet("sheet1").getRow(2).createCell(2).setCellValue("priya12@gmail.com");
		book.getSheet("sheet1").getRow(2).createCell(3).setCellValue("Pravalika@66");
		book.getSheet("sheet1").getRow(2).createCell(4).setCellValue("7654385927");
		book.getSheet("sheet1").getRow(2).createCell(5).setCellValue("12/6/2000");
		book.getSheet("sheet1").getRow(2).createCell(6).setCellValue("hello");
		FileOutputStream fos=new FileOutputStream("D:\\Java\\Book2.xlsx");
		book.write(fos);
		book.close();
		System.out.println("data");
	}

}
