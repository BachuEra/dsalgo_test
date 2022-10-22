package dsalgopages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Testcases.LandingPageTest;
import Utilities.Loggerclass;

public class DataStructurePage {
	WebDriver ldriver;
	loginpage lp;
   
	
	public DataStructurePage(WebDriver rdriver) {
		super();
		this.ldriver = rdriver;
		PageFactory.initElements(ldriver, this);
		lp = new loginpage(ldriver);
	}
	
	@FindBy(xpath= "//a[@href='data-structures-introduction']")
	@CacheLookup
	WebElement getStartedDatastrucPage;
	
	@FindBy(xpath="//a[@href='time-complexity']")
	@CacheLookup
	WebElement DataStruc_time;
	
	@FindBy(xpath="//a[@href='time-complexity']")
	@CacheLookup
	WebElement timecomplex;
	
	@FindBy(xpath="//a[contains(text(),'Practice Questions')]")
	@CacheLookup
	WebElement PracticeQuestions; 
	
	@FindBy(xpath = "//a[@href='/tryEditor']")
	@CacheLookup 
	WebElement tryHereLink;
	
	@FindBy(xpath= "//form[@id='answer_form']/div/div/div/textarea")
	@CacheLookup
	WebElement  text_area;
	
	@FindBy(xpath="//button[contains(text(),'Run')]")
	@CacheLookup
	WebElement runbtn;
	
	
	


public void clickongsDatastrucPage() {
	getStartedDatastrucPage.click();
	}
public void Timecomplexity() {
	timecomplex.click();
}
public void navigateToTryHere() {
	ldriver.findElement(By.partialLinkText("Try here")).click();
}
public void textarea(String codeInput)
{
	Loggerclass.info("inside text area Datastructure");
	ldriver.findElement(By.xpath("//form[@id='answer_form']/div/div/div/textarea")).sendKeys(codeInput);
}

public void Practiceques() {
	PracticeQuestions.click();
}
public void clickRun() {
	runbtn.click();

	
	
}
}














