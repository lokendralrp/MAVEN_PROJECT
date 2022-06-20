package data_driven_testing;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadingExcel 
{
	/*WebDriver driver;	
	@SuppressWarnings("deprecation")
	
	public void driverSettings()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\JAVA\\selenium\\setup\\chromedriver files\\chromedriver.exe");
		driver = new ChromeDriver();
	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	}
*/	
	public void readexcelfile() throws IOException
	{
		FileInputStream file=new FileInputStream("C://JAVA//selenium//setup//TEST EXCEL//data3.xlsx");
	
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		
		int rownum=sheet.getLastRowNum();// retuns number of rows
		int colcount=sheet.getRow(0).getLastCellNum(); // returns number of cells present in a row
		
		System.out.println(rownum);
		System.out.println(colcount);
		
		for(int r=0;r<=rownum;r++)
		{
			
			XSSFRow row=sheet.getRow(r);
			
			for(int c=0;c<colcount;c++)
			{
				//XSSFCell cell=row.getCell(c);
				//String value=cell.toString();
				String value=row.getCell(c).toString();
				System.out.print(value+"   ");
			}
			System.out.println();	
		}
	}
	
	public static void main(String[] args) throws IOException 
	{
		ReadingExcel re=new ReadingExcel ();
		//re.driverSettings();
		re.readexcelfile();
		
	}

}
