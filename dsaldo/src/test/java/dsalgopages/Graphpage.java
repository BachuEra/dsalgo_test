package dsalgopages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Graphpage {
	WebDriver ldriver;
	loginpage lp;

	public Graphpage(WebDriver rdriver) {
		super();
		this.ldriver = rdriver;
		PageFactory.initElements(ldriver, this);
		lp = new loginpage(ldriver);
	}

	@FindBy(xpath = "//a[@href='graph']")
	@CacheLookup
	WebElement getStartedgraphPage;

	@FindBy(xpath="//a[@class='list-group-item'][normalize-space()='Graph']")
	@CacheLookup
	WebElement Graphtab;
	
	@FindBy(xpath = "//a[@href='/graph/graph-representations/']")
	@CacheLookup
	WebElement Gh_res;

	@FindBy(xpath = "//a[@href='/tryEditor']") // added/
	@CacheLookup
	WebElement tryHereLink;
	
	@FindBy(xpath= "//form[@id='answer_form']/div/div/div/textarea")
	@CacheLookup
	WebElement  text_area;
	
	@FindBy(xpath="//a[contains(text(),'Practice Questions')]")
	@CacheLookup
	WebElement PracQues;
	
	@FindBy(xpath="//button[contains(text(),'Run')]")
    @CacheLookup 
	WebElement run_btn;
	
	public void GraphGetStarted() {
		getStartedgraphPage.click();
	}
	public void clickongraphbutton() {
		Graphtab.click();
	}
	public void navigatetoGh_res() {
		Gh_res.click();
	}
	public void navigateToTryHere() {
		ldriver.findElement(By.partialLinkText("Try here")).click();
	}
	public void textarea(String codeInput)
	{
		System.out.println("inside text area Graph");
		ldriver.findElement(By.xpath("//form[@id='answer_form']/div/div/div/textarea")).sendKeys(codeInput);
	}
	public void clickRun() {
		//run_btn.click();
		ldriver.findElement(By.cssSelector("button")).click();
	}
	public void navigatetograph1() {
		getStartedgraphPage.click();
	}
	public void Practiceques() {
		PracQues.click();
	}
}
