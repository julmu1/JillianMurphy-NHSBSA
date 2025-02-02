package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class StartPage {
    private WebDriver driver;
    WebDriverWait wait;

    //locators

    By startNowButton = By.id("next-button");
    By acceptCookiesButton = By.id("nhsuk-cookie-banner__link_accept_analytics");


    public StartPage(WebDriver driver) {this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));}

    public void launchTheApplication(){
        driver.get("https://check-for-help-paying-nhs-costs.nhsbsa.nhs.uk/start");
    }

    public boolean isStartNowPageDisplayed(){
        return driver.findElement(startNowButton).isDisplayed();
    }

    public void  clickStartNowButton()
    {
        driver.findElement(startNowButton).click();
    }
    public void clickAcceptCookiesButton()
    {
        driver.findElement(acceptCookiesButton).click();
    }
    public void iLaunchTheApplication(){
        driver.manage().deleteAllCookies();
        driver.get("https://check-for-help-paying-nhs-costs.nhsbsa.nhs.uk/start");
        driver.manage().window().maximize();
    }

}
