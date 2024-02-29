package pageObjects;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import utilities.ExcelUtility;

public class GiftCards extends Basepage{
	
	public GiftCards(WebDriver driver) 
	{
		super(driver);
	}

	@FindBy(xpath="//*[@class='topnav_item livingunit']")
	// click on the living option
	WebElement liv;
	
	@FindBy(xpath="(//ul[@class='taxonslist'])[8]//span")
    // Display values under living storage
	List<WebElement>item;
	
	@FindBy(xpath="(//*[@class='featuredLinksBar__link'])[3]")
	// click on the Gift Cards option
	WebElement gf;
	
	@FindBy(xpath="//*[@class='_1bluI']")
	// scroll down under gift cards
	WebElement sc;
	
	@FindBy(xpath="(//*[@class='_2ebST'])[3]")
	// click on Birthday or Anniversary option
	WebElement bir;
	
	@FindBy(xpath="(//*[@class='HuPJS'])[1]")
	// click amount under Gift Cards
	WebElement amt;
	
	@FindBy(xpath="(//*[@class='Upz18 _1hLiD UJU2v'])[1]")
	// select month under Gift Cards
	WebElement sel;
	
	@FindBy(xpath="(//*[@class='Upz18 _1hLiD UJU2v'])[2]")
	// select date under Gift Cards
	WebElement dat;
	
	@FindBy(xpath="//*[@class='_1IFIb _1fVSi action-button _1gIUf _1XfDi']")
	// click next button
	WebElement ele;
	
	@FindBy(xpath="//*[@id='ip_4036288348']")
	// Enter Recipient Name
	WebElement Rname;
	
	@FindBy(xpath="//*[@name='recipient_email']")
	// Enter Recipient Email
	WebElement Remail;
	
	@FindBy(xpath="//*[@name='recipient_mobile_number']")
	// Enter Recipient Mobile Number
	WebElement Rmobile;
	
	@FindBy(xpath="//*[@name='customer_name']")
	// Enter Customer Name
	WebElement Cname;
	
	@FindBy(xpath="//*[@name='customer_email']")
	// Enter Customer Email
	WebElement Cemail;
	
	@FindBy(xpath="//*[@name='customer_mobile_number']")
	// Enter Customer Mobile Number
	WebElement Cmobile;
	
	@FindBy(xpath="//*[@name='customer_address']")
	// Enter Customer Address
	WebElement Caddress;
	
	@FindBy(xpath="(//*[@class='tDZNG _15qWO'])[8]")
	// Enter Customer Pin code
	WebElement pincode;
	
	@FindBy(xpath="//*[@id='ip_1554905400']")
	// Enter Customer City
	WebElement city;
	
	@FindBy(xpath="//*[@type='submit']")
	// Click on Submit Button
	WebElement submit;
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	
	public void living()
	{
		liv.click();
	}
	
	public void livingstorage() throws IOException 
	{
		int row=0;
		String data="";
		for(WebElement e:item) {		
    		data=e.getText();
    		System.out.println(data);
    		ExcelUtility.setCellData("Sheet2",row,4,data);
    		row++;
	}
	}
	
	public void giftcards()
	{
		gf.click();
	}
	
	public void scroll()
	{
		js.executeScript("arguments[0].scrollIntoView();",sc);
	}
	
	public void Birthdayoranniversary()
	{
		bir.click();
	}
	public void amount()
	{
		amt.click();
	}
	
	public void month()
	{
		Select s=new Select(sel);
		s.selectByVisibleText("Mar (2024)");
	}
	
	public void date()
	{
		Select d=new Select(dat);
		d.selectByVisibleText("15");
	}
	
	public void next()
	{
		ele.click();
	}
	
	public void details() throws IOException, InterruptedException
	{
		Rname.sendKeys(ExcelUtility.getCellData("Sheet1",2,1));
		Remail.sendKeys(ExcelUtility.getCellData("Sheet1",3,1));
		Rmobile.sendKeys(ExcelUtility.getCellData("Sheet1",4,1));
		Cname.sendKeys(ExcelUtility.getCellData("Sheet1",5,1));
		Cemail.sendKeys(ExcelUtility.getCellData("Sheet1",6,1));
		Cmobile.sendKeys(ExcelUtility.getCellData("Sheet1",7,1));
		Caddress.sendKeys(ExcelUtility.getCellData("Sheet1",8,1));
		pincode.sendKeys(ExcelUtility.getCellData("Sheet1",9,1));
		Thread.sleep(2000);
		submit.click();
	}
	
	public void warning_msg() throws IOException
	{
		int row=0;
		String remail=Remail.getAttribute("validationMessage");
		ExcelUtility.setCellData("Sheet2",row,7,remail);
	    System.out.println(remail);
	}
	
	public void valid_details() throws InterruptedException, IOException
	{
		Remail.clear();
		Remail.sendKeys(ExcelUtility.getCellData("Sheet1",10,1));
		Thread.sleep(2000);
		submit.click();
	}
	
	public void warning_msg2() throws IOException
	{
		String tomail=Cemail.getAttribute("validationMessage");
		ExcelUtility.setCellData("Sheet2",2,7,tomail);
		System.out.println(tomail);
	}
	
	public void valid_details2() throws InterruptedException, IOException
	{
		Cemail.clear();
		Cemail.sendKeys(ExcelUtility.getCellData("Sheet1",11,1));
		Thread.sleep(2000);
		submit.click();
		Thread.sleep(3000);
	}
	
}
