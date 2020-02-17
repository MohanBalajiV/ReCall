package aug02;

import org.openqa.selenium.WebElement;

public interface test1 {

	public void startApp(String Browser,String URL);

	public void implicitlyWait(int num);
	
	public void explicitlyWait(WebElement ele);
	
	public WebElement locateElement(String ele,String value);

	public WebElement locateElementById(String value);
	
	public void click(WebElement ele);
	
	public void enter(WebElement ele,String value);
	
	public void getText(WebElement ele);
	
	public void getTitle();
	
	public void getOptions(WebElement ele);
	
	public void selectByIndex(WebElement ele,int num);
	
	public void selectByCount(WebElement ele,int num);
	
	public void selectByValue(WebElement ele,String value);
	
	public void selectByVisibleText(WebElement ele,String value);
	
	public void switchToFrameByIndex(int num);
	
	public void switchToFrameByIdorClass(String value);
	
	public void switchToFrame(String ele,String value);
	
	public void acceptAlert();
	
	public void dismissAlert();
	
	public void getTextOfAlert();
	
	public void switchToWindow(int num);
	
	public void ss();
	
	public void close();
	
	public void quit();
	
}
