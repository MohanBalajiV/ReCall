package stepDescription;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateLead {
	
	public ChromeDriver driver;
	
	@Given("Launch the browser")	
	public void launch() {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@And("Load the URL")
	public void load() {
		driver.get("");
	}

	@And("Maximize the browser")
	public void max() {
		driver.manage().window().maximize();
	}
	
	@And("Enter the Username as Demosalesmanager")
	public void typeUName() {
		driver.findElementById("username").sendKeys("DemoSalesManager");
	}
	
	@And("Enter the Password as crmsfa")
	public void typePass() {
		driver.findElementById("password").sendKeys("crmsfa");
	}
	
	@And("Click on Login button")
	public void clickLogin() {
		driver.findElementByClassName("decorativeSubmit").click();
	}
	
	@And("Click crmsfa")
	public void clickcrmsfa() {
		driver.findElementByClassName("crmsfa").click();
	}
	
	@And("Click Leads")
	public void clickLeads() {
		driver.findElementByLinkText("Leads").click();
	}

	@And("Click Create Lead")
	public void clickCL() {
		driver.findElementByLinkText("Create Lead").click();
	
	}
	
	@And("Enter the Company Name as (.*)")
	public void typeCName(String Cname) {
		driver.findElementById("createLeadForm_companyName").sendKeys(Cname);
	}
	
	@And("Enter the First Name as (.*)")
	public void typeFname(String Fname) {
		driver.findElementById("createLeadForm_firstName").sendKeys(Fname);
	}
	
	@And("Enter the Last Name as (.*)")
	public void typeLName(String Lname) {
		driver.findElementById("createLeadForm_lastName").sendKeys(Lname);
	}

	@When("Click on CreateLead button")
	public void clickCreate() {
		driver.findElementByClassName("smallSubmit").click();
	}
	
	@Then("VerifyTitle")
	public void VrifyTitle() {
	String title = driver.getTitle();
	if(title.contains("View Lead")) {
		System.out.println("Lead created");
	}else {
		System.out.println("Lead not created");
	}
	}
	
	@Then("Close Browser")
	public void CloseBrowser() {
		driver.close();
	}
}


