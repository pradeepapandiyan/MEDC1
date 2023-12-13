package BaseClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class baseClass 

{
  public static WebDriver driver;
  public static WebDriverWait wait;
  public static void Browserlaunch(String BrowserName)
  {
//	  System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\configProperty\\Driver\\chromedriver-win32\\chromedriver.exe");
//
//	  ChromeOptions chromeOptions = new ChromeOptions();
//	  chromeOptions.addArguments("--remote-allow-origins=*");
//	  chromeOptions.addArguments("--headless"); // Enable headless mode
//	  chromeOptions.addArguments("--window-size=1920,1080");
//	  
//	  driver = new ChromeDriver(chromeOptions);
	  ChromeOptions chromeOptions = new ChromeOptions();
	  chromeOptions.addArguments("--remote-allow-origins=*");
	  driver = new ChromeDriver(chromeOptions);
	  driver.manage().window().maximize();
  }
  public void geturl(String url) 
  {
	try {
		driver.get(url);
	} catch (Exception e) {
		
		e.printStackTrace();
	}
  }
  //Base Class for Click
   
  public void elementClick(WebElement element) 
  {
	try 
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(70));
		wait.until(ExpectedConditions.visibilityOf(element));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].style.border='5px solid Green'",element);
		element.click();
	} 
	catch (Exception e) 
	{
		e.printStackTrace();
	}
 }
  public static void elementSendKeys(WebElement element,String value) {
		try {
				//visiablityofelement().until(ExpectedConditions.visibilityOf(element));
			    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(70));
			    wait.until(ExpectedConditions.visibilityOf(element));
				JavascriptExecutor js=(JavascriptExecutor)driver;
				js.executeScript("arguments[0].style.border='5px solid Green'",element);

				element.sendKeys(value);
} 				catch (Exception e) {
				System.err.println("Unable to Enter the value : "+e.getMessage());
}
}
  
  //Base Class for Send Keys
 
  public void sendKeys(WebElement element, String text)
  {     
      element.sendKeys(text);
  }
  
  //Base Class for Get Text
  
  public String getText( WebElement element ) 
  {
	  WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(70));
	  wait.until(ExpectedConditions.visibilityOf(element));
      return element.getText();
  }
  
  // Method to wait for element visibility and click
  public void clickWhenVisible(WebElement element) 
  {
      wait.until(ExpectedConditions.visibilityOf(element));
      element.click();
  }

  public void Assertion(WebElement element, String text) 
  {
	    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(70));
	    wait.until(ExpectedConditions.visibilityOf(element));
	    String text1 = element.getText();
	    System.out.println(text1);
		Assert.assertEquals(text, text1);

  }
  
	////////////////////////////////Screenshot/////////////////////////////////
	public static byte[] reports_Screenshot() {
				byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
				return screenshot;
	}
}
