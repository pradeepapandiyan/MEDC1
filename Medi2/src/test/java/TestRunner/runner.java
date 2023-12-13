package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;
@CucumberOptions(
		features={"src\\test\\java\\Features\\FormSubmission.feature"},
		glue= {"StepDefinition", "Hooks"},
		plugin = {"pretty",
				 "html:target\\report\\Medi_report.html",
				 "json:target\\report\\Medi_JReport.json",
				 "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
				},

		snippets=SnippetType.CAMELCASE,
		dryRun =!true)
				
		
public class runner extends AbstractTestNGCucumberTests
{
	
}
