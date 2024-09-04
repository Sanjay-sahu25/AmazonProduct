package PageObjects;

import AbstractComponets.AbstractComponents;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LandingPage extends AbstractComponents {
    WebDriver driver;
    public LandingPage(WebDriver driver){
        super(driver);
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(id="nav-link-accountList-nav-line-1")
    WebElement helloSign;

    @FindBy(css = "input[type$='email']")
    WebElement username;

    @FindBy(className = "a-button-input")
    WebElement Continue;

    @FindBy(id="ap_password")
    WebElement passwordEle;

    @FindBy(id="signInSubmit")
    WebElement submit;

    @FindBy(className="a-text-bold")
    WebElement label;


    public SignOutPage LoginApplication(String email, String password)
    {
        helloSign.click();
        waitForElementTOAppear(username);
        username.sendKeys(email);
        Continue.click();
        waitForElementTOAppear(passwordEle);
        passwordEle.sendKeys(password);
        submit.click();
        return new SignOutPage(driver);

    }
    public void goTo()
    {
        driver.get("https://www.amazon.in/");
    }

}
