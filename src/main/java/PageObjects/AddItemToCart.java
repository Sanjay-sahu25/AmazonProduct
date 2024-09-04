package PageObjects;

import AbstractComponets.AbstractComponents;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AddItemToCart extends AbstractComponents {
    WebDriver driver;
    public AddItemToCart(WebDriver driver )
    {
        super(driver);
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "input[id='isscrid']")
    WebElement searchBox;

    @FindBy(css = "input[id='nav-search-submit-button']")
    WebElement search;

    @FindBy(css ="span[class='a-price-whole']")
    List<WebElement> products;

    public void SearchItem()
    {
        searchBox.sendKeys(itemName);
        search.click();

    }
    public void getProductByPrice()
    {
        WebElement prod = products.stream().filter(product ->product.getText().equals(price)).findFirst().orElse(null);


    }

}
