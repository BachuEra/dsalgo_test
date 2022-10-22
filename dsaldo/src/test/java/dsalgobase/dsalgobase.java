package dsalgobase;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import io.github.bonigarcia.wdm.WebDriverManager;

public class dsalgobase {
	//public String baseURL = readconfig.getApplicationURL();
	//public String userName =readconfig.getUsername();
	//public String passWord =readconfig.getPassword();
	public static WebDriver driver;
	
	
	@BeforeClass
	public static WebDriver initialization() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	//	options.addArguments("start-maximized");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://dsportalapp.herokuapp.com/");
		return driver;
	}

	@AfterClass
	public void teardown() {
		driver.quit();
	}
	
	public void captureScreen(String methodname) throws IOException {
		DateTimeFormatter timeStampPattern = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
        System.out.println(timeStampPattern.format(java.time.LocalDateTime.now()));
        String number=(timeStampPattern.format(java.time.LocalDateTime.now()));
        
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(".//screenshots//image_"+number+"/"+methodname+".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");
	}
	public void waitforseconds(int seconds) {
		try {
			Thread.sleep(seconds*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

	
}