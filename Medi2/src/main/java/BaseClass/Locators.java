package BaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Locators extends baseClass
{
	
	public Locators(WebDriver driver) 
	{
		 this.driver=driver;
		 PageFactory.initElements(driver, this);

	}
	@FindBy(xpath = "//input[@id='signInName']")
	public WebElement userName;
	
	@FindBy(xpath = "//input[@id='password']")
	public WebElement Password;
	
	@FindBy(xpath = "//button[contains(text(),'Log in')]")
	public WebElement Login;
	
	@FindBy(xpath = "//button[contains(text(),'OK')]")
	public WebElement welcome;
	
	@FindBy(xpath = "//span[contains(text(),'Welcome')]")
	public WebElement homePage;
	
	@FindBy(xpath = "//div//ul//li//a[contains(text(),'Request Forms ')]")
	public WebElement tab;
	
	@FindBy(xpath = "//div//a[contains(text(),'Create New Request')][1]")
	public WebElement form;
	
	@FindBy(xpath = "//input[@name='data[title]']")
	public WebElement formTitle;
	
	@FindBy(xpath = "//input[@name='description']")
	public WebElement eventTitle;
	
	@FindBy(xpath = "//select[@id='regionId']/option[contains(text(),'Global')]")
	public WebElement region;
	
	@FindBy(xpath = "//input[@id='event-start-date']")
	public WebElement startDate;
	
	@FindBy(xpath = "//button[contains(text(),'Submit Request')]")
	public WebElement submitButton;
	
	@FindBy(xpath = "//div[contains(text(),'Request submitted successfully')]")
	public WebElement formsubmissionMessage;
	
	
	
	

}
