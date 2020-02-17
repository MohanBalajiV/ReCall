package july23;

import org.openqa.selenium.WebElement;

public interface Backup {
	
	//Browser,URL
	public void StartApp(String Browser,String URL);
	//Locaters
	public WebElement locateElement(String locater,String locatervalue);
	//attribute id
	public WebElement locateElementById(String locatervalue);
	//to type
	public void type(WebElement ele,String value);
	//to click 
	public void click(WebElement ele);
	//to get text
	public void getText(WebElement ele);
	//to get Title
	public void getTitle();
	//to verify text
	public void verifyText(WebElement ele,String expectedText);
	//to verify title
	public void verifyTitle(String expectedTitle);
	//to select dropdown by index
	public void selectDropDownByIndex(WebElement ele,int num);
	//to select dropdown by value
	public void selectDropDownByValue(WebElement ele,String value);
	//to select dropdwon by visibletext
	public void selectDropdownByVisibleText(WebElement ele,String value);
	//to accept alert
	public void acceptAlert();
	//to cancel alert
	public void dismissAlert();
	//to getText from alert
	public void getTextOfAlert();
	//to switch to window
	public void switchWindow(int num);
	//to switch to frame by id or name
	public void switchToFrameById(String Locvalue);
	//to switch to frame by index
	public void switchToFrameByIndex(int num);
	//to switch to frame by locater
	public  void switchToFrameByLocater(WebElement ele,String value);
	//to take snapshot
	public void takess();
	//to close the browser
	public void close();
	//to close all the browser
	public void closeAll();
	//to wait
	public void implicitlyWait(int num);
		

}
