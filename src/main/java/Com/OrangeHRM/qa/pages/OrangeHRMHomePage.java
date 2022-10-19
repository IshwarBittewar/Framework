package Com.OrangeHRM.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.OrangeHRM.qa.Base.TestBase;

public class OrangeHRMHomePage extends TestBase {
	
	@FindBy(xpath ="//a[contains(text(),\"Reports\")]")WebElement reports;
	
	@FindBy(xpath ="//input[@placeholder=\"Type for hints...\"]")WebElement Reportername;
	
	@FindBy(xpath ="//button[@type=\"submit\"]")WebElement searchbutton;
	
	@FindBy(xpath ="//a[contains(text(),\"Add Employee\")]")WebElement addemployee;
	@FindBy (xpath ="//input[@name=\"firstName\"]")WebElement Firstname;
	@FindBy(xpath ="//input[@name=\"middleName\"]")WebElement middlename;
	@FindBy(xpath ="//input[@name=\"lastName\"]")WebElement lastname;
	@FindBy(xpath="//button[@type=\"submit\"]")WebElement submit;
	
	public OrangeHRMHomePage()throws IOException {
		
		PageFactory.initElements(driver, this);
		
	}
	
	public String ReporterPage(String Name) {
		
		reports.click();
		Reportername.sendKeys(Name);
		searchbutton.click();
		
		
		return Reportername.getText();
	}
public String employee(String Fname,String Mname, String Lname) throws InterruptedException {
		
		addemployee.click();
		Thread.sleep(3000);
		Firstname.sendKeys(Fname);
		Thread.sleep(3000);
		middlename.sendKeys(Mname);
		Thread.sleep(3000);
		lastname.sendKeys(Lname);
		Thread.sleep(3000);
		submit.click();
		Thread.sleep(3000);
		return Firstname.getText(); 
	}
}
