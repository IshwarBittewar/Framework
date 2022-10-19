package Com.OrangeHRM.TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Com.OrangeHRM.qa.Base.TestBase;
import Com.OrangeHRM.qa.pages.OrangeHRMALoginPage;

public class LoginPageTest extends TestBase {
	OrangeHRMALoginPage loginpage;
	public LoginPageTest() throws IOException {
		super();
		
		
	}

	@BeforeMethod
	public void setup() throws IOException {
		initialization();
		loginpage =new OrangeHRMALoginPage();
	}
	@Test 
	public void orangeuserandpassword() throws InterruptedException {
		
		boolean UserID=loginpage.validusername(pros.getProperty("username"), pros.getProperty("password"));
		Assert.assertTrue(false);
	}
	@Test 
	public void orangehrmtiltle() throws InterruptedException {
		
	String pagetitle=	loginpage.ValidatePageTitle(pros.getProperty("username"), pros.getProperty("password"));
		
	Assert.assertEquals(pagetitle, pros.getProperty("Title"));
	
	
	}
	
	@AfterMethod
	public void Teardown() {
		driver.quit();
	}
}
