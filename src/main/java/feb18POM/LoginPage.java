package feb18POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import jan26framework.ProjectMethods;

public class LoginPage extends ProjectMethods{
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="")
	WebElement eleusername;
	@And("Enter the Username (.*)")
	public LoginPage typeUsername(String data) {
		enter(eleusername, data);
		return this;
	}
	
	@FindBy(id="")
	WebElement elepass;
	public LoginPage typePass(String pass) {
		enter(elepass, pass);
		return this;
	}

	@FindBy(id="")
	WebElement elelogin;
	public Homepage click() {
		click(elelogin);
		Homepage hm = new Homepage();
		return hm;
	}
}
