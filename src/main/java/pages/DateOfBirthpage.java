package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DateOfBirthpage {
    private WebDriver driver;
    WebDriverWait wait;


    By questionHeading = By.id("question-heading");
    By dayLocator = By.id("dob-day");
    By monthLocator = By.id("dob-month");
    By yearLocator = By.id("dob-year");

    public DateOfBirthpage(WebDriver driver){this.driver = driver;}


    public void enterDateOfBirth(String day, String month, String year) {
        driver.findElement(By.id("dob-day")).sendKeys(day);
        driver.findElement(By.id("dob-month")).sendKeys(month);
        driver.findElement(By.id("dob-year")).sendKeys(year);
    }
}
