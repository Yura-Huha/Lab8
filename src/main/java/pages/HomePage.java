package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
    private static final String USERNAME = "matthew229";
    private static final String USER_PASSWORD = "348765121";

    @FindBy(xpath = "//a[contains(text(), 'Register')]" )
    private WebElement registerLink;
    @FindBy(xpath = "//input[@name='username']" )
    private WebElement userNameField;
    @FindBy(xpath = "//input[@name='password']" )
    private WebElement passwordField;
    @FindBy(xpath = "//input[@value='Log In']" )
    private WebElement logInButton;
    @FindBy(xpath = "//img[contains(@src, 'logo.gif')]" )
    private WebElement logoElement;


    public HomePage(WebDriver driver) {
        super(driver);
    }

    public RegisterPage clickOnRegisterLink(){
        registerLink.click();
        return new RegisterPage(driver);
    }

    public HomePage enterUserName(){
        userNameField.sendKeys(USERNAME);
        return this;
    }

    public HomePage enterPassword(){
        passwordField.sendKeys(USER_PASSWORD);
        return this;
    }

    public AccountLogInSuccessPage logIn(){
        implicitWait();
        logInButton.click();
        return new AccountLogInSuccessPage(driver);
    }

    public WebElement getLogoElement(){
        return logoElement;
    }
}
