package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.velocity.runtime.directive.Break;
import org.openqa.selenium.WebDriver;
import pages.CommonPage;
import pages.CountryPage;
import pages.StartPage;
import utils.DriverFactory;

public class countrySteps {

    private WebDriver driver = DriverFactory.getDriver();
    private StartPage startPage = new StartPage(driver);
    private CountryPage countryPage = new CountryPage(driver);
    private CommonPage commonPage = new CommonPage(driver);

    @Given("I have launched the application")
    public void iHaveLaunchedTheApplication() {
        startPage.iLaunchTheApplication();
        startPage.clickStartNowButton();
    }
    @And("I am on the live in page")
    public void iAmOnTheLiveInPage() {
        countryPage.isQuestionHeadingDisplayed();
    }

    @When("I select my country as Northern Ireland")
    public void iSelectMyCountryAsNorthernIreland(){
        countryPage.selectNireRadioButton();
        commonPage.selectNextButton();
    }
    @Then("I will see the service not northern ireland page")
    public void iWillSeeTheServiceNotNorthernIrelandPage(){

    }


//    @When("I choose {string}")
//    public void iChoose(String liveInRadioButton){
//        switch (liveInRadioButton) {
//            case "England":
//                break;
//            case "Scotland":
//                break;
//            case "Wales":
//                break;
//            case "Northern Ireland":
//                throw new IllegalArgumentException;
//
//        }
//    }

}
