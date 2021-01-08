package dec15;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Class2 {
	
	//open photos
	public static void photos(){
		for(int photos=1;photos<=10;photos++) {
		System.out.println("Opened file name is photo "+photos);	
		}
	}

	
	//print folder
	public static void main(String[] args) throws IOException {
//		Class1.message("Dad");
//		Class2.photos();
		//create obj for non static method of another class
//		Class1 newobj = new Class1();
//		newobj.ringtone(1);
		//Import dynamic value  from Excel 
		XSSFWorkbook wbook = new XSSFWorkbook("E:\\Excel for selenium\\Book2.xlsx");
		int  numberOfSheets = wbook.getNumberOfSheets();
		System.out.println(numberOfSheets);
		XSSFSheet sheet = wbook.getSheetAt(0);
		int rowcount = sheet.getLastRowNum();
		System.out.println(rowcount);
		int cellcount = sheet.getRow(0).getLastCellNum();
		System.out.println(cellcount);
		String [][] data = new String [rowcount][cellcount];
		for(int i=0;i<=rowcount;i++) {
			XSSFRow row= sheet.getRow(i);
			for(int j=1;j<cellcount;j++) {
				XSSFCell cell= row.getCell(j);
				data[i][j-1] = cell.getStringCellValue();
				System.out.println(data);
			}
		
		}
		
		
		ExtentHtmlReporter html = new ExtentHtmlReporter("./reports/result.html");
		html.setAppendExisting(true);
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(html);
		ExtentTest test=extent.createTest("testCaseName","testDesc");
		test.pass("");
		test.fail("");
		test.assignAuthor("author");
		test.assignCategory("category");
				
		
		
	}

	
}
