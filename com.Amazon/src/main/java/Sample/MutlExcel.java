package Sample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class MutlExcel {
	public static void main(String[] args) throws Throwable {
		FileInputStream fis=new FileInputStream("D:\\Java\\javacodes\\com.Amazon\\src\\test\\resources\\Data\\TestData.xlsx");
		Workbook book=WorkbookFactory.create(fis);
		Sheet sh=book.getSheet("sheet1");
		int count=sh.getLastRowNum();
		for(int i=1; i<=count;i++) {
			String data=book.getSheet("sheet1").getRow(i).getCell(0).getStringCellValue();
			System.out.println(data);
		}
	}

}
