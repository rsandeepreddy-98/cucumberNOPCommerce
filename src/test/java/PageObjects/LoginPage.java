package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public WebDriver driver;
	
	public LoginPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	private By dashboardTitle=By.xpath("//a[@href='/Admin']/child::i");
	
	public void clickDashboardMenu() {
		driver.findElement(dashboardTitle).click();
	}

	public String getPageTitle() {
		return driver.getTitle();
	}
	
	/*Here we need to identify the webelements of the Login page*/
	@FindBy(name = "Email")
	private WebElement emailElement;
	
	public void setEmailElement(String email) {
		emailElement.clear();
		emailElement.sendKeys(email);
	}
	
	/*For Password element*/
	@FindBy(id = "Password")
	private WebElement passwordElement;
	
	public void setPasswordElement(String password) {
		passwordElement.clear();
		passwordElement.sendKeys(password);
	}
	
	/*For Login Button*/
	@FindBy(xpath = "//button[@class='button-1 login-button']")
	private WebElement loginButtonElement;
	
	public void setLoginButton() {
		loginButtonElement.click();
	}
	
}
