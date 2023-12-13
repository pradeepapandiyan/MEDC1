package StepDefinition;
import static org.testng.Assert.assertTrue;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.*;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseClass.Locators;
import BaseClass.baseClass;
import PageObjectManager.PageObjectManager;

import java.util.concurrent.TimeUnit;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.testng.Assert.assertEquals;
public class formSubmit extends baseClass
{
	public WebDriver driver;
	PageObjectManager pm=new PageObjectManager(driver);
	
	@Given("User is on the login page")
	public void user_is_on_the_login_page() 
	{
		Browserlaunch("Chrome");
		geturl("https://oktatest.medcompli2.com/");
	}

	@When("User enters valid username and password")
	public void user_enters_valid_username_and_password() throws InterruptedException 
	{		 
	   Thread.sleep(7000);
	   //username
	   elementSendKeys(pm.getLocator().userName, "feroze.mohamed@aroopatech.com");
	   //password
	   elementSendKeys(pm.getLocator().Password, "P@ssw0rd!23");
	   //login
	   elementClick(pm.getLocator().Login);
       
	   //welcome popup
	   elementClick(pm.getLocator().welcome);
     }

	//home page succes message
	@Then("User should be redirected to the home page")
	public void user_should_be_redirected_to_the_home_page() 
	{
		Assertion(pm.getLocator().homePage, "Welcome");
		
	}

	@Then("the user profile should be displayed")
	public void the_user_profile_should_be_displayed() throws InterruptedException
	{
		elementClick(pm.getLocator().tab);
		elementClick(pm.getLocator().form);   
		System.out.println("Form was not selected");
	}

	@Given("User is on the form submission page")
	public void user_is_on_the_form_submission_page() throws InterruptedException 
	{
		elementSendKeys(pm.getLocator().formTitle, "HCP form submission");
		elementSendKeys(pm.getLocator().eventTitle, "HCP form submission");
		elementClick(pm.getLocator().region);
		elementSendKeys(pm.getLocator().startDate, "22122023");
		elementClick(pm.getLocator().submitButton);
	}

	@Then("User should see a success message")
	public void user_should_see_a_success_message() throws InterruptedException 
	{
		
		Assertion(pm.getLocator().formsubmissionMessage, "Request submitted successfully");
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//		WebElement sm = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Request submitted successfully')]")));
//		String message1= sm.getText();
//		System.out.println(message1);
	}



}
