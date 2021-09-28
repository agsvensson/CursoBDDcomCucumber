package br.com.agsvensson.runners;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
				 //features = "src\\test\\resources\\features\\aprender_cucumber.feature",
				 //features = "src\\test\\resources\\features\\alugar_filme.feature",
				 //features = "src\\test\\resources\\features\\inserir_conta.feature",
				 features = "src\\test\\resources\\features\\",
				 glue = "br.com.agsvensson.steps",
				 plugin = {"pretty", "html:target/report-html", "json:target/report.json"},
				 monochrome = true, // resolve o problema de caracteres no terminal
				 tags = {"@funcionais"},
				 snippets = SnippetType.CAMELCASE,
				 dryRun = false, // true valida os cenários
				 strict = false
				)
public class RunnerFuncionalTest {

	@BeforeClass
	public static void reset() {
	System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver.exe");
	ChromeOptions options = new ChromeOptions();
	options.setHeadless(true);
	WebDriver driver = new ChromeDriver(options);
	
	driver.get("https://seubarriga.wcaquino.me/");
	driver.findElement(By.id("email")).sendKeys("arthur86@mailinator.com");
	driver.findElement(By.id("senha")).sendKeys("123456");
	driver.findElement(By.tagName("button")).click();
	driver.findElement(By.linkText("reset")).click();
	System.out.println("");
	System.out.println("Reset do banco de dados efetuado com sucesso :) ");
	System.out.println("");
	driver.quit();
	}
}
