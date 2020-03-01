package feb18POM;

import java.sql.Driver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import jan26framework.ProjectMethods;

public class Homepage extends ProjectMethods{
	
	public Homepage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="")
	WebElement eleleads;
	public Homepage click() {
		
		return this;
	}
}
