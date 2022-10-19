package Com.OrangeHRM.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.OrangeHRM.qa.Base.TestBase;

public class OrangeHRMALoginPage extends TestBase{
	
	@FindBy(xpath ="//input[@name=\"username\"]")WebElement username;

	@FindBy(xpath ="//input[@name=\"password\"]")WebElement password;
	
	@FindBy(xpath ="//button[@type=\"submit\"]")WebElement loginbutton;
	
	@FindBy(xpath ="//p[@class=\"oxd-userdropdown-name\"]")WebElement Homepageusername;
	

public OrangeHRMALoginPage() throws IOException {
	
	PageFactory.initElements(driver, this);
	
}
public boolean validusername(String UN,String PW) throws InterruptedException {
	username.sendKeys(UN);
	Thread.sleep(3000);
	password.sendKeys(PW);
	Thread.sleep(3000);
	
	
	loginbutton.click();
	 return Homepageusername.isDisplayed();
}
public String ValidatePageTitle (String UN,String PW) throws InterruptedException {
	
	username.sendKeys(UN);
	Thread.sleep(3000);
	password.sendKeys(PW);
	Thread.sleep(3000);
	loginbutton.click();
	return driver.getTitle();
	
	
}
}
