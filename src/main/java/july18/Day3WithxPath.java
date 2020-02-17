package july18;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3WithxPath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElementByXPath("//input[@id='username']").sendKeys("demosalesmanager");
		driver.findElementByXPath("//input[@name='PASSWORD']").sendKeys("crmsfa");
		driver.findElementByXPath("//input[@class='decorativeSubmit']").click();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByXPath("//a[text()='Leads']").click();
		driver.findElementByXPath("//a[text()='Find Leads']").click();
		driver.findElementByXPath("//span[text()='Email']").click();
		driver.findElementByXPath("//input[@name='emailAddress']").sendKeys("@gmail.com");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(1000);
		driver.findElementByXPath("(//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first '])[2]//a").click();
		String before = driver.findElementByXPath("//span[@id='viewLead_firstName_sp']").getText();	
		driver.findElementByXPath("((//div[@class='frameSectionExtra'])[2]//a)[3]").click();
		driver.findElementByXPath("//input[@id='updateLeadForm_firstName']").clear();
		driver.findElementByXPath("//input[@id='updateLeadForm_firstName']").sendKeys("asdf");
		driver.findElementByXPath("//input[@class='smallSubmit']").click();
		String after = driver.findElementByXPath("//span[@id='viewLead_firstName_sp']").getText();
//		if(before!=after) {
//			System.out.println("Edited");
//		}else {
//			System.out.println("Not edited");
//	}
		if(before!=after) {
		do {
				System.out.println("Edited");
			}while(after=="asdf");
		
		}else {
			System.out.println("Not Edited");
		}
		
		
		
		
		
//		String name = driver.findElementByXPath("//label[text()='Email Address:']").getText();
//		do {
//			driver.findElementByXPath("//input[name='emailAddress']").sendKeys("user@gmail,com");
//		}while{
//			name="Email Address";
//		}
	
	
	
	}

}

