package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class BaseTest {
    WebDriver driver;
    private static final String PARABANK_URL = "https://parabank.parasoft.com/parabank/index.htm";

    @BeforeSuite
    public void createDriver() {
        WebDriverManager.chromedriver().setup();
    }
        public void setDriver(){
        driver = new ChromeDriver();
        driver.get(PARABANK_URL);
    }

    @AfterSuite
    public void  afterSuite(){
        driver.quit();
    }
}
