package Steps;

import Framework.BaseTest;
import PageObjects.GoogleHomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class GoogleSearchSteps extends BaseTest {

    @Test
    public void checkGoogleSearchFunction() {
        GoogleHomePage googleHomePage = new GoogleHomePage(driver);
        googleHomePage.getGooglePage();
        googleHomePage.typeIntoSearchField("Szkolenie IT");
        validateSearchResults();
    }

    private void validateSearchResults() {
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        wait.until(ExpectedConditions.titleContains("Stacja IT"));
    }
}
