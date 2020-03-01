package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import io.cucumber.datatable.dependency.com.fasterxml.jackson.core.PrettyPrinter;


@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/feature", glue= {"stepdescription","feb18POM"},monochrome=true,
dryRun=false,plugin= {"pretty","html:CucumberReport"},snippets=SnippetType.CAMELCASE,
tags= {"CreateLead"})
public class TestRunner {
	


}
