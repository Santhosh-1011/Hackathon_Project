package pageObjects;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import utilities.ExcelUtility;


	public class BookShelves extends Basepage{
		
		public BookShelves(WebDriver driver) 
		{
			super(driver);
		}
		
		Actions act;
		
		@FindBy(xpath="//*[@class='close-reveal-modal hide-mobile']")
		// click on the close pop-up icon
		WebElement cl;
		
		@FindBy(xpath="//*[@id='filters-form']/div[1]/div/div/ul/li[1]")
		// click on the category 
		WebElement ct;
		
		@FindBy(xpath="//*[@id='filters_primary_category_Kids_Bookshelves']")
		// click kids BookShelves check box
		WebElement Bs;
		
		@FindBy(xpath="//*[@id='filters-form']/div[1]/div/div/ul/li[2]")
		// click on the price icon
		WebElement pr;
		
		@FindBy(xpath="//*[@class='noUi-handle noUi-handle-upper']")
		// Adjust the slider under price 
		WebElement upp;
		
		@FindBy(xpath="//*[@id='filters_availability_In_Stock_Only']")
		// click the exclude stock check box
		WebElement st;
		
		@FindBy(xpath="(//*[text()='Recommended'])[1]")
		//click on the Recommended icon
		WebElement val;
		
		@FindBy(xpath="//div[@class='data arrow_box']/ul/li[3]")
		// click High to Low under Recommended option
		WebElement hl;
		
		@FindBy(xpath = "//div[@class='product-info-block']//span[@itemprop]")
		// Display Name of the BookShelves
		List<WebElement> num;
		
		@FindBy(xpath = "(//div[@class='product-info-block'])//div[@class='price-number']/span")
		// Display price of the BookShelves
		List<WebElement> amt;
		
		public void close()
		{
			cl.click();
		}
		
		public void category()
		{
			ct.click();
		}
		
		public void Bookshelves()
		{
			Bs.click();
		}
		
		public void price()
		{
			pr.click();
		}
		
		public void slider()
		{
			act=new Actions(driver);
			//low.click();
			upp.click();
			act.dragAndDropBy(upp,-212, -91).perform();
		}
		
		public void stock()
		{
			st.click();
		}
		
		public void Recommended()
		{
			val.click();
		}
		
		public void hightolow()
		{
			hl.click();
		}
		
		public void name() throws IOException
		{
			int row=0;
			for(int i=0;i<3;i++) {
	    		String s1=num.get(i).getText();
	    		String s2=amt.get(i).getText();
	    		String s3=s1+s2;
	    		System.out.println(s3);
	    		ExcelUtility.setCellData("Sheet2",row,0,s3);
	    		row++;
			}
		}
		
		
	}
