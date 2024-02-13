package Stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class loginstepdefs {
	WebDriver driver;
	sharedsteps s ;
	public loginstepdefs(sharedsteps s) {
		this.s=s;
	}
    @Given("^I am on the login page$")
    public void iAmOnLoginPage() {
      driver=s.getdriver();
       driver.get("https://demowebshop.tricentis.com/login");
    }

    @When("^I enter valid credentials$")
    public void iEnterValidCredentials() {
        driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("ltest@test.com");
        driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("ltest@test");
    }

    @When("^click on the login button$")
    public void clickLoginButton() {
        driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
    }

    @Then("^I should be logged in successfully$")
    public void verifySuccessfulLogin() {
    	String s=driver.getTitle();
        Assert.assertEquals(s, "Demo Web Shop");
    }
}
