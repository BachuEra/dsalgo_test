package dsalgopages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Landingpage {
  @FindBy(xpath="//button[contains(text(),'Get Started')]")
  @CacheLookup
	WebElement GetStarted;
  

WebDriver ldriver;
public Landingpage(WebDriver rdriver) {
	super();
	this.ldriver=rdriver;
	PageFactory.initElements(ldriver,this);
}

public void getstart(){
	GetStarted.click();
	System.out.println("getstarted clicked");
}
}