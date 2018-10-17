package Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FirefoxDriverImplementation{

    private WebDriver driver;
    private WebDriverWait wait;

    public WebDriver getDriver() {
        return driver;
    }

    public WebDriverWait getWait() {
        return wait;
    }

    public FirefoxDriverImplementation() {
        setDriverLocationProperty();
        initializeDriver();
        initializeWebDriverWait();
    }

    private void initializeDriver() {
        this.driver = new FirefoxDriver();
    }

    private void initializeWebDriverWait(){
        this.wait = new WebDriverWait(this.driver, 15);
    }

    public void closeDriver() {
        driver.close();
    }

    private void setDriverLocationProperty() {
        System.setProperty("webdriver.gecko.driver", "./src/test/resources/geckodriver.exe");
    }
}
