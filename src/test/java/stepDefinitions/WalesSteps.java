package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.CountryPage;
import pages.GPpracticePage;
import pages.StartPage;
import utils.DriverFactory;

public class WalesSteps {

    private WebDriver driver = DriverFactory.getDriver();
    private StartPage startPage = new StartPage(driver);
    private CountryPage countryPage = new CountryPage(driver);
    private GPpracticePage gpPracticePage = new GPpracticePage(driver);

    @When("the user selects Wales")
    public void theUserSelectsWales() {
        driver.findElement(By.id("radio-wales")).click();
    }
    @When("the user enters no to scotland or wales")
    public void theUserEntersNoToScotlandOrWales(){
        driver.findElement(By.id("radio-no")).click();
    }
    @Then("they select Wales")
    public void theySelectWales(){
        driver.findElement(By.id("radio-wales")).click();
    }
    @When("they enter a valid date of birth which is over 100")
    public void theyEnterAValidDateOfBirthWhichIs16() {
        driver.findElement(By.id("dob-day")).sendKeys("01");
        driver.findElement(By.id("dob-month")).sendKeys("02");
        driver.findElement(By.id("dob-year")).sendKeys("1923");
    }
    @When("they select no to lives with a partner")
    public void theySelectNoToLiveWithAPartner(){
        driver.findElement(By.id("partner-hint")).isDisplayed();


    }
    @When("they select no to claims benefits")
    public void theySelectNoToClaimsBenefits(){
        driver.findElement(By.id("radio-no")).click();
    }
    @Then("they should see the war pensioner page")
    public void theyShouldSeeWarPensionerPage(){
        driver.findElement(By.id("radio-no")).isDisplayed();
    }
    @When("they select yes to having an injury")
    public void theySelectYesToHavingAnInjury(){
        driver.findElement(By.id("radio-yes")).click();
    }
    @When("they select No I get a different benefit")
    public void theySelectNoIGetADifferentBenefit(){
        driver.findElement(By.id("different-benefit")).click();
    }
}
