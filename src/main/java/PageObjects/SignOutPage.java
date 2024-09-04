package PageObjects;

import AbstractComponets.AbstractComponents;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SignOutPage extends AbstractComponents {
    WebDriver driver;

    public  SignOutPage(WebDriver driver){
        super(driver);
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "nav-link-accountList-nav-line-1")
    WebElement helloSign;

    @FindBy(id = "nav-item-signout")
    WebElement signOut;

    public void SignOut()
    {
        Actions a = new Actions(driver);
        a.moveToElement(helloSign).perform();
        waitForElementTOAppear(signOut);
        signOut.click();

    }
}
