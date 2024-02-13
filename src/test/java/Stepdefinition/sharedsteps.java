package Stepdefinition;



import io.cucumber.java.Before;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.vimalselvam.cucumber.listener.Reporter;
import java.io.File;
import io.cucumber.java.After;

public class sharedsteps {
	WebDriver driver;
    @Before
    public void initializeBrowser() {
    	System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
        driver = new FirefoxDriver();
    }
    public WebDriver getdriver() {
    	return driver;
    }
    @After
    public void closeBrowser() {
    	
    	//Reporter.loadXMLConfig(new File("src/main/resources/config.xml"));
    	driver.close();  
    	}
}
