package Testcases;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import dsalgobase.dsalgobase;
import dsalgopages.Graphpage;
import dsalgopages.loginpage;

public class GraphpageTest extends dsalgobase {
	Graphpage GHPage;
	loginpage lp;
	@DataProvider (name = "codeInput2")
	public Object[][] Textarea(){
		return new Object[][] {{"print('Hello, Testing Graphpages...')"}};
	}
	
	@Test(priority=1,dataProvider = "codeInput2")
	public void arrayTest(String text){
		driver.get("https://dsportalapp.herokuapp.com/");
		lp = new loginpage(driver);
		GHPage = new Graphpage(driver);
		try {
			System.out.println("URL is opened");
			lp.getLogin("xyzabc123", "nobody@123");
			GHPage.GraphGetStarted();
			waitforseconds(2);
			Assert.assertTrue(driver.getTitle().equals("Graph"));
			GHPage.clickongraphbutton();
			Assert.assertTrue(driver.getTitle().equals("Graph"));
			GHPage.navigateToTryHere();
			Assert.assertTrue(driver.getTitle().equals("Assessment"));
			GHPage.textarea(text);
			GHPage.clickRun();
			waitforseconds(2);
			}
		catch(Exception e) {
			e.printStackTrace();
		}
		driver.navigate().back();}
	
		@Test(priority = 2, dataProvider = "codeInput2")
		public void Graphres(String text) {		
			GHPage = new Graphpage(driver);
		try {
		GHPage.navigatetoGh_res();
		Assert.assertTrue(driver.getTitle().equals("Graph Representations"));
		Actions scr=new Actions(driver);
		scr.sendKeys(Keys.END);
		GHPage.navigateToTryHere();
		Assert.assertTrue(driver.getTitle().equals("Assessment"));
		GHPage.textarea(text);
		GHPage.clickRun();
		waitforseconds(2);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		driver.navigate().back();
		}
	
		@Test(priority = 3, dataProvider = "codeInput2")
		public void GraphpreQ(String text) {
			GHPage = new Graphpage(driver);
		
	//PracticeQuestionsTab
			GHPage.Practiceques();
			Assert.assertTrue(driver.getTitle().equals("Practice Questions"));
			waitforseconds(2);
		driver.navigate().back();
		waitforseconds(2);
		lp.signOut();
		
		
}}