package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.CountryPage;
import pages.GPpracticePage;
import pages.StartPage;
import utils.DriverFactory;
import pages.*;


public class EnglandSteps {
    private WebDriver driver = DriverFactory.getDriver();
    private StartPage startPage = new StartPage(driver);
    private CountryPage countryPage = new CountryPage(driver);
    private GPpracticePage gpPracticePage = new GPpracticePage(driver);
    private CommonPage commonPage = new CommonPage(driver);
    private DentalPracticePage dentalPracticePage = new DentalPracticePage(driver);
    private DateOfBirthpage doBpage = new DateOfBirthpage(driver);
    private Partner partner = new Partner(driver);


;
    @Given("the user is on the start page")
    public void theUserIsOnStartPage() {
        driver.manage().deleteAllCookies();
        driver.get("https://check-for-help-paying-nhs-costs.nhsbsa.nhs.uk/start");
        driver.manage().window().maximize();
    }

    @Given("I am on the start page")
    public void iAmOnTheStartPage() {
        driver.manage().deleteAllCookies();
        driver.get("https://check-for-help-paying-nhs-costs.nhsbsa.nhs.uk/start");
        driver.manage().window().maximize();
        startPage.clickStartNowButton();
    }

    @When("the user Accepts Cookies")
    public void theUserAcceptCookies(){
        driver.findElement(By.id("nhsuk-cookie-banner__link_accept_analytics")).click();
    }
    @And("the cookie banner should disappear")
    public void theCookieBannerShouldDisappear(){
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.findElement(By.id("nhsuk-success-banner__message")).isDisplayed();
    }

    @When("the user selects the start now button")
    public void theUserSelectStartNowButton() { startPage.clickStartNowButton(); }

    @Then("the user is redirected to the country page")
    public void theUserIsRedirectedToCountryPage() {countryPage.isQuestionHeadingDisplayed();}

    @When("the user selects the England radio button")
    public void theUserSelectsTheEnglandRadioButton() {
        driver.findElement(By.id("radio-england")).click();
    }

    @And("selects the next button")
    public void selectsTheNextButton(){
        countryPage.selectNextButton();
    }

    @Then("the user will see the screen practice page")
    public void theUserWillSeeTheScreenPracticePage(){
        driver.findElement(By.id("question-heading")).isDisplayed();
    }

    @When("the user selects England")
    public void theUserSelectsEngland() {
        driver.findElement(By.id("radio-england")).click();
    }

    @And("clicks next button")
    public void clicks_next_button() {
        driver.findElement(By.id("next-button")).click();

    }

    @Then("they should see the gp practice page")
    public void they_should_see_the_gp_practice_page() {
        driver.findElement(By.id("question-heading")).isDisplayed();
    }

    @When("the user enters yes to scotland or wales")
    public void theUserEntersYestoScotlandOrWales() {
       driver.findElement(By.id("radio-yes")).click();
    }

    @Then("they should see the dental practice page")
    public void they_should_see_the_dental_practice_page() {
        driver.findElement(By.id("question-heading")).isDisplayed();
    }

    @When("they select England")
    public void they_select_england() {
        driver.findElement(By.id("radio-england")).click();

    }

    @Then("they should see the date of birth page")
    public void they_should_see_the_date_of_birth_page() {
        driver.findElement(By.id("date-of-birth-hint")).isDisplayed();
    }

    @When("they enter a valid date of birth")
    public void they_enter_a_valid_date_of_birth() {
       driver.findElement(By.id("dob-day")).sendKeys("01");
       driver.findElement(By.id("dob-month")).sendKeys("08");
       driver.findElement(By.id("dob-year")).sendKeys("1979");

    }

    @Then("they should see the lives with a partner page")
    public void they_should_see_the_lives_with_a_partner_page() {
        driver.findElement(By.id("partner-hint")).isDisplayed();
    }

    @When("they select yes to lives with a partner")
    public void they_select_yes_to_lives_with_a_partner() {
        driver.findElement(By.id("radio-yes")).click();
    }

    @Then("they should see the claim benefits page")
    public void they_should_see_the_claim_benefits_page() {
        driver.findElement(By.id("radio-yes")).isDisplayed();
    }

    @When("they enter yes to claim benefits")
    public void they_enter_yes_to_claim_benefits() {
        driver.findElement(By.id("radio-yes")).click();
    }

    @Then("they should see the paid universal credit page")
    public void they_should_see_the_paid_universal_credit_page() {
        driver.findElement(By.id("question-heading")).isDisplayed();
    }

    @When("they select yes, we receive universal credit payments")
    public void they_select_yes_we_receive_universal_credit_payments() {
        driver.findElement(By.id("yes-universal")).click();

    }

    @Then("they should see the universal credit claim page")
    public void they_should_see_the_universal_credit_claim_page() {
        driver.findElement(By.id("label-yes")).isDisplayed();

    }

    @When("they enter yes to universal credit claim page")
    public void they_enter_yes_to_universal_credit_claim_page() {
        driver.findElement(By.id("radio-yes")).click();
    }

    @Then("they should see the universal take home credit home pay page")
    public void they_should_see_the_universal_take_home_credit_home_pay_page() {
        driver.findElement(By.id("radio-yes")).isDisplayed();
    }

    @When("they select yes to combined income")
    public void they_select_yes_to_combined_income(){
        driver.findElement(By.id("radio-yes")).click();
    }

    @Then("the user should be on the {string} page")
    public void theUserShouldBeOnThePage(String expectedUrl) {
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals("The URL does not match", expectedUrl, actualUrl);
    }

    @When("I select England as my Country")
    public void iSelectEnglandAsMyCountry(){
        countryPage.selectEnglandRadioButton();
        commonPage.selectNextButton();

    }
    @And("I select my GP practice as England")
    public void iSelectMyGpPracticeAsEngland(){
        gpPracticePage.selectRadioNo();
        commonPage.selectNextButton();

    }
    @And("I select my dental practice as England")
    public void iSelectMyDentalPracticeAsEngland(){
        dentalPracticePage.selectEnglandRadioButton();
        commonPage.selectNextButton();

    }
    @When("I enter a date of birth {string} {string} {string}")
    public void iEnterAValidDateOfBirth(String day, String month, String year){
        doBpage.enterDateOfBirth("01", "01", "1995");
        commonPage.selectNextButton();

    }

    @And("I do not live with a partner")
    public void iDoNotLiveWithAPartner(){
        partner.selectRadioNo();
        partner.selectNextButton();
    }

    @And("I do live with a partner")
    public void iDoLiveWithAPartner() {
        partner.selectRadioYes();
        partner.selectNextButton();
    }



    @And("I do not claim benefits")
    public void iDoNotClaimBenefits(){
        commonPage.selectRadioNo();
        commonPage.selectNextButton();
    }

    @When("I enter that I am not pregnant or given birth")
    public void iEnterIAmNotPregnantOrGivenBirth(){
        commonPage.selectRadioNo();
        commonPage.selectNextButton();
    }
    @And("I do not have an armed force related illness or diabetes")
    public void iDoNotHaveAnArmedForcesRelatedIllnessOrDiabetes(){
        commonPage.selectRadioNo();
        commonPage.selectNextButton();
        commonPage.selectRadioNo();
        commonPage.selectNextButton();


    }
    @And("I do not have an armed forces related illness")
    public void iDoNotHaveAnArmedForcesRelatedIllness(){
        commonPage.selectRadioNo();
        commonPage.selectNextButton();
    }

    @And("I say no to other medical conditions")
    public void iSayNoToOtherMedicalConditions(){
        commonPage.selectRadioNo();
        commonPage.selectNextButton();
        commonPage.selectRadioNo();
        commonPage.selectNextButton();
        commonPage.selectRadioNo();
        commonPage.selectNextButton();
    }

    @And("I do not live in a care home")
    public void iDoNotLiveInACareHome(){
        commonPage.selectRadioNo();
        commonPage.selectNextButton();
    }
    @When("I enter I have less than the amount in property")
    public void iEnterIHaveLessThanTheAmountInProperty(){
        commonPage.selectRadioNo();
        commonPage.selectNextButton();
    }
    @Then("I get the result I can get help {string} page")
    public void iGetTheResultICanGetHelp(String expectedUrl){
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals("The URL does not match", expectedUrl, actualUrl);

    }



}

