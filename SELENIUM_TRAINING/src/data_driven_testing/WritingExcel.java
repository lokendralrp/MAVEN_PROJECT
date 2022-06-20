package data_driven_testing;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WritingExcel 
{
	public void writeexcelfile() throws IOException
	{
		FileOutputStream file = new FileOutputStream("C://JAVA//selenium//setup//TEST EXCEL/welcome.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook();
		
		XSSFSheet sheet=workbook.createSheet("data");
		
		for(int i=0;i<=5;i++)
		{
			XSSFRow row=sheet.createRow(i);
			
			for(int j=0;j<3;j++)
			{
				row.createCell(j).setCellValue("welcome");
			}
		}
		workbook.write(file);
		System.out.println("Writing excel is completed");	
	}	
	
	public static void main(String[] args) throws IOException 
	{
		WritingExcel we=new WritingExcel ();
		//we.driverSettings();
		we.writeexcelfile();
		
	}
}



