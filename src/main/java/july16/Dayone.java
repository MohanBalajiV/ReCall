package july16;

import java.util.List;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dayone {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElementById("username").sendKeys("Demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("test");
		driver.findElementById("createLeadForm_firstName").sendKeys("user");
		driver.findElementById("createLeadForm_lastName").sendKeys("one");		
		Select src = new Select(driver.findElementById("createLeadForm_dataSourceId"));
		src.selectByVisibleText("Website");
		Dimension size = driver.findElementById("createLeadForm_currencyUomId").getSize();
		System.out.println(size);
		Select currency = new Select(driver.findElementById("createLeadForm_currencyUomId"));
		List<WebElement > alloptions = currency.getOptions();
		for(WebElement eachoption: alloptions) {
			System.out.println(eachoption.getText());
		}
		Select ind = new Select (driver.findElementById("createLeadForm_industryEnumId"));
		ind.selectByIndex(4);
		driver.findElementByClassName("smallSubmit").click();
		String text = driver.findElementById("viewLead_companyName_sp").getText();
		if(text=="test") {
			System.out.println("Name of the lead is"+text);
		}
		else {
			System.out.println("Not created");
		}
		WebElement edit = driver.findElementByLinkText("Edit");
		edit.click();
		
		
		
		
//		WebElement edit = driver.findElementByLinkText("Edit");
//		if(text=="test") {
//			do 
//				edit.click();
//		}
//	
		
		}	
		
		
}
		

		
		
		
		
		
//		driver.findElementById("");
//		WebElement src = driver.findElementById("");
//		Select sel =new Select(src);
//		sel.selectByIndex(4);
//		sel.selectByVisibleText("");
//		sel.selectByValue("");
//		driver.findElementByXPath("//div[@id='']");
//		driver.findElementByXPath("//div[@Classname='']");
//		driver.findElementByXPath("//div[@LinkText='']");
//		driver.findElementByXPath("//div[startswith(@id,'')]");
//		driver.findElementByXPath("//div[endswith(@id,'')]");
//		driver.findElementByXPath("//div[contains(@id,'')]");
//		driver.findElementByXPath("//div[text()='']");
//		driver.findElementByXPath("//div[contains[text(),'']");
//	
		


