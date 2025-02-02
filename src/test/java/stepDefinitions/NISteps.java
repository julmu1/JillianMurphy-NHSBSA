package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.CountryPage;
import pages.StartPage;
import utils.DriverFactory;

public class NISteps {

    private WebDriver driver = DriverFactory.getDriver();
    private StartPage startPage = new StartPage(driver);
    private CountryPage countryPage = new CountryPage(driver);

    @When("the user selects Northern Ireland")
    public void theUserSelectsNorthernIreland() {
        driver.findElement(By.id("radio-nire")).click();
    }
    @Then("they should be redirected to the service not northern ireland {string} page")
    public void theyShouldBeRedirectedToTheServiceNotNorthern(String expectedUrl ){
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals("The URL does not match", expectedUrl, actualUrl);

    }
}
