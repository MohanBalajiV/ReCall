package stepDescription;

import com.aventstack.extentreports.gherkin.model.Scenario;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import dec15.InheritanceClass;

public class Hooks extends InheritanceClass{
	
	@Before
	public void beforeScenario(Scenario sc) {
		StartResult();
//		createTestCase(sc.getName(),sc.getId());
		test.assignAuthor("balaji|");
		test.assignCategory("test");
		startAPP("Chrome", "");
	}
	
	
	@After
	public void afterScenario() {
		close();
		endResult();
	}
	

}
