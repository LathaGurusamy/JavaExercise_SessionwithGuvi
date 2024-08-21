package ExcelFileOperation;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFFactory;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//Workbook----->Sheet---->Rows---->Cells

public class WritingExcel
{

	public static void main(String[] args) throws IOException
	{
		
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet("Employee Information");
		Object empData[][] = {    { "Name" , "Age" , "Email"},
		                          { "John Doe","30" , "john@test.com" },
		                          { "Jane Doe","28" , "jane@test.com" },
		                          { "Bob Smith","35" , "jacky@example.com" },
		                          { "Swapnil","37" , "swapnil@example.com" }
		                      };
		
		
		//Using for loop
		int rows=empData.length;
	    int cols=empData[0].length;
	    
		System.out.println(rows);
		System.out.println(cols);

		for(int r=0;r<rows;r++)
		{
			
			XSSFRow row=sheet.createRow(r);
			for(int c=0;c<cols;c++)
			{
				XSSFCell cell=row.createCell(c);
				Object value=empData[r][c];
				
				if(value instanceof String)
					cell.setCellValue((String)value);
				if(value instanceof Integer)
					cell.setCellValue((Integer)value);
				if(value instanceof Boolean)
					cell.setCellValue((Boolean)value);
			}
		}
		String excelFilePath=".\\DataExcelFile\\Writeemployeedetails.xlsx";
		FileOutputStream outputstream=new FileOutputStream(excelFilePath);
		workbook.write(outputstream);
		
		outputstream.close();
		
		System.out.println("Writeemployeedetails file hasbeen  written sucessfully...");
		

		
		
		
	}
	
}
				






		

		
		
		
		
		
		
		
		
		
		
		
		
		

