package Stepdefinition;



import io.cucumber.java.Before;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.vimalselvam.cucumber.listener.Reporter;
import java.io.File;
import io.cucumber.java.After;

public class sharedsteps {
	WebDriver driver;
    @Before
    public void initializeBrowser() {
    	System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
        driver = new EdgeDriver();
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
