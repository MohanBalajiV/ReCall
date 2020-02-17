package jan26framework;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

import dec15.InheritanceClass;

public class ProjectMethods extends InheritanceClass{
	
	
	public static String sheet,testCaseName,author,category,desc;
//	public static int num;
	
	@BeforeSuite
	public void beforesuite(){
		StartResult();
	}
	
	@BeforeClass
	public void beforeClass() {
		createTestCase(testCaseName,desc);
		beforeMethod(author, category);
	}
	
	@BeforeMethod
	public void beforeMethod() {
		startAPP("Chrome","http://leaftaps.com/opentaps");
		WebElement user = locateElement("Id","username");
		enter(user,"DemoSalesManager");
		locateElement("Id","password").sendKeys("crmsfa");
		WebElement login = locateElement("ClassName","decorativeSubmit");
		click(login);
		locateElement("LinkText","CRM/SFA").click();
		implicitlyWait(30);
		locateElement("LinkText","Leads").click();
		
	}
	
	
	@AfterMethod
	public void afterMethod() {
		quit();
	}

	@AfterSuite
	public void afterSuite() {
		endResult();
	}
	
}
	
//	@DataProvider(name="fetchdata")	
//	public String[] [] getData()  throws IOException {
//	XSSFWorkbook wbook = new XSSFWorkbook(sheet);
//	XSSFSheet sheet= wbook.getSheetAt(0);
//	int rowcount = sheet.getLastRowNum();
//	int cellcount = sheet.getRow(0).getLastCellNum();
//	String [][] data = new String [rowcount][cellcount];
//	for(int i=1;i<rowcount;i++) {
//		XSSFRow row = sheet.getRow(i);
//		for(int j=0;j<cellcount;j++) {
//			XSSFCell cell= row.getCell(j);
//			data[i-1][j]=cell.getStringCellValue();
//			System.out.println(data);
//					
//		}
//	}
//	return null;
//	}

	
//	public static String testCaseName,testdesc,author,category;
//	@BeforeSuite
//	public void beforeSuite() {
//		StartResult();
//	}
//	
//	@BeforeClass
//	public void beforeClass() {
//		createTestCase(testCaseName, testdesc);
//		beforeMethod(author, category);
//	}
//	
//	@BeforeMethod
//	public void beforeMethod() {
//		startAPP("Chrome","http://leaftaps.com/opentaps");
//		WebElement user = locateElement("Id","username");
//		enter(user,"DemoSalesManager");
//		locateElement("Id","password").sendKeys("crmsfa");
//		WebElement login = locateElement("ClassName","decorativeSubmit");
//		click(login);
//		locateElement("LinkText","CRM/SFA").click();
//		implicitlyWait(30);
//		locateElement("LinkText","Leads").click();
//		
//	}
//	
//	@AfterMethod
//	public void afterMethod() {
//		quit();
//	}
//
//	@AfterSuite
//	public void afterSuite() {
//		endResult();
	
