package dsalgopages;

import java.util.UUID;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	WebDriver ldriver;
	Landingpage LDPage;

	public RegisterPage(WebDriver rdriver) {
		super();
		this.ldriver = rdriver;
		PageFactory.initElements(ldriver, this);
		LDPage = new Landingpage(ldriver);
	}
	
	@FindBy(linkText="Register")
	@CacheLookup
	WebElement register;
	
	@FindBy(linkText="Sign out")
	@CacheLookup
	WebElement signOut;
	
	
	@FindBy(id="id_username")
	@CacheLookup
	WebElement userName;
	
	@FindBy(id="id_password1")
	@CacheLookup
	WebElement passWord;
	
	@FindBy(id="id_password2")
	@CacheLookup
	WebElement passWordConfirmation;
	
	@FindBy(css = "input[type=submit]")
	@CacheLookup
	WebElement submit;
	
	
	public void onClickSubmit() {
		submit.click();
	}
	public void setLdriver(WebDriver ldriver) {
		this.ldriver = ldriver;
	}

	public void setLDpage(Landingpage LDPage) {
		this.LDPage = LDPage;
	}

	public void Register(WebElement register) {
		this.register = register;
	}
	public void UserName(String uid) {
			this.userName.sendKeys(uid);
		}
	public void PassWord(String pwd) {
		System.out.println(pwd);
		this.passWord.sendKeys(pwd);
	}
	public void PassWordConfirmation(String pass) {
		this.passWordConfirmation.sendKeys(pass);
	}
	public void clickRegister() {
		System.out.println("register clicked");
		LDPage.getstart();
		register.click();
	}
	public void signOut() {
		signOut.click();
	}

	public loginpage gotologinpage() {
		submit.click();
		return new loginpage(ldriver);
	}
}



