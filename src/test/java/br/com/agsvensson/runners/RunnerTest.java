package br.com.agsvensson.runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
				 features = "src\\test\\resources\\features\\",
				 glue = "br.com.agsvensson.steps",
				 plugin = {"pretty", "html:target/report-html", "json:target/report.json"},
				 monochrome = true, // resolve o problema de caracteres no terminal
				 tags = {"@unitários"},
				 snippets = SnippetType.CAMELCASE,
				 dryRun = false, // true valida os cenários
				 strict = false
				)
public class RunnerTest {

	}