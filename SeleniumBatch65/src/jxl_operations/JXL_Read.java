package jxl_operations;

import java.io.FileInputStream;
import java.io.IOException;

import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class JXL_Read {

	@Test
	public void read() throws BiffException, IOException {
		//Sample	
		FileInputStream fis = new FileInputStream("C:\\Users\\admin\\OneDrive\\Desktop\\Cities.xls");
		
		Workbook wb = Workbook.getWorkbook(fis);
		
		Sheet s = wb.getSheet(0);
		
		int totalRows = s.getRows();
		int totalColumns = s.getColumns();
		
		System.out.println("Total Rows: "+ totalRows);
		System.out.println("Total Rows: "+ totalColumns);
		//String city = s.getCell(0, 2).getContents();
		
		for(int i=0; i<s.getRows(); i++) {
			
			String data = s.getCell(0, i).getContents();
			
			System.out.println(data);
		}
		
		
		
	}
}
