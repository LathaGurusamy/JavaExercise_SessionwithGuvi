package ExcelFileOperation;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcel {

	public static void main(String[] args) throws IOException 
	{
      
		String excelFilePath=".\\DataExcelFile\\Reademployeedetails.xlsx";
		
		FileInputStream inputstream=new FileInputStream(excelFilePath);
		
		XSSFWorkbook workbook=new XSSFWorkbook(inputstream);
		
		//By using Sheet Name 
		//XSSFSheet sheet=workbook.getSheet("Sheet1");
		
		//By using Index 
		XSSFSheet sheet=workbook.getSheetAt(0);
		
		//Using For loop
		
		int rows=sheet.getLastRowNum();
		int cols=sheet.getRow(1).getLastCellNum();
		
		for(int r=0;r<=rows;r++)
		{
			
			XSSFRow row=sheet.getRow(r);
			for(int c=0;c<cols;c++)
			{
				XSSFCell cell=row.getCell(c);
				cell.getCellType();
				
				switch(cell.getCellType())
				{
				case STRING:System.out.printf("%-20s",cell.getStringCellValue());
				     break;
				case NUMERIC:System.out.printf("%-10.1f",cell.getNumericCellValue());
				     break;
				case BOOLEAN:System.out.printf("%-10s",cell.getBooleanCellValue());
				     break;
				}
			}
			
			System.out.println();
			
		}
		
		

	}

}
