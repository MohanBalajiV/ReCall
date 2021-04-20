package dec10;

import java.io.File;



import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.xml.bind.ParseConversionEvent;
import org.apache.commons.io.FileUtils;
import org.apache.poi.xslf.usermodel.XSLFSheet;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Prep2019 {
	
	 	
//	public int m1() {
//		return 0;
//	}
//	public long m1() {
//		return 1;
//		
//	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//initiate browser
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		Prep2019 os=new Prep2019();
//		System.out.print(os.m1);
		
		driver.get("");
		char[] ch={'1','2','3','2','5','4','6','3'};
		
		
		
		
		//locators
		driver.findElementById("Idvalue");
		driver.findElementByClassName("ClassNamevalue");
		driver.findElementByXPath("XPath");
		driver.findElementByLinkText("LinkText");
		driver.findElementByName("Value");
		driver.findElementByTagName("Tagname");
		driver.findElementByCssSelector("");
		driver.findElementByPartialLinkText("");
		
		//if a locator is locating multiple we have to use findElements and store in a list
		List<WebElement> ele = driver.findElementsById("");
		for(WebElement all: ele) {
			all.getText();
		}
		
		//Relative XPath  //tagname[@attribute='attributevalue']
		driver.findElementByXPath("//input[@id='username']");
		driver.findElementByXPath("//input[starts-with(@id,'user')]");
		driver.findElementByXPath("//input[ends-with(@id,'name')]");
		driver.findElementByXPath("//input[contains(@id,'ernam')]");
		driver.findElementByXPath("//input[text()='asdf']");
		driver.findElementByXPath("//input[contains(text(),'asdf')]");
		driver.findElementByXPath("//*[@id='password'])/following::a");
		driver.findElementByXPath("//*[@id='password'])/preceeding::div");
		driver.findElementByXPath("//*[@id='password'])/following-sibling::span");
		driver.findElementByXPath("//*[@id='password'])/preceeding-sibling::span");
		driver.findElementByXPath("//*[@id='password'])//a");
		driver.findElementByXPath("//*[@id='password'])/parent::span");
		
		driver.findElementByXPath("//input[@id='asdf']");
		driver.findElementByXPath("//input[starts-with(@id,'user')]");
		driver.findElementByXPath("//input[ends-with(@id,'sadf')]");
		driver.findElementByXPath("//input[contains(text(),'asdf')]");
		driver.findElementByXPath("//input[contains(text(),'asdf')]/following::a");
		driver.findElementByXPath("//input[contains(text(),'asdf')]/preceeding::a");
		driver.findElementByXPath("//input[contains(text(),'asdf')]/following-sibling::a");
		driver.findElementByXPath("(//input[contains(text(),'asdfasdf')]/preceeding::a)[2]");
		
		
		WebDriverWait wait= new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(ele1));
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		//dropdown if it is in select tag
		WebElement dp = driver.findElementById("");
		Select sel= new Select(dp);
		
		//if we know the count
		sel.selectByIndex(4);
		sel.selectByValue("value");
		sel.selectByVisibleText("Text");
		
		//to deselect a value in dropdown
		sel.deselectByIndex(4);
		sel.deselectByValue("value");
		sel.deselectByVisibleText("Text");
		
		//if dont know the size of the dp and only for select class we can use getOptions
		List<WebElement> options = sel.getOptions();
		int size = options.size();
		sel.selectByIndex(size-4);
		//for loop
		for(int i=0;i<size;i++) {
			options.get(i).getText();
		}
		//for each
		for(WebElement each:options) {
			each.getText();
		}
		
		//if the dropdown is not in the select tag
		List<WebElement> options1 = driver.findElementsById("");
		for(WebElement each : options1) {
			String text = each.getText();
			System.out.println("text");
			
			//to pass a string in console
			Scanner sc = new Scanner(System.in);
			String nextLine = sc.nextLine();
			if(text.contains(nextLine)) {
				each.click();
				break;
				}
		}
		
		//alert
		driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		driver.switchTo().alert().getText();
		
		//frames
		driver.switchTo().frame(1);
		driver.switchTo().frame("ID/ClassName Value");
		driver.switchTo().frame("driver.findElementByXPath");
		//parent of that frame
		driver.switchTo().parentFrame();
		//parent of all frames
		driver.switchTo().defaultContent();
		
		//windowhandles
		String parentwindow = driver.getWindowHandle();
		Set<String> win = driver.getWindowHandles();
		List<String> all = new ArrayList<String>(win);
		all.addAll(win);
		driver.switchTo().window(all.get(1));
		int size2 = all.size();
		for(int i=0;i<size2;i++) {
		driver.switchTo().window(all.get(i));
		}
		
		//methods
		driver.findElementById("").sendKeys("");		
		driver.findElementById("").clear();
		driver.findElementById("").click();
		driver.findElementById("").getText();
		driver.getTitle();
		driver.close();
		driver.quit();
		
		//screenshot
		File src = driver.getScreenshotAs(OutputType.FILE);
		File des = new File("path");
		FileUtils.copyFile(src, des);
		
		//right click
		Actions ac = new Actions(driver);
		ac.contextClick().sendKeys(Keys.ARROW_DOWN).perform();
		
		//to press escape
		driver.getKeyboard().sendKeys(Keys.ESCAPE);
		
		//to check whether the checkbox is checked or not
		WebElement checkbox = driver.findElementById("");
		boolean selected = checkbox.isSelected();
		if(selected == true){
			System.out.println("selected");
		}
		
		//to check the element is enabled or not
		driver.findElementById("").isEnabled();
		
		//to check the elemenet is displayed or not
		driver.findElementById("").isDisplayed();
		
		//get value of a cell 2 row and 1 cell from excel if it is xlsx use XSSF 
		XSSFWorkbook wbook = new XSSFWorkbook("path");
		int numberOfSheets = wbook.getNumberOfSheets();
		XSSFSheet wsheet = wbook.getSheetAt(0);
		XSSFRow rows = wsheet.getRow(1);
		XSSFCell cells = rows.getCell(0);
		String Cellvalue = cells.getStringCellValue();
		System.out.println("Cellvalue");
		
		//if I dont know how many rows and cells
		XSSFWorkbook book = new XSSFWorkbook("path");
		int sheets = book.getNumberOfSheets();
		System.out.println(sheets);
		XSSFSheet sheet1 = book.getSheetAt(0);
		int rowcount = sheet1.getLastRowNum();
		int cellcount = sheet1.getRow(0).getLastCellNum();
		for(int i=1;i<rowcount;i++) {
			XSSFRow row = sheet1.getRow(i);
			for(int j=0;j<cellcount;j++) {
				XSSFCell cell = row.getCell(j);
				String value = cell.getStringCellValue();
				System.out.println(value);
			}
		}
		
		
		//to get the dynamic value
		XSSFWorkbook book1 = new XSSFWorkbook("path");
		XSSFSheet sheets1 = book1.getSheetAt(0);
		int rowcount1 = sheets1.getLastRowNum();
		int cellcount1 = sheet1.getRow(0).getLastCellNum();
		String[][] data = new String [rowcount1][cellcount1];
		for(int i=1;i<rowcount1;i++) {
			XSSFRow row = sheet1.getRow(i);
			for(int j=0;j<cellcount1;j++) {
				XSSFCell cell1= row.getCell(j);
				data[i-1][j]= cell1.getStringCellValue();
				System.out.println(data);
			}
		}
		
		
		XSSFWorkbook bk = new XSSFWorkbook("path");
		XSSFSheet sht = bk.getSheetAt(0);
		int rowcnt= sht.getLastRowNum();
		int cellcnt= sht.getRow(0).getLastCellNum();
		String [][] dt = new String[rowcnt][cellcnt];
		for(int i=1;i<rowcnt;i++) {
			XSSFRow rw= sht.getRow(i);
			for(int j=0;j<cellcnt;j++) {
				XSSFCell cl = rw.getCell(j);
				dt[i-1][j] = cl.getStringCellValue();
				System.out.println(dt);
			}
		}
		
		
		
		//creating path for reports
		ExtentHtmlReporter html= new ExtentHtmlReporter("./reports/result.html");
		//to know the history
		html.setAppendExisting(true);
		ExtentReports extent= new ExtentReports();
		// to create the report in html format
		extent.attachReporter(html);
		ExtentTest test = extent.createTest("TestCaseName","TestCaseDescription");
		test.assignAuthor("Author name");
		test.assignCategory("category");
		test.pass("");
		test.fail("");
		
		//to run the report
		extent.flush();
		
		//to take screenshot of the report
		test.pass("Login clicked successfully", MediaEntityBuilder.createScreenCaptureFromPath("").build());
		
		
		
		
		//Calling methods refer in selenium project--> package weekday3,mobile class , and mymobile class.
		//Calling methods refer in Official project--> package dec15,Class1 and Class2 class.
		//We have to create an object in classname inside main method to call a non static method of that class
		//For a static method we can directly call the method name inside the main class 
		//To call a method we have to call like classname.methodname
		//to call a non static method we have to create an object in method name to call that method
		//To call a method from another class we have to create an static object of the classname in the class level
		//After creating a static object call the staticobjectname.methodname of class1.
		
		//public access modified can be accessed anywhere
		//default can be accessed within the package
		//private can be accessed within the class level
		//protected can be accessec within the class or subclass
		
		
		//public = access modifier
		//static = return type
		//void = return type
		//int = data type
		//string = data type
		//public void openPage(int num){   }
		//public static String openFolder(){  String name="new" return name;
		//if static used it should have return type

		//for array index starts with 0
		
		WebElement element = driver.findElementById("");
		String text="English,Hindi";
		String [] a = text.split(",");
		for (int i=0;i<text.length();i++) {
			String text2 = element.getText();
			if(text2.equalsIgnoreCase(text)) {
				element.click();
				
			}
		}
		//in for loop if it 10 elements if u start by 0
		for(int i=0;i<10;i++) {
			
		}
		//in for loop if it has 10 elements if u start by 1
		for(int i=1;i<=10;i++) {
			
		}
	}

	
	//switch case
	public static String msg(String name) {
		String a="";
		//Inside switch("") we should give what is given in arguments, here we gave name so we will give name below
		switch(name) {
		case "one" : a="asdf";
		case "two" : a="wqer";
		case "three" : a="zxcv";
		}
		return a;
	}
}


