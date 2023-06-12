package Pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SauceDemo {
    public SauceDemo(){
        PageFactory.initElements(Driver.getDriver(), this );
    }
    @FindBy(id = "user-name")
    public WebElement userInput;

    @FindBy(id = "password")
    public WebElement passInput;

    @FindBy(id = "login-button")
    public WebElement button;

    @FindBy(xpath= "//button[@class='btn btn_primary btn_small btn_inventory']")
    public List<WebElement> listOfButtons;
}
