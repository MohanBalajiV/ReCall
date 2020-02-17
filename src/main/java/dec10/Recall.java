package dec10;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Recall {
		
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		
		
		driver.findElementById("");
		driver.findElementByClassName("");
		driver.findElementByLinkText("");
		driver.findElementByTagName("");
		driver.findElementByPartialLinkText("");
		
		driver.findElementByXPath("//input[@id='']");
		driver.findElementByXPath("//input[starts-with(@id,'')]");
		driver.findElementByXPath("//*[ends-with(@id,'')]");
		driver.findElementByXPath("//*[contains(@id,'')]");
		driver.findElementByXPath("//input(text()='']");
		driver.findElementByXPath("//input[contains(text(),'')]");
		driver.findElementByXPath("//input[contains(text(),'')]/following::a");
		driver.findElementByXPath("//input[contains(text(),'')]/preceeding::a");
		driver.findElementByXPath("//input[contains(text(),'')]/following-sibling::a");
		driver.findElementByXPath("//input[contains(text(),'')]/preceeding-sibling::a");
		driver.findElementByXPath("(//input[text()=''])[2]");
		
		
		WebElement dp =driver.findElementById("");
		Select sel= new Select(dp);
		sel.selectByIndex(1);
		sel.selectByValue("");
		sel.selectByVisibleText("");
		
		List<WebElement> options = sel.getOptions();
		int size = options.size();
		sel.selectByIndex(size-5);
		
		for(int i=0;i<size;i++) {
			dp.getText();
		}
		
		for(WebElement eachoption:options) {
			dp.getText();
		}
		
		
		List<WebElement> option = driver.findElementsById("");
		for(WebElement eachoptions:option) {
			String text = dp.getText();
			
			Scanner sc= new Scanner(System.in);
			String nextLine = sc.nextLine();
			if(text.contains(nextLine)) {
				eachoptions.click();
				break;
			}
		}
		
		
		
		driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		driver.switchTo().alert().getText();
		
		
		driver.switchTo().frame(1);
		driver.switchTo().frame("id/classname value");
		driver.switchTo().frame(driver.findElementById(""));
		
		
		
		String parent =driver.getWindowHandle();
		Set<String>win= driver.getWindowHandles();
		List<String>allwin= new ArrayList<String>(win);
		allwin.addAll(win);
		driver.switchTo().window(allwin.get(1));
		
		int size2 = allwin.size();
		for(int i=0;i<size2;i++) {
			driver.switchTo().window(allwin.get(i));
		}
		
		
		
		XSSFWorkbook wbook = new XSSFWorkbook("");
		XSSFSheet sheet= wbook.getSheetAt(0);
		XSSFRow row = sheet.getRow(1);
		XSSFCell cell = row.getCell(0);
		String data= cell.getStringCellValue();
		System.out.println(data);
		
		
		XSSFWorkbook wbook1 = new XSSFWorkbook("");
		XSSFSheet sheet1 = wbook1.getSheetAt(0);
		int rowcount = sheet1.getLastRowNum();
		int cellcount = sheet1.getRow(0).getLastCellNum();
		for(int i=0;i<rowcount;i++) {
			XSSFRow row1= sheet1.getRow(i);{
				for(int j=0;j<cellcount;j++) {
					XSSFCell cell1 = row1.getCell(j);
					String data1 = cell1.getStringCellValue();
					System.out.println(data1);
				}
			}
		}
		
		
		XSSFWorkbook wbook2=  new XSSFWorkbook("");
		XSSFSheet sheet2= wbook2.getSheetAt(0);
		int rowcount1 = sheet2.getLastRowNum();
		int cellcount1 = sheet2.getRow(0).getLastCellNum();
		String[][]data1= new String [rowcount1][cellcount1];
		for(int i=1;i<=rowcount1;i++) {
			XSSFRow row1= sheet1.getRow(i);
			for(int j=0;j<cellcount1;j++) {
				XSSFCell cell2=row1.getCell(j);
				data1 [i-1] [j] =cell2.getStringCellValue(); 
				System.out.println(data1);
			}
		}
		
		
		ExtentHtmlReporter html = new ExtentHtmlReporter("");
		html.setAppendExisting(true);
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(html);
		
		
		ExtentTest test = extent.createTest("testcaseName","TestDes");
		test.assignAuthor("");
		test.assignCategory("");
		test.pass("");
		test.fail("");
		extent.flush();
		
				
	}

}
