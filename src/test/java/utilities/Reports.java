package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Reports {

	public static ExtentReports extentReports;
	
	public static ExtentReports getReports() {
		String path = System.getProperty("user.dir")+"./Reports/reports.html";
		ExtentSparkReporter extentSparkReporter = new ExtentSparkReporter(path);
		extentSparkReporter.config().setDocumentTitle("CucumberDEmo");
		extentSparkReporter.config().setReportName("Cucumber");
		
		extentReports = new ExtentReports();
		extentReports.attachReporter(extentSparkReporter);
		extentReports.setSystemInfo("Teseter", "Sandeep");
		
		return extentReports;
	}
}
