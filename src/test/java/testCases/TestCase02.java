package testCases;

import java.io.IOException;
import org.testng.annotations.Test;

import pageObjects.BookShelves;
import testBase.BaseClass;

public class TestCase02 extends BaseClass{
	BookShelves Bs;
	@Test(priority=1)
public	void popup() throws InterruptedException
	{
		logger.info("********Click KidBookshelves********");
		Bs=new BookShelves(driver);
		Thread.sleep(2000);
		Bs.close();
		Bs.category();
		Bs.Bookshelves();
	}
	
	@Test(priority=2)
public	void searchprice() throws InterruptedException
	{
		logger.info("*******Search Price*******");
		Thread.sleep(2000);
		Bs.price();
		Thread.sleep(2000);
		Bs.slider();
		Bs.stock();
	}
	@Test(priority=3)
	void find() throws InterruptedException
	{
		logger.info("******HightoLow******");
		Thread.sleep(2000);
		Bs.Recommended();
		Bs.hightolow();
	}
    @Test(priority=4)
    void printprice() throws IOException, InterruptedException
    {
    	logger.info("************Display Name and Price of the BookShelves**********");
    	System.out.print("-----------Name and Price of the Books-----------");
    	System.out.println("");
    	Bs.name();
    	Thread.sleep(2000);
    }
}
