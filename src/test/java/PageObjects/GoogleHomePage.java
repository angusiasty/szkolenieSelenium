package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleHomePage {

    private WebDriver driver;
    private WebDriverWait wait;
    private By searchField = By.name("q");


    public GoogleHomePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 15);
    }

    public void typeIntoSearchField(String searchQueue) {
        wait.until(ExpectedConditions.elementToBeClickable(searchField));
        driver.findElement(searchField).sendKeys(searchQueue);
    }

    public void getGooglePage() {
        driver.get("http://google.com");
        wait.until(ExpectedConditions.titleIs("Google"));
    }
}

