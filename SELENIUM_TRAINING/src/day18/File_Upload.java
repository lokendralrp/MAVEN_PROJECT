package day18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class File_Upload 
{
        public static void main(String[] args) throws InterruptedException, FindFailed 
        {
		
		System.setProperty("webdriver.chrome.driver","C:\\JAVA\\selenium\\setup\\chromedriver files\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/FileUpload.html");
		
		
//choose file xpath		
		driver.findElement(By.xpath("//*[@id='input-4']")).click();

//snipped images path		
		String imagesFilepath="C:\\Users\\my acer\\Desktop\\snipped images\\";
//files to upload		
		String inputFilepath="C:\\Users\\my acer\\Desktop\\upload files\\";
		
		 Screen s = new Screen();
//snipped images name		 
	     Pattern fileInputTextBox = new Pattern(imagesFilepath + "location input box.PNG");
	     Pattern openButton = new Pattern(imagesFilepath + "OpenButton.PNG");
		
		Thread.sleep(5000);
		
		s.wait(fileInputTextBox, 20);
		s.type(fileInputTextBox,inputFilepath+"apple.jpg");
		s.click(openButton);
		
	}


}
