package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    private static final int TIME = 100;
   protected WebDriver driver;
   private WebDriverWait wait;

   public BasePage(WebDriver driver) {
       this.driver = driver;
       wait = new WebDriverWait(driver, Duration.ofSeconds(TIME));
       PageFactory.initElements(driver, this);

   }


   public void implicitWait() {
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIME));
   }

}
