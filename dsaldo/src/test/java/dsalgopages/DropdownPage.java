package dsalgopages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DropdownPage {
	WebDriver ldriver;
	loginpage lp;
	
	public DropdownPage(WebDriver rdriver) {
		super();
		this.ldriver = rdriver;
		PageFactory.initElements(ldriver, this);
		lp = new loginpage(ldriver);
	}

	@FindBy(xpath= "//div[@class='nav-item dropdown']")
	@CacheLookup
	WebElement dropdown;
	
	@FindBy(xpath= "//input[@name='username']")
	@CacheLookup
	WebElement Username;
	
	@FindBy(xpath= "//input[@name='password']")
	@CacheLookup
	WebElement Password;
	
	@FindBy(xpath= "//input[@type='submit']")
	@CacheLookup
	WebElement signin;
	
	@FindBy(xpath= "//a[@href='/logout']")
	@CacheLookup
	WebElement signout;
	

public void dropdownclick() {
	dropdown.click();
}
public void SetuserName() {
	Username.sendKeys("xyzabc123");
}
public void SetPassword() {
	Password.sendKeys("nobody@123");
}
public void signin() {
	signin.click();
}


}