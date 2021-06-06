package testcase;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public String[][] excelData(String fileName) throws IOException {
		//step1: set up the workbook path
		XSSFWorkbook wb = new XSSFWorkbook("./data/"+fileName+".xlsx");
		//step2: get into the Worksheet
		XSSFSheet ws = wb.getSheet("Sheet1");
		//to get the row count
		int rows = ws.getLastRowNum(); //exclude the first row
		
		//to get the number of cells in a row
		int cells = ws.getRow(0).getLastCellNum();
		
		//declare 2D array
		String[][] data = new String[rows][cells];
				
		for (int i = 1; i <= rows; i++) {
			for (int j = 0; j < cells; j++) {
				String value = ws.getRow(i).getCell(j).getStringCellValue();
				System.out.println(value);
				data[i-1][j] = value;
			}
				
		}
		//to close the workbook
		wb.close();
		
		return data;
		

		//step3: get into the row; row index starts from 0
		//XSSFRow row = ws.getRow(i);
		
		//step4: to get into the cell
		//XSSFCell cell = row.getCell(0);
		
		
		//step5: to read the data from a cell
		//String value = cell.getStringCellValue();	
		
		
		
	}

}
