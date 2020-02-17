package aug04;

import org.openqa.selenium.WebElement;


import org.testng.annotations.Test;

import aug02.Inherit1;

public class Test1 extends Inherit1 {
		@Test
	public void main() throws InterruptedException {
		startApp("chrome","http://leaftaps.com/opentaps/control/main");
		WebElement username = locateElement("id", "username");
		enter(username,"DemoSalesManager");
		WebElement pass = locateElement("XPath","//input[@name='PASSWORD']");
		enter(pass,"crmsfa");
		locateElement("XPath","//input[@name='PASSWORD']").click();
		locateElement("XPath","//input[@class='decorativeSubmit']").click();
		locateElement("linkText","CRM/SFA").click();
		locateElement("XPath","//a[text()='Leads']").click();
		locateElement("linkText","Create Lead").click();
		WebElement companyname = locateElementById("createLeadForm_companyName");
		enter(companyname,"test1");
		WebElement fname = locateElementById("createLeadForm_firstName");
		enter(fname,"user");
		WebElement lname = locateElementById("createLeadForm_lastName");
		enter(lname,"one");
		WebElement source = locateElementById("createLeadForm_dataSourceId");
		selectByCount(source, 3);
		WebElement mar = locateElementById("createLeadForm_marketingCampaignId");
		selectByIndex(mar, 3);
		locateElement("XPath","//img[@id='createLeadForm_birthDate-button']").click();
		locateElement("XPath","//td[text()='4']").click();
		WebElement title = locateElement("name","generalProfTitle");
		enter(title,"Reg");
		WebElement industry = locateElement("id","createLeadForm_industryEnumId");
		getOptions(industry);
		WebElement email = locateElement("id","createLeadForm_primaryEmail");
		enter(email,"abc@gmail.com");
		locateElement("class","smallSubmit").click();
		String createdcname = locateElement("id","viewLead_companyName_sp").getText();
		System.out.println("The created company name is"+ createdcname);
		locateElement("XPath","((//div[@class='frameSectionExtra'])[2]//a)[3]").click();
		locateElementById("updateLeadForm_companyName").clear();
		locateElementById("updateLeadForm_companyName").sendKeys("asdf");
		locateElement("XPath","//input[@class='smallSubmit']").click();
		String ecname = locateElement("id","viewLead_companyName_sp").getText();
		System.out.println("The edited name is"+ecname);
		if(ecname !=createdcname) {
			System.out.println("The company name is edited");
		}
		locateElement("linkText","Merge Leads").click();
		locateElement("XPath","(//input[@name='partyIdFrom']/following::a/img)[1]").click();
		switchToWindow(1);
		locateElement("XPath","//span[text()='Email']").click();
		WebElement emailadd = locateElement("XPath","//input[@name='emailAddress']");
		enter(emailadd, "@gmail.com");
		locateElement("XPath","//button[text()='Find Leads']").click();
		Thread.sleep(1000);
		locateElement("XPath","//div[@class='x-grid3-hd-inner x-grid3-hd-firstName']").click();
		Thread.sleep(1000);
		WebElement id1 = locateElement("XPath","(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[2]/a");
		String idone = id1.getText();
		System.out.println("id1 is"+idone);
		click(id1);
		Thread.sleep(1000);
		switchToWindow(0);
		locateElement("XPath","(//input[@name='partyIdTo']/following::a/img)[1]").click();
		switchToWindow(1);
		locateElement("XPath","(//input[@class=' x-form-text x-form-field'])[1]").sendKeys("2");
		locateElement("XPath","//button[text()='Find Leads']").click();
		Thread.sleep(1000);
		WebElement id2 = locateElement("XPath","(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]");
		String idtwo = id2.getText();
		System.out.println("id2 is"+idtwo);
		id2.click();
		Thread.sleep(1000);
		switchToWindow(0);
		locateElement("XPath","//a[text()='Merge']").click();
		acceptAlert();
		locateElement("XPath","//a[text()='Find Leads']").click();
		WebElement lead = locateElement("XPath","(//input[@class=' x-form-text x-form-field'])[24]");
		lead.sendKeys(idone);
		locateElement("XPath","//button[text()='Find Leads']").click();
		String result = locateElement("XPath","//div[@class='x-paging-info']").getText();
		if(result=="No records to display")
		{
			System.out.println("Merged");
		}else {
			System.out.println("Not Merged");
		}
			
	}
}
