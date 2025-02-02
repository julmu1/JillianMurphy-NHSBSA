package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class GPpracticePage {

        private WebDriver driver;
        WebDriverWait wait;

        By yesLocator = By.id("radio-yes");
        By noLocator = By.id("radio-no");
        By questionHeading = By.id("question-heading");

        public GPpracticePage(WebDriver driver) {this.driver = driver;
                this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));}

        public boolean isGPpracticeHeadingDisplayed(){

                try {
                        return driver.findElement(questionHeading).isDisplayed();
                }
                catch(Exception e)
                {
                        return false;
                }
        }


        public void selectRadioYes(){driver.findElement(yesLocator).click();}
        public void selectRadioNo(){driver.findElement(noLocator).click();}


}
