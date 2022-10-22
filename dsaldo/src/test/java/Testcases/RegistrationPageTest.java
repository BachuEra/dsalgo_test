package Testcases;

import java.util.UUID;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import dsalgobase.dsalgobase;
import dsalgopages.HomePage;
import dsalgopages.RegisterPage;
import dsalgopages.loginpage;

public class RegistrationPageTest {
	static RegisterPage rPage;
	RegistrationPageTest Rtest;
	//DataDriven
public class RegistrationTest  extends dsalgobase {
	 int desiredlength=8;
	String uid = UUID.randomUUID().toString().substring(0, desiredlength);
     String pwd="nobody@123";
	 String pass=pwd;
	
	@DataProvider(name="testdata")
	public Object[][] testdata(){
		return new Object[][] {
			{uid,"nobody@123"},
			//{"Anu123",uid},
			//{"tuvwx123","xyzabc"},
			//{"123?#","nobody@123"}
			};}
	
	
	
	@Test(dataProvider="testdata")
	public void registrationTestdd (String uid1,String pwd){
		driver.get("https://dsportalapp.herokuapp.com/");
		rPage = new RegisterPage(driver);
		rPage.clickRegister();
		System.out.println("URL is opened");
	     this.pwd=pwd;
		 this.uid=uid1;
		rPage.UserName(uid1);
		rPage.PassWord(pwd);
		rPage.PassWordConfirmation(pass);
		rPage.onClickSubmit();
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
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		rPage.signOut();
	}
	
	
	
	
	 // @Test(priority=2)
		public void successregistration () {
		  HomePage Hp=new HomePage(driver);
		  Hp.clickRegister();
			//rPage = new RegisterPage(driver);
			//rPage.clickRegister();
			rPage.UserName(uid);
			System.out.println(uid);
			rPage.PassWord(pwd);
			System.out.println(pwd);
			rPage.PassWordConfirmation(pass);
			rPage.onClickSubmit();
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			rPage.signOut();
			
}
	 // @Test(priority=3)
	  public void signout() {
	 rPage = new RegisterPage(driver);  
	  rPage.signOut();
	  
	  
	  }
	
	  
}}