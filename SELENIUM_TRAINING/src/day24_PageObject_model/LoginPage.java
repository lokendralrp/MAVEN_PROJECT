package day24_PageObject_model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	WebDriver ldriver;
	
	LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);//'this' refers to this class
	}

	@FindBy(name="userName")
	WebElement txtboxUname;
	
	@FindBy(name="password")
	WebElement txtboxpass;
	
	@FindBy(xpath="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[4]/td[2]/div/input")
	WebElement signin;
	
	public void setUserName(String uname)
	{
		txtboxUname.sendKeys(uname);
	}
	
	public void setPassword(String pwd)
	{
		txtboxpass.sendKeys(pwd);
	}
	
	public void clickSubmit()
	{
		signin.click();
	}
}
