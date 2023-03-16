package Runner;
import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features={"src/main/java/features/SiteUser.feature"},
		glue={"stepDefinitions"},
		plugin = {"pretty","html:target/cucmberReports/test-outout.html","json:target/cucumberjsonOutput/cucumber.json","junit:junit_xml/cucumber.xml"},//to put report 
		stepNotifications = true,
		dryRun=true,
		monochrome=true
//		,tags= "@SiteUser"
		)




public class testRunner {
	





}
