package br.com.agsvensson.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
				 features = "src\\test\\resources\\features\\",
				 glue = {"br.com.agsvensson.steps", "br.com.agsvensson.config"},
				 plugin = {"pretty", "html:target/report-html", "json:target/report.json"},
				 monochrome = true, // resolve o problema de caracteres no terminal
				 tags = {"@unitários", "not @ignore"},
				 snippets = SnippetType.CAMELCASE,
				 dryRun = false, // true valida os cenários
				 strict = false
				)
public class RunnerTest {

	}