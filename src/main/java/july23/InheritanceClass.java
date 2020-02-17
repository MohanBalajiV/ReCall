package july23;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.CopyUtils;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class InheritanceClass implements Backup{

	
	public RemoteWebDriver driver;
	@Override
	public void StartApp(String Browser, String URL) {
		// TODO Auto-generated method stub
		try {
			if (Browser=="chrome") {
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			driver=new ChromeDriver();
		    }else{
			System.out.println("This driver file is not present in the path");
		    }
			driver.get(URL);
			System.out.println("Loaded the URL");
	    }
		catch (Exception e) {
			// TODO Auto-generated catch block
		}	
	}
		

	@Override
	public WebElement locateElement(String locater, String locatervalue) {
		// TODO Auto-generated method stub
		switch(locater) {	
		case "id"  : return driver.findElementById(locatervalue);
		case "class" : return driver.findElementByClassName(locatervalue);
		case "linktext" : return driver.findElementByLinkText(locatervalue);
		case "xpath" : return driver.findElementByXPath(locatervalue);
		case "name" : return driver.findElementByName(locatervalue);
		case "cssselector" : return driver.findElementByCssSelector(locatervalue);
		}
		return null;
	}

	@Override
	public WebElement locateElementById(String locatervalue) {
		// TODO Auto-generated method stub
		WebElement id = driver.findElementById(locatervalue);
		return id;
	}

	@Override
	public void type(WebElement ele, String value) {
		// TODO Auto-generated method stub
		ele.sendKeys(value);
		System.out.println("The element is typed");
		
	}

	@Override
	public void click(WebElement ele) {
		// TODO Auto-generated method stub
		ele.click();
		System.out.println("The element is clicked");
	}

	@Override
	public void getText(WebElement ele) {
		// TODO Auto-generated method stub
		String text = ele.getText();
		System.out.println("The value of the text is"+text);
	}

	@Override
	public void getTitle() {
		// TODO Auto-generated method stub
		String title = driver.getTitle();
		System.out.println("The title is"+title);
	}

	@Override
	public void verifyText(WebElement ele, String expectedText) {
		// TODO Auto-generated method stub
		String text = ele.getText();
		if(text==expectedText) {
			System.out.println("Verified the text");
		}else {
			System.out.println("Not verified the text");
		}
	}

	@Override
	public void verifyTitle(String expectedTitle) {
		// TODO Auto-generated method stub
		String title = driver.getTitle();
		if(title==expectedTitle) {
			System.out.println("Verified the title");
		}else {
			System.out.println("Not verified the title");
		}
	}

	@Override
	public void selectDropDownByIndex(WebElement ele, int num) {
		// TODO Auto-generated method stub
		Select index = new Select(ele);
		index.selectByIndex(num);
	}

	@Override
	public void selectDropDownByValue(WebElement ele, String value) {
		// TODO Auto-generated method stub
		Select data = new Select(ele);
		data.selectByValue(value);
	}

	@Override
	public void selectDropdownByVisibleText(WebElement ele, String value) {
		// TODO Auto-generated method stub
		Select text = new Select(ele);
		text.selectByVisibleText(value);
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
		String text = driver.switchTo().alert().getText();
		System.out.println("The alert is "+text);
	}

	@Override
	public void switchWindow(int num) {
		// TODO Auto-generated method stub
		Set<String> allWindows = driver.getWindowHandles();
		List<String> allList= new ArrayList<String>();
		allList.addAll(allWindows);
		driver.switchTo().window(allList.get(num));
	}

	@Override
	public void switchToFrameById(String Locvalue) {
		// TODO Auto-generated method stub
		driver.switchTo().frame(Locvalue);
		
	}

	@Override
	public void switchToFrameByIndex(int num) {
		// TODO Auto-generated method stub
		driver.switchTo().frame(num);
		
	}

	@Override
	public void switchToFrameByLocater(WebElement ele, String value) {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public void takess() {
		// TODO Auto-generated method stub
		long number = (long) Math.floor(Math.random() * 900000000L) + 10000000L; 
		try {
			FileUtils.copyFile(driver.getScreenshotAs(OutputType.FILE) , new File("./ss/"+number+".jpg"));
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		FileUtils.copyFile(driver.getScreenshotAs(OutputType.FILE) , new File("./reports/images/"+number+".jpg"));

	}
	

	@Override
	public void close() {
		// TODO Auto-generated method stub
		driver.close();
		
	}

	@Override
	public void closeAll() {
		// TODO Auto-generated method stub
		driver.quit();
	}


	@Override
	public void implicitlyWait(int num) {
		// TODO Auto-generated method stub
		driver.manage().timeouts().implicitlyWait(num, TimeUnit.SECONDS);		
	}
	
	

}
