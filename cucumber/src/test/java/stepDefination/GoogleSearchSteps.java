package stepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class GoogleSearchSteps {

	WebDriver driver =null;
	

	@Given("browser is open")
	public void browser_is_open() {
		System.out.println("Browser open");
		String projectPath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/Drivers/chromedriver.exe");
		
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
	}

	@And("user is on google search page")
	public void user_is_on_google_search_page() {
		System.out.println("user_is_on_google_search_page");
		driver.navigate().to("http://www.google.com");
	}

	@When("user enters a text in search box")
	public void user_enters_a_text_in_search_box() {
		System.out.println("user enters a text in search box");
		driver.findElement(By.name("q")).sendKeys("selenium");
	}

	@And("hits enter")
	public void hits_enter() {
		System.out.println("hits enter");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);		
	}

	@Then("user is navigated to serach results")
	public void user_is_navigated_to_serach_results() {
		System.out.println("user is navigated to serach results");
		driver.getPageSource().concat("selenium");
		driver.close();
		driver.quit();
	}



}
