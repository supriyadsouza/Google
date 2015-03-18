package test.java.com.googletests;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class GoogleTest {
	
	public WebDriver driver;
	public static Logger log = Logger.getLogger(GoogleTest.class);
	
	@BeforeClass
	public void beforeClass() {
		BasicConfigurator.configure();
		LogManager.getRootLogger().setLevel(Level.INFO);
		log.info("Starting the browser");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http:\\www.google.com");
	}
	
	@Test
	public void testGoogle() {
		log.info("In the testcase");
	}
  

	@AfterClass
	public void afterClass() {
	  driver.close();
	  driver.quit();
	  log.info("Closing the browser");
	}
}
