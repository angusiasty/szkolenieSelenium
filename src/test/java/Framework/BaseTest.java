package Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest {

    protected WebDriver driver;
    protected WebDriverWait wait;

    @BeforeMethod
    public void setUp() {
        FirefoxDriverImplementation firefoxDriverImplementation = new FirefoxDriverImplementation();
        this.driver = firefoxDriverImplementation.getDriver();
        this.wait = firefoxDriverImplementation.getWait();
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }
}
