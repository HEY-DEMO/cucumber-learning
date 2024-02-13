package Stepdefinition;



import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class searchstepdefs {
	WebDriver driver;
	sharedsteps s ;
	public searchstepdefs(sharedsteps s) {
		this.s=s;
	}
    @Given("^I am logged in$")
    public void iAmLoggedIn() {
    	driver=s.getdriver();
        driver.get("https://demowebshop.tricentis.com/login");
        driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("ltest@test.com");
        driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("ltest@test");
        driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();

    }

    @When("^I search for \"([^\"]*)\"$")
    public void iSearchForProduct(String productName) {
        driver.findElement(By.xpath("//*[@id=\"small-searchterms\"]")).sendKeys(productName);
        driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[3]/form/input[2]")).click();
    }

    @Then("^I should see relevant search results$")
    public void verifySearchResults() {
    	 WebElement imageElement = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[3]/div[1]/div/div/div[1]/a/img"));

         // Get the source attribute of the image
         String actualSrc = imageElement.getAttribute("src");
         String expectedSrc = "https://demowebshop.tricentis.com/content/images/thumbs/0000131_health-book_125.jpeg";

         // Assert that the actual source matches the expected one
         Assert.assertEquals(expectedSrc, actualSrc);    }
}
