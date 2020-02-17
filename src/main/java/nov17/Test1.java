package nov17;

import java.util.ArrayList;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.collections4.Get;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test1 {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementByXPath("//input[@name='PASSWORD']").sendKeys("crmsfa");
		driver.findElementByXPath("//input[@class='decorativeSubmit']").click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByLinkText("CRM/SFA").click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByXPath("//a[text()='Leads']").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("test");
		driver.findElementById("createLeadForm_firstName").sendKeys("asdf");
		driver.findElementById("createLeadForm_lastName").sendKeys("fdsa");
		WebElement dp1 = driver.findElementById("createLeadForm_dataSourceId");
		Select source = new Select (dp1);
		source.selectByIndex(3);
		WebElement dp2 = driver.findElementById("createLeadForm_marketingCampaignId");
		Select mk = new Select(dp2);
		mk.selectByValue("DEMO_MKTG_CAMP");
		driver.findElementById("createLeadForm_birthDate-button").click();
		driver.findElementByXPath("(//td[text()='5'])[2]").click();
		driver.findElementByXPath("(//td[text()='22']");
		String text = driver.findElementById("createLeadForm_birthDate").getText();
		System.out.println(text);
		WebElement dp3 = driver.findElementById("createLeadForm_currencyUomId");
		Select cur = new Select(dp3);
		List<WebElement> eachoption1 = cur.getOptions();
		for(WebElement eachoption : eachoption1) {
			String text2 = eachoption.getText();
			System.out.println(text2);
		}			
		int size = eachoption1.size();
		cur.selectByIndex(size-4);
		
		
			
			
		
		}
			
			
		
		
			
}


