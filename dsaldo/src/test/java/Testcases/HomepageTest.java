package Testcases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Testcases.RegistrationPageTest.RegistrationTest;
import Utilities.Loggerclass;
import dsalgobase.dsalgobase;
import dsalgopages.HomePage;
import dsalgopages.Landingpage;
import dsalgopages.loginpage;

public class HomepageTest extends dsalgobase {
	Logger log=(Logger)LogManager.getLogger(HomepageTest.class.getName());
	
	Landingpage LDPage;
	HomePage HPpage;
	loginpage lp;
	RegistrationPageTest Rtest;
	String Home="https://dsportalapp.herokuapp.com/home";

@Test(priority=1)
public void TestDropDown() throws InterruptedException
	{
	driver.get("https://dsportalapp.herokuapp.com/");
	lp = new loginpage(driver);
	lp.getLogin("xyzabc123", "nobody@123");
	waitforseconds(2);
	HPpage=new HomePage(driver);
	
	HPpage.ClickDropDownDataStructure();
		Assert.assertEquals(HPpage.ValidateArrays(), "Arrays");
		Loggerclass.info("arraydropdown clicked");
		Assert.assertEquals(HPpage.ValidateLinkedList(), "Linked List");
		Loggerclass.info("Linked Listdropdown clicked");
		Assert.assertEquals(HPpage.ValidateStack(), "Stack");
		Loggerclass.info("Stackdropdown clicked");
		Assert.assertEquals(HPpage.ValidateQueue(), "Queue");
		Loggerclass.info("Queuedropdown clicked");
		Assert.assertEquals(HPpage.ValidateTree(), "Tree");
		Loggerclass.info("Treedropdown clicked");
		Assert.assertEquals(HPpage.ValidateGraph(), "Graph");
		Loggerclass.info("Graphdropdown clicked");
		HPpage.CloseDropDownDataStructure();
		Loggerclass.info("dropdown closed");
   }

@Test(priority=2)
public void GSGetstarted() {
	HPpage.checkDSGetstarted();
	driver.get(Home);
}
@Test(priority=3)
public void ArrGetstarted() {
	HPpage.checkArrGetstarted();
	driver.get(Home);
}
//@Test(priority=4)
public void LinkedListGetstarted() {
	HPpage.checkLLGetstarted();
	driver.get(Home);
}
//@Test(priority=5)
public void stackGetstarted() {
	HPpage.checkStackGetstarted();
	driver.get(Home);
}
//@Test(priority=6)
public void TreeGetstarted() {
	HPpage.checkTreeGetstarted();
	driver.get(Home);
}
@Test(priority=7)
public void GraphGetstarted() {
	HPpage.checkGHGetstarted();
	driver.get(Home);
}

@Test(priority=8)
public void TestClickRegister() 	{
	//HPpage=new HomePage(driver);
	
	HPpage.ClickSignOut();
	waitforseconds(2);
	HPpage.clickRegister();
	waitforseconds(1);
	log.info("Went to registration page");
	Loggerclass.info("Went to registration page");
	//Assert.assertEquals(HPpage.validatePagetitle(),"Registration");
	driver.navigate().back();
	
	}

@Test(priority=9)
public void TestClickSignin() throws InterruptedException
	{HPpage=new HomePage(driver);
	HPpage.clickSignIn();
	waitforseconds(1);
	//Assert.assertEquals(HPpage.validatePagetitle(),"Login");
	Loggerclass.info("Went to login page");
	driver.navigate().back();
	
	}




}
