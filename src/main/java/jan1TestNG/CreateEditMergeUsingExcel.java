package jan1TestNG;

import java.io.IOException;


import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import dec15.InheritanceClass;

public class CreateEditMergeUsingExcel extends InheritanceClass{

	@DataProvider(name="fetchdata")
	public String[] [] getData()  throws IOException {
		XSSFWorkbook wbook = new XSSFWorkbook("E:\\Excel for selenium\\Book2.xlsx");
		int NoofSheets = wbook.getNumberOfSheets();
//		System.out.println(NoofSheets);
//		for(int i=0;i<NoofSheets;i++) {
//			if(name="fetchdata") {
//			XSSFSheet sheet = wbook.getSheetAt(0);
//			}else if(name="fetchdata1") {
				XSSFSheet sheet = wbook.getSheetAt(0);
//			}
		int rowcount = sheet.getLastRowNum();
		int cellcount = sheet.getRow(0).getLastCellNum();
		String [][] data = new String [rowcount][cellcount];
		for(int j=1;j<=rowcount;j++) {
			XSSFRow row= sheet.getRow(j);
			for(int z=0;z<cellcount;z++) {
				XSSFCell cell= row.getCell(z);
				data[j-1][z] = cell.getStringCellValue();
				System.out.println(data);
			}
			
		}
		return data;
//	}
//		return null;
	}
	
	@Parameters({"url"})
	@Test(dataProvider="fetchdata",alwaysRun=true)
	public void createLead(String URL,String username, String password,String companyname,String firstname,String lastname,int marketing,String firstnamelocal,String lastnamelocal,String industry,String createdfname) {
//	@Test(invocationCount=5,threadPoolSize=3,alwaysRun=true)
//	public void createLead() {	
		startAPP("Chrome",URL);
		WebElement user = locateElement("Id","username");
		enter(user,username);
		locateElement("Id","password").sendKeys(password);
		WebElement login = locateElement("ClassName","decorativeSubmit");
		click(login);
		locateElement("LinkText","CRM/SFA").click();
		implicitlyWait(30);
		locateElement("LinkText","Leads").click();
		locateElement("LinkText","Create Lead").click();
//		enter(locateElement("Id","createLeadForm_companyName"),"TestLeaf");
		enter(locateElement("Id","createLeadForm_companyName"),companyname);
//		enter(locateElement("Id","createLeadForm_firstName"),"Mohan");
		enter(locateElement("Id","createLeadForm_firstName"),firstname);
//		enter(locateElement("Id","createLeadForm_lastName"),"Balaji");
		enter(locateElement("Id","createLeadForm_lastName"),lastname);
		selectByIndex((locateElement("Id","createLeadForm_marketingCampaignId")), marketing);
		
		enter(locateElement("Id","createLeadForm_firstNameLocal"),firstnamelocal);
		
		enter(locateId("createLeadForm_lastNameLocal"), lastnamelocal);
		getText(locateId("createLeadForm_ _sp"));
		
		selectByVisibleText((locateId("createLeadForm_industryEnumId")),industry);
		
		locateElement("ClassName","smallSubmit").click();
		
		String text = locateElement("Id","viewLead_firstName_sp").getText();
		System.out.println(text);
		if(text==createdfname) {
			System.out.println("Created");
		}else {
			System.out.println("Not Created");
		}
	}
	
	@Parameters({"url"})
	@Test(dataProvider="fetchdata1",dependsOnMethods= {"jan1.CreateEditMergeUsingExcel.createLead"},enabled=false)
	public void editLeed(String URL) throws InterruptedException {
		startAPP("Chrome",URL);
		WebElement user = locateElement("Id","username");
		enter(user,"DemoSalesManager");
		locateElement("Id","password").sendKeys("crmsfa");
		WebElement login = locateElement("ClassName","decorativeSubmit");
		click(login);
		locateElement("LinkText","CRM/SFA").click();
		implicitlyWait(30);
		locateElement("LinkText","Leads").click();
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
	
	
	@Parameters("url")
	@Test(enabled=false,priority=0)
	public void main(String URL) throws InterruptedException {
		startAPP("Chrome",URL);
		WebElement username = locateElement("Id","username");
		enter(username, "DemoSalesManager");
		locateElement("Id","password").sendKeys("crmsfa");
		WebElement login = locateElement("ClassName","decorativeSubmit");
		click(login);
		locateElement("LinkText","CRM/SFA").click();
		implicitlyWait(30);
		locateElement("LinkText","Leads").click();
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
