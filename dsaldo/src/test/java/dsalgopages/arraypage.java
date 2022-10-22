package dsalgopages;

import java.lang.System.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.Loggerclass;
import dsalgopages.loginpage;

public class arraypage  {
	WebDriver ldriver;
	loginpage lp;
   
	
	public arraypage(WebDriver rdriver) {
		super();
		this.ldriver = rdriver;
		PageFactory.initElements(ldriver, this);
		lp = new loginpage(ldriver);
	}
	
	@FindBy(xpath= "//a[@href='array']")
	@CacheLookup
	WebElement getStartedArrayPage;


	@FindBy(linkText="Arrays in Python")
	@CacheLookup
	WebElement arrysInPython;
	
	@FindBy(linkText="Arrays Using List")
	@CacheLookup
	WebElement arrayUsingList;
	
	@FindBy(linkText="Basic Operations in Lists")
	@CacheLookup
	WebElement basicOpsInLists;
	
	@FindBy(linkText="Applications of Array")
	@CacheLookup
	WebElement applicationsOfArray;
	
	@FindBy(xpath="//a[@href='/array/practice']")
	@CacheLookup
	WebElement PracticeQuestions;

    @FindBy(xpath = "//a[@href='/tryEditor']")//added/
	@CacheLookup 
	WebElement tryHereLink;

	@FindBy(xpath= "//form[@id='answer_form']/div/div/div/textarea")
	@CacheLookup
	WebElement  text_area;
	
	@FindBy(css="button")
    @CacheLookup 
	WebElement run_btn;
	
	
		
	public void clickArrayGetStarted() {
		getStartedArrayPage.click();
	}
	
    public void navigateToArraysInPython() {
		arrysInPython.click();
	}
	public void clickBasicOpsInLists() {
		basicOpsInLists.click();
	}

		public void navigateToArrayUsingList() {
		arrayUsingList.click();
	}

	public void navigateToTryHere() {
		ldriver.findElement(By.partialLinkText("Try here")).click();
	}
	public void clickApplicationsOfArray() {
		applicationsOfArray.click();
	}
	
	public void textarea(String codeInput)
	{
		Loggerclass.info("inside text area Array Pages");
		//text_area.sendKeys(codeInput);
		ldriver.findElement(By.xpath("//form[@id='answer_form']/div/div/div/textarea")).sendKeys(codeInput);
	}
	public void clickRun() {
		//run_btn.click();
		ldriver.findElement(By.cssSelector("button")).click();
	}
	public void PracQues() {
		PracticeQuestions.click();
	}
	
}

	
	
