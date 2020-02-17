package aug19;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import aug02.test1;


public class inherit2 implements test1 {
	public RemoteWebDriver driver;
	@Override
	public void startApp(String Browser, String URL) {
		// TODO Auto-generated method stub
		try {
			if(Browser=="Chrome") {
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
			driver= new ChromeDriver();      
			}else {
				System.out.println("The browser not available in the path");
			}
			driver.get(URL);
			System.out.println("Loaded the URL");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void implicitlyWait(int num) {
		// TODO Auto-generated method stub
		driver.manage().timeouts().implicitlyWait(num, TimeUnit.SECONDS);
	}

	@Override
	public void explicitlyWait(WebElement ele) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public WebElement locateElement(String ele, String value) {
		// TODO Auto-generated method stub
		switch(ele) {
		case "id" : return driver.findElementById(value);
		case "class" : return driver.findElementByClassName(value);
		case "XPath" : return driver.findElementByXPath(value);
		case "LinkText" : return driver.findElementByLinkText(value);
		case "PartialLinktext" : return driver.findElementByPartialLinkText(value);
		
		}
		return null;
	}

	@Override
	public WebElement locateElementById(String value) {
		// TODO Auto-generated method stub
		driver.findElementById(value);
		return null;
	}

	@Override
	public void click(WebElement ele) {
		// TODO Auto-generated method stub
		ele.click();
	}

	@Override
	public void enter(WebElement ele, String value) {
		// TODO Auto-generated method stub
		ele.sendKeys(value);
	}

	@Override
	public void getText(WebElement ele) {
		// TODO Auto-generated method stub
		ele.getText();
	}

	@Override
	public void getTitle() {
		// TODO Auto-generated method stub
		driver.getTitle();
	}

	@Override
	public void getOptions(WebElement ele) {
		// TODO Auto-generated method stub
		Select sel = new Select(ele);
		List<WebElement> dp = sel.getOptions();
		for(WebElement eachoption : dp) {
		System.out.println(eachoption.getText());
		}
	}

	@Override
	public void selectByIndex(WebElement ele, int num) {
		// TODO Auto-generated method stub
		Select sel = new Select(ele);
		sel.selectByIndex(num);
	}

	@Override
	public void selectByCount(WebElement ele, int num) {
		// TODO Auto-generated method stub
		Select sel = new Select (ele);
		List<WebElement> options = sel.getOptions();
		for(WebElement eachoption:options) {
			System.out.println(eachoption.getText());
		}
		int count = options.size();
		System.out.println("The size is"+count);
		sel.selectByIndex(count-num);
		
	}

	@Override
	public void selectByValue(WebElement ele, String value) {
		// TODO Auto-generated method stub
		Select sel = new Select(ele);
		sel.selectByValue(value);
	}

	@Override
	public void selectByVisibleText(WebElement ele, String value) {
		// TODO Auto-generated method stub
		Select sel= new Select(ele);
		sel.selectByVisibleText(value);
		
	}

	@Override
	public void switchToFrameByIndex(int num) {
		// TODO Auto-generated method stub
		driver.switchTo().frame(num);
		
	}

	@Override
	public void switchToFrameByIdorClass(String value) {
		// TODO Auto-generated method stub
		if(value=="id") {
			driver.switchTo().frame(value);
		}else if(value=="name"){
		driver.switchTo().frame(value);
		}
	}

	@Override
	public void switchToFrame(String ele, String value) {
		// TODO Auto-generated method stub
		if(ele=="id") {
			driver.switchTo().frame(value);
		}else if(ele=="XPath") {
		driver.switchTo().frame(value);
		}
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
	public void getTextOfAlert() {
		// TODO Auto-generated method stub
		driver.switchTo().alert().getText();
	}

	@Override
	public void switchToWindow(int num) {
		// TODO Auto-generated method stub
		Set<String> win = driver.getWindowHandles();
		List<String> allwin = new ArrayList<>(win);
		allwin.addAll(win);
		driver.switchTo().window(allwin.get(num));
	}

	@Override
	public void ss() {
		// TODO Auto-generated method stub
		File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
		File desc= new File("");
		
		try {
			FileUtils.copyFile(screenshotAs, desc);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void quit() {
		// TODO Auto-generated method stub
		
	}

}