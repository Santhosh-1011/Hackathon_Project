package StepDefinition;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;



import PageFactory.BaseclassCucumber;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {

	static WebDriver driver;
	 static Properties p;
	@Before
	public static  void setup() throws IOException, InterruptedException
	{
		driver=BaseclassCucumber.getWebDriver();
		p=BaseclassCucumber.getProperties();
		driver.get(p.getProperty("URL"));
		driver.manage().window().maximize();
	}

	@After
	public void tearDown()
	{
		driver.quit();
	}
	@AfterStep
	public void addScreenshot(Scenario scenario) {
	  if(!scenario.isFailed()) {
	  	TakesScreenshot ts=(TakesScreenshot) driver;
	  	byte[] screenshot=ts.getScreenshotAs(OutputType.BYTES);
	  	scenario.attach(screenshot, "image/png",scenario.getName());
	  }
	}
}
