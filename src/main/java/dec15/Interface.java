package dec15;

import org.openqa.selenium.WebElement;

public interface Interface {
	
	//Browser
	public void startAPP(String Browser,String URL);
	
	//locators,we give WebElement instead of void because locating element is not a method
	public WebElement locateElement(String locator,String locvalue);

	//locate id. if not located it throws no such element exception
	public WebElement locateId(String locatorvalue);
	
	//sendKeys we give void because .sendKeys(); is a method
	//if not located it throws element not visible exception
	public void enter(WebElement ele,String text);
	
	//click
	public void click(WebElement ele);
	
	//clear 
	public void clear(WebElement ele);
	
	//getText we give String because it returns the text
	public String getText(WebElement ele);
	
	//getTitle
	public void getTitle();
	
	//getAttribute
	public void getAttribute(WebElement ele,String value);
	
	//select by index
	public void selectByIndex(WebElement ele, int index);
	
	//select by value
	public void selectByValue(WebElement ele,String value);
	
	//select by visibleText
	public void selectByVisibleText(WebElement ele,String text);
	
	//switch to frame by index
	public void frameByIndex(int num);
	
	//switch to frame by id/classname
	public void frameByIdClass(String value);
	
	//switch to frame by ele
	public void frameByEle(WebElement ele);
	
	//accept alert
	public void acceptAlert();
	
	//dismiss alert
	public void dismissAlert();
	
	//getAlert
	public String getAlert();
	
	//switchToWindow
	public void switchWindow(int num);
	
	//is displayed
	public boolean isDisplayed(WebElement ele);
	
	//is selected
	public boolean isSelected(WebElement ele);
	
	//is enabled
	public boolean isEnabled(WebElement ele);
	
	//verify Title
	public boolean verifyTitle();
	
	//verifyPartialText
	public boolean verifyPartialText(WebElement ele);
	
	//verifyExactText
	public boolean verifyExactText(WebElement ele);
	
	//verify partial Attribute
	public void verifyPartialAtt(WebElement ele,String Attribute,String value);
	
	//verify exact Attribute
	public void verifyExactAtt(WebElement ele,String Attribute,String value);
	
	//Take snap
	public void takeSnap(String path);
	
	
	//close 
	public void close();
	
	//close all browsers
	public void quit();
	
	//implicitwait
	public void implicitlyWait(int num);
	

}
