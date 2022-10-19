  package Com.OrangeHRM.TestCases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Com.OrangeHRM.qa.Base.TestBase;
import Com.OrangeHRM.qa.pages.OrangeHRMALoginPage;
import Com.OrangeHRM.qa.pages.OrangeHRMHomePage;

public class HomePageTest extends TestBase{
	OrangeHRMALoginPage loginpage;
	OrangeHRMHomePage homepage;
	
	public HomePageTest() throws IOException {
		super();
		
	}
@BeforeMethod
	public void setup() throws IOException {
	initialization();
	loginpage=new OrangeHRMALoginPage();
	homepage =new OrangeHRMHomePage();
	
}
	@Test
	public void Employename() throws InterruptedException {
		
		loginpage.validusername(pros.getProperty("username"), pros.getProperty("password"));
		
		Thread.sleep(4000);
		
		
		homepage.ReporterPage("Name");
		
		
	}
	@Test
	public void addemploye1() throws InterruptedException {
		
		loginpage.validusername(pros.getProperty("username"), pros.getProperty("password"));
	   Thread.sleep(3000);
	   homepage.employee(pros.getProperty("Fname"), pros.getProperty("Mname"), pros.getProperty("Lname"));
	  
	
	}
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}


