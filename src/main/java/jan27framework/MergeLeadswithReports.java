package jan27framework;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import jan26framework.ProjectMethods;

public class MergeLeadswithReports extends ProjectMethods {
	
	@BeforeTest
	public void setData() {
		sheet="E:\\Excel for selenium\\Book2.xlsx";
		testCaseName="MergeLead";
		desc="Merging two leads";
		author="balaji";
		category="smoke";
		}

	@Test
	public void mergeLead() throws InterruptedException {
		locateElement("PartialLinkText","Merge Lea").click();
		locateElement("XPath","//img[@src='/images/fieldlookup.gif']").click();
		switchWindow(1);
		WebElement firstname = locateElement("Name","firstName");
		enter(firstname, "babu");
		WebElement search = locateElement("XPath","//button[text()='Find Leads']");
		click(search);
		Thread.sleep(3000);
		WebElement lead1 = locateElement("XPath","//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
		String Firstlead = getText(lead1);
		System.out.println("The Lead one is "+Firstlead);
		click(lead1);
		switchWindow(0);
		locateElement("XPath","(//td[@class='titleCell'])[2]/following::img").click();
		switchWindow(1);
		WebElement firstname2 = locateElement("Name","firstName");
		enter(firstname2, "babu");
		WebElement search1 = locateElement("XPath","//button[text()='Find Leads']");
		click(search1);
		Thread.sleep(3000);
		WebElement lead2 = locateElement("XPath","(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[2]");
		String SecondLead = getText(lead2);
		System.out.println("The Lead two is "+SecondLead);
		click(lead2);
		switchWindow(0);
		locateElement("LinkText","Merge").click();
		acceptAlert();
		locateElement("LinkText","Find Leads").click();
		locateElement("XPath","//div[@class='x-form-item x-tab-item']//input[@name='id']").sendKeys(Firstlead);
		locateElement("XPath","//button[text()='Find Leads']").click();
		String text3 = locateElement("XPath","//div[@class='x-paging-info']").getText();
		String result = locateElement("XPath","//div[@class='x-paging-info']").getText();
		if(result.equalsIgnoreCase("no records to display"))
		{
			System.out.println("Merged");
		}else {
			System.out.println("Not Merged");
		}

	}
}
