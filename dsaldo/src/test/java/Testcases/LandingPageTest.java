package Testcases;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
//import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Utilities.Loggerclass;
import dsalgobase.dsalgobase;
import dsalgopages.Landingpage;

public class LandingPageTest extends dsalgobase {
//private static Logger logger;
/*@BeforeClass
public void logclass() {
	 logger=(Logger) LogManager.getLogger();
}*/

@Test
	public void landingtest() {
	Landingpage LDPage = new Landingpage(driver);
	LDPage.getstart();
	
	if(driver.getTitle().equals("NumpyNinja"))
	{
		Assert.assertTrue(true);
		Loggerclass.info("We are in Landing Page");
	}
	else
	{
		
		Assert.assertTrue(false);
		Loggerclass.info("We are not in Landing Page");
	
	
}

}}
