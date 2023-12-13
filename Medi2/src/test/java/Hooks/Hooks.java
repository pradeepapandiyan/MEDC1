package Hooks;

import BaseClass.baseClass;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

public class Hooks extends baseClass{

	@BeforeStep
	public void BeforeStep(Scenario scenario) {
		
		
		
	}  
	@AfterStep
	public void AfterStep(Scenario scenario) {
	
		if (scenario.isFailed()) {
			scenario.attach(reports_Screenshot(),"image/png","screenshot");
		}
		
	}
	@Before
	public void BeforeHooks() {
		System.out.println("=========Application is started =========");

	}
	
	
	@After
	public void AfterHooks(Scenario scenario) {
		System.out.println(	scenario.getName());
		System.out.println(scenario.getStatus());
		System.out.println("=======Application End===============");
	//scenario.attach(reports_Screenshot(), "image/png","screenshot");
	//driver.quit();
	}
}