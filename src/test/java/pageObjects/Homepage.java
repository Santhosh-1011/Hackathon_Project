package pageObjects;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.ExcelUtility;

public class Homepage extends Basepage{
	
	public Homepage(WebDriver driver) 
	{
		super(driver);
	}
	@FindBy(xpath="//*[@id='search']")
	// Enter BookShelves 
	WebElement searchbox;
	
	@FindBy(xpath="//*[@class='search-icon icofont-search']")
	// Click the search button
	WebElement searchbutton;
	
	public void search() throws IOException
	{
		
		searchbox.sendKeys(ExcelUtility.getCellData("Sheet1",0,1));
	}
	
	public void button()
	{
		searchbutton.click();
	}
}

