package july20;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.support.ui.Select;

public class Day4AlertHandling {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
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
		cur.selectByIndex(size-4);}}

//		
//		
//		
//		
//		driver.get("http://leaftaps.com/opentaps/control/main");
//		driver.findElementByXPath("//input[@id='username']").sendKeys("Demosalesmanager");
//		driver.findElementByXPath("//input[@name='PASSWORD']").sendKeys("crmsfa");
//		driver.findElementByXPath("//input[@class='decorativeSubmit']").click();
////		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//		driver.findElementByLinkText("CRM/SFA").click();
//		driver.findElementByXPath("//a[text()='Leads']").click();
//		driver.findElementByXPath("//a[contains(text(),'Merge Le')]").click();
//		driver.findElementByXPath("//input[@id='partyIdFrom']/following::a").click();
//		Set<String> tab = driver.getWindowHandles();
//		List<String> allList= new ArrayList <String>();
//		allList.addAll(tab);
//		driver.switchTo().window(allList.get(1));
//		driver.findElementByXPath("//input[starts-with(@name,'firstNa')]").sendKeys("a");
//		driver.findElementByXPath("//button[text()='Find Leads']").click();
//		Thread.sleep(1000);
////		driver.findElementByXPath("//div[@class='x-grid3-hd-inner x-grid3-hd-partyId']").click();
////		Thread.sleep(1000);
//		String id1 = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[2]").getText();
//		System.out.println(id1);
//		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[2]/a").click();
//		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
//		tab = driver.getWindowHandles();
//		allList = new ArrayList<String>();
//		allList.addAll(tab);
//		driver.switchTo().window(allList.get(0));
////		File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
////		File desc= new File("./ss/img1.png");
////		FileUtils.copyDirectory(screenshotAs, desc);
//		driver.findElementByXPath("//input[@name='partyIdTo']/following::a").click();
//		tab = driver.getWindowHandles();
//		allList = new ArrayList<String>();
//		allList.addAll(tab);
//		driver.switchTo().window(allList.get(1));
//		driver.findElementByXPath("//input[starts-with(@name,'lastNam')]").sendKeys("d");
//		driver.findElementByXPath("//button[text()='Find Leads']").click();
//		Thread.sleep(1000);
//		String id2 = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[3]").getText();
//		System.out.println(id2);
//		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[3]/a").click();
//		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
//		tab = driver.getWindowHandles();
//		allList = new ArrayList<String>();
//		allList.addAll(tab);
//		driver.switchTo().window(allList.get(0));
//		driver.findElementByXPath("//a[text()='Merge']").click();
//		driver.switchTo().alert().accept();
//		driver.findElementByXPath("//a[text()='Find Leads']").click();
//		driver.findElementByXPath("//input[@class=' x-form-text x-form-field']").sendKeys(id1);
//		driver.findElementByXPath("//button[text()='Find Leads']").click();
//		Thread.sleep(1000);
//		String text = driver.findElementByXPath("//div[@class='x-paging-info']").getText();		
//		if(text=="No records to display")
//		{
//			System.out.println("Merged");
//		}else {
//			System.out.println("Not Mergerd");
//		}
//			}
//
//}
//
