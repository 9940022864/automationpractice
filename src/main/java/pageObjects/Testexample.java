package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Testexample {
	@Test
	public void verifyTitle(){
	WebDriver driver = new ChromeDriver();
	driver.get("https://mail.google.com/mail/u/0/");
	String pageTitle = driver.getTitle();
	Assert.assertEquals(pageTitle, "Gmail");
	
		
	}

}
