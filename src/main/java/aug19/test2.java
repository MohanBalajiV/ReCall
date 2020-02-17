package aug19;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import aug19.inherit2;

public class test2 extends inherit2 {
    
	@Test
	public void main() throws InterruptedException   {
		startApp("Chrome", "http://leaftaps.com/opentaps/control/main");
		WebElement username = locateElement("id", "username");
		enter(username, "demosalesmanager");
		WebElement pass = locateElement("XPath","//input[@name='PASSWORD']");
		enter(pass,"crmsfa");
		locateElement("XPath","//input[@class='decorativeSubmit']").click();
		locateElement("LinkText","CRM/SFA").click();
		locateElement("XPath","//a[text()='Leads']").click();
		locateElement("LinkText","Merge Leads").click();
		locateElement("XPath","(//input[@name='partyIdFrom']/following::a/img)[1]").click();
		switchToWindow(1);
		locateElement("XPath","//span[text()='Email']").click();
		WebElement email = locateElement("XPath","//input[@name='emailAddress']");
		enter(email,"@gmail.com");
		locateElement("XPath","//button[text()='Find Leads']").click();
		Thread.sleep(1000);
		WebElement idone = locateElement("XPath","(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[2]/a");
		String text2 = idone.getText();
		System.out.println(text2);
		idone.click();
		Thread.sleep(1000);
		switchToWindow(0);
		locateElement("XPath","(//input[@name='partyIdTo']/following::a/img)[1]").click();
		switchToWindow(1);
		locateElement("XPath","(//input[@class=' x-form-text x-form-field'])[1]").sendKeys("2");
		locateElement("XPath","//button[text()='Find Leads']").click();
		Thread.sleep(1000);
		WebElement idtwo = locateElement("XPath","(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]");
		String text = idtwo.getText();
		System.out.println(text);
		idtwo.click();
		Thread.sleep(1000);
		switchToWindow(0);
		locateElement("XPath","//a[text()='Merge']").click();
		acceptAlert();
		locateElement("XPath","//a[text()='Find Leads']").click();
		locateElement("XPath","(//input[@class=' x-form-text x-form-field'])[24]").sendKeys("idone");
		locateElement("XPath","//button[text()='Find Leads']").click();
		String text3 = locateElement("XPath","//div[@class='x-paging-info']").getText();
		String result = locateElement("XPath","//div[@class='x-paging-info']").getText();
		if(result=="No records to display")
		{
			System.out.println("Merged");
		}else {
			System.out.println("Not Merged");
		}
	}

}
