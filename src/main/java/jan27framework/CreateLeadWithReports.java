package jan27framework;

import java.io.IOException;


import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jan26framework.ProjectMethods;

public class CreateLeadWithReports extends ProjectMethods{
	
	@BeforeTest
	public void setData() throws IOException {
		sheet="E:\\Excel for selenium\\Book2.xlsx";
		testCaseName="CreateLead";
		author="Balaji";
		category="smoke";
		desc="Creating a Lead";
	}
	
	@Test(dataProvider="fetchData")
	public void createLead(String companyname,String firstname,String lastname,int marketing,String firstnamelocal,String lastnamelocal,String industry,String createdfname) {
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
}	


