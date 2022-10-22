package Testcases;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import dsalgobase.dsalgobase;
import dsalgopages.DataStructurePage;
import dsalgopages.arraypage;
import dsalgopages.loginpage;

public class DatastructureTest extends dsalgobase {
	DataStructurePage DCPage;
	loginpage lp;
	@DataProvider (name = "codeInput1")
	public Object[][] Textarea(){
		return new Object[][] {{"print('Hello, Testing datastructure pages...')"}};
	}
	@Test(priority=1,dataProvider = "codeInput1")
	public void arrayTest(String text){
		driver.get("https://dsportalapp.herokuapp.com/");
		lp = new loginpage(driver);
		DCPage = new DataStructurePage(driver);
		
			System.out.println("URL is opened");
			lp.getLogin("xyzabc123", "nobody@123");
		System.out.println("LoginSuccessfully");
			DCPage.clickongsDatastrucPage();
			Assert.assertTrue(driver.getTitle().equals("Data Structures-Introduction"));
		 //Datastructure timecomplexity
			DCPage.Timecomplexity();
			System.out.println("clicked the Timecomplexity Button");
			Assert.assertTrue(driver.getTitle().equals("Time Complexity"));
			waitforseconds(5);
			DCPage.navigateToTryHere();
			Assert.assertTrue(driver.getTitle().equals("Assessment"));
			DCPage.textarea(text);
			DCPage.clickRun();
			waitforseconds(2);
		driver.navigate().back();}

		@Test(priority = 2)
		public void DatastruPracQ() {
			DCPage = new DataStructurePage(driver);
			lp = new loginpage(driver);
		//PracticeQuestionsTab
			DCPage.Practiceques();
			Assert.assertTrue(driver.getTitle().equals("Practice Questions"));
			waitforseconds(5);
		driver.navigate().back();
		waitforseconds(2);
		lp.signOut();
	}
	
}
