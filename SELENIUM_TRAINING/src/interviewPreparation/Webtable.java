package interviewPreparation;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\JAVA\\selenium\\setup\\chromedriver files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.selenium.dev/ecosystem/");
		
		int rows=driver.findElements(By.xpath("/html/body/div/main/div[4]/div/table/tbody/tr")).size();
		System.out.println("rows= " +rows);
		
		int columns=driver.findElements(By.xpath("/html/body/div/main/div[4]/div/table/thead/tr[1]/th")).size();
		System.out.println("columns= " +columns);
//retrieve specific row-cell value
		String value=driver.findElement(By.xpath("/html/body/div/main/div[4]/div/table/tbody/tr[1]/td[1]")).getText();
		System.out.println("value= " +value);
		
//retrieve all data
		for(int r=1; r<=rows; r++)
		{
				String data1=driver.findElement(By.xpath("/html/body/div/main/div[4]/div/table/tbody/tr["+r+"]/th[1]")).getText();
				String data2=driver.findElement(By.xpath("/html/body/div/main/div[4]/div/table/tbody/tr["+r+"]/td[1]")).getText();
				String data3=driver.findElement(By.xpath("/html/body/div/main/div[4]/div/table/tbody/tr["+r+"]/td[2]")).getText();
				System.out.print(data1+ "      					    "+data2 + "     					     "+data3);
			
			System.out.println();
		}

		
//print specific rowws or column by condition
		driver.get("https://testautomationpractice.blogspot.com/");
		
		int row=driver.findElements(By.xpath("//*[@id=\"HTML1\"]/div[1]/table/tbody/tr")).size();
		
		for(int r=2; r<=row; r++)
		{
			String book= driver.findElement(By.xpath("//*[@id=\"HTML1\"]/div[1]/table/tbody/tr["+r+"]/td[1]")).getText();
			
			if(book.equals("Master In Selenium"))
			{
				String author=driver.findElement(By.xpath("//*[@id=\"HTML1\"]/div[1]/table/tbody/tr["+r+"]/td[2]")).getText();
				String subj=driver.findElement(By.xpath("//*[@id=\"HTML1\"]/div[1]/table/tbody/tr["+r+"]/td[3]")).getText();
				System.out.println(book+ "        " +author+ "        " +subj);
			}
		}
		
		
	
		
		
	}
	
	
	
	

}
