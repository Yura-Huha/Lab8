package tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.HomePage;

public class CreateAccountTest extends BaseTest{

    private static final String MESSAGE = "Your account was created successfully. You are now logged in.";

    @BeforeClass
    public void driverSetUp(){
        setDriver();
    }

    @Test
    public void checkCreatingOfAccountTest(){
        String actualMessage = new HomePage(driver)
                .clickOnRegisterLink()
                .enterFirstName()
                .enterLastName()
                .enterAddress()
                .enterAddress()
                .enterCity()
                .enterState()
                .enterZip()
                .enterPhoneNumber()
                .enterSSN()
                .enterUserName()
                .enterPassword()
                .confirmPassword()
                .registerAccount()
                .getActualMessage();
        Assert.assertTrue(actualMessage.contains(MESSAGE));
    }

    @AfterTest
    public void closeDriver(){
        afterSuite();
    }

}
