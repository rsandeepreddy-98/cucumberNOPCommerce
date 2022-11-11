package PageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CustomersPage {

	public WebDriver driver;
	public CustomersPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//i[@class='nav-icon far fa-user']")
	private WebElement customersMenuItem;
	
	public void CustomersMenuItem() {
		WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
		webDriverWait.until(ExpectedConditions.elementToBeClickable(customersMenuItem));
		customersMenuItem.click();
	}
	
	@FindBy(xpath = "//a[@href='/Admin/Customer/List']")
	private WebElement customersOption;
	
	public void customersOptionClick() {
		customersOption.click();
	} 
	
	private By addNewButton = By.xpath ("//div[@class='float-right']/child::a");
	
	public void clickAddNewButton() {
		driver.findElement(addNewButton).click();
	}
}
