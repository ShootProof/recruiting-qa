package shootproof.selenium.tests;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

public class BaseTest{
	private WebDriver targetWebDriver;
	
	@BeforeSuite (alwaysRun = true)
	@Parameters({"browser","version"})
	protected void setupSuite(String browserName, String browserVersion) throws Exception {
		DesiredCapabilities capabilities = new DesiredCapabilities();
	    capabilities.setBrowserName(browserName);
	    capabilities.setVersion(browserVersion);
	    
	    try{
		    targetWebDriver = new RemoteWebDriver(
	                new URL("http://localhost:4444/wd/hub"),
	                capabilities);
	    }catch(Exception e) {
	    	throw new Exception("Exception is thrown during test setup: " + e.getMessage());
	    }
	}
	
	protected WebDriver getTargetWebDriver() {
		return targetWebDriver;
	}
	
	@AfterSuite (alwaysRun = true)
	protected void teardownSuite (){
		targetWebDriver.close();
	}
}
