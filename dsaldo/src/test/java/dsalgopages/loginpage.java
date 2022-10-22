package dsalgopages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class loginpage {
	
	WebDriver ldriver;
	Landingpage LDPage;
	
	@FindBy(linkText="Sign in")
	@CacheLookup
	WebElement login;

	@FindBy(linkText="Sign out")
	@CacheLookup
	WebElement signOut;

	@FindBy(id="id_username")
	@CacheLookup
	WebElement userName;

	@FindBy(id="id_password")
	@CacheLookup
	WebElement passWord;

	@FindBy(css = "input[type=submit]")
	@CacheLookup
	WebElement submit;
	
	public loginpage(WebDriver rdriver) {
		super();
		this.ldriver = rdriver;
		PageFactory.initElements(ldriver, this);
		LDPage = new Landingpage(ldriver);
}
	
public void onClickSubmit() {
	submit.click();
}

public void setLdriver(WebDriver ldriver) {
	this.ldriver = ldriver;
}

public void setLDPage(Landingpage LDPage) {
	this.LDPage = LDPage;
}

public void setLogin(WebElement login) {
	this.login = login;
}

public void setUserName(String userName) {
	this.userName.sendKeys(userName);
}

public void setPassWord(String passWord) {
	this.passWord.sendKeys(passWord);
}
public void getstart() {
	LDPage.getstart();
}

public void clickSignIn() {
	login.click();
}

public void clickSubmit() {
	System.out.println("signin clicked");
	submit.click();
}

public void getLogin(String user, String pass) {
	getstart();
    clickSignIn();
  
	setUserName(user);
  	System.out.println("Entered username");
   
	setPassWord(pass);
	System.out.println("Entered password");
	
	clickSubmit();
}
public void Signin() {
	 clickSignIn();
}
public void signOut() {
	signOut.click();
}

}

	
	

