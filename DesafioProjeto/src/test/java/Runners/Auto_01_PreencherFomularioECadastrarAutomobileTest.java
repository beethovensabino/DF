package Runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/Features",
        glue = "Steps",
        plugin = {"pretty" ,"html:target/cucumber-reports"},
        monochrome = true,
        snippets = SnippetType.CAMELCASE,
        dryRun = false
)

public class Auto_01_PreencherFomularioECadastrarAutomobileTest {

}
