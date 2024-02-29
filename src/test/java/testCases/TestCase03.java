package testCases;

import java.io.IOException;
import org.testng.annotations.Test;
import pageObjects.GiftCards;
import testBase.BaseClass;

public class TestCase03 extends BaseClass{

	 GiftCards Gf;
     @Test(priority=1,groups= {"sanity"})
     void getliving() throws InterruptedException, IOException
     {
    	 logger.info("***********Display values under living storage************");
    	 System.out.print("-------------------Values of Living Storage--------------------");
    	 System.out.println("");
    	 Gf=new GiftCards(driver);
    	 Gf.living();
    	 Thread.sleep(2000);
    	 Gf.livingstorage();
     }
     
     @Test(priority=2,groups= {"sanity","regression"})
     void getvalue() throws InterruptedException
     {
    	 logger.info("************click on Gift Cards***********");
    	 Gf.giftcards();
     }
     
     @Test(priority=3,groups= {"sanity","regression"})
     void scrolldown() throws InterruptedException
     { 
    	 logger.info("******click on Birthday or anniversary*******");
    	 Gf.scroll();
    	 Gf.Birthdayoranniversary();
     }
     
     @Test(priority=4,groups= {"sanity","regression"})
     void entervalues()
     {
    	 logger.info("************Enter values under Gift Cards**************");
    	 Gf.amount();
    	 Gf.month();
    	 Gf.date();
    	 Gf.next();
     }
     
     @Test(priority=5,groups= {"sanity","regression"})
     void enterdetails() throws InterruptedException, IOException 
     {
    	 try {
    		 logger.info("***********Enter the details***********");
    	     Gf.details();
     }
    	 catch(Exception e) {
        	 System.out.println(e); 
     }
    	 System.out.print("-------------------Validation Message--------------------");
    	 System.out.println("");
    	 logger.info("**************Validate the warning message************");
    	 Gf.warning_msg();
    	 Thread.sleep(2000);
     }
    	 @Test(priority=6,groups= {"sanity","regression"})
    	 void msg() throws InterruptedException, IOException
    	 {
    	 Gf.valid_details();
    	 Gf.warning_msg2();
    	 }
    	 @Test(priority=7,groups= {"sanity","regression"})
    	 void valid() throws InterruptedException, IOException
    	 {
    	 Gf.valid_details2();
    	 Thread.sleep(2000);
     }
}
