package Testcases;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Testcases.RegistrationPageTest.RegistrationTest;
import dsalgobase.dsalgobase;
import dsalgopages.HomePage;
import dsalgopages.Landingpage;
import dsalgopages.loginpage;

public class loginpagetest extends dsalgobase {
	loginpagetest Lptest;
	loginpage lPage;
		
	@DataProvider(name="testdata")
	public Object[][] testdata(){
		return new Object[][] {
			{"xyzabc123","nobody@123"}
			//{"","nobody@123"},
			//{"xyzabc123",""},
			//{"xyz123","nobody@123"}
			};}
	
	@Test(priority=2,dataProvider="testdata")
		public void loginTestdd(String user,String Pass){
			driver.get("https://dsportalapp.herokuapp.com/");
		     lPage = new loginpage(driver);
			System.out.println("URL is opened");
			lPage.getLogin(user, Pass);
			
			if(driver.getTitle().equals("NumpyNinja"))
			{
				Assert.assertTrue(true);
				System.out.println("Login test pass");
			}
			else
			{
				Assert.assertTrue(false);
				System.out.println("login fail");
			}
			
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			lPage.signOut();
	}
	
@Test(priority=3)
public void Loginsucess() {
	driver.get("https://dsportalapp.herokuapp.com/");
	lPage = new loginpage(driver);
	lPage.getLogin("xyzabc123","nobody@123");
	
}

	



//lPage.signOut();



	}

