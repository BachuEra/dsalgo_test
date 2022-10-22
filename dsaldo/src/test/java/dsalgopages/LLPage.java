package dsalgopages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.Loggerclass;

public class LLPage {
	WebDriver ldriver;
	loginpage lp;

	public LLPage(WebDriver rdriver) {
		super();
		this.ldriver = rdriver;
		PageFactory.initElements(ldriver, this);
		lp = new loginpage(ldriver);
	}

	@FindBy(xpath = "//a[@href='linked-list']")
	@CacheLookup
	WebElement getStartedLLPage;

	@FindBy(xpath ="//a[text()='Introduction']")
	@CacheLookup
	WebElement Intro;

	@FindBy(xpath = "//a[text()='Creating Linked LIst']")
	@CacheLookup
	WebElement CreateLL;

	@FindBy(xpath = "//a[text()='Types of Linked List']")
	@CacheLookup
	WebElement TypesofLL;

	@FindBy(xpath = "//a[text()='Implement Linked List in Python']")
	@CacheLookup
	WebElement LLinPython;

	@FindBy(xpath = "//a[text()='Traversal']")
	@CacheLookup
	WebElement traversal;

	@FindBy(xpath = "//a[text()='Insertion']")
	@CacheLookup
	WebElement Insertion;

	@FindBy(xpath = "//a[text()='Deletion']")
	@CacheLookup
	WebElement deleteLL;

	@FindBy(xpath = "//a[text()='Practice Questions']")
	@CacheLookup
	WebElement PresQ;

	@FindBy(xpath = "//a[@href='/tryEditor']") 
	@CacheLookup
	WebElement tryHereLink;

	@FindBy(xpath = "//form[@id='answer_form']/div/div/div/textarea")
	@CacheLookup
	WebElement text_area;

	@FindBy(css = "button")
	@CacheLookup
	WebElement run_btn;

	public void clickgetstartedLL() {
		getStartedLLPage.click();
	}

	public void getIntro() {
		Intro.click();
	}

	public void CreateLL() {
		CreateLL.click();
	}

	public void TypesofLL() {
		TypesofLL.click();
	}

	public void LLinpython() {
		LLinPython.click();
	}

	public void TravelLL() {
		traversal.click();
	}

	public void InsertLL() {
		Insertion.click();
	}

	public void deletionLL() {
		deleteLL.click();
	}

	public void textarea(String codeInput3) {
		Loggerclass.info("inside text area LinkedList Pages");
		ldriver.findElement(By.xpath("//form[@id='answer_form']/div/div/div/textarea")).sendKeys(codeInput3);
	}

	public void clickRun() {
		// run_btn.click();
		ldriver.findElement(By.cssSelector("button")).click();
	}

	public void navigateToTryHere() {
		ldriver.findElement(By.partialLinkText("Try here")).click();
	}

	public void PracQues() {
		PresQ.click();
	}

}
