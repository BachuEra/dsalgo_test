package Testcases;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import dsalgobase.dsalgobase;
import dsalgopages.HomePage;
import dsalgopages.LLPage;
import dsalgopages.loginpage;

public class LLTest extends dsalgobase {
	loginpage lp;
	HomePage hp;
	LLPage LLP;
	Actions action;
	
	@DataProvider(name = "codeInput3")
	public Object[][] Textarea() {
		return new Object[][] { { "print('Hello, Testing LinkedList pages...')" } };
	}
	@Test(priority = 1, dataProvider = "codeInput3")
	public void LListTest(String text) {
		loginpage lp = new loginpage(driver);
		lp.getLogin("xyzabc123", "nobody@123");
		LLP=new LLPage(driver);
		LLP.clickgetstartedLL();
		LLP.getIntro();
		Assert.assertTrue(driver.getTitle().equals("Introduction"));
		waitforseconds(1);
		LLP.navigateToTryHere();
		Assert.assertTrue(driver.getTitle().equals("Assessment"));
		LLP.textarea(text);
		LLP.clickRun();
		driver.navigate().back();
}
	
@Test(priority=2,dataProvider = "codeInput3")
public void CreateLL(String text) {
	LLP=new LLPage(driver);
	LLP.CreateLL();
	Assert.assertTrue(driver.getTitle().equals("Creating Linked LIst"));
	waitforseconds(1);
	LLP.navigateToTryHere();
	Assert.assertTrue(driver.getTitle().equals("Assessment"));
	LLP.textarea(text);
	LLP.clickRun();
	driver.navigate().back();
	
}
@Test(priority=3,dataProvider = "codeInput3")
public void TypesofLL(String text) {
	LLP=new LLPage(driver);
	LLP.TypesofLL();
	Assert.assertTrue(driver.getTitle().equals("Types of Linked List"));
	action=new Actions(driver);
	action.sendKeys(Keys.END);
	waitforseconds(1);
	LLP.navigateToTryHere();
	Assert.assertTrue(driver.getTitle().equals("Assessment"));
	LLP.textarea(text);
	LLP.clickRun();
	driver.navigate().back();
	
}
@Test(priority=4,dataProvider = "codeInput3")
	public void LLinpython(String text) {
	LLP=new LLPage(driver);
	action=new Actions(driver);
	action.sendKeys(Keys.UP);
	LLP.LLinpython();
	Assert.assertTrue(driver.getTitle().equals("Implement Linked List in Python"));
	action.sendKeys(Keys.END);
	waitforseconds(1);
	LLP.navigateToTryHere();
	Assert.assertTrue(driver.getTitle().equals("Assessment"));
	LLP.textarea(text);
	LLP.clickRun();
	driver.navigate().back();
	
	
}
@Test(priority=5,dataProvider = "codeInput3")
public void LLTravelsal(String text) {
	LLP=new LLPage(driver);
	action=new Actions(driver);
	action.sendKeys(Keys.UP);
	LLP.TravelLL();
	Assert.assertTrue(driver.getTitle().equals("Traversal"));
	action.sendKeys(Keys.END);
	waitforseconds(1);
	LLP.navigateToTryHere();
	Assert.assertTrue(driver.getTitle().equals("Assessment"));
	LLP.textarea(text);
	LLP.clickRun();
	driver.navigate().back();
	
	}
@Test(priority=5,dataProvider = "codeInput3")
public void LLInsertion(String text) {
	LLP=new LLPage(driver);
	action=new Actions(driver);
	action.sendKeys(Keys.UP);
	LLP.InsertLL();
	Assert.assertTrue(driver.getTitle().equals("Insertion"));
	action.sendKeys(Keys.END);
	waitforseconds(1);
	LLP.navigateToTryHere();
	Assert.assertTrue(driver.getTitle().equals("Assessment"));
	LLP.textarea(text);
	LLP.clickRun();
	driver.navigate().back();
	
}

@Test(priority=5,dataProvider = "codeInput3")
public void LLdeletion(String text) {
	LLP=new LLPage(driver);
	action=new Actions(driver);
	action.sendKeys(Keys.UP);
	LLP.deletionLL();
	Assert.assertTrue(driver.getTitle().equals("Deletion"));
	action.sendKeys(Keys.END);
	waitforseconds(1);
	LLP.navigateToTryHere();
	Assert.assertTrue(driver.getTitle().equals("Assessment"));
	LLP.textarea(text);
	LLP.clickRun();
	driver.navigate().back();
	
}
@Test(priority=6,dataProvider = "codeInput3")
public void practiceQues(String text) {
	lp=new loginpage(driver);
	LLP=new LLPage(driver);
	action=new Actions(driver);
	action.sendKeys(Keys.UP);
	LLP.PracQues();
	Assert.assertTrue(driver.getTitle().equals("Practice Questions"));
	driver.navigate().back();
	action=new Actions(driver);
	action.sendKeys(Keys.UP);
	lp.signOut();
	
}

	}
