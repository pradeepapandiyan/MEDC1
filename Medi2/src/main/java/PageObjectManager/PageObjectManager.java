package PageObjectManager;

import org.openqa.selenium.WebDriver;

import BaseClass.Locators;
import BaseClass.baseClass;

public class PageObjectManager extends baseClass
{
	public PageObjectManager(WebDriver driver)
	{
		this.driver=driver;
	}
	private Locators locators;
	public Locators getLocator() {
		if (locators==null) {
			locators=new Locators(driver);
		}
		return locators;
	}

}
