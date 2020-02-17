package dec15;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import jan26framework.LearnReports;

public class InheritanceClass extends LearnReports implements Interface{
	
	int i=1;
	public RemoteWebDriver driver;
	@Override
	public void startAPP(String Browser, String URL) {
		try {
			// TODO Auto-generated method stub
			if(Browser=="Chrome") {
				System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
				driver = new ChromeDriver();
			}if(Browser=="IE") {
				System.setProperty("webdriver.ie.driver","./drivers/chromedriver.exe");
				driver = new InternetExplorerDriver();
			}
			driver.get(URL);
			} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public WebElement locateElement(String locator, String locvalue) {
		// TODO Auto-generated method stub
		switch(locator) {
		case "Id" : return driver.findElementById(locvalue);
		case "ClassName" : return driver.findElementByClassName(locvalue);
		case "XPath" : return driver.findElementByXPath(locvalue);
		case "LinkText" : return driver.findElementByLinkText(locvalue);
		case "TagName" : return driver.findElementByTagName(locvalue);
		case "CssSelector" : return driver.findElementByCssSelector(locvalue);
		case "PartialLinkText" : return driver.findElementByPartialLinkText(locvalue);
		case "Name" : return driver.findElementByName(locvalue);
		
		}
		
		return null;
	}

	@Override
	public WebElement locateId(String locatorvalue) {
		// TODO Auto-generated method stub
		return driver.findElementById(locatorvalue);
		 
	}

	@Override
	public void enter(WebElement ele,String text) {
		// TODO Auto-generated method stub
		ele.sendKeys(text);
		
	}

	@Override
	public void click(WebElement ele) {
		// TODO Auto-generated method stub
		ele.click();
	}

	@Override
	public void clear(WebElement ele) {
		// TODO Auto-generated method stub
		ele.clear();
	}

	@Override
	public String getText(WebElement ele) {
		// TODO Auto-generated method stub
		ele.getText();
		return null;
	}

	@Override
	public void getTitle() {
		// TODO Auto-generated method stub
		driver.getTitle();
	}

	@Override
	public void getAttribute(WebElement ele,String value) {
		// TODO Auto-generated method stub
		ele.getAttribute(value);
		
	}

	@Override
	public void selectByIndex(WebElement ele, int index) {
		// TODO Auto-generated method stub
		Select sel = new Select(ele);
		sel.selectByIndex(index);
	}

	@Override
	public void selectByValue(WebElement ele, String value) {
		// TODO Auto-generated method stub
		Select sel= new Select(ele);
		sel.selectByValue(value);
	}

	@Override
	public void selectByVisibleText(WebElement ele, String text) {
		// TODO Auto-generated method stub
		Select sel= new Select(ele);
		sel.selectByVisibleText(text);
	}

	@Override
	public void frameByIndex(int num) {
		// TODO Auto-generated method stub
		driver.switchTo().frame(num);
	}

	@Override
	public void frameByIdClass(String value) {
		// TODO Auto-generated method stub
		driver.switchTo().frame(value);
	}

	@Override
	public void frameByEle(WebElement ele) {
		// TODO Auto-generated method stub
		driver.switchTo().frame(ele);
	}

	@Override
	public void acceptAlert() {
		// TODO Auto-generated method stub
		driver.switchTo().alert().accept();
	}

	@Override
	public void dismissAlert() {
		// TODO Auto-generated method stub
		driver.switchTo().alert().dismiss();
	}

	@Override
	public String getAlert() {
		// TODO Auto-generated method stub
		driver.switchTo().alert().getText();
		return null;
	}

	@Override
	public void switchWindow(int num) {
		// TODO Auto-generated method stub
		Set<String> allwin=driver.getWindowHandles();
		List<String> allList = new ArrayList<String>(allwin);
		allList.addAll(allwin);
		driver.switchTo().window(allList.get(num));
		
	}

	@Override
	public boolean isDisplayed(WebElement ele) {
		// TODO Auto-generated method stub
		boolean k = ele.isDisplayed();
		if(k==true) {
			System.out.println("Displayed");
			return true;
		}else {
		return false;
		}
	}

	@Override
	public boolean isSelected(WebElement ele) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEnabled(WebElement ele) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean verifyTitle() {
		// TODO Auto-generated method stub
		String title = driver.getTitle();
		if(title.equalsIgnoreCase("text")) {
			System.out.println(title);
			return true;
		}
		return false;
	}

	@Override
	public boolean verifyPartialText(WebElement ele) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean verifyExactText(WebElement ele) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void verifyPartialAtt(WebElement ele, String Attribute, String value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void verifyExactAtt(WebElement ele, String Attribute, String value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void takeSnap(String path) {
		// TODO Auto-generated method stub
		File src = driver.getScreenshotAs(OutputType.FILE);
		File desc = new File("./ss/file"+i+".png");
		try {
			FileUtils.copyFile(src, desc);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		driver.close();
		
	}

	@Override
	public void quit() {
		// TODO Auto-generated method stub
		driver.quit();
	}

	@Override
	public void implicitlyWait(int num) {
		// TODO Auto-generated method stub
		driver.manage().timeouts().implicitlyWait(num, TimeUnit.SECONDS);
				
		
	}

}
