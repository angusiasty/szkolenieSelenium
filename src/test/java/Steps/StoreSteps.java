package Steps;

import Framework.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class StoreSteps extends BaseTest {

    @Test
    public void storeTest() {
        driver.get("http://automationpractice.com");
        wait.until(ExpectedConditions.titleIs("My Store"));
        wait.until(ExpectedConditions.elementToBeClickable(By.className("login")));
        driver.findElement(By.className("login")).click();
        wait.until(ExpectedConditions.titleIs("Login - My Store"));
        wait.until(ExpectedConditions.elementToBeClickable(By.id("email_create")));
        driver.findElement(By.id("email_create")).sendKeys("angus+123@gmail.com");
        driver.findElement(By.id("email_create")).sendKeys(Keys.ENTER);
        wait.until(ExpectedConditions.elementToBeClickable(By.id("city")));
        driver.findElement(By.id("city")).sendKeys("The City");
        Select oSelect = new Select(driver.findElement(By.id("id_state")));
        //oSelect.selectByValue("22");
        oSelect.selectByVisibleText("Rhode Island");
    }
}
