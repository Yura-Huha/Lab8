package pages;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.StringUtils;

public class RegisterPage extends BasePage{
    private static final String USER_FIRST_NAME = "Matthew";
    private static final String USER_LAST_NAME = "Jonathan";
    private static final String USER_ADDRESS = "Lincoln Street, 19";
    private static final String USER_CITY = "New York";
    private static final String USER_STATE = "New York";
    private static final String USER_ZIP_CODE = "10002";
    private static final int LENGTH_OF_NUMBER = 10;
    private static final String USER_NUMBER = StringUtils.generateRandomNumber(LENGTH_OF_NUMBER);
    private static final String USER_SSN = "017-44-2284";
    private static final int LENGTH_OF_USERNAME = 3;
    private static final String USERNAME = StringUtils.generateRandomUserName(LENGTH_OF_USERNAME);
    private static final String USER_PASSWORD = "348765121";




    @FindBy(xpath = "//input[@id='customer.firstName']" )
    private WebElement firstNameField;
    @FindBy(xpath = "//input[@id='customer.lastName']" )
    private WebElement lastNameField;
    @FindBy(xpath = "//input[@id='customer.address.street']" )
    private WebElement addressField;
    @FindBy(xpath = "//input[@id='customer.address.city']" )
    private WebElement cityField;
    @FindBy(xpath = "//input[@id='customer.address.state']" )
    private WebElement stateField;
    @FindBy(xpath = "//input[@id='customer.address.zipCode']" )
    private WebElement zipCodeField;
    @FindBy(xpath = "//input[@id='customer.phoneNumber']" )
    private WebElement phoneNumberField;
    @FindBy(xpath = "//input[@id='customer.ssn']" )
    private WebElement ssnField;
    @FindBy(xpath = "//input[@id='customer.username']" )
    private WebElement userNameField;
    @FindBy(xpath = "//input[@id='customer.password']" )
    private WebElement passwordField;
    @FindBy(xpath = "//input[@id='repeatedPassword']" )
    private WebElement confirmField;
    @FindBy(xpath = "//input[@class='button' and @value='Register']" )
    private WebElement registerButton;


    public RegisterPage(WebDriver driver) {
        super(driver);
    }
    public RegisterPage enterFirstName(){
        firstNameField.sendKeys(USER_FIRST_NAME);
        return this;
    }
    public RegisterPage enterLastName(){
        lastNameField.sendKeys(USER_LAST_NAME);
        return this;
    }
    public RegisterPage enterAddress(){
        addressField.sendKeys(USER_ADDRESS);
        return this;
    }
    public RegisterPage enterCity(){
        cityField.sendKeys(USER_CITY);
        return this;
    }
    public RegisterPage enterState(){
        stateField.sendKeys(USER_STATE);
        return this;
    }
    public RegisterPage enterZip(){
        zipCodeField.sendKeys(USER_ZIP_CODE);
        return this;
    }
    public RegisterPage enterPhoneNumber(){
        phoneNumberField.sendKeys(USER_NUMBER);
        return this;
    }
    public RegisterPage enterSSN(){
        ssnField.sendKeys(USER_SSN);
        return this;
    }
    public RegisterPage enterUserName(){
        userNameField.sendKeys(USERNAME);
        return this;
    }
    public RegisterPage enterPassword(){
        passwordField.sendKeys(USER_PASSWORD);
        return this;
    }
    public RegisterPage confirmPassword(){
        confirmField.sendKeys(USER_PASSWORD);
        return this;
    }
    public AccountSuccessPage registerAccount(){
        registerButton.click();
        return new AccountSuccessPage(driver);
    }
}
