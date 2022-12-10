package tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.HomePage;

public class LogoTest extends BaseTest {

    @BeforeClass
    public void driverSetUp(){
        setDriver();
    }

    @Test
    public void hasLogoTest(){
        WebElement logoElement = new HomePage(driver)
                .getLogoElement();
        Assert.assertTrue(logoElement.isDisplayed());
    }
    @AfterTest
    public void closeDriver(){
        afterSuite();
    }
}
