package roughuse;

import java.io.IOException;
import java.security.cert.PKIXRevocationChecker.Option;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRichTextString;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Use2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
//		ChromeDriver driver = new ChromeDriver();
//		driver.get("http://leaftaps.com/opentaps/control/main");
//		driver.manage().window().maximize();
//		driver.findElementById("username").sendKeys("Demosalesmanager");
//		driver.findElementById("password").sendKeys("crmsfa");
//		driver.findElementByClassName("decorativeSubmit").click();
//		driver.findElementByLinkText("CRM/SFA").click();
//		driver.findElementByLinkText("Create Lead").click();
//		driver.findElementById("createLeadForm_companyName").sendKeys("test");
//		driver.findElementById("createLeadForm_firstName").sendKeys("user");
//		driver.findElementById("createLeadForm_lastName").sendKeys("one");
//		WebElement dp = driver.findElementById("createLeadForm_dataSourceId");
//		Select sel = new Select(dp);
//		List <WebElement> text= sel.getOptions();
//		int count = text.size();
//		sel.size();
//		sel.selectByIndex(count-2);
		
		XSSFWorkbook wbook = new XSSFWorkbook("E:\\Excel for selenium\\Book2.xlsx");
		XSSFSheet sheet = wbook.getSheetAt(0);
		int rowcount = sheet.getLastRowNum();
		System.out.println(rowcount);
		int cellcount = sheet.getRow(0).getLastCellNum();
		System.out.println(cellcount);
		XSSFRow row = sheet.getRow(1);
		XSSFCell cell = row.getCell(2);
		String data = cell.getStringCellValue();
		System.out.println(data);
					
		}
		
//		Dimension size = dp.getSize();
		
		
		
		

	}

