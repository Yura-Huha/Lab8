package tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.HomePage;

public class LogInTest extends BaseTest{
    @BeforeClass
    public void driverSetUp(){
        setDriver();
    }

    @Test
    public void logInTest(){
        WebElement tableElement = new HomePage(driver)
                .enterUserName()
                .enterPassword()
                .logIn()
                .getTableElement();
        Assert.assertTrue(tableElement.isDisplayed());
    }
    @AfterTest
    public void closeDriver(){
        afterSuite();
    }
}
