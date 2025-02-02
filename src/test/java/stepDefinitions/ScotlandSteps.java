package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.CountryPage;
import pages.GPpracticePage;
import pages.StartPage;
import utils.DriverFactory;

public class ScotlandSteps {

    private WebDriver driver = DriverFactory.getDriver();
    private StartPage startPage = new StartPage(driver);
    private CountryPage countryPage = new CountryPage(driver);
    private GPpracticePage gpPracticePage = new GPpracticePage(driver);

    @When("the user selects Scotland")
    public void theUserSelectsScotland(){
        driver.findElement(By.id("radio-scotland")).click();

    }
    @Then("the user should be on {string} page")
    public void theUserShouldBeOnPage(String expectedUrl ){
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals("The URL does not match", expectedUrl, actualUrl);

    }
    @When("the user selects yes to living in the Highlands")
    public void theUserSelectsYesToLivingInTheHighlands(){
        driver.findElement(By.id("radio-yes")).click();
    }
    @When("the user selects I am not registered with a dental practice")
    public void theUserSelectsIamNotRegisteredWithADentalPractice(){
        driver.findElement(By.id("radio-not-registered")).click();
    }
    @When("they enter a valid date of birth which is 16")
    public void theyEnterAValidDateOfBirthWhichIs16(){
        driver.findElement(By.id("dob-day")).sendKeys("01");
        driver.findElement(By.id("dob-month")).sendKeys("02");
        driver.findElement(By.id("dob-year")).sendKeys("2009");
    }
    @Then("they will see full time education page")
    public void theyWillSeeFullTimeEducationPage(){
        driver.findElement(By.id("question-heading")).isDisplayed();

    }
    @When("the user enters yes to full time education page")
    public void theUserEnteredYesToFullTimeEducationPage(){
        driver.findElement(By.id("radio-yes")).click();
    }
    @Then("they will see results full time education {string} page")
    public void theyWillSeeResultsFullTimeEducationPage(String expectedUrl){
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals("The URL does not match", expectedUrl, actualUrl);

    }
}
