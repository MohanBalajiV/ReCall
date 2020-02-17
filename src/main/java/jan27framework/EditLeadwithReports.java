package jan27framework;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import jan26framework.ProjectMethods;

public class EditLeadwithReports extends ProjectMethods{
	
	@BeforeTest
	public void setData() {
		sheet="E:\\Excel for selenium\\Book2.xlsx";
		testCaseName="Edit Leads";
		desc="Editing a lead";
		author="balaji";
		category="smoke";
		}

	@Test
	public void editLead() throws InterruptedException {
		click(locateElement("linktext", "Find Leads"));
		click(locateElement("XPath","//span[text()='Phone']"));
		Thread.sleep(1000);
		enter(locateElement("name","phoneNumber"),"99");
		click(locateElement("xpath", "//button[text()='Find Leads']"));
		Thread.sleep(2000);
		click(locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		Thread.sleep(2000);
		String beforeEdit = locateElement("id","viewLead_companyName_sp").getText();
		System.out.println(beforeEdit);
		click(locateElement("linktext", "Edit"));
		enter(locateElement("id", "updateLeadForm_companyName"),"TL");
		click(locateElement("class", "smallSubmit"));
		String afterEdit = locateElement("id","").getText();
		if(beforeEdit!=afterEdit) {
			System.out.println("Edited");
		}else {
			System.out.println("Not Edited");
		}
	}
	
	
	
	
}
