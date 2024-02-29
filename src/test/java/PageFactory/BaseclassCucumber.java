package PageFactory;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseclassCucumber {
	static Properties p;
	static WebDriver driver;
	//To initialize browser
	public static WebDriver getWebDriver() throws IOException {	
		FileReader file=new FileReader(".//src/test/resources/config.properties");
		Properties obj = new Properties();
		obj.load(file);		
		String browserName=obj.getProperty("browser");	
		if(browserName.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("edge")) {
				 driver=new EdgeDriver();
		}
		else {
			System.out.println("Enter a Valid Browser");
		}	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		return driver;
	}
	public static WebDriver getDriver() {

		return driver;
	}

   //To load property file
	public static Properties getProperties() throws IOException
	{		 
		FileReader file=new FileReader(".//src/test/resources/config.properties");
	   p=new Properties();
	   p.load(file);
		return p;
	}
 
}
