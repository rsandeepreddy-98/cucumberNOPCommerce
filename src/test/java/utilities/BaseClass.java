package utilities;


import java.io.File;
import java.io.IOException;
import java.sql.DriverManager;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;





public class BaseClass {
	public static WebDriver driver;

	
	public static void setUp() {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	
	public static void tearDown() {
		driver.close();
	}
	
	
	public void takeScreenShotOnFailedScenario(Scenario scenario) throws IOException {

		
		if ((scenario.isFailed())) {
			 File sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			 	
			 byte[] fileContent = FileUtils.readFileToByteArray(sourcePath);
			
			scenario.embed(fileContent, "image/png");
		}
	}
	
	@After
	public static void getScreenshot(Scenario scenario) throws IOException {

			 
		if ((scenario.isFailed())) {
			 File sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			 byte[] fileContent = FileUtils.readFileToByteArray(sourcePath);
			 String destinationFile = System.getProperty("user.dir") + "./Screenshots.png";
				
			scenario.embed(fileContent, "image/png");
			FileUtils.copyFile(sourcePath, new File(destinationFile));
			
		}
		
	
			
	}
	  
	
	
}
