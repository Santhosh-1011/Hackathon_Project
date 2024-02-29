package testCases;

import java.io.IOException;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pageObjects.Homepage;
import testBase.BaseClass;

public class TestCase01 extends BaseClass{

	Homepage hp;
  @Test(priority=1,groups= {"sanity"})
  @Parameters({"browser"})
  public void searchbookshelves() throws IOException
  {
	 logger.info("*********Search BookShelves*********");
	  hp=new Homepage(driver);
	  hp.search();
 	  hp.button();
  }
}
