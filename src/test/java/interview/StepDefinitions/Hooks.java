package interview.StepDefinitions;

import cucumber.api.Scenario;
import interview.Utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

	
	@Before("@ui")
	public void setUp() {
		System.out.println("Setting up webdriver");
		Driver.getDriver();

	}
	
	@After("@ui")
	public void tearDown(Scenario scenario) {

		if (scenario.isFailed()) {

			final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
			scenario.embed(screenshot, "image/png");
		}
		Driver.closeDriver();
	}
}
