package Stepdefinition;



import io.cucumber.java.Before;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

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
    	driver.close();    }
}
