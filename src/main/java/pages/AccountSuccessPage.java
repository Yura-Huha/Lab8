package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountSuccessPage extends BasePage{
    @FindBy(xpath = "//p[text() = 'Your account was created successfully. You are now logged in.']" )
    private WebElement actualMessage;
    public AccountSuccessPage(WebDriver driver) {
        super(driver);
    }

    public String getActualMessage(){
        return actualMessage.getText();
    }
}
