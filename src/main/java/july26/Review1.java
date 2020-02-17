package july26;

import java.util.List;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import july23.InheritanceClass;

public class Review1 extends InheritanceClass {
	
	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		StartApp("chrome","http://leaftaps.com/opentaps/control/main");
//		WebElement useraname = locateElement("xpath", "//input[@id='username']");
//		type(useraname, "DemoSalesManager");
//		WebElement pass = locateElement("xpath","//input[@name='PASSWORD']");
//		type(pass,"crmsfa");
//		WebElement login = locateElement("xpath","//input[@class='decorativeSubmit']");
//		click(login);
//		WebElement link = locateElement("linktext","CRM/SFA");
//		click(link);
//		implicitlyWait(10);
//		WebElement Leads = locateElement("xpath","//a[text()='Leads']");
//		click(Leads);
//		WebElement CreateLead = locateElement("linktext","Create Lead");
//		click(CreateLead);
//		locateElementById("createLeadForm_companyName").sendKeys("test");
//		locateElementById("createLeadForm_firstName").sendKeys("user");
//		locateElementById("createLeadForm_lastName").sendKeys("two");
//		WebElement dp = locateElementById("createLeadForm_dataSourceId");
//		Select sel =new Select (dp);
//		List <WebElement> text = sel.getOptions();
//		int count = text.size();
//		selectDropDownByIndex(dp, count-2);
//
//	}

	
	@Test
	public void main() {
		StartApp("chrome","http://leaftaps.com/opentaps/control/main");
		WebElement useraname = locateElement("xpath", "//input[@id='username']");
		type(useraname, "DemoSalesManager");
		WebElement pass = locateElement("xpath","//input[@name='PASSWORD']");
		type(pass,"crmsfa");
		WebElement login = locateElement("xpath","//input[@class='decorativeSubmit']");
		click(login);
		WebElement link = locateElement("linktext","CRM/SFA");
		click(link);
		implicitlyWait(10);
		WebElement Leads = locateElement("xpath","//a[text()='Leads']");
		click(Leads);
		WebElement CreateLead = locateElement("linktext","Create Lead");
		click(CreateLead);
		locateElementById("createLeadForm_companyName").sendKeys("test");
		locateElementById("createLeadForm_firstName").sendKeys("user");
		locateElementById("createLeadForm_lastName").sendKeys("two");
		WebElement dp = locateElementById("createLeadForm_dataSourceId");
		Select sel =new Select (dp);
		List <WebElement> text = sel.getOptions();
		int count = text.size();
		selectDropDownByIndex(dp, count-2);
		locateElement("class","smallSubmit").click();
		String leadname = locateElementById("").getText();
		System.out.println(leadname);
		locateElementById("").click();
		WebElement leadname1 = locateElementById("");
		leadname1.clear();
		type(leadname1, "asdf");
		locateElement("class","").click();
		String editedleadname = locateElementById("").getText();
		if(editedleadname=="asdf") {
			System.out.println("edited");
		}else {
			System.out.println("not edited");
		}
		}
}

