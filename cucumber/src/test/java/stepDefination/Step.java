package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step{
	
	WebDriver driver;
	
	@Given("^Users enter the Website$")
	public void users_enter_the_Website() throws Throwable {
	 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\cucumber\\src\\test\\java\\BDD\\cucumber\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/V4/");
	}

	@When("^User enters the creadtinal$")
	public void user_enters_the_creadtinal() throws Throwable {
	   driver.findElement(By.name("uid")).sendKeys("mngr300551");
	   driver.findElement(By.name("password")).sendKeys("ypUdazy");
	   driver.findElement(By.name("btnLogin")).click();
	}

	@Then("^Homepage is displayed$")
	public void homepage_is_displayed() throws Throwable {
	   
		boolean valid = driver.getPageSource().contains("mngr300551");
		
		if(valid==true) {
		
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
	}
	
}
