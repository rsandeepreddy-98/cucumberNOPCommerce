package stepDefination;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import com.aventstack.extentreports.gherkin.model.Feature;

import PageObjects.CustomersPage;
import PageObjects.LoginPage;
import cucumber.api.Scenario;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilities.BaseClass;
import utilities.Reports;

public class Stepdefination  {

	LoginPage loginPage;
	CustomersPage customersPage;
	WebDriver driver;
	/*
	 * //Scenario scenario; ExtentTest extentTest ; ExtentReports extentReports =
	 * Reports.getReports();
	 */
	@Given("^user launches chrome browser$")
	public void user_launches_chrome_browser() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver = new ChromeDriver();
		loginPage = new LoginPage(driver);
		customersPage = new CustomersPage(driver);
		
		/*
		 * extentTest=extentReports.createTest(Feature.class, "Feature File");
		 * extentTest.createNode(new
		 * GherkinKeyword("Given"),"^user launches chrome browser$");
		 * extentTest.addScreenCaptureFromPath(getScreenshot(driver));
		 */
	}

	@When("^user enter the url \"([^\"]*)\"$")
	public void user_enter_the_url(String url) throws Throwable {

		driver.get(url);
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//extentTest.addScreenCaptureFromPath(getScreenshot(driver));
	}

	@When("^user enters username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
	public void user_enters_username_as_and_password_as(String email, String pass) throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		loginPage.setEmailElement(email);
		Thread.sleep(2000);
		loginPage.setPasswordElement(pass);
		Thread.sleep(1500);
		//extentTest.addScreenCaptureFromPath(getScreenshot(driver));
	}

	@And("^user clicks on login button$")
	public void user_clicks_on_login_button() throws Throwable {

		loginPage.setLoginButton();
		Thread.sleep(1500);
		//extentTest.addScreenCaptureFromPath(getScreenshot(driver));
	}

	@When("^user clicks on Customer Menu in the left navigation bar$")
	public void user_clicks_on_Customer_Menu_in_the_left_navigation_bar() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		
		customersPage.CustomersMenuItem();
		//extentTest.addScreenCaptureFromPath(getScreenshot(driver));
	}

	@When("^Clicks on customer menu$")
	public void clicks_on_customer_menu() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		customersPage.customersOptionClick();
		//extentTest.addScreenCaptureFromPath(getScreenshot(driver));
	}

	@When("^user clicks on AddNewButton$")
	public void user_clicks_on_AddNewButton() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		customersPage.clickAddNewButton();
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		//extentTest.addScreenCaptureFromPath(getScreenshot(driver));
	}
	
	@When("^user click on DashboardMenu Option$")
	public void user_click_on_DashboardMenu_Option() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    loginPage.clickDashboardMenu();
	  assertEquals("Dashboard / nopCommerce administration", loginPage.getPageTitle());
	  
	  
	}
	
	@Then("^close browser$")
	public void close_browser() throws Throwable {

	driver.close();	 
	}
}
