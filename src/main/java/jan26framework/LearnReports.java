package jan26framework;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public abstract class LearnReports {
	
	public static ExtentReports extent ;
	public static ExtentTest test,testData;
	
	
	public void StartResult() {
		ExtentHtmlReporter html= new ExtentHtmlReporter("./reports/result.html");
		html.setAppendExisting(true);
		extent =  new ExtentReports();
		extent.attachReporter(html);
	}

	public void returnStep(String status,String desc) {
		if(status.equalsIgnoreCase("pass")) {
			testData.pass(desc);
		}else if(status.equalsIgnoreCase("fail")){
			testData.fail(desc);
		}
	}

	public void createTestCase(String testCaseName,String desc) {
		test = extent.createTest(testCaseName,desc);
	}
	
	public void beforeMethod(String author,String category) {
		testData = test.createNode("Leads");
		testData.assignAuthor(author);
		testData.assignCategory(category);
	}
	
	
	public void endResult() {
		extent.flush();
	}
}

//	public static ExtentReports extent;
//	public static ExtentTest test,testData;
//	
//	public void StartResult() {
//		ExtentHtmlReporter html= new ExtentHtmlReporter("./reports/result.html");
//		html.setAppendExisting(true);
//		extent= new ExtentReports();
//		extent.attachReporter(html);
//	}
//	
//	public void reportStep(String status,String desc) {
//		if(status.equalsIgnoreCase("Pass")) {
//			testData.pass(desc);
//		}else if(status.equalsIgnoreCase("Fail")) {
//			testData.fail(desc);
//		}
//	}
//	
//	public void createTestCase(String testCaseName,String testdesc) {
//		test= extent.createTest(testCaseName,testdesc);
//	}
//	
//	public void beforeMethod(String author,String category) {
//		testData= test.createNode("Leads");
//		testData.assignAuthor(author);
//		testData.assignCategory(category);
//		
//	}
//	
//	
//	public void endResult() {
//		extent.flush();
//	}
	
	
	
	
	
	
	
	
	
	
