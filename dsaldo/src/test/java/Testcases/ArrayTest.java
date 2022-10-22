package Testcases;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import dsalgobase.dsalgobase;
import dsalgopages.HomePage;
import dsalgopages.arraypage;
import dsalgopages.loginpage;

public class ArrayTest extends dsalgobase {
	loginpage lp;
	HomePage hp;
	arraypage aPage;

	@DataProvider(name = "codeInput")
	public Object[][] Textarea() {
		return new Object[][] { { "print('Hello, Testing array pages...')" } };
	}

	@Test(priority = 1, dataProvider = "codeInput")
	public void arrayTest(String text) {
		loginpage lp = new loginpage(driver);
		lp.getLogin("xyzabc123", "nobody@123");
		aPage=new arraypage(driver);
		aPage.clickArrayGetStarted();
		// arrpython

		// Navigate to arrays in python link
		aPage.navigateToArraysInPython();

		// are we in arrays in python
		Assert.assertTrue(driver.getTitle().equals("Arrays in Python"));
		System.out.println("Cursor in the Arrays in the Python page");
		waitforseconds(5);
		// Navigate to Try here link
		aPage.navigateToTryHere();

		// are we in Assesment page
		Assert.assertTrue(driver.getTitle().equals("Assessment"));

		// Input code for python code test
		aPage.textarea(text);

		// click run button
		aPage.clickRun();
		waitforseconds(2);

		driver.navigate().back();
		//lp.signOut();
	}

	@Test(priority = 2, dataProvider = "codeInput")
	public void arrayList(String text) {
		aPage=new arraypage(driver);
		//aPage.clickArrayGetStarted();
		
		
		Actions action=new Actions(driver);
		action.sendKeys(Keys.UP);
		waitforseconds(2);
				// Navigate to arrays using list link
			aPage.navigateToArrayUsingList();

		   Assert.assertTrue(driver.getTitle().equals("Arrays Using List"));
		   System.out.println("Cursor in the Arrays Using List page");
     		//waitforseconds(2);
			aPage.navigateToTryHere();
			Assert.assertTrue(driver.getTitle().equals("Assessment"));

			// Input code for python code test
			aPage.textarea(text);

			// click run button
			aPage.clickRun();
			driver.navigate().back();
		}

	@Test(priority = 3, dataProvider = "codeInput")
	public void arraybasiuc(String text) {
		aPage=new arraypage(driver);
		//aPage.clickArrayGetStarted();
		// Navigate to Basic Operations in Lists link
			aPage.clickBasicOpsInLists();
			Assert.assertTrue(driver.getTitle().equals("Basic Operations in Lists"));
			System.out.println("Cursor in the Basic Operations in Lists page");
			waitforseconds(5);
			aPage.navigateToTryHere();
			// are we in Assesment page
			Assert.assertTrue(driver.getTitle().equals("Assessment"));
			// Input code for python code test
			aPage.textarea(text);

			// click run button
			aPage.clickRun();
			waitforseconds(2);
		driver.navigate().back();
		//lp.signOut();
	}

	@Test(priority = 4, dataProvider = "codeInput")
	public void arrayapp(String text) {
		aPage=new arraypage(driver);
			aPage.clickApplicationsOfArray();
			// are we in Assesment page
			Assert.assertTrue(driver.getTitle().equals("Applications of Array"));
			System.out.println("Cursor in the Applications of Array page");
			waitforseconds(2);
			aPage.navigateToTryHere();
			// are we in Assesment page
			Assert.assertTrue(driver.getTitle().equals("Assessment"));
			// Input code for hello world test
			aPage.textarea(text);

			aPage.clickRun();//run button
			waitforseconds(2);
			driver.navigate().back();
		waitforseconds(2);
	}
		
		@Test(priority = 5, dataProvider = "codeInput")
		public void arrayPracQ(String text) {
			lp = new loginpage(driver);
			aPage=new arraypage(driver);
			//aPage.clickArrayGetStarted();
			// Navigate to Basic Operations in Lists link
				aPage.PracQues();
				Assert.assertTrue(driver.getTitle().equals("Practice Questions"));
				System.out.println("Cursor in the ArrayPractice Questions page");
				waitforseconds(2);
				//aPage.navigateToTryHere();
				// are we in Assesment page
				//Assert.assertTrue(driver.getTitle().equals("Assessment"));
				// Input code for python code test
				//aPage.textarea(text);

				// click run button
				//aPage.clickRun();
				//waitforseconds(2);
			driver.navigate().back();
			lp.signOut();
		}
		
	}


