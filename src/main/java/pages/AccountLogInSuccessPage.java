package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountLogInSuccessPage extends BasePage{
    @FindBy(xpath = "//table[@id='accountTable']" )
    private WebElement tableElement;
    public AccountLogInSuccessPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getTableElement(){
        return tableElement;
    }

}
