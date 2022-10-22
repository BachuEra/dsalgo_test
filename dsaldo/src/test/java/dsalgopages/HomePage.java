package dsalgopages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


public class HomePage  {

	
	
public HomePage(WebDriver rdriver)
	{
		this.ldriver = rdriver;
		PageFactory.initElements(ldriver, this);
	}
	
	@FindBy(className="navbar-brand") WebElement pageTitle;
	@FindBy(linkText = "Register") WebElement Register;
	@FindBy(linkText = "Sign in") WebElement Signin;
	@FindBy(linkText = "Sign out") WebElement Signout;
	@FindBy(xpath = "//div[contains(text(),'Logged out successfully')]") WebElement SignoutSuccessMessage;
	@FindBy(xpath = "//div[contains(text(),'You are not logged in')]") WebElement NotLoggedMessage;
	
	@FindBy(xpath = "//div[@class = 'nav-item dropdown']") WebElement OpenDataStructureDropdown;
	@FindBy(xpath = "//div[@class = 'nav-item dropdown show']") WebElement CloseDataStructureDropdown;
	@FindBy(xpath = "//a[text()='Data Structures']") public WebElement DataStructure;
	@FindBy(xpath= "//a[text()='Arrays']") WebElement ArraysDropdown;
	@FindBy(xpath="//a[text()='Linked List']") WebElement LinkedListDropdown;
	@FindBy(xpath="//a[text()='Stack']") WebElement StackDropdown;
	@FindBy(xpath="//a[text()='Queue']") WebElement QueueDropdown;
	@FindBy(xpath="//a[text()='Tree']") WebElement TreeDropdown;
	@FindBy(xpath="//a[text()='Graph']") WebElement GraphDropdown;
	
	@FindBy(xpath="//a[@href='/tree']") WebElement SelectTreeDropdown;
	@FindBy(xpath = "//a[@href='linked-list']") WebElement LinkedlistGetStarted;
	@FindBy(xpath = "//div[contains(text(),'New Account Created.You are logged in as')]") public WebElement SuccessLoginMessage;
	
	
	@FindBy(xpath="//a[@href='data-structures-introduction']")
    @CacheLookup
	WebElement Datastructure;
	@FindBy(xpath="//a[@href='array']")
	WebElement Array;
	@FindBy(xpath="//a[@href='linked-list']")
	WebElement Linked_list;
	@FindBy(xpath="//a[@href='stack']")
	WebElement Stack;
	@FindBy(xpath="//a[@href='queue']")
	WebElement Queue;
	@FindBy(xpath="//a[@href='tree']")
	WebElement Tree;
	@FindBy(xpath="//a[@href='graph']")
	WebElement Graph;

	@FindBy(xpath="//a[@class='nav-link dropdown-toggle']")
	WebElement DropDown;

	WebDriver ldriver;
	Landingpage LDPage;
	
public String validatePagetitle()
	{
        return pageTitle.getText();
	}
public void ClickDropDownDataStructure() 
	{
	    OpenDataStructureDropdown.click();
		Assert.assertNotNull(DataStructure);
	}
public String ValidateArrays() 
	{
		return ArraysDropdown.getText();
    }
public String ValidateLinkedList() 
   {
		return LinkedListDropdown.getText();
   }
public String ValidateStack() 
   {
		return StackDropdown.getText();
   }
public String ValidateQueue() 
	{
		return QueueDropdown.getText();
	}
public String ValidateTree()
	{
		return TreeDropdown.getText();
	}
public String ValidateGraph() 
	{
		return GraphDropdown.getText();
	}
public void CloseDropDownDataStructure() 
	{
		CloseDataStructureDropdown.click();
	}
public void ClickTreeDropdown() 
	{
		SelectTreeDropdown.click();
	}
public String NotLoggedMessage()
   {
		return NotLoggedMessage.getText();
   }
public void ClickLinkedlistGetStarted() 
	{
		LinkedlistGetStarted.click();
	}

public void clickRegister()
	{
		Register.click();
	}
public void clickSignIn()
	{
		Signin.click();
	}
public void ClickSignOut() 
	{
		Signout.click();
	}
public String SignoutSuccessmessage()
	{
		return SignoutSuccessMessage.getText();
	}
public String GetSuccessLoginMessage() 
{
   return SuccessLoginMessage.getText();
}
public void checkDSGetstarted() {
	Datastructure.click();
}
public void checkArrGetstarted() {
	Array.click();

}
public void checkLLGetstarted() {
	Linked_list.click();

}
public void checkStackGetstarted() {
	Stack.click();

}
public void checkTreeGetstarted() {
	Tree.click();

}
public void checkGHGetstarted() {
	Graph.click();

}
public RegisterPage GotoRegisterpage() {
	Register.click();
	return new RegisterPage(ldriver);
}
}





/*public HomePage(WebDriver rdriver) {

	this.ldriver = rdriver;
	PageFactory.initElements(ldriver, this);
	LDPage = new Landingpage(ldriver);
	PageFactory.initElements(driver,this);
}

public RegisterPage registerpage() {
	Register.click();
	return new RegisterPage(ldriver);
	}

public loginpage loginpage() {
	Signin.click();
	return new loginpage(ldriver);
	
}

public void dropdown(String text) {
	Select dd=new Select((WebElement) driver.findElements(By.xpath("//div[@class='dropdown-menu show']")));
	dd.deselectByVisibleText(text);
}

public void datastruc() {
	DataStructure.click();
	;
}

public arraypage Array() {
	Array.click();
	return new arraypage(ldriver);
	
}

}*/


